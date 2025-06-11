# Java JUnit 3 TDD Project

This project demonstrates the use of **object-oriented programming (OOP)** concepts in Java, specifically **inheritance**. It also includes basic **unit testing using JUnit 3**.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running the Tests](#running-the-tests)
- [Usage Examples](#usage-examples)
- [Contributing](#contributing)
- [License](#license)

## Overview

This educational project showcases fundamental OOP principles through a human-based class hierarchy. The project implements inheritance patterns with a base `Humain` class and demonstrates Test-Driven Development (TDD) practices using JUnit 3.

## Features

### Object-Oriented Programming (Humain classes)
- **Inheritance** with a shared `Humain` base class
- **Encapsulation** with private fields and public getters/setters
- **Method Overriding** of the `toString()` method in subclasses
- **Method Overloading** with `ami()` method to simulate default parameters

### Utility Classes
- **Calculator operations** with basic arithmetic functions
- **Recursive algorithms** (sum of integers from 1 to n)
- **Object type comparison** utilities
- **Data parsing** functionality

### Testing Framework
- **Unit Testing** with JUnit 3 framework
- **Test Suites** for organizing related tests
- **Test-Driven Development** approach

## Project Structure

```
project-root/
├── src/
│   ├── iut/
│   │   └── bad/
│   │       ├── Humain.java          # Base human class
│   │       └── [Other classes...]   # Human subclasses
│   ├── Calcul.java                  # Calculator utility class
│   ├── CalculTest.java              # JUnit 3 tests for Calcul
│   ├── CalculTestSuite.java         # Test suite for calculator tests
│   ├── ParserData.java              # Data parsing utility
│   └── ParserDataTest.java          # JUnit 3 tests for ParserData
├── test/
│   └── iut/
│       └── bad/
│           └── HumainTest.java      # JUnit 3 tests for Humain classes
├── bin/                             # Compiled classes (generated)
├── lib/
│   └── junit-3.8.1.jar            # JUnit 3 library
└── README.md
```

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher
- **JUnit 3** library (junit-3.8.1.jar or similar)
- An IDE like Eclipse or IntelliJ IDEA (optional but recommended)

## Installation

1. **Clone the repository:**
   ```bash
   git clone git@github.com:Donovan700/TDD-JUnit3.git
   cd java-junit3-tdd-project
   ```

2. **Download JUnit 3** (if not already included):
    - Download `junit-3.8.1.jar` from the official JUnit website
    - Place it in the `lib/` directory

3. **Set up your IDE** (optional):
    - Import the project into your preferred IDE
    - Add JUnit 3 to your project's classpath

## Running the Tests

### Option 1: Run from an IDE (Eclipse, IntelliJ)

1. Right-click on `HumainTest.java`
2. Select **Run as > JUnit Test**

### Option 2: Compile and run manually

```bash
# Create bin directory if it doesn't exist
mkdir -p bin

# Compile all source files (including both packages)
javac -d bin -cp lib/junit-3.8.1.jar src/iut/bad/*.java src/*.java test/iut/bad/*.java

# Run individual test classes
java -cp bin:lib/junit-3.8.1.jar junit.textui.TestRunner iut.bad.HumainTest
java -cp bin:lib/junit-3.8.1.jar junit.textui.TestRunner src.CalculTest
java -cp bin:lib/junit-3.8.1.jar junit.textui.TestRunner src.ParserDataTest

# Run the complete test suite
java -cp bin:lib/junit-3.8.1.jar junit.textui.TestRunner src.CalculTestSuite
```

**Note:** Make sure to replace `lib/junit-3.8.1.jar` with the correct path to your JUnit 3 jar file.

### Expected Output

If all tests pass, you should see output similar to:
```
.....
Time: 0.012

OK (5 tests)
```

## Usage Examples

### Using the Humain Classes

```java
// Example usage of the Humain class and its subclasses
Humain person = new Humain("John", "Doe", 25);
System.out.println(person.toString());

// Using the ami() method
person.ami("Alice");
person.ami("Bob", 69);
```

### Using the Calcul Class

```java
// Example usage of the calculator utility
Calcul calc = new Calcul();

// Basic arithmetic operations
int sum = calc.additionner(5, 3);        // Returns 8
int difference = calc.soustraire(10, 4);  // Returns 6

// Recursive sum (1 + 2 + ... + n)
int totalSum = calc.sumInt(5);            // Returns 15 (1+2+3+4+5)

// Object type comparison
String result = calc.checkObj("Hello", "World");     // Returns "Same" (both String)
String result2 = calc.checkObj("Hello", 123);        // Returns "Not Same"
```

### Running Individual Tests

```java
// Example test method structure for Calcul
public void testAdditionner() {
    Calcul calc = new Calcul();
    assertEquals(8, calc.additionner(5, 3));
    assertEquals(0, calc.additionner(-2, 2));
}
```

## Key Learning Objectives

This project helps understand:

### Object-Oriented Programming
- **Inheritance hierarchies** in Java
- **Encapsulation** principles
- **Method overriding** and **overloading**

### Programming Fundamentals
- **Recursive algorithms** (demonstrated in `sumInt` method)
- **Object type checking** and reflection basics
- **Utility class design** patterns

### Testing and Quality Assurance
- **Unit testing** with JUnit 3
- **Test suites** organization
- **Test-Driven Development** practices

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -am 'feat<branch>: Add new feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Create a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

**Note:** This is an educational project demonstrating basic OOP concepts and JUnit 3 testing. For production applications, consider using more recent versions of JUnit (JUnit 4 or JUnit 5) which offer additional features and better syntax.