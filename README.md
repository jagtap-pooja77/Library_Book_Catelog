# 📚 Library Book Catalog API

A Java-based RESTful API for managing a library’s book catalog, built with Spring Boot and MySQL.

---

## ✅ Features

- Add a new book
- Get all books
- Get book by ID
- Delete a book
- Update availability of a book
- Input validation (`title` cannot be empty)

---

## 🧰 Tech Stack

- Java 8+
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman (for testing)

---


## 🚀 How to Run the Project


## 1📥 Clone the Repository

To get started, clone the project repository from GitHub:

git clone https://github.com/jagtap-pooja77/Library_Book_Catelog

cd library


## 🔧 Configure MySQL Database

### 2. Create the database
Login to your MySQL server and run:
```sql
CREATE DATABASE library;
```

Update src/main/resources/application.properties:
```
spring.datasource.url=jdbc:mysql://localhost:3306/library
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

### 3. Build and run the application
```
mvn clean install
mvn spring-boot:run
```
The app will start at:
http://localhost:8080

---
###  Project Structure
```
src/
├── main/
│ ├── java/
│ │ └── com/example/library/
│ │ ├── controller/
│ │ │ └── BookController.java 
│ │ ├── model/
│ │ │ └── Book.java 
│ │ ├── Repository/
│ │ │ └── BookRepository.java 
│ │ ├── service/
│ │ │ ├── BookService.java 
│ │ │ └── BookNotFoundException.java 
│ │ └── LibraryApplication.java 
│ └── resources/
│ ├── static/ 
│ ├── templates/
│ └── application.properties 
├── pom.xml
```
---
### 📥 Sample Requests
➕ Add a Book
```
POST /books/addbook
Content-Type: application/json

{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "isbn": "9780132350884"
}
```
### 📚 Get All Books
```
GET /books/getallbooks
```
### 🔍 Get Book by ID
```
GET /books/getbook/2
```
### ❌ Delete Book
```
GET /books/deletebook/4
```
### 🔄 Update Availability
```
PUT /api/books/1/availability?available=false
```
### ❗ Input Validation
-title field is required

-If title is missing or empty, API returns:
```
{
  "status": 400,
  "error": "Bad Request",
  "message": "Title cannot be empty"
}
```
---
### 🧪 Postman Testing

1.Import the provided Postman Collection: Library.postman_collection.json

2.Import the environment file: Library.postman_environment.json

3.Set environment variable:
```
baseUrl = http://localhost:8080/books
```
## 📬 Postman Collection

You can use the Postman collection below to test all the API endpoints:

🔗 [Click here to open the Postman Collection](https://web.postman.co/workspace/My-Workspace~38a455d7-506c-4a5e-8604-ee63b629d110/collection/45369474-31642da3-0e87-4465-9288-50a3ca46f403?action=share&source=copy-link&creator=45369474)


---
### 🧾 License

This project is open-source and available under the MIT License.











