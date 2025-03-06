1. Overview
   
A Student Management System is a web-based application that helps in managing student records, including creating, reading, updating, and deleting (CRUD) student data.

2. Technologies Used

Spring Boot (for application development)
Spring Data JPA (for database operations)
MySQL (as the database)
Spring Web (for building RESTful APIs)
Postman (for testing APIs)

3. CRUD Operations
   
Create Student: Add new student records.
Read Students: Retrieve all students or a specific student by ID.
Update Student: Modify existing student details.
Delete Student: Remove a student record from the database

4. API Endpoints
POST /students/add → Create a new student
GET /students → Retrieve all students
GET /students/{id} → Get student by ID
PUT /students/update/{id} → Update student details
DELETE /students/delete/{id} → Delete student
