# IRCTC Backend

A RESTful backend application for an IRCTC-like railway reservation system built using Spring Boot. It provides APIs for user authentication, train management, station management, seat availability, and ticket booking.

## Features

- User Registration and Login
- JWT-based Authentication and Authorization
- Train Management (Add, Update, Delete, View)
- Station Management
- Search Trains by Source and Destination
- View Train Schedules
- Check Seat Availability
- Book Tickets
- Role-based Access Control (Admin/User)
- RESTful APIs

## Tech Stack

- Java 21
- Spring Boot
- Spring Security
- JWT Authentication
- Spring Data JPA (Hibernate)
- MySQL
- Maven
- IntelliJ IDEA
- Postman (API Testing)

## Project Structure

```
src
 ├── controller
 ├── service
 ├── repository
 ├── entity
 ├── dto
 ├── config
 ├── security
 ├── exception
 └── resources
```

## Database

- MySQL
- JPA/Hibernate ORM

## API Endpoints

## How to Run

1. Clone the repository
2. Create a MySQL database
3. Update `application.properties`
4. Run the Spring Boot application
5. Test APIs using Postman

## Author

Simran Kambhale
