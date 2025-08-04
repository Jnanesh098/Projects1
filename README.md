# School Management System (Java)

## Date
04/08/2025

## Project Overview
The **School Management System** is a Java-based console application developed using **Eclipse IDE**.  
It helps manage:
- Students and their fee payments
- Teachers and their salary payments
- School finances (total money earned and spent)

This project demonstrates core **Object-Oriented Programming (OOP)** concepts like:
- Classes & Objects
- Encapsulation
- Method calls
- Static variables for shared data
- Java Collections (`List`)

------------------

## Features
- Add and manage teachers
- Add and manage students
- Track fees paid by each student
- Pay teacher salaries
- View total money earned and spent by the school

------------------

## Tools & Technologies Used
- **Java JDK 8+**
- **Eclipse IDE**
- **Java Collections Framework**

------------------

## Class Structure
### **1. School.java**
- Manages lists of teachers and students.
- Tracks total money earned and spent.
- Methods to add teachers, add students, and update finances.

### **2. Student.java**
- Stores student details (ID, name, grade, fees paid, total fees).
- Method to pay fees and update the school's earnings.
- Method to check remaining fees.

### **3. Teacher.java**
- Stores teacher details (ID, name, salary, salary earned).
- Method to receive salary and update school's expenses.

### **4. Main.java**
- Creates initial teachers and students.
- Demonstrates adding teachers dynamically.
- Demonstrates paying fees and salaries.
- Displays updated school finances.

-------------------------

## Sample Output
GHS has earned 13000
**------Making SCHOOL PAY SALARY-------**
GHS has spent for salary to Shini and now has 12500
GHS has spent for salary to Jhansi and now has 11800
Student's name :Jnanesh Total fees paid so far 2000
Name of the Teacher: Jhansi Total salary earned so far 1400

-----------------------

## Folder Structure (Eclipse)
SchoolManagementSystem/
│
├── src/
│ └── school/management/system/
│ ├── School.java
│ ├── Student.java
│ ├── Teacher.java
│ └── Main.java
│
└── README.md

-------------------

## How to Run in Eclipse
1. Open **Eclipse IDE**.
2. Go to **File → New → Java Project** → Name: `SchoolManagementSystem`.
3. Create package:
      school.management.system
4. Create four classes: `School`, `Student`, `Teacher`, `Main`.
5. Copy the respective code into each file.
6. Right-click `Main.java` → **Run As → Java Application**.

--------------------

## Debugging & Improvements
- Ensure the package name is `school.management.system` (not `mangement`).
- Add user input for dynamic student/teacher creation.
- Store data in a database for persistence.
- Create a GUI for better usability.
   
