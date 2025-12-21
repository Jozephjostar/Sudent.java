# Assignment 1: Object-Oriented Student Management System

## Project Overview
This project was created as part of Assignment 1 to practice Object-Oriented Programming (OOP) in Java.
The goal of the project is to build a simple student management system using classes, objects, arrays,
and basic calculations.

In this project, I implemented two main classes: `Student` and `Course`, and a driver class `Main`
to demonstrate how they work together. The program follows OOP principles such as encapsulation,
abstraction, and composition.

---

## Learning Goals
While working on this assignment, I practiced:
- Java basics (variables, conditions, loops, arrays)
- Creating and using classes and objects
- Writing constructors, methods, and fields
- Encapsulation and data hiding using `private` fields
- Using getters and setters
- Working with arrays of objects
- Writing clean and readable Java code
- Organizing a project using Git and GitHub

---

## Class Descriptions

### Student Class
The `Student` class represents a university student.

**Fields:**
- `name` – full name of the student
- `id` – student ID
- `major` – academic program
- `gpa` – current GPA
- `credits` – total earned credits

All fields are private to ensure encapsulation.

**Constructor:**
The constructor accepts `name`, `id`, and `major`.  
The GPA is initialized to `0.0` and credits to `0`.

**Methods:**
- Getters and setters for all fields
- `addCredits(int c)` – increases the number of credits
- `updateGPA(double newGPA)` – updates GPA
- `isHonors()` – returns true if GPA is 3.5 or higher
- `toString()` – returns a textual representation of the student

---

### Course Class
The `Course` class represents an academic course.

**Fields:**
- `courseName` – name of the course
- `instructor` – instructor name
- `students[]` – array of Student objects

This class demonstrates **composition**, because a course contains students.

**Methods:**
- `addStudent(Student s, int index)` – adds a student to the array
- `courseAverageGPA()` – calculates the average GPA of students
- `highestCreditStudent()` – finds the student with the most credits
- `toString()` – returns a summary of the course

---

## Main Program
The `Main` class is the driver program.

It:
- Creates multiple `Student` objects
- Updates their GPA and credits
- Stores them in an array
- Creates a `Course` object and adds students to it
- Prints student information using `toString()`
- Displays the highest-credit student and the average GPA
- Processes the student array to find:
  - The student with the highest GPA
  - The number of honors students
  - The total number of credits

---

## How to Compile and Run

From the `src` directory, use the following commands:

```bash
javac *.java
java Main
