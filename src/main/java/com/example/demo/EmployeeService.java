package com.example.demo;

import com.example.demo.EmployeeNotFoundException;
import com.example.demo.Employee;
import com.example.demo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Optional<Employee> getEmployeeById(Integer id) {
        return employeeRepo.findById(id);
    }

    public Employee saveEmployee(Employee emp) {
        return employeeRepo.save(emp);
    }

    public Employee updateEmployee(Integer id, Employee empDetails) {
        Employee emp = employeeRepo.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id " + id));

        emp.setName(empDetails.getName());
        emp.setDepartment(empDetails.getDepartment());
        emp.setRole(empDetails.getRole());
        emp.setSalary(empDetails.getSalary());

        return employeeRepo.save(emp);
    }

    public void deleteEmployee(Integer id) {
        Employee emp = employeeRepo.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id " + id));
        employeeRepo.delete(emp);
    }
}