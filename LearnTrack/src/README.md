# LearnTrack – Student & Course Management System

## Overview

LearnTrack is a beginner-friendly, console-based Java application for managing students, courses, and course enrollments. The project demonstrates Core Java and object-oriented programming concepts through a simple layered architecture.

## Features

* Register students with automatically generated IDs
* Create and list courses
* Find students and courses by ID
* Enroll students in courses
* Track enrollment status
* Validate basic student and course input
* Store records using `ArrayList`

## Technologies

* Java
* Object-Oriented Programming (OOP)
* Collections Framework (`ArrayList`)
* Java Enums
* `java.time.LocalDate`

## Project Structure

```text

src/com/airtribe/learntrack/
├── Main.java
├── constants/
│   └── AppConstants.java
├── entity/
│   ├── Person.java
│   ├── Student.java
│   ├── Course.java
│   └── Enrollment.java
├── enums/
│   ├── EnrollmentStatus.java
│   └── CourseStatus.java
├── exception/
│   ├── EntityNotFoundException.java
│   └── InvalidInputException.java
├── repository/
│   ├── StudentRepository.java
│   ├── CourseRepository.java
│   └── EnrollmentRepository.java
├── service/
│   ├── StudentService.java
│   ├── CourseService.java
│   └── EnrollmentService.java
└── util/
    └── IdGenerator.java
```

## Prerequisites

* JDK 11 or later
* A Java IDE such as IntelliJ IDEA, Eclipse, or VS Code with Java support

## How to Run

1. Clone or download this repository.
2. Open the project in your Java IDE.
3. Ensure the source directory is configured correctly.
4. Run `com.airtribe.learntrack.Main`.

## Architecture

* **Entity:** Represents students, courses, and enrollments.
* **Repository:** Stores and retrieves records.
* **Service:** Coordinates operations and performs basic validation.
* **Util:** Generates unique IDs during the current application run.
* **Enums:** Define supported statuses.

## Current Limitations

* Data is stored in memory and is lost when the application exits.
* IDs are generated in memory and reset when the application restarts.
* No database, graphical interface, or authentication is implemented.
* The current `Main` class demonstrates the main workflow rather than providing a full interactive menu.

## Learning Objectives

This project practices classes and objects, constructors, encapsulation, inheritance, method overriding, polymorphism, static members, collections, enums, exception handling, and package organization.
