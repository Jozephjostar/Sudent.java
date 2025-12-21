# Student Management System (Assignment 1)

## About the Project
This project is a simple Java program created for Assignment 1.
It demonstrates basic Object-Oriented Programming concepts such as classes,
objects, encapsulation, and arrays.

The system works with students and courses and performs simple calculations
like average GPA and total credits.

---

## Classes Used

### Student
The Student class stores information about a student.

Fields:
- name
- id
- major
- gpa
- credits

Main functions:
- update GPA
- add credits
- check if the student is an honors student
- display student information

---

### Course
The Course class stores information about a course and its students.

It contains:
- course name
- instructor name
- an array of students

Main functions:
- add students to the course
- calculate average GPA
- find the student with the highest credits

---

## Main Program
The Main class runs the program.

It:
- creates several students
- updates their GPA and credits
- stores them in an array
- creates a course and adds students
- prints results to the console

---

## How to Run the Program

Compile and run from the `src` folder:

```bash
javac *.java
java Main
