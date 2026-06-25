# University Course Management System

This project is a simple Java-based console application for managing university courses, students, and lecturers. It provides functionality to model the key entities in a university environment, such as `Person`, `Student`, `Lecturer`, `Lesson`, and `Course`. The system enables user interaction through the console for input and management of course-related information.

## Features

- **Person Abstraction**: Models shared attributes and behaviors for people in the university, such as name, national ID, and address.

- **Student and Lecturer Classes**: Extend the `Person` class with specialized fields — `Student` includes student ID and grade, while `Lecturer` includes lecturer ID and salary.

- **Lesson and Course Classes**: Enable representation of courses, with fields for code, title, credits, type, and relationships to lecturers and students.

- **User Interaction**: Uses the console (`Scanner`) to collect information about people, courses, and grades interactively.

- **Grade Management**: Allows entering, sorting, and displaying student grades for a course.

- **Persistence**: Saves student IDs and grades to a text file (`students.txt`) for record-keeping.

- **Validation**: Enforces constraints for grades, salary, credits, and lesson types to ensure data consistency.

## Getting Started
### Prerequisites

- Java Development Kit (JDK) 8 or higher

### Compilation
Compile all Java source files located in the Uni package:

```bash
javac Uni/*.java
```
### Running
You will need to use the driver class, `main` existed in `Main` class to instantiate and use the `Course`, `Student`, and `Lecturer` classes interactively. 

### Compile and run:
```bash
javac Main.java
java Main
```

#### Project Structure

- `Person.java`: Abstract base class for people
- `Student.java`: Student entity
- `Lecturer.java`: Lecturer entity
- `Lesson.java`: Abstract base class for lessons/courses
- `Course.java`: Course implementation with student and lecturer management

**Notes**

- The application is designed for demonstration and educational purposes.
- The system currently supports a fixed capacity of 50 students per course.
- All input/output is via the console.
- Data is saved as plain text in students.txt.