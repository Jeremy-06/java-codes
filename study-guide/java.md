# Java Study Guide

## Table of Contents

1.  [Introduction to Java](#1-introduction-to-java)
    *   [What is Java?](#what-is-java)
    *   [History and Features](#history-and-features)
    *   [Java Virtual Machine (JVM)](#java-virtual-machine-jvm)
    *   [Java Development Kit (JDK)](#java-development-kit-jdk)
    *   [Java Runtime Environment (JRE)](#java-runtime-environment-jre)
2.  [Setting Up Your Java Environment](#2-setting-up-your-java-environment)
    *   [Installing the JDK](#installing-the-jdk)
    *   [Setting Environment Variables](#setting-environment-variables)
    *   [Your First Java Program](#your-first-java-program)
    *   [Compiling and Running](#compiling-and-running)
3.  [Basic Java Concepts](#3-basic-java-concepts)
    *   [Variables](#variables)
        *   [Data Types (Primitive and Non-Primitive)](#data-types-primitive-and-non-primitive)
        *   [Declaring and Initializing](#declaring-and-initializing)
    *   [Operators](#operators)
        *   [Arithmetic Operators](#arithmetic-operators)
        *   [Relational Operators](#relational-operators)
        *   [Logical Operators](#logical-operators)
        *   [Assignment Operators](#assignment-operators)
        *   [Unary Operators](#unary-operators)
    *   [Control Flow Statements](#control-flow-statements)
        *   [If-Else Statements](#if-else-statements)
        *   [Switch Statements](#switch-statements)
    *   [Loops](#loops)
        *   [While Loop](#while-loop)
        *   [Do-While Loop](#do-while-loop)
        *   [For Loop](#for-loop)
        *   [Enhanced For Loop (For-Each)](#enhanced-for-loop-for-each)
        *   [Break and Continue](#break-and-continue)
4.  [Methods](#4-methods)
    *   [Defining Methods](#defining-methods)
    *   [Method Parameters and Return Types](#method-parameters-and-return-types)
    *   [Method Overloading](#method-overloading)
5.  [Arrays and Strings](#5-arrays-and-strings)
    *   [Arrays](#arrays)
        *   [Declaring and Initializing Arrays](#declaring-and-initializing-arrays)
        *   [Multidimensional Arrays](#multidimensional-arrays)
    *   [Strings](#strings)
        *   [String Class and its Methods](#string-class-and-its-methods)
        *   [String vs. StringBuilder vs. StringBuffer](#string-vs-stringbuilder-vs-stringbuffer)
6.  [Object-Oriented Programming (OOP)](#6-object-oriented-programming-oop)
    *   [Classes and Objects](#classes-and-objects)
    *   [Constructors](#constructors)
    *   [This Keyword](#this-keyword)
    *   [Static Keyword](#static-keyword)
    *   [Access Modifiers (Public, Private, Protected, Default)](#access-modifiers-public-private-protected-default)
    *   [Encapsulation](#encapsulation)
    *   [Inheritance](#inheritance)
        *   [Extends Keyword](#extends-keyword)
        *   [Super Keyword](#super-keyword)
        *   [Method Overriding](#method-overriding)
    *   [Polymorphism](#polymorphism)
        *   [Compile-time (Method Overloading)](#compile-time-method-overloading)
        *   [Run-time (Method Overriding)](#run-time-method-overriding)
    *   [Abstraction](#abstraction)
        *   [Abstract Classes](#abstract-classes)
        *   [Interfaces](#interfaces)
    *   [Inner Classes](#inner-classes)
7.  [Exception Handling](#7-exception-handling)
    *   [What are Exceptions?](#what-are-exceptions)
    *   [Try-Catch-Finally Blocks](#try-catch-finally-blocks)
    *   [Throw and Throws Keywords](#throw-and-throws-keywords)
    *   [Custom Exceptions](#custom-exceptions)
8.  [Collections Framework](#8-collections-framework)
    *   [Overview of Collections](#overview-of-collections)
    *   [List Interface (ArrayList, LinkedList, Vector)](#list-interface-arraylist-linkedlist-vector)
    *   [Set Interface (HashSet, TreeSet, LinkedHashSet)](#set-interface-hashset-treeset-linkedhashset)
    *   [Map Interface (HashMap, TreeMap, LinkedHashMap)](#map-interface-hashmap-treemap-linkedhashmap)
    *   [Iterators](#iterators)
9.  [File Handling (I/O)](#9-file-handling-io)
    *   [File Class](#file-class)
    *   [Reading from Files (FileReader, BufferedReader, Scanner)](#reading-from-files-filereader-bufferedreader-scanner)
    *   [Writing to Files (FileWriter, BufferedWriter, PrintWriter)](#writing-to-files-filewriter-bufferedwriter-printwriter)
10. [Multithreading](#10-multithreading)
    *   [What is a Thread?](#what-is-a-thread)
    *   [Creating Threads (Extending Thread, Implementing Runnable)](#creating-threads-extending-thread-implementing-runnable)
    *   [Thread Lifecycle](#thread-lifecycle)
    *   [Thread Synchronization](#thread-synchronization)
11. [Java 8+ Features](#11-java-8-features)
    *   [Lambda Expressions](#lambda-expressions)
    *   [Functional Interfaces](#functional-interfaces)
    *   [Stream API](#stream-api)
    *   [Default and Static Methods in Interfaces](#default-and-static-methods-in-interfaces)
    *   [Optional Class](#optional-class)
    *   [New Date and Time API (java.time)](#new-date-and-time-api-javatime)
12. [Summary and Practice Exercises](#12-summary-and-practice-exercises)
    *   [Summary](#summary)
    *   [Practice Exercises](#practice-exercises)

---

## 1. Introduction to Java

### What is Java?
Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let application developers *write once, run anywhere* (WORA), meaning that compiled Java code can run on all platforms that support Java without the need to recompile.

### History and Features
Java was originally developed by James Gosling at Sun Microsystems (now owned by Oracle) and released in 1995.

**Key Features:**
*   **Simple:** Java's syntax is based on C++, making it relatively easy to learn.
*   **Object-Oriented:** Everything in Java is an object (with the exception of primitive data types).
*   **Platform Independent:** Achieved through the JVM, allowing code to run on any platform.
*   **Secure:** Java's security features include a security manager for applications.
*   **Robust:** Strong memory management, automatic garbage collection, and exception handling make Java robust.
*   **Multithreaded:** Java supports multithreaded programming, allowing concurrent execution of parts of a program.
*   **High Performance:** Just-In-Time (JIT) compilers enable high performance.
*   **Distributed:** Designed for distributed environments of the internet.
*   **Dynamic:** Capable of dynamically extending itself with new methods and classes.

### Java Virtual Machine (JVM)
The JVM is an abstract machine that provides a runtime environment in which Java bytecode can be executed. It acts as an interpreter for the compiled `.class` files. When you run a Java program, the JVM loads the `.class` file, verifies the bytecode, and executes it. This is what enables Java's platform independence.

### Java Development Kit (JDK)
The JDK is a software development environment used for developing Java applications and applets. It includes the JRE, a compiler (javac), an archiver (jar), a documentation generator (javadoc), and other tools needed for Java development. If you want to develop Java applications, you need the JDK.

### Java Runtime Environment (JRE)
The JRE is a software package that provides the class libraries and other resources that a Java program needs to run. It includes the JVM. If you only want to run Java applications, and not develop them, then the JRE is sufficient.

## 2. Setting Up Your Java Environment

### Installing the JDK
1.  **Download:** Go to the official Oracle website or OpenJDK website and download the latest stable version of the JDK for your operating system.
2.  **Installation:** Run the installer and follow the on-screen instructions. The installation typically places the JDK in a directory like `C:\Program Files\Java\jdk-xx.x.x` (Windows) or `/Library/Java/JavaVirtualMachines/jdk-xx.x.x.jdk/Contents/Home` (macOS).

### Setting Environment Variables
You need to set the `JAVA_HOME` and `Path` environment variables so that your operating system knows where to find the Java executable files.

*   **Windows:**
    1.  Search for "Environment Variables" and open "Edit the system environment variables."
    2.  Click "Environment Variables..."
    3.  Under "System variables," click "New..." to create `JAVA_HOME`.
        *   Variable name: `JAVA_HOME`
        *   Variable value: `C:\Program Files\Java\jdk-xx.x.x` (your JDK installation path)
    4.  Find the `Path` variable, select it, and click "Edit..."
    5.  Click "New" and add `%JAVA_HOME%\bin`.
    6.  Click OK on all windows.

*   **macOS/Linux:**
    1.  Open your terminal.
    2.  Edit your shell's configuration file (e.g., `~/.bash_profile`, `~/.zshrc`, `~/.profile`).
    3.  Add the following lines:
        ```bash
        export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-xx.x.x.jdk/Contents/Home
        export PATH=$JAVA_HOME/bin:$PATH
        ```
    4.  Save the file and run `source ~/.bash_profile` (or your respective file) to apply changes.

**Verify Installation:**
Open a terminal or command prompt and type:
```bash
java -version
javac -version
```
You should see the installed Java version.

### Your First Java Program

Let's write a classic "Hello, World!" program.
1.  Open a text editor (like VS Code, IntelliJ IDEA Community, Eclipse, or even Notepad).
2.  Create a new file named `HelloWorld.java`.

```java
// HelloWorld.java

public class HelloWorld { // Declare a public class named HelloWorld
    public static void main(String[] args) { // Main method: entry point of the program
        // System.out.println is used to print output to the console
        System.out.println("Hello, World!"); // Print the message
    }
}
```

### Compiling and Running

1.  **Compile:** Open your terminal or command prompt, navigate to the directory where you saved `HelloWorld.java`, and compile it using the Java compiler (`javac`):
    ```bash
    javac HelloWorld.java
    ```
    If successful, this will create a `HelloWorld.class` file in the same directory. This is the bytecode that the JVM executes.

2.  **Run:** Execute the compiled program using the Java Virtual Machine (`java`):
    ```bash
    java HelloWorld
    ```
    You should see the output: `Hello, World!`

---

## 3. Basic Java Concepts

### Variables

Variables are containers for storing data values. In Java, every variable has a data type.

#### Data Types (Primitive and Non-Primitive)

**Primitive Data Types:**
Java has 8 primitive data types, which are predefined by the language.

| Data Type | Size (bytes) | Range                                            | Default Value | Example        |
| :-------- | :----------- | :----------------------------------------------- | :------------ | :------------- |
| `byte`    | 1            | -128 to 127                                      | 0             | `byte b = 10;` |
| `short`   | 2            | -32,768 to 32,767                                | 0             | `short s = 1000;` |
| `int`     | 4            | -2,147,483,648 to 2,147,483,647                  | 0             | `int i = 50000;` |
| `long`    | 8            | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | 0L            | `long l = 1234567890123L;` |
| `float`   | 4            | Approximately ±3.4e-038 to ±3.4e+038 (6-7 decimal digits) | 0.0f          | `float f = 12.34f;` |
| `double`  | 8            | Approximately ±1.7e-308 to ±1.7e+308 (15 decimal digits) | 0.0d          | `double d = 12.3456789;` |
| `boolean` | 1 (JVM specific) | `true` or `false`                                | `false`       | `boolean b = true;` |
| `char`    | 2            | Unicode characters, '\u0000' to '\uffff'         | `'\u0000'`    | `char c = 'A';` |

**Non-Primitive Data Types (Reference Types):**
These are not predefined by Java and include Classes, Interfaces, and Arrays. They are created by the programmer and do not store the actual values directly, but rather references (addresses) to the objects in memory.
*   Examples: `String`, `Array`, `Scanner`, `CustomClass`.

#### Declaring and Initializing

```java
public class VariableExamples {
    public static void main(String[] args) {
        // Declaration: specifying data type and name
        int age;

        // Initialization: assigning a value
        age = 30;

        // Declaration and Initialization in one line
        double salary = 55000.75;
        char initial = 'J';
        boolean isActive = true;
        String name = "Alice"; // String is a non-primitive type

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Initial: " + initial);
        System.out.println("Is Active: " + isActive);
        System.out.println("Name: " + name);

        // Constants: use 'final' keyword
        final double PI = 3.14159;
        // PI = 3.14; // This would cause a compile-time error
        System.out.println("PI: " + PI);
    }
}
```

### Operators

Operators are special symbols that perform operations on one or more operands.

#### Arithmetic Operators
Used to perform mathematical calculations.

| Operator | Description      | Example       | Result |
| :------- | :--------------- | :------------ | :----- |
| `+`      | Addition         | `10 + 3`      | `13`   |
| `-`      | Subtraction      | `10 - 3`      | `7`    |
| `*`      | Multiplication   | `10 * 3`      | `30`   |
| `/`      | Division         | `10 / 3`      | `3`    |
| `%`      | Modulus (remainder) | `10 % 3`      | `1`    |

#### Relational Operators
Used to compare two values and return a boolean result (`true` or `false`).

| Operator | Description            | Example      | Result |
| :------- | :--------------------- | :----------- | :----- |
| `==`     | Equal to               | `10 == 3`    | `false`|
| `!=`     | Not equal to           | `10 != 3`    | `true` |
| `>`      | Greater than           | `10 > 3`     | `true` |
| `<`      | Less than              | `10 < 3`     | `false`|
| `>=`     | Greater than or equal to | `10 >= 3`    | `true` |
| `<=`     | Less than or equal to  | `10 <= 3`    | `false`|

#### Logical Operators
Used to combine conditional statements.

| Operator | Description | Example              | Result |
| :------- | :---------- | :------------------- | :----- |
| `&&`     | Logical AND | `(5 > 3) && (8 < 10)`| `true` |
| `||`     | Logical OR  | `(5 > 3) || (8 > 10)`| `true` |
| `!`      | Logical NOT | `!(5 == 3)`          | `true` |

#### Assignment Operators
Used to assign values to variables.

| Operator | Example      | Equivalent to |
| :------- | :----------- | :------------ |
| `=`      | `a = 10`     | `a = 10`      |
| `+=`     | `a += 5`     | `a = a + 5`   |
| `-=`     | `a -= 5`     | `a = a - 5`   |
| `*=`     | `a *= 5`     | `a = a * 5`   |
| `/=`     | `a /= 5`     | `a = a / 5`   |
| `%=`     | `a %= 5`     | `a = a % 5`   |

#### Unary Operators
Operate on a single operand.

| Operator | Description                  | Example    | Result |
| :------- | :--------------------------- | :--------- | :----- |
| `+`      | Unary plus (no effect)       | `+5`       | `5`    |
| `-`      | Unary minus (negates value)  | `-5`       | `-5`   |
| `++`     | Increment (increments by 1)  | `x++` (post-increment), `++x` (pre-increment) | |
| `--`     | Decrement (decrements by 1)  | `x--` (post-decrement), `--x` (pre-decrement) | |
| `!`      | Logical complement (negates boolean) | `!true`    | `false`|

```java
public class OperatorExamples {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Arithmetic
        System.out.println("a + b = " + (a + b)); // 13
        System.out.println("a - b = " + (a - b)); // 7
        System.out.println("a * b = " + (a * b)); // 30
        System.out.println("a / b = " + (a / b)); // 3 (integer division)
        System.out.println("a % b = " + (a % b)); // 1

        // Relational
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b));   // true

        // Logical
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x));         // false

        // Assignment
        int c = 20;
        c += 5; // c = c + 5;
        System.out.println("c after += 5: " + c); // 25

        // Unary
        int i = 5;
        System.out.println("i++: " + (i++)); // prints 5, then i becomes 6 (post-increment)
        System.out.println("i: " + i);       // 6
        System.out.println("++i: " + (++i)); // i becomes 7, then prints 7 (pre-increment)
        System.out.println("i: " + i);       // 7
    }
}
```

### Control Flow Statements

Control flow statements determine the order in which statements are executed.

#### If-Else Statements
Used for conditional execution.

```java
public class IfElseExample {
    public static void main(String[] args) {
        int temperature = 25;

        if (temperature > 30) {
            System.out.println("It's hot outside!");
        } else if (temperature >= 20) { // Else if condition
            System.out.println("It's a pleasant day.");
        } else { // Else block
            System.out.println("It's a bit chilly.");
        }

        // Ternary operator (shorthand for simple if-else)
        String weather = (temperature > 25) ? "Warm" : "Cool";
        System.out.println("Weather: " + weather);
    }
}
```

#### Switch Statements
Used to execute one of many code blocks based on the value of an expression.

```java
public class SwitchExample {
    public static void main(String[] args) {
        int dayOfWeek = 3; // 1 for Monday, 2 for Tuesday, etc.
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break; // Exit the switch statement
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default: // Executed if no case matches
                dayName = "Invalid Day";
                break;
        }
        System.out.println("The day is: " + dayName);

        // Java 14+ switch expressions (more concise)
        String season = "Winter";
        String clothingRecommendation = switch (season) {
            case "Spring", "Autumn" -> "Light jacket";
            case "Summer" -> "T-shirt and shorts";
            case "Winter" -> "Heavy coat and scarf";
            default -> "Unknown season, dress accordingly";
        };
        System.out.println("For " + season + ", wear: " + clothingRecommendation);
    }
}
```

### Loops

Loops are used to execute a block of code repeatedly as long as a certain condition is met.

#### While Loop
Repeats a block of code as long as a specified condition is true. The condition is checked *before* each iteration.

```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int count = 1;
        System.out.println("Counting up to 5 (While Loop):");
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++; // Increment count in each iteration
        }

        // Example: Sum of numbers from 1 to 10
        int num = 1;
        int sum = 0;
        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("Sum of 1 to 10: " + sum);
    }
}
```

#### Do-While Loop
Similar to the while loop, but the block of code is executed *at least once*, and then the condition is checked.

```java
public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Counting from 0 to 4 (Do-While Loop):");
        do {
            System.out.println("i: " + i);
            i++;
        } while (i < 5);

        // Even if the condition is initially false, the block runs once
        int j = 10;
        System.out.println("Do-While with false condition:");
        do {
            System.out.println("This will print once, even though j < 5 is false. j: " + j);
            j++;
        } while (j < 5);
    }
}
```

#### For Loop
Provides a concise way to write loops. It's ideal when you know how many times you want to loop.

```java
public class ForLoopExample {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 5 (For Loop):");
        // Syntax: for (initialization; condition; increment/decrement)
        for (int k = 1; k <= 5; k++) {
            System.out.println("k: " + k);
        }

        System.out.println("Even numbers from 0 to 10:");
        for (int l = 0; l <= 10; l += 2) { // Increment by 2
            System.out.println("Even: " + l);
        }

        // Nested for loops (e.g., for printing a pattern)
        System.out.println("Star pattern:");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
        /* Output:
           *
           * *
           * * *
        */
    }
}
```

#### Enhanced For Loop (For-Each)
Introduced in Java 5, it simplifies iterating over arrays and collections.

```java
public class ForEachLoopExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Iterating through an array (For-Each Loop):");
        for (int number : numbers) { // For each 'number' in 'numbers'
            System.out.println("Number: " + number);
        }

        String[] fruits = {"Apple", "Banana", "Cherry"};
        System.out.println("Iterating through a String array:");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
```

#### Break and Continue

*   **`break`:** Terminates the innermost loop (or switch statement) and transfers control to the statement immediately following the loop.
*   **`continue`:** Skips the rest of the current iteration of the loop and proceeds to the next iteration.

```java
public class BreakContinueExample {
    public static void main(String[] args) {
        System.out.println("Break example (stop at 3):");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Exit the loop when i is 3
            }
            System.out.println(i);
        }
        // Output:
        // 1
        // 2

        System.out.println("\nContinue example (skip 3):");
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                continue; // Skip the current iteration when j is 3
            }
            System.out.println(j);
        }
        // Output:
        // 1
        // 2
        // 4
        // 5
    }
}
```

---

## 4. Methods

Methods are blocks of code that perform a specific task. They allow for code reusability and better organization.

### Defining Methods

A method typically has:
*   **Access Modifier:** (e.g., `public`, `private`, `protected`, `default`) specifies who can access the method.
*   **Static/Non-static:** (optional) `static` methods belong to the class, `non-static` methods belong to objects.
*   **Return Type:** The data type of the value the method returns. `void` means it doesn't return any value.
*   **Method Name:** A unique identifier.
*   **Parameters (Optional):** A list of inputs the method accepts, enclosed in parentheses.

```java
public class MethodExamples {

    // A simple method that doesn't return a value (void) and takes no parameters
    public static void sayHello() {
        System.out.println("Hello from a method!");
    }

    // A method that takes a String parameter and prints a personalized greeting
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // A method that takes two integer parameters and returns their sum
    public static int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum; // Returns an integer value
    }

    // A method to find the maximum of two numbers
    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        // Calling methods
        sayHello(); // No arguments needed

        greetUser("Alice"); // Pass a String argument
        greetUser("Bob");

        int result = addNumbers(10, 20); // Store the returned value
        System.out.println("Sum of 10 and 20: " + result);

        System.out.println("Sum of 5 and 7: " + addNumbers(5, 7)); // Call directly in print

        int maxNumber = findMax(15, 8);
        System.out.println("Maximum of 15 and 8: " + maxNumber);
    }
}
```

### Method Parameters and Return Types
*   **Parameters:** Values passed into a method. They act as local variables within the method.
    *   **Call by Value:** In Java, all primitive types are passed by value. A copy of the actual value is passed.
    *   **Call by Reference:** For objects, a copy of the reference (memory address) is passed. This means changes made to the object *inside* the method will affect the original object.
*   **Return Type:** The type of value a method sends back to the caller. If a method does not return a value, its return type is `void`. The `return` keyword is used to send the value back.

### Method Overloading
Method overloading allows a class to have multiple methods with the same name, but different parameter lists (i.e., different number of parameters, different types of parameters, or different order of parameter types). The return type alone is not sufficient to overload a method.

```java
public class MethodOverloadingExample {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method: add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method: add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method: concatenate two strings
    public String add(String s1, String s2) {
        return s1 + s2;
    }

    public static void main(String[] args) {
        MethodOverloadingExample calculator = new MethodOverloadingExample();

        System.out.println("Sum of 5 and 10: " + calculator.add(5, 10));             // Calls add(int, int)
        System.out.println("Sum of 1, 2, and 3: " + calculator.add(1, 2, 3));       // Calls add(int, int, int)
        System.out.println("Sum of 2.5 and 3.5: " + calculator.add(2.5, 3.5));      // Calls add(double, double)
        System.out.println("Concatenated string: " + calculator.add("Hello, ", "Java!")); // Calls add(String, String)
    }
}
```

---

## 5. Arrays and Strings

### Arrays

An array is a collection of elements of the same data type. Elements in an array are stored in contiguous memory locations and can be accessed using an index (starting from 0).

#### Declaring and Initializing Arrays

**Declaration:**
```java
dataType[] arrayName; // Preferred way
dataType arrayName[]; // Works, but not preferred
```

**Initialization:**
1.  **Directly:**
    ```java
    int[] numbers = {10, 20, 30, 40, 50}; // Size is determined by the number of elements
    String[] names = {"Alice", "Bob", "Charlie"};
    ```
2.  **Using `new` keyword with size:**
    ```java
    int[] scores = new int[5]; // Declares an array of 5 integers, initialized to default values (0 for int)
    // Accessing and assigning values
    scores[0] = 95;
    scores[1] = 88;
    scores[2] = 76;
    scores[3] = 92;
    scores[4] = 81;
    // scores[5] = 99; // This would cause an ArrayIndexOutOfBoundsException
    ```

**Array Length:**
The `length` property returns the size of the array.
```java
System.out.println("Number of elements in 'numbers': " + numbers.length); // Output: 5
```

```java
public class ArrayExamples {
    public static void main(String[] args) {
        // Declaring and initializing an array of integers
        int[] scores = {85, 92, 78, 95, 88};

        System.out.println("--- Integer Array Example ---");
        System.out.println("Scores array length: " + scores.length);

        // Accessing elements using a for loop
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score at index " + i + ": " + scores[i]);
        }

        System.out.println("\n--- String Array Example ---");
        // Declaring an array of Strings with a specified size
        String[] fruits = new String[4];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Orange";
        fruits[3] = "Grape";

        System.out.println("Fruits array length: " + fruits.length);

        // Accessing elements using an enhanced for loop (for-each)
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        System.out.println("\n--- Modifying Array Elements ---");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Original numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        numbers[2] = 100; // Change the element at index 2
        System.out.print("\nModified numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
```

#### Multidimensional Arrays

Arrays of arrays. The most common is a 2D array (matrix).

```java
public class MultidimensionalArrayExample {
    public static void main(String[] args) {
        // Declaring and initializing a 2D integer array (3 rows, 3 columns)
        int[][] matrix = {
            {1, 2, 3},   // Row 0
            {4, 5, 6},   // Row 1
            {7, 8, 9}    // Row 2
        };

        System.out.println("--- 2D Array (Matrix) Example ---");
        // Accessing elements: matrix[rowIndex][columnIndex]
        System.out.println("Element at [0][0]: " + matrix[0][0]); // Output: 1
        System.out.println("Element at [1][2]: " + matrix[1][2]); // Output: 6

        // Iterating through a 2D array using nested loops
        System.out.println("\nPrinting the matrix:");
        for (int i = 0; i < matrix.length; i++) { // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) { // Loop through columns of the current row
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        // Jagged array (rows can have different number of columns)
        System.out.println("\n--- Jagged Array Example ---");
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[]{10, 20};
        jaggedArray[1] = new int[]{30, 40, 50};
        jaggedArray[2] = new int[]{60};

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

### Strings

In Java, `String` is a class, not a primitive data type. It represents sequences of characters. Strings are **immutable**, meaning once a `String` object is created, its value cannot be changed. Any operation that appears to modify a `String` actually creates a new `String` object.

#### String Class and its Methods

```java
public class StringExamples {
    public static void main(String[] args) {
        // Creating Strings
        String s1 = "Hello";              // String literal
        String s2 = new String("World");  // Using new keyword

        System.out.println("--- String Creation and Concatenation ---");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // Concatenation using + operator
        String s3 = s1 + " " + s2 + "!";
        System.out.println("s3 (concatenated): " + s3);

        // Concatenation using concat() method
        String s4 = s1.concat(" Java");
        System.out.println("s4 (concat method): " + s4);

        System.out.println("\n--- Common String Methods ---");

        // length() - returns the length of the string
        System.out.println("Length of s3: " + s3.length()); // 12

        // charAt(index) - returns the character at the specified index
        System.out.println("Character at index 1 in s1: " + s1.charAt(1)); // e

        // substring(beginIndex) - returns a new string from beginIndex to the end
        System.out.println("Substring of s3 from index 6: " + s3.substring(6)); // World!

        // substring(beginIndex, endIndex) - returns a new string from beginIndex to endIndex-1
        System.out.println("Substring of s3 from 0 to 5: " + s3.substring(0, 5)); // Hello

        // equals() - compares two strings for equality (content-wise)
        String s5 = "Hello";
        System.out.println("s1 equals s5: " + s1.equals(s5)); // true
        System.out.println("s1 equals \"hello\": " + s1.equals("hello")); // false (case-sensitive)

        // equalsIgnoreCase() - compares two strings ignoring case
        System.out.println("s1 equalsIgnoreCase \"hello\": " + s1.equalsIgnoreCase("hello")); // true

        // compareTo() - compares two strings lexicographically (returns int)
        System.out.println("s1 compareTo s5: " + s1.compareTo(s5)); // 0 (equal)
        System.out.println("s1 compareTo \"Hi\": " + s1.compareTo("Hi")); // Negative value (H comes after E)

        // indexOf() - returns the index of the first occurrence of a character or substring
        System.out.println("Index of 'o' in s1: " + s1.indexOf('o')); // 4
        System.out.println("Index of \"or\" in s3: " + s3.indexOf("or")); // 7

        // lastIndexOf() - returns the index of the last occurrence
        System.out.println("Last index of 'l' in s1: " + s1.lastIndexOf('l')); // 3

        // startsWith() / endsWith()
        System.out.println("s3 starts with \"Hello\": " + s3.startsWith("Hello")); // true
        System.out.println("s3 ends with \"!\": " + s3.endsWith("!")); // true

        // replace() - replaces all occurrences of a character/substring
        String replacedString = s3.replace("World", "Java");
        System.out.println("s3 after replace: " + replacedString); // Hello Java!

        // toLowerCase() / toUpperCase()
        System.out.println("s3 to lower case: " + s3.toLowerCase()); // hello world!
        System.out.println("s3 to upper case: " + s3.toUpperCase()); // HELLO WORLD!

        // trim() - removes leading and trailing whitespace
        String spacedString = "   Hello Java   ";
        System.out.println("Trimmed string: '" + spacedString.trim() + "'"); // 'Hello Java'

        // split() - splits a string into an array of strings based on a delimiter
        String sentence = "Java is a powerful language";
        String[] words = sentence.split(" ");
        System.out.println("Words after split:");
        for (String word : words) {
            System.out.println(word);
        }

        // contains() - checks if a string contains a sequence of characters
        System.out.println("s3 contains \"World\": " + s3.contains("World")); // true
    }
}
```

#### String vs. StringBuilder vs. StringBuffer

Since `String` objects are immutable, repeated modifications (like concatenations in a loop) create many new `String` objects, which can be inefficient for performance and memory. For mutable sequences of characters, Java provides `StringBuilder` and `StringBuffer`.

*   **`String`:** Immutable. Best for constant strings or when string content doesn't change frequently.
*   **`StringBuffer`:** Mutable. Thread-safe (synchronized methods), meaning multiple threads can safely use it. This makes it slower than `StringBuilder`. Use when working in a multithreaded environment.
*   **`StringBuilder`:** Mutable. Not thread-safe (non-synchronized methods), making it faster than `StringBuffer`. Use when working in a single-threaded environment.

```java
public class MutableStringExamples {
    public static void main(String[] args) {
        System.out.println("--- String Immutability Example ---");
        String originalString = "Java";
        System.out.println("Original String: " + originalString + " (HashCode: " + originalString.hashCode() + ")");

        originalString = originalString + " Programming"; // This creates a *new* String object
        System.out.println("Modified String: " + originalString + " (HashCode: " + originalString.hashCode() + ")");
        // The hash code is different, indicating a new object.

        System.out.println("\n--- StringBuilder Example (Mutable, Not Thread-Safe) ---");
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial StringBuilder: " + sb + " (HashCode: " + sb.hashCode() + ")");

        sb.append(" World"); // Modifies the existing object
        System.out.println("After append: " + sb + " (HashCode: " + sb.hashCode() + ")");

        sb.insert(5, ","); // Inserts at index 5
        System.out.println("After insert: " + sb);

        sb.reverse(); // Reverses the string
        System.out.println("After reverse: " + sb);

        sb.delete(0, 5); // Delete characters from index 0 to 4 (exclusive of 5)
        System.out.println("After delete: " + sb);

        System.out.println("\n--- StringBuffer Example (Mutable, Thread-Safe) ---");
        StringBuffer sbf = new StringBuffer("Welcome");
        System.out.println("Initial StringBuffer: " + sbf + " (HashCode: " + sbf.hashCode() + ")");

        sbf.append(" to Java"); // Modifies the existing object
        System.out.println("After append: " + sbf + " (HashCode: " + sbf.hashCode() + ")");

        // StringBuffer has similar methods like insert, delete, reverse, etc.
    }
}
```

---

## 6. Object-Oriented Programming (OOP)

OOP is a programming paradigm based on the concept of "objects," which can contain data (fields/attributes) and code (methods/behaviors). The main principles of OOP are Encapsulation, Inheritance, Polymorphism, and Abstraction.

### Classes and Objects

*   **Class:** A blueprint or a template for creating objects. It defines the structure (attributes) and behavior (methods) that all objects of that class will have. A class itself is not an object; it's a definition.
*   **Object:** An instance of a class. When a class is defined, no memory is allocated. Memory is allocated only when an object is created. Objects have state (values of attributes) and behavior (methods).

```java
// Define a Class named 'Dog'
class Dog {
    // Attributes (instance variables)
    String name;
    String breed;
    int age;

    // Method (behavior)
    public void bark() {
        System.out.println(name + " says Woof! Woof!");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed + ", Age: " + age);
    }
}

public class ClassAndObjectExample {
    public static void main(String[] args) {
        // Creating objects (instances) of the Dog class
        Dog myDog = new Dog(); // Declaring and instantiating an object
        Dog yourDog = new Dog();

        // Accessing attributes and assigning values using the dot operator
        myDog.name = "Buddy";
        myDog.breed = "Golden Retriever";
        myDog.age = 3;

        yourDog.name = "Lucy";
        yourDog.breed = "Labrador";
        yourDog.age = 5;

        // Calling methods on objects
        System.out.println("--- My Dog's Actions ---");
        myDog.bark();
        myDog.eat("dog food");
        myDog.displayInfo();

        System.out.println("\n--- Your Dog's Actions ---");
        yourDog.bark();
        yourDog.displayInfo();
    }
}
```

### Constructors

A constructor is a special type of method that is automatically called when an object of a class is created. Its primary purpose is to initialize the object's attributes.

*   A constructor's name must be the same as the class name.
*   It does not have a return type, not even `void`.
*   If you don't define a constructor, Java provides a default no-argument constructor.

```java
class Car {
    String make;
    String model;
    int year;
    String color;

    // Default Constructor (No-argument constructor)
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 2020;
        this.color = "White";
        System.out.println("Default Car created!");
    }

    // Parameterized Constructor
    public Car(String make, String model, int year, String color) {
        this.make = make;     // 'this' refers to the current object's instance variable
        this.model = model;
        this.year = year;
        this.color = color;
        System.out.println(make + " " + model + " Car created!");
    }

    // Another Parameterized Constructor (Overloading constructors)
    public Car(String make, String model, int year) {
        this(make, model, year, "Black"); // Constructor chaining: calls the other constructor
    }

    public void displayCarInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Car defaultCar = new Car();
        defaultCar.displayCarInfo(); // Make: Unknown, Model: Unknown, Year: 2020, Color: White

        System.out.println();

        // Creating an object using the parameterized constructor
        Car myCar = new Car("Toyota", "Camry", 2023, "Blue");
        myCar.displayCarInfo(); // Make: Toyota, Model: Camry, Year: 2023, Color: Blue

        System.out.println();

        // Creating an object using the overloaded constructor
        Car anotherCar = new Car("Honda", "Civic", 2022);
        anotherCar.displayCarInfo(); // Make: Honda, Model: Civic, Year: 2022, Color: Black
    }
}
```

### This Keyword

The `this` keyword refers to the current object. It is used to:
1.  **Distinguish between instance variables and local variables (parameters) if they have the same name.** (Most common use in constructors and setters).
2.  **Invoke the current class's constructor (constructor chaining).** (e.g., `this(...)`).
3.  **Return the current class instance.**
4.  **Pass the current class instance as an argument to another method.**

```java
class Box {
    int length;
    int width;
    int height;

    // Constructor using 'this' to refer to instance variables
    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method using 'this' to distinguish parameter from instance variable
    public void setDimensions(int length, int width, int height) {
        this.length = length; // 'this.length' refers to the instance variable
        this.width = width;
        this.height = height;
    }

    public int getVolume() {
        return this.length * this.width * this.height; // 'this' is optional here but can improve readability
    }

    // Constructor chaining using this()
    public Box(int side) {
        this(side, side, side); // Calls the Box(int, int, int) constructor
    }

    public void compare(Box otherBox) {
        if (this.getVolume() > otherBox.getVolume()) {
            System.out.println("This box is larger.");
        } else if (this.getVolume() < otherBox.getVolume()) {
            System.out.println("Other box is larger.");
        } else {
            System.out.println("Both boxes have the same volume.");
        }
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {
        Box box1 = new Box(10, 5, 2);
        System.out.println("Box1 Volume: " + box1.getVolume());

        Box box2 = new Box(4); // Using constructor chaining
        System.out.println("Box2 Volume: " + box2.getVolume());

        box1.compare(box2); // Pass 'box2' as an argument
    }
}
```

### Static Keyword

The `static` keyword in Java is used for memory management mainly. It can be applied to:
*   **Static Variables (Class Variables):** Belong to the class, not to any specific object. There's only one copy of a static variable, shared by all instances of the class. They are initialized once, when the class is loaded.
*   **Static Methods:** Belong to the class, not to any object. They can be called directly using the class name without creating an object. They can only access static variables and static methods of the class.
*   **Static Blocks:** Used to initialize static variables. Executed once, when the class is loaded.
*   **Static Inner Classes:** (Less common for beginners, but good to know).

```java
class College {
    String studentName;
    int studentId;
    static String collegeName = "ABC University"; // Static variable, shared by all students
    static int studentCount = 0; // Static variable to keep track of students

    // Constructor
    public College(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        studentCount++; // Increment static count every time a new student object is created
    }

    // Non-static method (can access both static and non-static members)
    public void displayStudentInfo() {
        System.out.println("Name: " + studentName + ", ID: " + studentId + ", College: " + collegeName);
    }

    // Static method (can only access static members directly)
    public static void displayCollegeInfo() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Total Students Enrolled: " + studentCount);
        // System.out.println("Student Name: " + studentName); // ERROR: Cannot make a static reference to the non-static field studentName
    }
}

public class StaticKeywordExample {
    public static void main(String[] args) {
        // Accessing static variable directly using class name
        System.out.println("Initial College Name: " + College.collegeName);

        // Accessing static method directly using class name
        College.displayCollegeInfo(); // Total Students Enrolled: 0

        College s1 = new College("Alice", 101);
        College s2 = new College("Bob", 102);
        College s3 = new College("Charlie", 103);

        s1.displayStudentInfo();
        s2.displayStudentInfo();

        // Static variable value is shared and updated
        System.out.println("College Name from s1: " + s1.collegeName); // Can access via object, but not recommended
        System.out.println("College Name from s2: " + s2.collegeName); // Use College.collegeName instead

        // Static method reflects the updated count
        College.displayCollegeInfo(); // Total Students Enrolled: 3

        // You can change a static variable globally
        College.collegeName = "XYZ Institute";
        s3.displayStudentInfo(); // Now shows XYZ Institute
    }
}
```

### Access Modifiers (Public, Private, Protected, Default)

Access modifiers control the visibility (scope) of classes, fields (variables), methods, and constructors.

| Modifier   | Class | Package | Subclass | World |
| :--------- | :---- | :------ | :------- | :---- |
| `public`   | Yes   | Yes     | Yes      | Yes   |
| `protected`| Yes   | Yes     | Yes      | No    |
| `default`  | Yes   | Yes     | No       | No    |
| `private`  | Yes   | No      | No       | No    |

*   **`public`:** Accessible from anywhere.
*   **`protected`:** Accessible within the same package and by subclasses (even if in a different package).
*   **`default` (no modifier):** Accessible only within the same package.
*   **`private`:** Accessible only within the class where it is declared.

```java
// File: com/example/package1/MyClass.java
package com.example.package1;

public class MyClass {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30; // No modifier, so default access
    private int privateVar = 40;

    public void publicMethod() {
        System.out.println("Public method in MyClass.");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in MyClass.");
    }

    void defaultMethod() {
        System.out.println("Default method in MyClass.");
    }

    private void privateMethod() {
        System.out.println("Private method in MyClass. Accessing privateVar: " + privateVar);
    }

    public void accessPrivate() {
        privateMethod(); // Private members can be accessed within the same class
    }
}
```

```java
// File: com/example/package1/AnotherClassInSamePackage.java
package com.example.package1;

public class AnotherClassInSamePackage {
    public void testAccess() {
        MyClass obj = new MyClass();
        System.out.println("--- Access from same package (AnotherClassInSamePackage) ---");
        System.out.println("Public var: " + obj.publicVar);
        System.out.println("Protected var: " + obj.protectedVar);
        System.out.println("Default var: " + obj.defaultVar);
        // System.out.println("Private var: " + obj.privateVar); // ERROR: privateVar is not visible

        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        // obj.privateMethod(); // ERROR: privateMethod() has private access
    }
}
```

```java
// File: com/example/package2/SubClass.java
package com.example.package2;

import com.example.package1.MyClass;

public class SubClass extends MyClass {
    public void testAccess() {
        System.out.println("--- Access from SubClass in different package ---");
        System.out.println("Public var: " + publicVar);     // Accessible
        System.out.println("Protected var: " + protectedVar); // Accessible (inherited)
        // System.out.println("Default var: " + defaultVar); // ERROR: defaultVar not visible (different package)
        // System.out.println("Private var: " + privateVar); // ERROR: privateVar not visible

        publicMethod();     // Accessible
        protectedMethod();  // Accessible (inherited)
        // defaultMethod(); // ERROR: defaultMethod() not visible
        // privateMethod(); // ERROR: privateMethod() not visible
    }
}
```

```java
// File: com/example/main/AccessModifiersDemo.java (Main class)
package com.example.main;

import com.example.package1.MyClass;
import com.example.package1.AnotherClassInSamePackage;
import com.example.package2.SubClass;

public class AccessModifiersDemo {
    public static void main(String[] args) {
        System.out.println("--- Access from different package (main method) ---");
        MyClass obj = new MyClass();
        System.out.println("Public var: " + obj.publicVar);
        // System.out.println("Protected var: " + obj.protectedVar); // ERROR: protectedVar not visible
        // System.out.println("Default var: " + obj.defaultVar);     // ERROR: defaultVar not visible
        // System.out.println("Private var: " + obj.privateVar);     // ERROR: privateVar not visible

        obj.publicMethod();
        // obj.protectedMethod(); // ERROR
        // obj.defaultMethod();   // ERROR
        obj.accessPrivate(); // Can access private indirectly via a public method

        System.out.println("\n-------------------------------------------");
        AnotherClassInSamePackage anotherObj = new AnotherClassInSamePackage();
        anotherObj.testAccess();

        System.out.println("\n-------------------------------------------");
        SubClass subObj = new SubClass();
        subObj.testAccess();
    }
}
```

### Encapsulation

Encapsulation is the bundling of data (attributes) and methods that operate on the data into a single unit (class). It also involves restricting direct access to some of an object's components, typically achieved by making fields `private` and providing `public` methods (getters and setters) to access and modify them.

**Benefits:**
*   **Data Hiding:** Prevents external code from directly modifying internal state, protecting data integrity.
*   **Flexibility:** Allows changes to the internal implementation without affecting external code.
*   **Maintainability:** Easier to debug and maintain code.

```java
class Account {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public Account(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        // Validate initial balance
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        }
    }

    // Getter methods (accessor methods)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter methods (mutator methods) - allows controlled modification
    // account number is typically not changeable
    // public void setAccountNumber(String accountNumber) {
    //     this.accountNumber = accountNumber;
    // }

    // No setter for name in this example, assuming it's set once in constructor

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient funds. Current balance: " + balance);
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Account myAccount = new Account("123456789", "John Doe", 1000.0);

        // Accessing data through public getter methods
        System.out.println("Account Holder: " + myAccount.getAccountHolderName());
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Current Balance: " + myAccount.getBalance());

        // Modifying data through public setter/mutator methods
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.withdraw(1500.0); // Insufficient funds

        System.out.println("Final Balance: " + myAccount.getBalance());

        // myAccount.balance = -500; // This would be possible without encapsulation (if 'balance' was public)
                                  // But now it's private, so this line causes a compile-time error.
    }
}
```

### Inheritance

Inheritance is a mechanism where one class (subclass/child class) acquires the properties and behaviors (fields and methods) of another class (superclass/parent class). It promotes code reusability and represents an "is-a" relationship.

#### Extends Keyword
The `extends` keyword is used to make one class inherit from another.

```java
// Parent Class (Superclass)
class Vehicle {
    String brand;
    String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void drive() {
        System.out.println(brand + " " + model + " is driving.");
    }

    public void displayVehicleInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

// Child Class (Subclass) - Car inherits from Vehicle
class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model); // Calls the constructor of the superclass (Vehicle)
        this.numberOfDoors = numberOfDoors;
    }

    public void accelerate() {
        System.out.println(brand + " " + model + " is accelerating.");
    }

    // You can override parent class methods (Polymorphism)
    @Override // Optional, but good practice to indicate method overriding
    public void displayVehicleInfo() {
        super.displayVehicleInfo(); // Call parent's method
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Another Child Class - Motorcycle inherits from Vehicle
class Motorcycle extends Vehicle {
    boolean hasSideCar;

    public Motorcycle(String brand, String model, boolean hasSideCar) {
        super(brand, model);
        this.hasSideCar = hasSideCar;
    }

    public void wheelie() {
        System.out.println(brand + " " + model + " is doing a wheelie!");
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Has Side Car: " + hasSideCar);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Create an object of the parent class
        Vehicle genericVehicle = new Vehicle("Generic", "ModelX");
        genericVehicle.drive();
        genericVehicle.displayVehicleInfo();

        System.out.println("\n--- Car Object ---");
        // Create an object of the child class Car
        Car myCar = new Car("Toyota", "Camry", 4);
        myCar.drive();         // Inherited method from Vehicle
        myCar.accelerate();    // Car's own method
        myCar.displayVehicleInfo(); // Overridden method

        System.out.println("\n--- Motorcycle Object ---");
        // Create an object of the child class Motorcycle
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", "Iron 883", false);
        myMotorcycle.drive();        // Inherited method
        myMotorcycle.wheelie();      // Motorcycle's own method
        myMotorcycle.displayVehicleInfo(); // Overridden method
    }
}
```

#### Super Keyword
The `super` keyword is used to:
1.  **Call the superclass constructor:** `super()` or `super(arguments)` must be the first statement in the subclass constructor.
2.  **Access superclass methods:** `super.methodName()` when a subclass has overridden a method, and you want to call the superclass's version.
3.  **Access superclass fields:** `super.fieldName` when a subclass has a field with the same name as a superclass field.

### Method Overriding
Method overriding occurs when a subclass provides a specific implementation for a method that is already defined in its superclass. The method signature (name, parameters, and return type) must be the same as in the superclass.

*   `@Override` annotation is optional but recommended for clarity and compile-time checking.
*   Access modifier of the overriding method cannot be more restrictive than the overridden method.
*   `static` methods cannot be overridden (they can be redefined, but it's not overriding).
*   `final` methods cannot be overridden.

### Polymorphism

Polymorphism means "many forms." In Java, it refers to the ability of an object to take on many forms. Specifically, a reference variable of a superclass type can refer to an object of any of its subclasses. This allows for flexibility and extensibility.

#### Compile-time Polymorphism (Method Overloading)
Achieved when multiple methods with the same name but different parameters exist in the same class. The compiler determines which method to call based on the arguments passed. (Already covered in [Methods](#method-overloading)).

#### Run-time Polymorphism (Method Overriding)
Achieved through inheritance and method overriding. The decision of which method to call is made at runtime, based on the actual object type, not the reference type.

```java
// Parent class
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

    public void scratch() {
        System.out.println("Cat scratches the furniture");
    }
}

public class RuntimePolymorphismExample {
    public static void main(String[] args) {
        // Parent class reference referring to a child class object
        Animal myAnimal1 = new Dog(); // myAnimal1 is an Animal reference, but points to a Dog object
        Animal myAnimal2 = new Cat(); // myAnimal2 is an Animal reference, but points to a Cat object
        Animal myAnimal3 = new Animal(); // myAnimal3 points to an Animal object

        // Calling overridden methods: the actual method called depends on the object type at runtime
        System.out.println("--- Polymorphic Behavior ---");
        myAnimal1.makeSound(); // Output: Dog barks
        myAnimal2.makeSound(); // Output: Cat meows
        myAnimal3.makeSound(); // Output: Animal makes a sound

        // A reference variable can only call methods that are defined in its type (or inherited)
        // myAnimal1.fetch(); // Compile-time error: 'fetch()' is not defined in Animal class

        // If you need to call specific subclass methods, you might need type casting (downcasting)
        System.out.println("\n--- Type Casting (Downcasting) ---");
        if (myAnimal1 instanceof Dog) { // Check if myAnimal1 actually refers to a Dog object
            Dog dog = (Dog) myAnimal1; // Downcast to Dog type
            dog.fetch(); // Now you can call Dog-specific methods
        }

        // Example of an array of Animal references holding different Animal types
        System.out.println("\n--- Array of Polymorphic Objects ---");
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Animal();

        for (Animal animal : animals) {
            animal.makeSound(); // Demonstrates runtime polymorphism
        }
    }
}
```

### Abstraction

Abstraction is the concept of hiding the complex implementation details and showing only the essential features of an object. It focuses on "what" an object does rather than "how" it does it. In Java, abstraction is achieved using **abstract classes** and **interfaces**.

#### Abstract Classes
*   A class declared with the `abstract` keyword.
*   Cannot be instantiated (you cannot create objects of an abstract class).
*   Can have abstract methods (methods declared without an implementation) and concrete methods (methods with implementation).
*   If a class contains at least one abstract method, it must be declared abstract.
*   Subclasses must implement all abstract methods of the abstract parent class, or they too must be declared abstract.

```java
// Abstract Class
abstract class Shape {
    String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method (no body) - must be implemented by concrete subclasses
    public abstract double calculateArea();

    // Concrete method (with body)
    public void displayColor() {
        System.out.println("This shape's color is: " + color);
    }
}

// Concrete Subclass 1
class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete Subclass 2
class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        // Shape s = new Shape("Red"); // Compile-time error: Cannot instantiate the abstract class Shape

        Circle circle = new Circle("Blue", 5.0);
        Rectangle rectangle = new Rectangle("Green", 4.0, 6.0);

        System.out.println("--- Circle Information ---");
        circle.displayColor();
        System.out.println("Circle Area: " + circle.calculateArea());

        System.out.println("\n--- Rectangle Information ---");
        rectangle.displayColor();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        // Polymorphism with abstract classes:
        System.out.println("\n--- Polymorphism with Abstract Class ---");
        Shape s1 = new Circle("Yellow", 7.0);
        Shape s2 = new Rectangle("Purple", 3.0, 5.0);

        System.out.println("Area of s1 (Yellow Circle): " + s1.calculateArea());
        s1.displayColor();
        System.out.println("Area of s2 (Purple Rectangle): " + s2.calculateArea());
        s2.displayColor();
    }
}
```

#### Interfaces
*   A blueprint of a class that can only contain abstract methods (before Java 8) and constants.
*   In Java 8, `default` and `static` methods were introduced.
*   In Java 9, `private` methods were introduced.
*   All methods in an interface are implicitly `public` and `abstract` (before Java 8 default/static methods).
*   All fields are implicitly `public`, `static`, and `final`.
*   A class `implements` an interface using the `implements` keyword.
*   A class can implement multiple interfaces (achieves multiple inheritance of type).
*   Interfaces support the "has-a" or "can-do" relationship.

```java
// Interface 1
interface Flyable {
    // All variables in an interface are public static final by default
    int MAX_ALTITUDE = 10000;

    // All methods are public abstract by default
    void fly();
    void land();

    // Default method (Java 8+)
    default void takeOff() {
        System.out.println("Taking off... (default behavior)");
    }

    // Static method (Java 8+)
    static void describeFlying() {
        System.out.println("Flyable objects can move through the air.");
    }
}

// Interface 2
interface Swimmable {
    void swim();
    void dive();
}

// Class implementing multiple interfaces
class Duck implements Flyable, Swimmable {
    String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying!");
    }

    @Override
    public void land() {
        System.out.println(name + " is landing.");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming gracefully.");
    }

    @Override
    public void dive() {
        System.out.println(name + " is diving underwater.");
    }

    // A duck has its own method
    public void quack() {
        System.out.println(name + " says Quack!");
    }
}

// Another class implementing an interface
class Airplane implements Flyable {
    String model;

    public Airplane(String model) {
        this.model = model;
    }

    @Override
    public void fly() {
        System.out.println(model + " is soaring high in the sky!");
    }

    @Override
    public void land() {
        System.out.println(model + " is landing on the runway.");
    }

    // Can override default method if needed
    @Override
    public void takeOff() {
        System.out.println(model + " is roaring down the runway for takeoff!");
    }
}


public class InterfaceExample {
    public static void main(String[] args) {
        Duck donald = new Duck("Donald");
        Airplane boeing = new Airplane("Boeing 747");

        System.out.println("--- Duck Actions ---");
        donald.takeOff(); // Uses default method from Flyable
        donald.fly();
        donald.swim();
        donald.dive();
        donald.land();
        donald.quack();

        System.out.println("\n--- Airplane Actions ---");
        boeing.takeOff(); // Uses overridden default method
        boeing.fly();
        boeing.land();

        System.out.println("\n--- Interface Static Method ---");
        Flyable.describeFlying(); // Call static method directly from interface

        System.out.println("\n--- Interface Constant ---");
        System.out.println("Max altitude for flyable objects: " + Flyable.MAX_ALTITUDE);

        // Polymorphism with interfaces
        System.out.println("\n--- Polymorphism with Interfaces ---");
        Flyable f1 = new Duck("Daffy");
        Flyable f2 = new Airplane("Airbus A380");

        f1.fly();
        f2.fly();
        // f1.swim(); // Compile-time error: swim() is not defined in Flyable interface
        // You would need to downcast if you want to call Swimmable methods on Daffy
        if (f1 instanceof Swimmable) {
            ((Swimmable)f1).swim();
        }
    }
}
```

### Inner Classes

An inner class is a class defined inside another class. They are used to logically group classes that only used in one place, increase encapsulation, and create more readable and maintainable code.

Types of Inner Classes:
1.  **Non-static (Member) Inner Class:** An instance of the inner class cannot be created without an instance of the outer class. It has access to all members (fields and methods) of the outer class, including private ones.
2.  **Static Nested Class:** A static inner class. It does not need an instance of the outer class to be created. It can only access static members of the outer class.
3.  **Local Class:** Defined inside a method, constructor, or block. Its scope is limited to that block.
4.  **Anonymous Inner Class:** An inner class without a name. Used for one-time use implementations of interfaces or abstract classes.

```java
public class OuterClass {
    private int outerX = 10;
    static int staticOuterY = 20;

    // 1. Non-static (Member) Inner Class
    class InnerClass {
        int innerZ = 30;

        public void displayInner() {
            System.out.println("--- Member Inner Class ---");
            System.out.println("Outer X from Inner: " + outerX); // Can access private outer members
            System.out.println("Static Outer Y from Inner: " + staticOuterY);
            System.out.println("Inner Z: " + innerZ);
        }
    }

    // 2. Static Nested Class
    static class StaticNestedClass {
        int staticInnerA = 40;

        public void displayStaticInner() {
            System.out.println("\n--- Static Nested Class ---");
            // System.out.println("Outer X from Static Inner: " + outerX); // ERROR: Cannot access non-static outer members
            System.out.println("Static Outer Y from Static Inner: " + staticOuterY); // Can access static outer members
            System.out.println("Static Inner A: " + staticInnerA);
        }
    }

    public void outerMethod() {
        int methodVar = 50;

        // 3. Local Class
        class LocalClass {
            public void displayLocal() {
                System.out.println("\n--- Local Class ---");
                System.out.println("Outer X from Local: " + outerX);
                System.out.println("Static Outer Y from Local: " + staticOuterY);
                System.out.println("Method Var from Local: " + methodVar); // Can access final or effectively final local variables
            }
        }

        LocalClass localObj = new LocalClass();
        localObj.displayLocal();
    }

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();

        // Creating an instance of Member Inner Class
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.displayInner();

        // Creating an instance of Static Nested Class
        OuterClass.StaticNestedClass staticInnerObj = new OuterClass.StaticNestedClass();
        staticInnerObj.displayStaticInner();

        // Calling method that contains a Local Class
        outerObj.outerMethod();

        // 4. Anonymous Inner Class
        System.out.println("\n--- Anonymous Inner Class ---");
        // Implementing an interface using an anonymous inner class
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is from an anonymous inner class implementing Runnable.");
                System.out.println("Accessing outerX from Anonymous: " + outerObj.outerX);
            }
        };
        Thread t = new Thread(myRunnable);
        t.start();

        // Implementing an abstract class using an anonymous inner class
        abstract class Greeter {
            public abstract void greet();
        }

        Greeter englishGreeter = new Greeter() {
            @Override
            public void greet() {
                System.out.println("Hello there!");
            }
        };
        englishGreeter.greet();
    }
}
```

---

## 7. Exception Handling

### What are Exceptions?
An exception is an event that disrupts the normal flow of a program's instructions during execution. When an error occurs within a method, it typically creates an `Exception` object and "throws" it. The method then terminates without returning a value. The runtime system then attempts to find a "catch" block to handle the exception.

**Types of Exceptions:**
1.  **Checked Exceptions:** Exceptions that are checked at compile-time. The compiler forces the programmer to either `catch` them or `declare` them (using `throws` keyword). Examples: `IOException`, `SQLException`.
2.  **Unchecked Exceptions (Runtime Exceptions):** Exceptions that are not checked at compile-time. They occur during runtime due to programming errors. The compiler doesn't force handling them, but it's good practice to handle critical ones. Examples: `NullPointerException`, `ArrayIndexOutOfBoundsException`, `ArithmeticException`.
3.  **Errors:** Represent serious problems that a reasonable application should not try to catch. Examples: `OutOfMemoryError`, `StackOverflowError`.

**Exception Hierarchy:**
All exception classes are subclasses of `java.lang.Throwable`.
`Throwable`
  `- `java.lang.Error` (Unrecoverable)
  `- `java.lang.Exception` (Recoverable)
    `- `java.lang.IOException` (Checked)
    `- `java.lang.SQLException` (Checked)
    `- `java.lang.RuntimeException` (Unchecked)
      `- `NullPointerException`
      `- `ArrayIndexOutOfBoundsException`
      `- `ArithmeticException`

### Try-Catch-Finally Blocks

The primary way to handle exceptions in Java is using `try`, `catch`, and `finally` blocks.

*   **`try`:** The code that might throw an exception is placed inside the `try` block.
*   **`catch`:** If an exception occurs in the `try` block, the control is transferred to the `catch` block that matches the exception type. You can have multiple `catch` blocks for different exception types.
*   **`finally`:** The `finally` block always executes, regardless of whether an exception occurred or was caught. It's often used for cleanup operations (e.g., closing resources).

```java
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        // --- Example 1: ArithmeticException (Unchecked) ---
        System.out.println("--- ArithmeticException Example ---");
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
            System.out.println("Result: " + result); // This line will not be executed
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
            System.out.println("Exception details: " + e.getMessage());
        } finally {
            System.out.println("Arithmetic operation attempt finished.");
        }
        System.out.println("Program continues after ArithmeticException handling.\n");


        // --- Example 2: NullPointerException (Unchecked) ---
        System.out.println("--- NullPointerException Example ---");
        String text = null;
        try {
            System.out.println("Length of text: " + text.length()); // Throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: String is null!");
            System.out.println("Exception type: " + e.getClass().getName());
        } finally {
            System.out.println("Null check attempt finished.\n");
        }


        // --- Example 3: ArrayIndexOutOfBoundsException (Unchecked) ---
        System.out.println("--- ArrayIndexOutOfBoundsException Example ---");
        int[] numbers = {1, 2, 3};
        try {
            System.out.println("Number at index 5: " + numbers[5]); // Throws ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!");
            System.out.println("Exception message: " + e.getMessage());
        } finally {
            System.out.println("Array access attempt finished.\n");
        }


        // --- Example 4: Multiple Catch Blocks and InputMismatchException ---
        System.out.println("--- Multiple Catch and InputMismatchException Example ---");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt(); // Can throw InputMismatchException
            int divisor = 0;
            System.out.print("Enter a divisor: ");
            divisor = scanner.nextInt(); // Can throw InputMismatchException

            if (divisor == 0) {
                // We can explicitly throw an exception if a specific condition is met
                throw new ArithmeticException("Custom message: Divisor cannot be zero.");
            }

            int divisionResult = num / divisor;
            System.out.println("Division result: " + divisionResult);
        } catch (InputMismatchException e) {
            System.out.println("Input Error: Please enter a valid integer.");
            scanner.next(); // Consume the invalid input
        } catch (ArithmeticException e) {
            System.out.println("Calculation Error: " + e.getMessage());
        } catch (Exception e) { // Generic catch for any other unforeseen exceptions (always place last)
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Input and calculation attempt finished.");
            // Good practice to close resources here
            scanner.close(); // Close the scanner in the finally block
        }
        System.out.println("Program continues after multiple catch handling.\n");


        // --- Example 5: Checked Exception (IOException) ---
        System.out.println("--- Checked Exception (IOException) Example ---");
        FileReader fileReader = null;
        try {
            // This line might throw a FileNotFoundException (a subclass of IOException)
            fileReader = new FileReader("nonExistentFile.txt");
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println("\nFile read successfully.");
        } catch (IOException e) { // Catching the checked exception
            System.out.println("File Error: " + e.getMessage());
        } finally {
            System.out.println("File operation attempt finished.");
            if (fileReader != null) {
                try {
                    fileReader.close(); // Closing the resource
                    System.out.println("FileReader closed.");
                } catch (IOException e) {
                    System.out.println("Error closing FileReader: " + e.getMessage());
                }
            }
        }
        System.out.println("Program continues after IOException handling.\n");
    }
}
```

### Throw and Throws Keywords

*   **`throw`:** Used to explicitly throw an exception from a method or any block of code. You create an exception object and then use `throw` to signal that an error has occurred.

*   **`throws`:** Used in a method signature to declare that the method might throw one or more specified checked exceptions. This tells the caller of the method that they need to handle these exceptions. It doesn't actually throw the exception, but rather declares the possibility.

```java
import java.io.IOException;

public class ThrowThrowsExample {

    // Method that declares it might throw an IOException (a checked exception)
    public static void readFile(String filePath) throws IOException {
        if (filePath == null || filePath.isEmpty()) {
            // Throw a custom IllegalArgumentException (unchecked, no 'throws' needed for this)
            throw new IllegalArgumentException("File path cannot be null or empty.");
        }

        if (!filePath.equals("validFile.txt")) {
            // Explicitly throw an IOException
            throw new IOException("File not found: " + filePath);
        }

        System.out.println("Successfully read from: " + filePath);
    }

    // Method that implicitly throws an unchecked exception
    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            // Implicitly throws ArithmeticException. No 'throws' declaration needed.
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        System.out.println("--- Throwing Unchecked Exception ---");
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an error: " + e.getMessage());
        }

        System.out.println("\n--- Throwing Checked Exception ---");
        try {
            readFile("invalidFile.txt");
        } catch (IOException e) { // Must catch the declared IOException
            System.out.println("Caught file error: " + e.getMessage());
        } catch (IllegalArgumentException e) { // Also catch the unchecked exception thrown
            System.out.println("Caught argument error: " + e.getMessage());
        }

        System.out.println("\n--- Calling method with valid input ---");
        try {
            readFile("validFile.txt");
        } catch (IOException | IllegalArgumentException e) { // Multi-catch block (Java 7+)
            System.out.println("Caught unexpected error: " + e.getMessage());
        }
    }
}
```

### Custom Exceptions

You can create your own exception classes by extending `Exception` (for checked exceptions) or `RuntimeException` (for unchecked exceptions). This is useful for providing more specific error information tailored to your application's logic.

```java
// Custom Checked Exception
class InsufficientFundsException extends Exception {
    private double amount;

    public InsufficientFundsException(String message, double amount) {
        super(message);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            // Can use a standard RuntimeException or a custom unchecked one
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    // Method declares that it might throw InsufficientFundsException (a checked exception)
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (balance < amount) {
            // Throw our custom checked exception
            throw new InsufficientFundsException("Insufficient funds to withdraw " + amount, amount);
        }
        balance -= amount;
        System.out.println("Withdrew " + amount + ". New balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("JP123", 1000);
        System.out.println("Initial Balance: " + account.getBalance());

        // Test deposit
        try {
            account.deposit(200);
            account.deposit(-50); // This will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Deposit error: " + e.getMessage());
        }
        System.out.println("Balance after deposits: " + account.getBalance());

        // Test withdrawal
        try {
            account.withdraw(500);
            account.withdraw(800); // This will throw InsufficientFundsException
        } catch (InsufficientFundsException e) { // Must catch the custom checked exception
            System.out.println("Withdrawal error: " + e.getMessage());
            System.out.println("Amount tried to withdraw: " + e.getAmount());
            System.out.println("Current balance: " + account.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Withdrawal input error: " + e.getMessage());
        }
        System.out.println("Final Balance: " + account.getBalance());
    }
}
```

---

## 8. Collections Framework

The Java Collections Framework provides a set of interfaces and classes to represent and manipulate groups of objects (collections). It offers high-performance, reusable data structures.

### Overview of Collections

The core interfaces are:
*   **`Collection`:** The root interface for all collections.
    *   **`List`:** Ordered collection (sequence) that allows duplicate elements. Elements can be accessed by their integer index.
    *   **`Set`:** Collection that does not allow duplicate elements. No specific order is guaranteed (usually).
    *   **`Queue`:** Collection designed for holding elements prior to processing. Typically, elements are inserted at the tail and removed from the head (FIFO - First-In, First-Out).

*   **`Map`:** A collection that maps unique keys to values. Each key can map to at most one value. (Not directly part of the `Collection` interface hierarchy, but often considered part of the Collections Framework).

Commonly used concrete classes implementing these interfaces:
*   **List:** `ArrayList`, `LinkedList`, `Vector`
*   **Set:** `HashSet`, `TreeSet`, `LinkedHashSet`
*   **Queue:** `PriorityQueue`, `ArrayDeque`
*   **Map:** `HashMap`, `TreeMap`, `LinkedHashMap`

### List Interface (ArrayList, LinkedList, Vector)

*   **`List`:** An ordered collection (also known as a sequence). The user has precise control over where each element is inserted. The user can access elements by their integer index (position), and search for elements in the list. Allows duplicate elements.

#### `ArrayList`
*   Implements `List` interface.
*   Uses a dynamic array internally.
*   Good for random access (getting elements by index) because of direct memory access. `get(index)` is O(1).
*   Adding/removing elements in the middle can be slow (O(n)) because elements need to be shifted.
*   Adding elements at the end is usually fast (amortized O(1)).

```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        List<String> fruits = new ArrayList<>(); // Recommended to use interface type (List) for declaration

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Allows duplicates
        fruits.add(1, "Grape"); // Add at a specific index

        System.out.println("--- ArrayList Operations ---");
        System.out.println("Initial fruits: " + fruits); // [Apple, Grape, Banana, Orange, Apple]

        // Accessing elements by index
        System.out.println("Fruit at index 0: " + fruits.get(0)); // Apple

        // Checking if an element exists
        System.out.println("Contains \"Banana\"? " + fruits.contains("Banana")); // true
        System.out.println("Contains \"Mango\"? " + fruits.contains("Mango"));   // false

        // Getting the size of the list
        System.out.println("Number of fruits: " + fruits.size()); // 5

        // Removing elements
        fruits.remove("Orange"); // Remove first occurrence of "Orange"
        fruits.remove(0);       // Remove element at index 0 (which is now Grape)

        System.out.println("Fruits after removal: " + fruits); // [Banana, Apple]

        // Iterating through the list
        System.out.println("\n--- Iterating with for-each loop ---");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\n--- Iterating with Iterator ---");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        // Clearing the list
        fruits.clear();
        System.out.println("Fruits after clear: " + fruits); // []
        System.out.println("Is fruits list empty? " + fruits.isEmpty()); // true
    }
}
```

#### `LinkedList`
*   Implements `List` and `Deque` (Double Ended Queue) interfaces.
*   Uses a doubly-linked list internally.
*   Good for frequent insertions/deletions at the beginning or middle (O(1) for head/tail, O(n) for middle after finding position).
*   Slow for random access (O(n)) because it has to traverse the list from the beginning or end to reach an index.

```java
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>(); // Can use LinkedList directly

        names.add("Alice");
        names.add("Bob");
        names.addFirst("Charlie"); // Add to the beginning
        names.addLast("David");    // Add to the end

        System.out.println("--- LinkedList Operations ---");
        System.out.println("Initial names: " + names); // [Charlie, Alice, Bob, David]

        System.out.println("First element: " + names.getFirst()); // Charlie
        System.out.println("Last element: " + names.getLast());   // David

        names.removeFirst(); // Remove Charlie
        names.removeLast();  // Remove David

        System.out.println("Names after removing first/last: " + names); // [Alice, Bob]

        names.add(1, "Eve"); // Insert in the middle
        System.out.println("Names after inserting Eve: " + names); // [Alice, Eve, Bob]
    }
}
```

#### `Vector`
*   Similar to `ArrayList`, uses a dynamic array.
*   **Thread-safe** (synchronized methods). This makes it slower than `ArrayList`.
*   Rarely used in new code because `ArrayList` is generally faster in single-threaded environments, and `Collections.synchronizedList()` or `CopyOnWriteArrayList` are preferred for thread-safe lists.

### Set Interface (HashSet, TreeSet, LinkedHashSet)

*   **`Set`:** A collection that contains no duplicate elements. It models the mathematical set abstraction. There is no particular order for elements (unless specified by concrete implementation).

#### `HashSet`
*   Implements `Set` interface.
*   Uses a hash table for storage.
*   **Does not maintain insertion order**, and elements are not sorted.
*   Provides **O(1) average-case performance** for `add`, `remove`, `contains`, and `size` operations.
*   Best for fast lookups when order doesn't matter.

```java
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> uniqueColors = new HashSet<>();

        // Adding elements
        uniqueColors.add("Red");
        uniqueColors.add("Green");
        uniqueColors.add("Blue");
        uniqueColors.add("Red"); // Duplicate, will not be added

        System.out.println("--- HashSet Operations ---");
        System.out.println("Colors: " + uniqueColors); // Order might vary: [Red, Blue, Green]

        // Checking for existence
        System.out.println("Contains \"Green\"? " + uniqueColors.contains("Green")); // true
        System.out.println("Contains \"Yellow\"? " + uniqueColors.contains("Yellow")); // false

        // Removing an element
        uniqueColors.remove("Blue");
        System.out.println("Colors after removing Blue: " + uniqueColors);

        // Size
        System.out.println("Number of unique colors: " + uniqueColors.size());

        // Iterating
        System.out.println("\n--- Iterating HashSet ---");
        for (String color : uniqueColors) {
            System.out.println(color);
        }
    }
}
```

#### `TreeSet`
*   Implements `SortedSet` interface (which extends `Set`).
*   Stores elements in a **sorted (ascending) order** based on their natural ordering or a custom `Comparator`.
*   Uses a Red-Black tree internally.
*   **O(log n) performance** for `add`, `remove`, `contains`, and `size`.
*   Guarantees that elements are sorted.

```java
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> sortedNumbers = new TreeSet<>();

        sortedNumbers.add(50);
        sortedNumbers.add(10);
        sortedNumbers.add(30);
        sortedNumbers.add(20);
        sortedNumbers.add(10); // Duplicate, will not be added

        System.out.println("--- TreeSet Operations ---");
        System.out.println("Sorted Numbers: " + sortedNumbers); // [10, 20, 30, 50] (naturally sorted)

        // Other Set operations like contains, remove, size work similarly
    }
}
```

#### `LinkedHashSet`
*   Implements `Set` interface.
*   Maintains the **insertion order** of elements.
*   Uses a hash table and a doubly-linked list internally.
*   Performance is slightly worse than `HashSet` but generally better than `TreeSet` for basic operations (close to O(1) on average).

```java
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> orderedFruits = new LinkedHashSet<>();

        orderedFruits.add("Apple");
        orderedFruits.add("Banana");
        orderedFruits.add("Orange");
        orderedFruits.add("Mango");
        orderedFruits.add("Apple"); // Duplicate, ignored

        System.out.println("--- LinkedHashSet Operations ---");
        System.out.println("Ordered Fruits: " + orderedFruits); // [Apple, Banana, Orange, Mango] (insertion order preserved)
    }
}
```

### Map Interface (HashMap, TreeMap, LinkedHashMap)

*   **`Map`:** An object that maps keys to values. A `Map` cannot contain duplicate keys; each key can map to at most one value.

#### `HashMap`
*   Implements `Map` interface.
*   Uses a hash table for storage.
*   **Does not maintain any order** (neither insertion nor sorted).
*   Provides **O(1) average-case performance** for `put`, `get`, `remove`, and `size`.
*   Allows one null key and multiple null values.
*   Best for fast key-value lookups when order doesn't matter.

```java
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();

        // Adding key-value pairs
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Charlie", 76);
        studentScores.put("Alice", 98); // Updates the value for key "Alice"

        System.out.println("--- HashMap Operations ---");
        System.out.println("Student Scores: " + studentScores); // Order not guaranteed

        // Getting a value by key
        System.out.println("Alice's score: " + studentScores.get("Alice")); // 98
        System.out.println("David's score: " + studentScores.get("David")); // null (key not found)

        // Checking if a key or value exists
        System.out.println("Contains key \"Bob\"? " + studentScores.containsKey("Bob"));   // true
        System.out.println("Contains value 76? " + studentScores.containsValue(76)); // true

        // Removing a key-value pair
        studentScores.remove("Charlie");
        System.out.println("Scores after removing Charlie: " + studentScores);

        // Size
        System.out.println("Number of students: " + studentScores.size());

        // Iterating over keys, values, or entries
        System.out.println("\n--- Iterating HashMap ---");
        System.out.println("Keys:");
        for (String name : studentScores.keySet()) {
            System.out.println(name);
        }

        System.out.println("Values:");
        for (Integer score : studentScores.values()) {
            System.out.println(score);
        }

        System.out.println("Entries (Key-Value pairs):");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
```

#### `TreeMap`
*   Implements `SortedMap` interface (which extends `Map`).
*   Stores key-value pairs in **sorted (ascending) order** based on the natural ordering of keys or a custom `Comparator`.
*   Uses a Red-Black tree internally.
*   **O(log n) performance** for `put`, `get`, `remove`, and `size`.
*   Does not allow null keys.

```java
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new TreeMap<>();

        phoneBook.put("Charlie", "555-1111");
        phoneBook.put("Alice", "555-2222");
        phoneBook.put("Bob", "555-3333");
        phoneBook.put("David", "555-4444");

        System.out.println("--- TreeMap Operations ---");
        System.out.println("Phone Book: " + phoneBook); // Keys are sorted alphabetically: {Alice=555-2222, Bob=555-3333, Charlie=555-1111, David=555-4444}

        System.out.println("Alice's number: " + phoneBook.get("Alice"));

        // Iterating will also be in sorted key order
        System.out.println("\n--- Iterating TreeMap ---");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
```

#### `LinkedHashMap`
*   Implements `Map` interface.
*   Maintains the **insertion order** of key-value pairs (or access order, if configured).
*   Uses a hash table and a doubly-linked list internally.
*   Performance is slightly worse than `HashMap` but generally close to O(1) on average.

```java
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new LinkedHashMap<>();

        employeeMap.put(103, "Sarah");
        employeeMap.put(101, "Mike");
        employeeMap.put(102, "Emily");
        employeeMap.put(104, "John");

        System.out.println("--- LinkedHashMap Operations ---");
        System.out.println("Employee Map: " + employeeMap); // {103=Sarah, 101=Mike, 102=Emily, 104=John} (insertion order)

        // Iterating will preserve insertion order
        System.out.println("\n--- Iterating LinkedHashMap ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
```

### Iterators

An `Iterator` is an object that enables you to traverse a collection and remove elements during traversal. It's the universal way to access elements in any `Collection`.

```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("London"); // Duplicate

        System.out.println("Original list: " + cities);

        // Get an Iterator for the list
        Iterator<String> cityIterator = cities.iterator();

        System.out.println("\n--- Iterating and Removing with Iterator ---");
        while (cityIterator.hasNext()) {
            String city = cityIterator.next();
            System.out.println("Processing: " + city);
            if (city.equals("London")) {
                cityIterator.remove(); // Removes the current element from the underlying collection
                System.out.println("Removed London!");
            }
        }
        System.out.println("List after iteration: " + cities); // [New York, Paris, Tokyo]

        // Trying to remove directly while iterating with for-each loop will cause ConcurrentModificationException
        // try {
        //     for (String city : cities) {
        //         if (city.equals("Paris")) {
        //             cities.remove(city); // ERROR: ConcurrentModificationException
        //         }
        //     }
        // } catch (Exception e) {
        //     System.out.println("\nCaught expected error: " + e);
        // }
    }
}
```

---

## 9. File Handling (I/O)

Java's I/O (Input/Output) API allows programs to interact with external data sources like files, networks, or other programs. File handling is a crucial part of this, enabling reading from and writing to files.

### File Class

The `java.io.File` class represents a file or directory path in the filesystem. It does not read or write file content but provides methods for:
*   Checking existence (`exists()`)
*   Getting path information (`getAbsolutePath()`, `getName()`)
*   Checking properties (`isFile()`, `isDirectory()`, `canRead()`, `canWrite()`)
*   Creating/deleting files/directories (`createNewFile()`, `delete()`, `mkdir()`)
*   Listing directory contents (`list()`, `listFiles()`)

```java
import java.io.File;
import java.io.IOException;

public class FileClassExample {
    public static void main(String[] args) {
        // 1. Create a File object representing a file
        File file = new File("myFile.txt");

        System.out.println("--- File Information ---");
        System.out.println("File Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Parent Directory: " + file.getParent());
        System.out.println("Exists: " + file.exists());
        System.out.println("Is File: " + file.isFile());
        System.out.println("Is Directory: " + file.isDirectory());
        System.out.println("Can Read: " + file.canRead());
        System.out.println("Can Write: " + file.canWrite());

        // 2. Create a new file
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("\n'myFile.txt' created successfully!");
                } else {
                    System.out.println("\nFailed to create 'myFile.txt'.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred during file creation: " + e.getMessage());
            }
        } else {
            System.out.println("\n'myFile.txt' already exists.");
        }

        // 3. Create a directory
        File directory = new File("myDirectory");
        if (!directory.exists()) {
            if (directory.mkdir()) { // Use mkdirs() to create parent directories too
                System.out.println("Directory 'myDirectory' created successfully!");
            } else {
                System.out.println("Failed to create directory 'myDirectory'.");
            }
        } else {
            System.out.println("Directory 'myDirectory' already exists.");
        }

        // 4. List contents of a directory (e.g., current directory)
        File currentDir = new File("."); // "." represents the current directory
        System.out.println("\n--- Contents of current directory ---");
        String[] fileNames = currentDir.list();
        if (fileNames != null) {
            for (String name : fileNames) {
                System.out.println(name);
            }
        }

        // 5. Delete a file
        // To delete 'myFile.txt' created earlier, uncomment the next block
        /*
        System.out.println("\nAttempting to delete 'myFile.txt'...");
        if (file.delete()) {
            System.out.println("'myFile.txt' deleted successfully.");
        } else {
            System.out.println("Failed to delete 'myFile.txt'.");
        }
        */

        // 6. Delete a directory (must be empty)
        // To delete 'myDirectory', ensure it's empty first.
        /*
        System.out.println("\nAttempting to delete 'myDirectory'...");
        if (directory.delete()) {
            System.out.println("'myDirectory' deleted successfully.");
        } else {
            System.out.println("Failed to delete 'myDirectory'. (Make sure it's empty)");
        }
        */
    }
}
```

### Reading from Files (FileReader, BufferedReader, Scanner)

Java provides several classes for reading data from files.

*   **`FileReader`:** Reads character streams. Good for reading text files character by character.
*   **`BufferedReader`:** Wraps a `FileReader` (or any other `Reader`) to provide buffered input, making reading more efficient, especially line by line.
*   **`Scanner`:** A versatile class for parsing primitive types and strings using regular expressions. Can read from `InputStream` or `File`. Very convenient for reading word by word or line by line.

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File; // For Scanner with File

public class FileReaderExample {

    private static final String FILENAME = "sample.txt";

    public static void main(String[] args) {
        // First, ensure the file exists and has some content for reading examples
        try {
            java.io.FileWriter writer = new java.io.FileWriter(FILENAME);
            writer.write("This is the first line.\n");
            writer.write("This is the second line with some numbers: 123 45.67.\n");
            writer.write("And a final line.");
            writer.close();
            System.out.println("Created " + FILENAME + " for reading examples.\n");
        } catch (IOException e) {
            System.err.println("Error setting up sample file: " + e.getMessage());
        }

        // --- 1. Reading character by character using FileReader ---
        System.out.println("--- Reading with FileReader (char by char) ---");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(FILENAME);
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println("\nFinished FileReader.\n");
        } catch (IOException e) {
            System.err.println("FileReader error: " + e.getMessage());
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.err.println("Error closing FileReader: " + e.getMessage());
                }
            }
        }

        // --- 2. Reading line by line using BufferedReader ---
        System.out.println("--- Reading with BufferedReader (line by line) ---");
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(FILENAME));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Finished BufferedReader.\n");
        } catch (IOException e) {
            System.err.println("BufferedReader error: " + e.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.err.println("Error closing BufferedReader: " + e.getMessage());
                }
            }
        }

        // --- 3. Reading with Scanner (tokens and lines) ---
        System.out.println("--- Reading with Scanner (tokens and lines) ---");
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(FILENAME));

            // Read word by word
            System.out.println("Reading word by word:");
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) { // Check if the next token is an int
                    System.out.println("Int: " + scanner.nextInt());
                } else if (scanner.hasNextDouble()) { // Check if it's a double
                    System.out.println("Double: " + scanner.nextDouble());
                } else {
                    System.out.println("Word: " + scanner.next());
                }
            }
            System.out.println("Finished Scanner (word by word).\n");

            // Reset scanner to read lines
            scanner = new Scanner(new File(FILENAME)); // Re-initialize scanner for line reading
            System.out.println("Reading line by line with nextLine():");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            System.out.println("Finished Scanner (line by line).\n");

        } catch (IOException e) {
            System.err.println("Scanner error: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
```

### Writing to Files (FileWriter, BufferedWriter, PrintWriter)

Similar to reading, Java provides classes for writing data to files.

*   **`FileWriter`:** Writes character streams. Basic for writing text files character by character.
*   **`BufferedWriter`:** Wraps a `FileWriter` (or any other `Writer`) to provide buffered output, making writing more efficient.
*   **`PrintWriter`:** A more advanced character-output stream that prints formatted representations of objects to a text-output stream. It has convenient methods like `print()`, `println()`, and `printf()`, and can automatically flush output.

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths; // For cleaning up files

public class FileWriterExample {

    private static final String FILE_WRITER_FILE = "output_filewriter.txt";
    private static final String BUFFERED_WRITER_FILE = "output_bufferedwriter.txt";
    private static final String PRINT_WRITER_FILE = "output_printwriter.txt";

    public static void main(String[] args) {
        // Clean up previous files if they exist
        try {
            Files.deleteIfExists(Paths.get(FILE_WRITER_FILE));
            Files.deleteIfExists(Paths.get(BUFFERED_WRITER_FILE));
            Files.deleteIfExists(Paths.get(PRINT_WRITER_FILE));
            System.out.println("Cleaned up old output files.\n");
        } catch (IOException e) {
            System.err.println("Error during cleanup: " + e.getMessage());
        }


        // --- 1. Writing with FileWriter ---
        System.out.println("--- Writing with FileWriter ---");
        FileWriter fileWriter = null;
        try {
            // true for append mode, false (default) for overwrite mode
            fileWriter = new FileWriter(FILE_WRITER_FILE, false);
            fileWriter.write("This is the first line written by FileWriter.\n");
            fileWriter.write("And this is the second line.");
            fileWriter.flush(); // Ensure data is written to disk
            System.out.println("Content written to " + FILE_WRITER_FILE + "\n");
        } catch (IOException e) {
            System.err.println("FileWriter error: " + e.getMessage());
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close(); // Close the stream to release resources
                } catch (IOException e) {
                    System.err.println("Error closing FileWriter: " + e.getMessage());
                }
            }
        }


        // --- 2. Writing with BufferedWriter ---
        System.out.println("--- Writing with BufferedWriter ---");
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(BUFFERED_WRITER_FILE));
            bufferedWriter.write("This is the first line written by BufferedWriter.");
            bufferedWriter.newLine(); // Writes a system-dependent new line character
            bufferedWriter.write("This is the second line.");
            bufferedWriter.newLine();
            bufferedWriter.write("A third line.");
            System.out.println("Content written to " + BUFFERED_WRITER_FILE + "\n");
        } catch (IOException e) {
            System.err.println("BufferedWriter error: " + e.getMessage());
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close(); // Closing BufferedWriter also closes the underlying FileWriter
                } catch (IOException e) {
                    System.err.println("Error closing BufferedWriter: " + e.getMessage());
                }
            }
        }


        // --- 3. Writing with PrintWriter ---
        System.out.println("--- Writing with PrintWriter ---");
        PrintWriter printWriter = null;
        try {
            // Can wrap a FileWriter directly or use a File object
            printWriter = new PrintWriter(new FileWriter(PRINT_WRITER_FILE, true)); // true for append
            printWriter.println("This is line 1 from PrintWriter."); // Automatically adds newline
            printWriter.printf("Formatted output: Name = %s, Age = %d%n", "Java", 25); // Formatted output
            printWriter.print("This is line 3, no newline.");
            printWriter.flush(); // Ensure content is written
            System.out.println("Content written to " + PRINT_WRITER_FILE + "\n");
        } catch (IOException e) {
            System.err.println("PrintWriter error: " + e.getMessage());
        } finally {
            if (printWriter != null) {
                printWriter.close(); // Closing PrintWriter also closes underlying stream
            }
        }

        // Using try-with-resources (Java 7+) for automatic resource management
        System.out.println("--- Writing with try-with-resources (Java 7+) ---");
        String autoCloseFile = "auto_close.txt";
        try (PrintWriter pw = new PrintWriter(new FileWriter(autoCloseFile))) {
            pw.println("This file was written using try-with-resources.");
            pw.println("The resource will be automatically closed.");
            System.out.println("Content written to " + autoCloseFile + ". Resource automatically closed.");
        } catch (IOException e) {
            System.err.println("Try-with-resources error: " + e.getMessage());
        }
    }
}
```

---

## 10. Multithreading

Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU. Each part of such a program is called a thread.

### What is a Thread?
A thread is a lightweight subprocess, the smallest unit of execution within a process. A single program can have multiple threads running concurrently.

**Benefits of Multithreading:**
*   **Improved Responsiveness:** An application can remain responsive to user input while performing long-running tasks in the background.
*   **Better Resource Utilization:** CPU can execute multiple tasks simultaneously.
*   **Faster Execution:** Tasks that can be broken down into independent subtasks can run in parallel.
*   **Simplified Model:** For certain problem domains, using threads can simplify program design.

### Creating Threads (Extending Thread, Implementing Runnable)

There are two primary ways to create threads in Java:

#### 1. Extending the `Thread` class
*   Create a class that `extends` `java.lang.Thread`.
*   Override the `run()` method with the code that the thread should execute.
*   Create an instance of your class and call its `start()` method.

**Limitation:** Java does not support multiple inheritance, so if your class already extends another class, you cannot use this approach.

```java
// 1. Extend the Thread class
class MyThread extends Thread {
    private String threadName;

    public MyThread(String name) {
        this.threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50); // Pause for 50 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
}

public class ThreadExtensionExample {
    public static void main(String[] args) {
        System.out.println("Main thread started.");

        MyThread thread1 = new MyThread("Thread-1");
        thread1.start(); // Invokes run() method in a new thread

        MyThread thread2 = new MyThread("Thread-2");
        thread2.start(); // Invokes run() method in another new thread

        System.out.println("Main thread finished creating child threads.");

        // We can make the main thread wait for child threads to complete
        try {
            thread1.join(); // Main thread waits for thread1 to die
            thread2.join(); // Main thread waits for thread2 to die
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while joining.");
        }

        System.out.println("All threads have finished. Main thread exiting.");
    }
}
```

#### 2. Implementing the `Runnable` interface
*   Create a class that `implements` `java.lang.Runnable`.
*   Override the `run()` method with the code that the thread should execute.
*   Create an instance of your `Runnable` class, then create a `Thread` object by passing your `Runnable` instance to its constructor, and finally call the `Thread` object's `start()` method.

**Advantage:** This approach allows your class to extend another class while still enabling multithreading. It separates the task (Runnable) from the thread itself.

```java
// 2. Implement the Runnable interface
class MyRunnable implements Runnable {
    private String taskName;

    public MyRunnable(String name) {
        this.taskName = name;
        System.out.println("Creating Runnable task: " + taskName);
    }

    @Override
    public void run() {
        System.out.println("Running task: " + taskName);
        try {
            for (int i = 3; i > 0; i--) {
                System.out.println("Task: " + taskName + ", count: " + i);
                Thread.sleep(70); // Pause
            }
        } catch (InterruptedException e) {
            System.out.println("Task " + taskName + " interrupted.");
        }
        System.out.println("Task " + taskName + " completed.");
    }
}

public class RunnableImplementationExample {
    public static void main(String[] args) {
        System.out.println("Main thread started.");

        // Create instances of MyRunnable
        MyRunnable task1 = new MyRunnable("Task-A");
        MyRunnable task2 = new MyRunnable("Task-B");

        // Create Thread objects by passing Runnable instances
        Thread threadA = new Thread(task1);
        Thread threadB = new Thread(task2);

        threadA.start(); // Start thread for Task-A
        threadB.start(); // Start thread for Task-B

        System.out.println("Main thread finished launching tasks.");

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for tasks.");
        }
        System.out.println("All tasks finished. Main thread exiting.");

        // Using Lambda for Runnable (Java 8+)
        System.out.println("\n--- Lambda Runnable Example ---");
        Thread lambdaThread = new Thread(() -> {
            System.out.println("Running from Lambda Thread!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Lambda Thread done.");
        });
        lambdaThread.start();
        try {
            lambdaThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted joining lambda.");
        }
        System.out.println("Lambda thread joined.");
    }
}
```

### Thread Lifecycle

A thread goes through various stages in its life cycle.

`NEW` -> `RUNNABLE` -> `RUNNING` -> `BLOCKED/WAITING/TIMED_WAITING` -> `TERMINATED`

*   **`NEW`:** The thread has been created but not yet started (after `new Thread()` but before `start()`).
*   **`RUNNABLE`:** The thread is executing in the JVM. It may be running or it may be waiting for CPU resources.
    *   **`RUNNING`:** The operating system has selected the thread to run.
*   **`BLOCKED`:** The thread is waiting for a monitor lock to enter a synchronized block/method.
*   **`WAITING`:** The thread is waiting indefinitely for another thread to perform a particular action (e.g., calling `wait()`, `join()`).
*   **`TIMED_WAITING`:** The thread is waiting for another thread to perform an action for a specified waiting time (e.g., calling `sleep()`, `wait(long)`, `join(long)`).
*   **`TERMINATED`:** The thread has completed its execution or has been aborted.

```java
class StatePrinterThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(100); // TIMED_WAITING
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("StatePrinterThread was interrupted.");
        }
        // When it finishes sleep, it goes back to RUNNABLE, then TERMINATED
    }
}

public class ThreadLifecycleExample {
    public static void main(String[] args) throws InterruptedException {
        StatePrinterThread thread = new StatePrinterThread();

        System.out.println("1. Before start(), state: " + thread.getState()); // NEW

        thread.start();
        System.out.println("2. After start(), state: " + thread.getState()); // RUNNABLE (or sometimes RUNNING briefly)

        // Give it some time to enter TIMED_WAITING state
        Thread.sleep(50);
        System.out.println("3. During sleep(), state: " + thread.getState()); // TIMED_WAITING

        thread.join(); // Main thread waits for 'thread' to die
        System.out.println("4. After join(), state: " + thread.getState()); // TERMINATED
    }
}
```

### Thread Synchronization

When multiple threads access shared resources (like a shared variable or a file), there's a risk of data inconsistency. **Synchronization** is used to control the access of multiple threads to shared resources, ensuring that only one thread can access the resource at a time.

Java provides several mechanisms for synchronization:

1.  **`synchronized` keyword:**
    *   **Synchronized Method:** Declaring a method as `synchronized` ensures that only one thread can execute that method on a given object instance at any time. It acquires a lock on the object itself.
    *   **Synchronized Block:** Allows finer-grained control. You can synchronize on any object, not just `this`. `synchronized(objectReference) { ... }`

2.  **`volatile` keyword:** Ensures that changes to a variable are immediately visible to all threads, preventing threads from working with cached copies of the variable. (Does not provide mutual exclusion like `synchronized`).

3.  **`ReentrantLock` (from `java.util.concurrent.locks`):** More flexible than `synchronized` blocks/methods. Allows for more advanced locking mechanisms, like fair locks, tryLock, etc.

4.  **Semaphores, Latches, Barriers, etc. (from `java.util.concurrent`):** Higher-level concurrency constructs.

```java
class Counter {
    int count = 0;

    // Non-synchronized method - can lead to inconsistent results
    public void incrementNonSync() {
        count++;
    }

    // Synchronized method - only one thread can execute this at a time for a given Counter object
    public synchronized void incrementSyncMethod() {
        count++;
    }

    // Synchronized block - synchronizes on 'this' (the Counter object)
    public void incrementSyncBlock() {
        synchronized (this) {
            count++;
        }
    }

    // Another synchronized block, synchronizing on a specific object (a separate lock)
    private final Object lock = new Object(); // A dedicated lock object
    public void incrementSyncSpecificLock() {
        synchronized (lock) { // Threads acquire a lock on the 'lock' object
            count++;
        }
    }
}

public class ThreadSynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        // --- Non-synchronized example (will likely show inconsistent results) ---
        Counter counter1 = new Counter();
        Runnable taskNonSync = () -> {
            for (int i = 0; i < 1000; i++) {
                counter1.incrementNonSync();
            }
        };

        Thread t1 = new Thread(taskNonSync, "NonSync-T1");
        Thread t2 = new Thread(taskNonSync, "NonSync-T2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Final count (Non-synchronized): " + counter1.count + " (Expected: 2000)");
        // Expected result is 2000, but often it will be less due to race conditions.

        // --- Synchronized method example ---
        Counter counter2 = new Counter();
        Runnable taskSyncMethod = () -> {
            for (int i = 0; i < 1000; i++) {
                counter2.incrementSyncMethod();
            }
        };

        Thread t3 = new Thread(taskSyncMethod, "SyncMethod-T3");
        Thread t4 = new Thread(taskSyncMethod, "SyncMethod-T4");

        t3.start();
        t4.start();

        t3.join();
        t4.join();
        System.out.println("Final count (Synchronized method): " + counter2.count + " (Expected: 2000)");
        // This will always be 2000 because access is synchronized.

        // --- Synchronized block example ---
        Counter counter3 = new Counter();
        Runnable taskSyncBlock = () -> {
            for (int i = 0; i < 1000; i++) {
                counter3.incrementSyncBlock();
            }
        };

        Thread t5 = new Thread(taskSyncBlock, "SyncBlock-T5");
        Thread t6 = new Thread(taskSyncBlock, "SyncBlock-T6");

        t5.start();
        t6.start();

        t5.join();
        t6.join();
        System.out.println("Final count (Synchronized block): " + counter3.count + " (Expected: 2000)");
        // This will also always be 2000.

        // --- Volatile keyword example (illustrative, not for mutual exclusion) ---
        // Volatile ensures visibility, but not atomicity for operations like count++
        // For simple writes/reads of primitives, it's fine. For compound operations, use synchronized or Atomics.
        class VolatileCounter {
            volatile int value = 0;
            public void increment() {
                value++; // This is NOT atomic
            }
        }
        VolatileCounter volCounter = new VolatileCounter();
        Runnable volTask = () -> {
            for (int i = 0; i < 500; i++) {
                volCounter.increment();
            }
        };

        Thread vt1 = new Thread(volTask, "Volatile-T1");
        Thread vt2 = new Thread(volTask, "Volatile-T2");
        vt1.start(); vt2.start();
        vt1.join(); vt2.join();
        System.out.println("Final count (Volatile, not atomic '++'): " + volCounter.value + " (Expected: 1000, but might be less)");
        // This demonstrates that volatile ensures visibility of 'value', but 'value++' itself
        // is not an atomic operation (it's read-modify-write), so race conditions can still occur.
        // For atomic operations, java.util.concurrent.atomic classes like AtomicInteger should be used.
    }
}
```

---

## 11. Java 8+ Features

Java 8, released in 2014, brought significant changes and new features, particularly around functional programming. Later versions (Java 9, 10, 11, etc.) continued to add improvements, but Java 8 remains a major milestone.

### Lambda Expressions

Lambda expressions provide a clear and concise way to represent an anonymous function (a function without a name). They are primarily used to implement functional interfaces.

**Syntax:** `(parameters) -> expression` or `(parameters) -> { statements; }`

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        // --- 1. Basic Lambda for a simple task ---

        // Before Java 8: Anonymous inner class
        Runnable oldRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable from anonymous inner class.");
            }
        };
        new Thread(oldRunnable).start();

        // With Java 8: Lambda expression for Runnable
        Runnable newRunnable = () -> System.out.println("Runnable from lambda expression.");
        new Thread(newRunnable).start();
        new Thread(() -> System.out.println("Direct lambda for Runnable.")).start();


        // --- 2. Lambdas with parameters ---
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("\nOriginal list: " + names);

        // Before Java 8: Sorting with anonymous inner class Comparator
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2); // Ascending order
            }
        });
        System.out.println("Sorted (anonymous class): " + names);

        // With Java 8: Sorting with Lambda expression
        // (s1, s2) are parameters, -> separates parameters from body, s2.compareTo(s1) is the body
        Collections.sort(names, (s1, s2) -> s2.compareTo(s1)); // Descending order
        System.out.println("Sorted (lambda descending): " + names);

        // Even more concise with Method References (for specific cases)
        Collections.sort(names, String::compareTo); // Equivalent to (s1, s2) -> s1.compareTo(s2)
        System.out.println("Sorted (method reference): " + names);


        // --- 3. Lambdas in List.forEach() ---
        System.out.println("\nIterating with forEach and lambda:");
        names.forEach(name -> System.out.println("Hello, " + name));

        // Using method reference with forEach
        System.out.println("Printing with method reference:");
        names.forEach(System.out::println);
    }
}
```

### Functional Interfaces

A functional interface is an interface that contains **exactly one abstract method**. Lambda expressions are used to provide the implementation of this single abstract method.

Java 8 introduced the `@FunctionalInterface` annotation (optional, but good practice) to denote an interface as functional. It also added several predefined functional interfaces in the `java.util.function` package:

*   **`Predicate<T>`:** Takes one argument and returns a boolean (`boolean test(T t)`).
*   **`Consumer<T>`:** Takes one argument and returns no result (`void accept(T t)`).
*   **`Function<T, R>`:** Takes one argument of type `T` and returns a result of type `R` (`R apply(T t)`).
*   **`Supplier<T>`:** Takes no arguments and returns a result of type `T` (`T get()`).
*   **`UnaryOperator<T>`:** Extends `Function`, takes one argument of type `T` and returns a result of the *same* type `T` (`T apply(T t)`).
*   **`BinaryOperator<T>`:** Extends `BiFunction`, takes two arguments of type `T` and returns a result of the *same* type `T` (`T apply(T t1, T t2)`).

```java
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

// Custom Functional Interface
@FunctionalInterface
interface MyCustomCalculator {
    int calculate(int a, int b);
    // int anotherMethod(); // Uncommenting this would make it not a functional interface
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // --- Custom Functional Interface ---
        MyCustomCalculator adder = (x, y) -> x + y;
        System.out.println("Addition: " + adder.calculate(10, 5));

        MyCustomCalculator multiplier = (x, y) -> x * y;
        System.out.println("Multiplication: " + multiplier.calculate(10, 5));


        // --- Predefined Functional Interfaces ---

        // Predicate: checks a condition
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("\nIs 4 even? " + isEven.test(4));   // true
        System.out.println("Is 7 even? " + isEven.test(7));   // false

        // Consumer: performs an action on an input
        Consumer<String> greeter = message -> System.out.println("Greeting: " + message);
        greeter.accept("Hello World!");

        // Function: transforms an input to an output
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println("Length of 'Java': " + stringLength.apply("Java")); // 4

        // Supplier: supplies a value
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println("Random number: " + randomNumber.get());

        // UnaryOperator: takes and returns the same type
        UnaryOperator<Integer> square = n -> n * n;
        System.out.println("Square of 9: " + square.apply(9)); // 81
    }
}
```

### Stream API

The Stream API provides a powerful and flexible way to process collections of objects. It allows you to perform operations on data in a declarative way, similar to SQL queries. Streams do not store data; they operate on a source (like a `List`, `Set`, `Array`, or I/O channels).

**Key characteristics:**
*   **Declarative:** You describe *what* you want to do, not *how*.
*   **Pipelining:** Operations can be chained together.
*   **Lazy evaluation:** Operations are only performed when a terminal operation is invoked.
*   **No storage:** Streams don't store elements.
*   **Functional:** Operations take lambda expressions.
*   **Parallelism:** Easily parallelize operations (`.parallelStream()`).

**Types of operations:**
*   **Intermediate Operations:** Return another stream, allowing for chaining (e.g., `filter()`, `map()`, `sorted()`, `distinct()`, `limit()`). They are lazy.
*   **Terminal Operations:** Produce a result or a side-effect (e.g., `forEach()`, `collect()`, `reduce()`, `count()`, `min()`, `max()`, `findFirst()`, `anyMatch()`). They trigger the processing of the stream.

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Original list of numbers: " + numbers);

        // --- 1. Filtering and collecting ---
        // Get all even numbers and put them into a new list
        List<Integer> evenNumbers = numbers.stream()         // Create a stream from the list
                                           .filter(n -> n % 2 == 0) // Intermediate: keeps only even numbers
                                           .collect(Collectors.toList()); // Terminal: collects elements into a new List
        System.out.println("Even numbers: " + evenNumbers); // [2, 4, 6, 8, 10]

        // --- 2. Mapping (Transformation) ---
        // Square each number
        List<Integer> squaredNumbers = numbers.stream()
                                             .map(n -> n * n) // Intermediate: transforms each element
                                             .collect(Collectors.toList());
        System.out.println("Squared numbers: " + squaredNumbers); // [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]

        // --- 3. Filtering, mapping, and reducing (aggregation) ---
        // Sum of squares of odd numbers
        int sumOfOddSquares = numbers.stream()
                                     .filter(n -> n % 2 != 0) // Filter odd numbers
                                     .map(n -> n * n)         // Square them
                                     .reduce(0, (sum, n) -> sum + n); // Terminal: aggregate into a single result (initial value, accumulator)
        // (1*1) + (3*3) + (5*5) + (7*7) + (9*9) = 1 + 9 + 25 + 49 + 81 = 165
        System.out.println("Sum of squares of odd numbers: " + sumOfOddSquares);

        // --- 4. Chaining multiple operations ---
        List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant", "ant");

        // Filter words starting with 'a', convert to uppercase, then collect as a Set
        Set<String> uniqueWordsStartingWithA = words.stream()
                                                    .filter(s -> s.startsWith("a"))  // apple, ant
                                                    .map(String::toUpperCase)        // APPLE, ANT
                                                    .collect(Collectors.toSet());    // Collect into a Set (removes duplicates if any)
        System.out.println("Unique words starting with 'a' (uppercase): " + uniqueWordsStartingWithA); // [APPLE, ANT]

        // --- 5. Counting, Min/Max ---
        long countWords = words.stream().count();
        System.out.println("Total words: " + countWords); // 6

        Optional<String> longestWord = words.stream()
                                           .max(Comparator.comparingInt(String::length));
        longestWord.ifPresent(w -> System.out.println("Longest word: " + w)); // elephant

        Optional<Integer> minNumber = numbers.stream().min(Integer::compare);
        minNumber.ifPresent(n -> System.out.println("Minimum number: " + n)); // 1

        // --- 6. Sorting ---
        List<String> sortedWords = words.stream()
                                       .sorted() // Natural order (alphabetical for strings)
                                       .collect(Collectors.toList());
        System.out.println("Sorted words: " + sortedWords); // [apple, ant, banana, cat, dog, elephant]

        List<String> sortedWordsLengthDesc = words.stream()
                                                 .sorted(Comparator.comparingInt(String::length).reversed())
                                                 .collect(Collectors.toList());
        System.out.println("Sorted by length (descending): " + sortedWordsLengthDesc); // [elephant, banana, apple, cat, dog, ant] (order for same length can vary)

        // --- 7. AnyMatch, AllMatch, NoneMatch ---
        boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("Any number is even? " + anyEven); // true

        boolean allGreaterThanZero = numbers.stream().allMatch(n -> n > 0);
        System.out.println("All numbers greater than 0? " + allGreaterThanZero); // true

        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
        System.out.println("None of the numbers are negative? " + noneNegative); // true

        // --- 8. Grouping elements (Collector) ---
        // Group words by their first letter
        Map<Character, List<String>> groupedByFirstLetter = words.stream()
                                                                 .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println("Words grouped by first letter: " + groupedByFirstLetter);
        // {a=[apple, ant], b=[banana], c=[cat], d=[dog], e=[elephant]}

        // --- 9. Parallel Streams ---
        // For large datasets, parallel streams can significantly improve performance
        long sumParallel = numbers.parallelStream()
                                  .filter(n -> n % 2 != 0)
                                  .mapToLong(n -> n * n) // Using mapToLong for better performance with primitive long
                                  .sum();
        System.out.println("Sum of odd squares (parallel): " + sumParallel);
    }
}
```

### Default and Static Methods in Interfaces

Java 8 introduced the ability to include **default** and **static** methods in interfaces.

*   **Default Methods:**
    *   Allow adding new methods to interfaces without breaking existing implementations.
    *   Provide a default implementation that implementing classes can either use directly or override.
    *   Defined using the `default` keyword.
*   **Static Methods:**
    *   Are utility methods that belong to the interface itself, not to any implementing class or object.
    *   Can be called directly on the interface name.
    *   Cannot be overridden by implementing classes.

```java
interface Shape {
    double getArea(); // Abstract method

    // Default method: provides a default implementation
    default void printDescription() {
        System.out.println("This is a generic shape.");
    }

    // Static method: a utility method for the interface
    static String getShapeType() {
        return "Geometric Shape";
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Optionally override the default method
    @Override
    public void printDescription() {
        System.out.println("This is a circle with radius " + radius);
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
    // Rectangle uses the default printDescription() method
}

public class InterfaceMethodsExample {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.getArea());
        circle.printDescription(); // Calls overridden default method

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        rectangle.printDescription(); // Calls default method from interface

        // Call the static method directly on the interface
        System.out.println("Shape Type: " + Shape.getShapeType());
        // Circle.getShapeType(); // Compile error: cannot call static interface method on class
    }
}
```

### Optional Class

The `java.util.Optional<T>` class is a container object that may or may not contain a non-null value. It was introduced to address the problem of `NullPointerException`s by forcing developers to explicitly handle the case where a value might be absent.

**Key methods:**
*   `of(T value)`: Creates an `Optional` with the specified non-null value. Throws `NullPointerException` if value is null.
*   `ofNullable(T value)`: Creates an `Optional` with the specified value, or an empty `Optional` if the value is null.
*   `empty()`: Returns an empty `Optional` instance.
*   `isPresent()`: Returns `true` if the `Optional` contains a value, `false` otherwise.
*   `isEmpty()` (Java 11+): Returns `true` if the `Optional` does not contain a value.
*   `get()`: Returns the value if present, otherwise throws `NoSuchElementException`. **Use with caution, prefer `orElse()` or `ifPresent()`**.
*   `orElse(T other)`: Returns the value if present, otherwise returns a default `other` value.
*   `orElseGet(Supplier<? extends T> other)`: Returns the value if present, otherwise invokes the `Supplier` function and returns its result.
*   `orElseThrow()` (Java 10+): Returns the value if present, otherwise throws `NoSuchElementException`.
*   `orElseThrow(Supplier<? extends X> exceptionSupplier)`: Returns the value if present, otherwise throws the exception provided by the supplier.
*   `ifPresent(Consumer<? super T> consumer)`: If a value is present, performs the given action on the value, otherwise does nothing.
*   `map(Function<? super T, ? extends U> mapper)`: If a value is present, applies the mapping function to it and returns an `Optional` describing the result.

```java
import java.util.Optional;

public class OptionalExample {

    public static String getGreeting(String name) {
        if (name != null && !name.trim().isEmpty()) {
            return "Hello, " + name + "!";
        }
        return null; // This can lead to NullPointerException
    }

    public static Optional<String> getGreetingOptional(String name) {
        if (name != null && !name.trim().isEmpty()) {
            return Optional.of("Hello, " + name + "!");
        }
        return Optional.empty(); // Explicitly return an empty Optional
    }

    public static void main(String[] args) {
        // --- Traditional approach (prone to NPE) ---
        String greeting1 = getGreeting("Alice");
        if (greeting1 != null) {
            System.out.println(greeting1);
        } else {
            System.out.println("Greeting is null (traditional)");
        }

        String greeting2 = getGreeting(null);
        // System.out.println(greeting2.toUpperCase()); // This would throw NullPointerException

        // --- Using Optional ---
        System.out.println("\n--- Using Optional.ofNullable ---");
        Optional<String> optionalGreeting1 = getGreetingOptional("Bob");
        if (optionalGreeting1.isPresent()) { // Check if value is present
            System.out.println(optionalGreeting1.get()); // Get the value (use cautiously)
        } else {
            System.out.println("Greeting is empty (Optional.isPresent())");
        }

        Optional<String> optionalGreeting2 = getGreetingOptional(""); // Empty string results in empty optional
        // Using orElse() to provide a default value
        String result2 = optionalGreeting2.orElse("Default Greeting");
        System.out.println(result2); // Default Greeting

        Optional<String> optionalGreeting3 = getGreetingOptional(null);
        // Using orElseGet() for lazy evaluation of default value
        String result3 = optionalGreeting3.orElseGet(() -> "Greeting from Supplier");
        System.out.println(result3); // Greeting from Supplier

        Optional<String> optionalGreeting4 = getGreetingOptional("Charlie");
        // Using ifPresent() to consume the value only if it's present
        optionalGreeting4.ifPresent(s -> System.out.println("If present: " + s));

        // Combining Optional with Stream API operations (e.g., map)
        Optional<String> nameOpt = Optional.of("david");
        Optional<String> upperNameOpt = nameOpt.map(String::toUpperCase);
        upperNameOpt.ifPresent(s -> System.out.println("Uppercase name: " + s)); // DAVID

        Optional<String> emptyNameOpt = Optional.empty();
        Optional<String> upperEmptyNameOpt = emptyNameOpt.map(String::toUpperCase);
        System.out.println("Uppercase empty name: " + upperEmptyNameOpt.orElse("No name provided")); // No name provided

        // Java 10+ orElseThrow()
        Optional<String> requiredValue = Optional.of("Important data");
        String data = requiredValue.orElseThrow(() -> new IllegalStateException("Data is missing!"));
        System.out.println("Required data: " + data);

        // Optional<String> missingValue = Optional.empty();
        // try {
        //     missingValue.orElseThrow(() -> new IllegalArgumentException("Cannot proceed without this value"));
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Caught expected exception: " + e.getMessage());
        // }
    }
}
```

### New Date and Time API (`java.time`)

Before Java 8, date and time handling in Java was notoriously cumbersome with classes like `java.util.Date` and `java.util.Calendar`. The new Date and Time API (`java.time` package), inspired by Joda-Time, provides a much improved, immutable, and thread-safe approach.

**Key classes:**
*   **`LocalDate`:** Represents a date (year, month, day) without time.
*   **`LocalTime`:** Represents a time (hour, minute, second, nanosecond) without date.
*   **`LocalDateTime`:** Represents both date and time without time-zone information.
*   **`ZonedDateTime`:** Represents a date and time with a time-zone.
*   **`Instant`:** Represents a point in time on the timeline (machine readable, often used for timestamps).
*   **`Duration`:** Measures time in seconds and nanoseconds.
*   **`Period`:** Measures time in years, months, and days.
*   **`DateTimeFormatter`:** For formatting and parsing date/time objects.

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Instant;
import java.time.Duration;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class NewDateTimeAPIExample {
    public static void main(String[] args) {
        // --- 1. LocalDate (Date only) ---
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today); // e.g., 2023-10-27

        LocalDate specificDate = LocalDate.of(2025, 1, 15);
        System.out.println("Specific date: " + specificDate);

        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Tomorrow: " + tomorrow);

        LocalDate lastMonth = today.minusMonths(1);
        System.out.println("Last month: " + lastMonth);

        System.out.println("Is " + specificDate + " after " + today + "? " + specificDate.isAfter(today));


        // --- 2. LocalTime (Time only) ---
        LocalTime currentTime = LocalTime.now();
        System.out.println("\nCurrent time: " + currentTime); // e.g., 14:30:45.123

        LocalTime specificTime = LocalTime.of(10, 30, 0); // 10:30 AM
        System.out.println("Specific time: " + specificTime);

        LocalTime timeInAnHour = currentTime.plusHours(1);
        System.out.println("Time in an hour: " + timeInAnHour);


        // --- 3. LocalDateTime (Date and Time without Zone) ---
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("\nCurrent Date and Time: " + currentDateTime);

        LocalDateTime specificDateTime = LocalDateTime.of(2024, 7, 20, 18, 0, 0);
        System.out.println("Specific Date and Time: " + specificDateTime);

        LocalDateTime nextWeekSameTime = currentDateTime.plusWeeks(1);
        System.out.println("Next week same time: " + nextWeekSameTime);


        // --- 4. ZonedDateTime (Date and Time with Zone) ---
        // Get system default zone
        ZoneId defaultZone = ZoneId.systemDefault();
        System.out.println("\nSystem Default Time Zone: " + defaultZone);

        // Get a specific time zone
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        ZonedDateTime nyDateTime = ZonedDateTime.now(newYorkZone);
        System.out.println("Current time in New York: " + nyDateTime);

        ZonedDateTime londonDateTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println("Current time in London: " + londonDateTime);

        // Convert between time zones
        ZonedDateTime nyToLondon = nyDateTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("NY time converted to London time: " + nyToLondon);


        // --- 5. Instant (Machine-readable timestamp) ---
        Instant timestamp = Instant.now();
        System.out.println("\nCurrent Instant (timestamp): " + timestamp); // UTC time


        // --- 6. Duration (Time-based amount of time) ---
        LocalTime t1 = LocalTime.of(9, 0);
        LocalTime t2 = LocalTime.of(12, 30);
        Duration duration = Duration.between(t1, t2);
        System.out.println("\nDuration between 9:00 and 12:30: " + duration.toMinutes() + " minutes");

        Duration twoHours = Duration.ofHours(2);
        System.out.println("Two hours in seconds: " + twoHours.getSeconds());


        // --- 7. Period (Date-based amount of time) ---
        LocalDate date1 = LocalDate.of(2023, 1, 1);
        LocalDate date2 = LocalDate.of(2024, 5, 15);
        Period period = Period.between(date1, date2);
        System.out.println("\nPeriod between " + date1 + " and " + date2 + ": " +
                           period.getYears() + " years, " +
                           period.getMonths() + " months, " +
                           period.getDays() + " days.");

        LocalDate newDate = date1.plus(Period.ofMonths(3));
        System.out.println("Date plus 3 months: " + newDate);


        // --- 8. DateTimeFormatter (Formatting and Parsing) ---
        LocalDateTime myDateTime = LocalDateTime.of(2023, 12, 25, 19, 30);

        // Custom formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = myDateTime.format(formatter);
        System.out.println("\nFormatted Date and Time (custom): " + formattedDateTime); // 25-12-2023 19:30:00

        // Predefined formatters
        String isoDate = myDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("ISO Local Date: " + isoDate); // 2023-12-25

        // Parsing a string to a LocalDateTime
        String dateString = "2023-11-10 14:00";
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, parser);
        System.out.println("Parsed Date Time: " + parsedDateTime);


        // --- 9. ChronoUnit (Useful for measuring differences) ---
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("\nDays between " + startDate + " and " + endDate + ": " + daysBetween);

        long monthsBetween = ChronoUnit.MONTHS.between(startDate, endDate);
        System.out.println("Months between " + startDate + " and " + endDate + ": " + monthsBetween);

        LocalTime startTime = LocalTime.of(8, 0);
        LocalTime endTime = LocalTime.of(17, 0);
        long hoursBetween = ChronoUnit.HOURS.between(startTime, endTime);
        System.out.println("Hours between " + startTime + " and " + endTime + ": " + hoursBetween);
    }
}
```

---

## 12. Summary and Practice Exercises

### Summary

This Java Study Guide has covered a vast range of fundamental and advanced concepts, aiming to provide a solid foundation for both beginners and intermediate learners. We started from the very basics of Java's architecture and setup, moved through core programming constructs like variables, operators, control flow, and methods, and then delved into data structures with arrays and strings.

A significant portion of the guide was dedicated to Object-Oriented Programming (OOP) principles (Encapsulation, Inheritance, Polymorphism, Abstraction), which are at the heart of Java. We explored how to handle errors gracefully using Exception Handling and efficiently manage collections of objects with the Collections Framework.

Understanding how to interact with the filesystem was covered in File Handling (I/O), and we introduced the crucial concept of Multithreading for concurrent program execution. Finally, we explored the transformative features introduced in Java 8+, including Lambda Expressions, Functional Interfaces, the powerful Stream API, enhancements to interfaces, the `Optional` class for null-safety, and the modern `java.time` Date and Time API.

Mastering these topics will equip you with the knowledge and skills necessary to develop robust, efficient, and maintainable Java applications.

### Practice Exercises

To solidify your understanding, try to implement the following programs. Focus on using the concepts learned in this guide, including good commenting, proper variable naming, and error handling where appropriate.

**Exercise 1: Fibonacci Sequence Generator**

Write a Java program that generates the Fibonacci sequence up to a given number `n`.
*   The Fibonacci sequence starts with 0 and 1.
*   Each subsequent number is the sum of the two preceding ones (e.g., 0, 1, 1, 2, 3, 5, 8...).
*   Implement two versions:
    1.  Using an iterative approach (e.g., `for` loop).
    2.  Using a recursive approach (be mindful of performance for large `n`).

**Example Output (for n=10, iterative):**
`Fibonacci sequence up to 10: 0 1 1 2 3 5 8`

**Exercise 2: Palindrome Checker**

Write a Java program that checks if a given string is a palindrome. A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward as forward (e.g., "madam", "racecar", "A man, a plan, a canal: Panama").
*   The checker should ignore case and non-alphanumeric characters.
*   Hint: You might want to use `StringBuilder` or `String` methods like `replaceAll()` and `toLowerCase()`.

**Example Output:**
`"Madam" is a palindrome: true`
`"Hello" is a palindrome: false`
`"A man, a plan, a canal: Panama" is a palindrome: true`

**Exercise 3: Simple File Handling Utility**

Create a Java program that performs basic file operations:
1.  **Create a file:** Ask the user for a filename and create an empty text file. Handle `IOException`.
2.  **Write to a file:** Prompt the user to enter several lines of text, and write them to the created file. Use `PrintWriter` and `try-with-resources`.
3.  **Read from a file:** Read and display the entire content of the file. Use `BufferedReader` and `try-with-resources`.
4.  **Append to a file:** Prompt the user for more text and append it to the existing file.
5.  **List files in directory:** List all files and directories in the current working directory.
6.  **Delete a file:** Ask the user if they want to delete the file created at the beginning.

**Example Flow:**
```
Enter filename to create: mydata.txt
File 'mydata.txt' created.

Enter text to write (type 'DONE' on a new line to finish):
First line of data.
Second line.
DONE
Content written to 'mydata.txt'.

Reading from 'mydata.txt':
First line of data.
Second line.

Enter text to append (type 'DONE' on a new line to finish):
Appended line 1.
Appended line 2.
DONE
Content appended to 'mydata.txt'.

Reading from 'mydata.txt' after appending:
First line of data.
Second line.
Appended line 1.
Appended line 2.

Files in current directory:
mydata.txt
MyJavaApp.jar
... (other files/dirs)

Do you want to delete 'mydata.txt'? (yes/no): yes
'mydata.txt' deleted.
```

**Exercise 4: Employee Management System (OOP, Collections, Lambdas)**

Design a simple Employee Management System using OOP principles and Java 8 features.

1.  **`Employee` Class:**
    *   Fields: `id` (int), `name` (String), `department` (String), `salary` (double).
    *   Constructor, getters, setters.
    *   Override `toString()` for easy printing.
2.  **`EmployeeManager` Class:**
    *   Use a `List<Employee>` (e.g., `ArrayList`) to store employees.
    *   Methods:
        *   `addEmployee(Employee employee)`: Adds an employee.
        *   `removeEmployee(int id)`: Removes an employee by ID.
        *   `findEmployeeById(int id)`: Returns `Optional<Employee>` (Java 8!) for a given ID.
        *   `getAllEmployees()`: Returns the list of all employees.
        *   `getEmployeesByDepartment(String department)`: Returns a `List<Employee>` for a specific department, sorted by name. Use Stream API.
        *   `calculateTotalSalary()`: Returns the sum of all employee salaries. Use Stream API.
        *   `getHighestPaidEmployee()`: Returns `Optional<Employee>` of the employee with the highest salary. Use Stream API.
        *   `getEmployeeCountByDepartment()`: Returns a `Map<String, Long>` where the key is the department name and the value is the count of employees in that department. Use Stream API's `Collectors.groupingBy`.
3.  **`Main` Class:**
    *   Create an instance of `EmployeeManager`.
    *   Add several `Employee` objects.
    *   Demonstrate all `EmployeeManager` methods with appropriate print statements.
    *   Use Lambda expressions for sorting or filtering where applicable.

**Example Output:**
```
--- Employee Management System ---
Added Employee: Employee{id=101, name='Alice', department='HR', salary=60000.0}
Added Employee: Employee{id=102, name='Bob', department='IT', salary=75000.0}
...

All Employees:
Employee{id=101, name='Alice', department='HR', salary=60000.0}
Employee{id=102, name='Bob', department='IT', salary=75000.0}
...

Employees in IT Department (sorted by name):
Employee{id=102, name='Bob', department='IT', salary=75000.0}
Employee{id=104, name='David', department='IT', salary=80000.0}

Total Salary: 305000.0

Highest Paid Employee: Optional[Employee{id=104, name='David', department='IT', salary=80000.0}]

Employee Count by Department: {HR=1, IT=2, Sales=1}

Removing employee with ID 103...
Employee with ID 103 removed.

All Employees after removal:
...
```

Good luck with your practice! These exercises will help you apply the concepts learned and deepen your understanding of Java.



