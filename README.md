# Library Management System
A console-based **Library Management System** built using **Java**. The application provides separate modules for **Admin** and **Student**, allowing efficient management of books, students, book issuance, returns, inventory, and fines through a menu-driven interface.
This project was developed to practice Java programming concepts such as Object-Oriented Programming (OOP), collections, authentication, user input handling, and menu-driven application development.
---

## Features
### Admin Module
- Secure Admin Login
- Add new books
- Update book stock
- Add new students
- View book details
- View student details

### Student Module
- Issue books
- Return books
- Update fine details
- Book issuing limit validation
- Fine validation before issuing books

### Library Features
- Book inventory management
- Student record management
- Book availability tracking
- Duplicate student ID prevention
- Menu-driven console interface
---

## Technologies Used
- Java
- Object-Oriented Programming (OOP)
- Java Collections (`ArrayList`)
- Scanner Class
---

## Project Structure
```
Library-Management-System/
├── src/
│   └── Project_01_LibraryManagement/
│       ├── Main.java
│       ├── Book.java (logical class)
│       ├── Student.java (logical class)
│       └── Admin.java (logical class)
├── README.md
```
> *In this project, the `Book`, `Student`, and `Admin` classes are implemented within the same Java file.*
---

## 📸 Screenshot
<img width="725" height="413" alt="Screenshot 2026-07-30 130055" src="https://github.com/user-attachments/assets/b98040bf-16c6-4bb6-83d0-f2a77db2697e" />

<img width="652" height="356" alt="Screenshot 2026-07-30 130128" src="https://github.com/user-attachments/assets/b5dbe365-9516-437f-a797-2a5979fd4df9" />

<img width="613" height="345" alt="Screenshot 2026-07-30 130203" src="https://github.com/user-attachments/assets/27dc3254-29f8-454c-8563-fb009a29dd57" />

<img width="593" height="279" alt="Screenshot 2026-07-30 130332" src="https://github.com/user-attachments/assets/4dfb5517-2db8-4825-be69-e5dbf2dad0cf" />


---

## How to Use
### Admin
1. Login using the Admin ID and password.
2. Add books to the library.
3. Update available stock.
4. Register new students.
5. View book details.
6. View student information.

### Student
1. Login as a student.
2. Issue available books.
3. Return borrowed books.
4. Update fine records.
5. Logout.
---

## Learning Objectives
This project helped me practice:
- Java Fundamentals
- Object-Oriented Programming (OOP)
- Classes and Objects
- Constructors
- ArrayList Operations
- Authentication Logic
- User Input Handling
- Menu-Driven Programming
- Inventory Management
- Basic Library System Design
---

## How to Run
1. Clone the repository:

```bash
git clone https://github.com/your-username/library-management-system.git
```

2. Open the project in IntelliJ IDEA, Eclipse, or VS Code.

3. Compile and run `Main.java`.
---

## Future Improvements
- Store data in MySQL or SQLite
- Add file handling for persistent storage
- Improve password security
- Add book search by title or author
- Generate issue and return dates
- Automatically calculate overdue fines
- Add ISBN support
- Build a GUI using Java Swing or JavaFX
---

## Disclaimer
This project was created for educational purposes to practice Java programming concepts. All data is stored temporarily in memory using `ArrayList` and is lost when the application exits.
---

## Author
**Samarth Bhardwaj**
GitHub: https://github.com/samarth-170
---

⭐ If you found this project useful, consider giving it a star on GitHub!
