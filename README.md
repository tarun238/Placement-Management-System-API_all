# Placement Management System API

A robust backend system for a web-based Placement Management System, built with Java and Spring Boot. This project provides RESTful APIs to manage students, colleges, placements, and users, streamlining the campus recruitment process.

---

## ✨ Features

* **Modular Architecture**: Follows a clean Controller-Service-Repository pattern for maintainability.
* **Comprehensive Data Management**: Full CRUD (Create, Read, Update, Delete) operations for all key entities.
* **Relational Data Integrity**: Manages relationships between students, colleges, and certificates.
* **User & Admin Roles**: Separate endpoints for managing system users and administrators.
* **Secure Configuration**: Uses a `.gitignore` and a local profile to protect sensitive database credentials from being committed to version control.

---

## 🛠️ Technologies Used

* **Backend**: Java 21, Spring Boot 3
* **Database**: PostgreSQL
* **Data Access**: Spring Data JPA (Hibernate)
* **API Testing**: Postman
* **Build Tool**: Apache Maven
* **Utilities**: Lombok

---

## 🚀 Getting Started

Follow these instructions to get a local copy up and running.

### **Prerequisites**

* Java Development Kit (JDK) 21 or later
* Apache Maven
* PostgreSQL
* Postman (or a similar API client)

### **Setup and Installation**

1.  **Clone the repository:**
    ```sh
    git clone [https://github.com/tarun238/Placement-Management-System-API_all.git](https://github.com/tarun238/Placement-Management-System-API_all.git)
    cd Placement-Managment-System-
    ```

2.  **Database Configuration:**
    * Open PostgreSQL and create a new database named `placement_db`.
    * Navigate to `src/main/resources/`.

3.  **Create a local properties file:**
    * Create a new file named `application-local.properties`.
    * Add your database password to this file:
        ```properties
        spring.datasource.password=your_secret_password_here
        ```
    * The main `application.properties` is already configured to use this file.

4.  **Run the application:**
    ```sh
    mvn spring-boot:run
    ```
    The application will start on `http://localhost:8080`.

---

## 📋 API Endpoints & Usage

Below are the available endpoints for each module, along with sample request bodies.

### **Admin**

Handles administrator data.

* **`POST /api/admins/`** - Adds a new admin.
    ```json
    {
        "name": "Super Admin",
        "password": "secure_password_123"
    }
    ```
* **`GET /api/admins/`** - Retrieves all admins.

---

### **User**

Handles general user data.

* **`POST /api/users/`** - Adds a new user.
    ```json
    {
        "name": "Placement Officer",
        "type": "Coordinator",
        "password": "user_pass_456"
    }
    ```
* **`GET /api/users/`** - Retrieves all users.

---

### **College**

Handles college data. *Note: A college must be created before creating a student.*

* **`POST /api/colleges/`** - Adds a new college.
    ```json
    {
        "collegeAdmin": "Dr. Jane Doe",
        "collegeName": "Global Institute of Technology",
        "location": "Bengaluru"
    }
    ```
* **`GET /api/colleges/`** - Retrieves all colleges.

---

### **Certificate**

Handles certificate data. *Note: A certificate must be created before creating a student.*

* **`POST /api/certificates/`** - Adds a new certificate.
    ```json
    {
        "certificateName": "Certified Spring Professional",
        "year": 2025,
        "college": "Global Institute of Technology"
    }
    ```
* **`GET /api/certificates/`** - Retrieves all certificates.
* **`GET /api/certificates/{id}`** - Retrieves a certificate by its ID.
* **`PUT /api/certificates/{id}`** - Updates an existing certificate.
* **`DELETE /api/certificates/{id}`** - Deletes a certificate.

---

### **Placement**

Handles placement drive information.

* **`POST /api/placements/`** - Adds a new placement drive.
    ```json
    {
        "name": "TechCorp Campus Drive 2025",
        "college": "Global Institute of Technology",
        "date": "2025-10-20",
        "qualification": "B.E. in CS/IT",
        "year": 2025
    }
    ```
* **`GET /api/placements/`** - Retrieves all placements.
* **`GET /api/placements/{id}`** - Retrieves a placement by its ID.
* **`DELETE /api/placements/{id}`** - Deletes a placement.

---

### **Student**

Handles student profile data. **Important**: You must provide the `id` of an existing College and Certificate when creating a new student.

* **`POST /api/students/`** - Adds a new student.
    ```json
    {
        "name": "Tarun CR",
        "roll": 415,
        "qualification": "B.E.",
        "course": "Computer Science and Engineering",
        "year": 2025,
        "hallTicketNo": 9649513,
        "college": {
            "id": 1
        },
        "certificate": {
            "id": 1
        }
    }
    ```
* **`GET /api/students/`** - Retrieves all students.
* **`GET /api/students/{id}`** - Retrieves a student by their ID.
* **`GET /api/students/hallticket/{hallTicketNo}`** - Retrieves a student by hall ticket number.
* **`DELETE /api/students/{id}`** - Deletes a student.
