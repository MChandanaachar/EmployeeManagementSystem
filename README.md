🏢 Employee Management System

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.7-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8-blue)
![Postman](https://img.shields.io/badge/Postman-API-orange)

======================================================

 Overview
This is a **Spring Boot Java project** for managing employees in a company.  
It provides a **backend REST API** for CRUD operations (Create, Read, Update, Delete) on employee data with **MySQL database integration**.

This project was completed as part of my **Java Developer Internship** at **Owl AI (Overload Ware Labs AI)**.

======================================================

 Internship Details
- **Role:** Java Developer Intern  
- **Duration:** 15/10/2025 – 15/11/2025  
- **Organization:** Owl AI  

======================================================

 Features
- Add new employees
- Retrieve all employees or a single employee by ID
- Update employee details
- Delete an employee
- Input validation using `@Valid` and `@NotBlank`
- Global exception handling for missing employee IDs
- MySQL database integration

======================================================

 Technologies Used
| Technology | Purpose |
|------------|---------|
| Java 17 | Backend programming language |
| Spring Boot 3.5.7 | REST API framework |
| MySQL | Database |
| Hibernate/JPA | ORM for database operations |
| Postman | API testing |

======================================================
 Project Structure
EmployeeManagementSystem/
├── pom.xml
├── src/
│   └── main/
│       ├── java/com/example/demo/
│       │   ├── controller/
│       │   │   └── EmployeeController.java
│       │   ├── service/
│       │   │   └── EmployeeService.java
│       │   ├── model/
│       │   │   └── Employee.java
│       │   ├── exception/
│       │   │   └── EmployeeNotFoundException.java
│       │   └── EmployeeManagementSystemApplication.java
│       └── resources/
│           ├── application.properties
├── screenshots/
└── README.md

==================================================

 REST API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/employees` | Add a new employee |
| GET | `/employees` | Retrieve all employees |
| GET | `/employees/{id}` | Retrieve employee by ID |
| PUT | `/employees/{id}` | Update employee by ID |
| DELETE | `/employees/{id}` | Delete employee by ID |

==================================================

 How to Run

1. Clone the repository:

```bash
git clone <https://github.com/MChandanaachar/EmployeeManagementSystem.git>

Configure application.properties with your MySQL credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
spring.datasource.username=DB_USERNAME
spring.datasource.password=DB_PASSWORD
spring.jpa.hibernate.ddl-auto=update


  Build and run the project:
mvn clean install
mvn spring-boot:run

  Test APIs using Postman.
screenshots

  Postman API testing screenshots:
screenshots/ folder in repo.

GitHub Repository [Employee Management System]

Employee Management System GitHub Link
https://github.com/MChandanaachar/EmployeeManagementSystem.git
===================================================================================================================================================

Author
M Chandana
Java Developer Intern at Owl AI
Tech Enthusiast
