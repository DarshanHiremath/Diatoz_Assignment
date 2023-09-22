# College Management System - Assignment Submission

## Introduction

This project report outlines the development of an assignment submitted to Diatoz Solutions Private Limited. The assignment involves the creation of a Java-based web application using the Spring Boot framework. The application is designed to provide functionality related to administrators and user management.

### Assignment Details

- **Assignment Title**: College Management System
- **Company**: Diatoz Solutions Private Limited
- **Submitted By**: Darshan Hiremath
- **Date of Submission**: 22-September-2023

## Project Overview

The goal of this project is to develop a web-based application that enables administrators to manage user accounts. The application provides features for adding, updating, deleting, and viewing user information. It also includes security features to protect user data and restrict access to authorized administrators.

### Technologies Used

The following technologies and tools were used in the development of this project:

- **Java**: The primary programming language for the project.
- **Spring Boot**: A Java-based framework used for building web applications.
- **Spring Security**: Provides security features for the application.
- **Spring Data JPA**: Used for data persistence and database interactions.
- **MySQL**: The relational database used to store user data.
- **Git**: Version control system for code management.
- **Maven**: Build and dependency management tool.
- **Spring Tool Suite**: Integrated development environment for Java.

## Project Structure

The project follows a standard Spring Boot project structure.  

![image](https://github.com/DarshanHiremath/Diatoz_Assignment/assets/87310019/935aa94b-93a0-403c-a30a-053e80f58c44)

![image](https://github.com/DarshanHiremath/Diatoz_Assignment/assets/87310019/22fb1ce9-89fb-4375-aef7-83f16eea5f0e)


### Application Features

The application includes the following features:

1. **User Management**:
   - Adding a new user with basic details (username, email, etc.).
   - Updating user information.
   - Deleting a user.
   - Viewing a list of all users.

2. **Security**:
   - Authentication: Administrators must log in to access the application.
   - Authorization: Role-based access control to restrict actions based on user roles.

3. **Database Integration**:
   - Data is stored in a MySQL database.
   - Spring Data JPA is used for database operations.

## Implementation Details

The core components of the application include:

- **Model**: Defines the structure of user data, including fields such as username, email, and roles.
- **Admin Model**: Represents administrator accounts and extends the User model.
- **Repository**: Provides CRUD operations for user data in the database.
- **Service**: Implements business logic related to user management.
- **Admin Service**: Manages administrator-specific functionality.
- **Controller**: Handles HTTP requests and interacts with the services to perform actions.
- **Security Configuration**: Configures Spring Security for authentication and authorization.

### Database Schema

The database schema includes three tables: `admin`, `teacher`, and `student`. All tables share a common structure, but the `admin` table includes additional columns specific to administrators.

**`admin` Table:**
- `admin_id` (Primary Key)
- `username`
- `password`
- `role`

**`teacher` Table:**
- `id` (Primary Key)
- `name`
- `password`
- `employeeId`
- `phno`

**`student` Table:**
- `id` (Primary Key)
- `name`
- `rollNo`
- `phno`
- `marks`
- `grade`

### Security

- **Authentication**: Administrators must provide valid credentials (username and password) to log in.
- **Authorization**: The application restricts access to certain features based on user roles.
  - Administrators have "ADMIN" role and can access all features.
  - Regular users have "USER" role and can perform basic user management actions.

## Conclusion

The College Management System project provides a secure and efficient solution for managing users and administrators. It leverages the Spring Boot framework, Spring Security, and a MySQL database to ensure data integrity and security. The project adheres to best practices in software development and follows a clear project structure.

This project report serves as documentation for the assignment submitted to Diatoz Company. It outlines the project's objectives, technologies used, features implemented, and key implementation details.



**Darshan Hiremath**
- **Email**: darshanhiremath6920@gmail.com
- **Phone**: 7338544301
