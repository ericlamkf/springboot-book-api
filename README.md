# 📚 Spring Boot Book Management REST API

This is a simple Book Management REST API built using **Spring Boot**, **Spring Data JPA**, and **H2 in-memory database**.

It supports basic CRUD operations:  
➕ Add a book  
📖 List all books  
❌ Delete a book by ID  

---

## 🚀 Features

- RESTful endpoints using `@RestController`
- Service layer for business logic
- Repository layer using Spring Data JPA
- In-memory H2 database with auto-generated schema
- JSON request/response handling with Jackson

---

## 🧱 Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok (optional)
- Maven (build tool)

---

## 📦 Installation & Run

### 1. Clone the project
```bash
git clone https://github.com/your-username/springboot-book-api.git
cd springboot-book-api

2. Build the project
bash
Copy
Edit
./mvnw clean install
3. Run the project
bash
Copy
Edit
./mvnw spring-boot:run
4. Access the application
API base URL: http://localhost:8080

H2 Console (for DB inspection): http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: (leave blank)

🛠 API Endpoints
Method	Endpoint	Description
GET	/books	Get all books
POST	/books	Add a new book
DELETE	/books/{id}	Delete book by ID

🔽 Sample JSON for POST
json
Copy
Edit
{
  "title": "Clean Code",
  "author": "Robert C. Martin"
}
📁 Project Structure
cpp
Copy
Edit
src
├── main
│   ├── java
│   │   └── com.book_api.book_api
│   │       ├── controller    // Handles HTTP requests (BookController)
│   │       ├── model         // Entity classes (Book)
│   │       ├── repository    // DAO layer (BookRepository)
│   │       └── service       // Business logic (BookService)
│   └── resources
│       ├── application.properties
│       └── static/templates (if any)
🧠 How It Works (Short Explanation)
Controller Layer (@RestController)
Accepts HTTP requests and delegates them to the service layer.

Service Layer (@Service)
Handles the main business logic (e.g., saving, deleting, retrieving books).

Repository Layer (@Repository)
Interfaces with the database using Spring Data JPA.

H2 Database
In-memory, resets on each run. Useful for testing and learning.

📄 Sample Model Class
java
Copy
Edit
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String author;

    public Book() {}

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters and Setters
}
✅ Lombok Note
If Lombok annotations like @Getter and @Setter do not work:

Ensure your IDE supports Lombok (enable annotation processing)

Or manually write the getter and setter methods

🙌 Author
Created by Your Name Here
Just a simple project to learn how to build RESTful APIs with Spring Boot.

📝 License
This project is open-source under the MIT License.

yaml
Copy
Edit

---

✅ You can now:
- Copy this into a file named `README.md` in your project root
- Replace `your-username` in the clone URL
- Replace **Your Name Here** if you'd like attribution

Let me know if you also want `.gitignore`, `LICENSE`, or GitHub Actions workflow files!
