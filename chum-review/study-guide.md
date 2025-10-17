# Java Programming Fundamentals - Complete Study Guide

## Table of Contents
1. [Programming Fundamentals](#programming-fundamentals)
2. [Operators](#operators)
3. [Strings](#strings)
4. [Typecasting](#typecasting)
5. [Built-in Libraries](#built-in-libraries)
6. [Selection Structures](#selection-structures)
7. [Iterative Structures](#iterative-structures)
8. [Arrays](#arrays)

---

# Programming Fundamentals

## a. Output Operations

Output operations in Java are used to display data to the console or other output streams.

### Basic Output Methods

**`System.out.print()`** - Prints without newline
```java
System.out.print("Hello");
System.out.print(" World");
// Output: Hello World
```

**`System.out.println()`** - Prints with newline
```java
System.out.println("Hello");
System.out.println("World");
// Output:
// Hello
// World
```

**`System.out.printf()`** - Formatted output
```java
int age = 25;
String name = "John";
System.out.printf("Name: %s, Age: %d%n", name, age);
// Output: Name: John, Age: 25
```

### Complete Example
```java
// filepath: OutputDemo.java
public class OutputDemo {
    public static void main(String[] args) {
        // Simple print
        System.out.print("This is ");
        System.out.print("on one line. ");
        
        // Print with newline
        System.out.println("\nThis is on a new line.");
        System.out.println("This is on another line.");
        
        // Formatted output
        String product = "Laptop";
        double price = 999.99;
        int quantity = 5;
        
        System.out.printf("Product: %s%n", product);
        System.out.printf("Price: $%.2f%n", price);
        System.out.printf("Quantity: %d%n", quantity);
        System.out.printf("Total: $%.2f%n", price * quantity);
    }
}
```

---

## b. Escape Sequences

Escape sequences are special character combinations that represent non-printable or special characters.

### Common Escape Sequences

| Escape Sequence | Description | Example |
|----------------|-------------|---------|
| `\n` | Newline | `"Hello\nWorld"` |
| `\t` | Tab | `"Name:\tJohn"` |
| `\\` | Backslash | `"C:\\Users"` |
| `\"` | Double quote | `"He said \"Hi\""` |
| `\'` | Single quote | `'\'A\''` |
| `\r` | Carriage return | `"Hello\rWorld"` |
| `\b` | Backspace | `"Helo\bo"` |

### Complete Example
```java
// filepath: EscapeSequenceDemo.java
public class EscapeSequenceDemo {
    public static void main(String[] args) {
        // Newline demonstration
        System.out.println("Line 1\nLine 2\nLine 3");
        
        // Tab demonstration
        System.out.println("Name:\tJohn Doe");
        System.out.println("Age:\t25");
        System.out.println("City:\tNew York");
        
        // Quotes demonstration
        System.out.println("He said, \"Java is awesome!\"");
        System.out.println("Single quote: \'A\'");
        
        // Backslash demonstration
        System.out.println("File path: C:\\Program Files\\Java");
        
        // Creating a formatted table
        System.out.println("\n=== Student Record ===");
        System.out.println("ID\tName\t\tGrade");
        System.out.println("1\tAlice\t\tA");
        System.out.println("2\tBob\t\tB+");
        System.out.println("3\tCharlie\t\tA-");
        
        // Creating a box
        System.out.println("\n+----------------+");
        System.out.println("|  Hello World!  |");
        System.out.println("+----------------+");
    }
}
```

---

## c. Placeholders

Placeholders are used in formatted output to specify where and how values should be displayed.

### Format Specifiers

| Specifier | Description | Example |
|-----------|-------------|---------|
| `%d` | Integer | `printf("%d", 42)` |
| `%f` | Float/Double | `printf("%.2f", 3.14159)` |
| `%s` | String | `printf("%s", "Hello")` |
| `%c` | Character | `printf("%c", 'A')` |
| `%b` | Boolean | `printf("%b", true)` |
| `%n` | Newline (platform independent) | `printf("Line%n")` |
| `%x` | Hexadecimal | `printf("%x", 255)` |
| `%o` | Octal | `printf("%o", 8)` |
| `%e` | Scientific notation | `printf("%e", 1000.0)` |

### Width and Precision

```java
%[flags][width][.precision]specifier
```

- **Width**: Minimum number of characters
- **Precision**: Number of decimal places for floating-point
- **Flags**: 
  - `-` : Left-align
  - `+` : Show sign
  - `0` : Zero-padding
  - `,` : Grouping separator

### Complete Example
```java
// filepath: PlaceholderDemo.java
public class PlaceholderDemo {
    public static void main(String[] args) {
        // Basic placeholders
        int age = 25;
        double height = 5.9;
        String name = "John";
        char grade = 'A';
        boolean isPassed = true;
        
        System.out.println("=== Basic Format Specifiers ===");
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d years%n", age);
        System.out.printf("Height: %.1f feet%n", height);
        System.out.printf("Grade: %c%n", grade);
        System.out.printf("Passed: %b%n%n", isPassed);
        
        // Width and alignment
        System.out.println("=== Width and Alignment ===");
        System.out.printf("|%10s|%n", "Right");     // Right-aligned, width 10
        System.out.printf("|%-10s|%n", "Left");     // Left-aligned, width 10
        System.out.printf("|%10d|%n", 42);          // Right-aligned integer
        System.out.printf("|%-10d|%n%n", 42);       // Left-aligned integer
        
        // Precision with floating-point
        double pi = 3.14159265359;
        System.out.println("=== Precision Control ===");
        System.out.printf("Pi with 2 decimals: %.2f%n", pi);
        System.out.printf("Pi with 5 decimals: %.5f%n", pi);
        System.out.printf("Pi in scientific notation: %e%n%n", pi);
        
        // Zero padding
        int orderNumber = 42;
        System.out.printf("Order Number: %05d%n%n", orderNumber);
        
        // Creating a receipt
        System.out.println("=== RECEIPT ===");
        System.out.printf("%-20s %10s %10s%n", "Item", "Qty", "Price");
        System.out.println("--------------------------------------------");
        System.out.printf("%-20s %10d $%9.2f%n", "Laptop", 1, 999.99);
        System.out.printf("%-20s %10d $%9.2f%n", "Mouse", 2, 25.50);
        System.out.printf("%-20s %10d $%9.2f%n", "Keyboard", 1, 75.00);
        System.out.println("--------------------------------------------");
        System.out.printf("%-20s %10s $%9.2f%n", "TOTAL", "", 1126.49);
        
        // Number formatting
        System.out.println("\n=== Number Formatting ===");
        int decimal = 255;
        System.out.printf("Decimal: %d%n", decimal);
        System.out.printf("Hexadecimal: %x%n", decimal);
        System.out.printf("Octal: %o%n", decimal);
        
        // Large numbers with grouping
        long population = 1000000;
        System.out.printf("%nPopulation: %,d%n", population);
    }
}
```

---

## d. Input Operations

Input operations allow programs to receive data from users or other sources.

### Scanner Class

The `Scanner` class is the most common way to get user input in Java.

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
```

### Scanner Methods

| Method | Description | Example |
|--------|-------------|---------|
| `nextInt()` | Read integer | `int num = scanner.nextInt();` |
| `nextDouble()` | Read double | `double price = scanner.nextDouble();` |
| `nextFloat()` | Read float | `float rate = scanner.nextFloat();` |
| `nextLong()` | Read long | `long value = scanner.nextLong();` |
| `nextBoolean()` | Read boolean | `boolean flag = scanner.nextBoolean();` |
| `next()` | Read single word | `String word = scanner.next();` |
| `nextLine()` | Read entire line | `String line = scanner.nextLine();` |

### Complete Example
```java
// filepath: InputDemo.java
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading different data types
        System.out.println("=== Student Registration ===");
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        
        System.out.print("Are you enrolled? (true/false): ");
        boolean isEnrolled = scanner.nextBoolean();
        
        // Clear the newline character
        scanner.nextLine();
        
        System.out.print("Enter your major: ");
        String major = scanner.nextLine();
        
        // Display collected information
        System.out.println("\n=== Registration Summary ===");
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d years%n", age);
        System.out.printf("GPA: %.2f%n", gpa);
        System.out.printf("Enrolled: %b%n", isEnrolled);
        System.out.printf("Major: %s%n", major);
        
        scanner.close();
    }
}
```

### Common Input Pitfalls and Solutions

```java
// filepath: InputPitfallsDemo.java
import java.util.Scanner;

public class InputPitfallsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Problem: nextInt() doesn't consume newline
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Solution: Use nextLine() to clear buffer
        scanner.nextLine(); // Consume leftover newline
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.printf("Number: %d, Name: %s%n", number, name);
        
        // Reading multiple values from one line
        System.out.print("Enter three numbers separated by spaces: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.printf("Sum: %d%n", a + b + c);
        
        // Input validation
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter your age: ");
        
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Enter a number: ");
            scanner.next(); // Discard invalid input
        }
        
        int age = scanner.nextInt();
        System.out.printf("Age entered: %d%n", age);
        
        scanner.close();
    }
}
```

### Complete Input/Output Example
```java
// filepath: CalculatorDemo.java
import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("╔════════════════════════════╗");
        System.out.println("║   Simple Calculator        ║");
        System.out.println("╚════════════════════════════╝");
        
        System.out.print("\nEnter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        boolean validOperation = true;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
                validOperation = false;
        }
        
        if (validOperation) {
            System.out.println("\n" + "=".repeat(30));
            System.out.printf("%.2f %c %.2f = %.2f%n", num1, operator, num2, result);
            System.out.println("=".repeat(30));
        }
        
        scanner.close();
    }
}
```

---

# Operators

## a. Arithmetic Operators

Arithmetic operators perform mathematical operations on numeric values.

### Basic Arithmetic Operators

| Operator | Description | Example | Result |
|----------|-------------|---------|--------|
| `+` | Addition | `5 + 3` | `8` |
| `-` | Subtraction | `5 - 3` | `2` |
| `*` | Multiplication | `5 * 3` | `15` |
| `/` | Division | `5 / 2` | `2` (integer division) |
| `%` | Modulus (remainder) | `5 % 2` | `1` |

### Unary Operators

| Operator | Description | Example |
|----------|-------------|---------|
| `+` | Unary plus | `+5` |
| `-` | Unary minus | `-5` |
| `++` | Increment | `x++` or `++x` |
| `--` | Decrement | `x--` or `--x` |

### Complete Example
```java
// filepath: ArithmeticOperatorsDemo.java
public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 3;
        
        System.out.println("=== Basic Arithmetic Operations ===");
        System.out.printf("a = %d, b = %d%n%n", a, b);
        
        // Basic operations
        System.out.printf("Addition (a + b): %d%n", a + b);
        System.out.printf("Subtraction (a - b): %d%n", a - b);
        System.out.printf("Multiplication (a * b): %d%n", a * b);
        System.out.printf("Division (a / b): %d%n", a / b);
        System.out.printf("Modulus (a %% b): %d%n%n", a % b);
        
        // Integer vs Floating-point division
        System.out.println("=== Division Behavior ===");
        System.out.printf("Integer division: 10 / 3 = %d%n", 10 / 3);
        System.out.printf("Float division: 10.0 / 3 = %.2f%n%n", 10.0 / 3);
        
        // Increment and Decrement
        System.out.println("=== Increment/Decrement ===");
        int x = 5;
        System.out.printf("Initial value: x = %d%n", x);
        System.out.printf("Post-increment (x++): %d, then x = %d%n", x++, x);
        
        x = 5;
        System.out.printf("Pre-increment (++x): %d, x = %d%n", ++x, x);
        
        x = 5;
        System.out.printf("Post-decrement (x--): %d, then x = %d%n", x--, x);
        
        x = 5;
        System.out.printf("Pre-decrement (--x): %d, x = %d%n%n", --x, x);
        
        // Practical examples
        System.out.println("=== Practical Examples ===");
        
        // Calculate average
        int score1 = 85, score2 = 90, score3 = 78;
        double average = (score1 + score2 + score3) / 3.0;
        System.out.printf("Average score: %.2f%n", average);
        
        // Convert temperature
        double celsius = 25.0;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("%.1f°C = %.1f°F%n", celsius, fahrenheit);
        
        // Calculate area and perimeter
        int length = 10, width = 5;
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.printf("Rectangle: Area = %d, Perimeter = %d%n", area, perimeter);
        
        // Time calculation
        int totalSeconds = 3665;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.printf("Time: %02d:%02d:%02d%n", hours, minutes, seconds);
    }
}
```

---

## b. Assignment Operators

Assignment operators assign values to variables with optional arithmetic operations.

### Assignment Operators Table

| Operator | Description | Example | Equivalent |
|----------|-------------|---------|------------|
| `=` | Simple assignment | `x = 5` | - |
| `+=` | Add and assign | `x += 3` | `x = x + 3` |
| `-=` | Subtract and assign | `x -= 3` | `x = x - 3` |
| `*=` | Multiply and assign | `x *= 3` | `x = x * 3` |
| `/=` | Divide and assign | `x /= 3` | `x = x / 3` |
| `%=` | Modulus and assign | `x %= 3` | `x = x % 3` |

### Complete Example
```java
// filepath: AssignmentOperatorsDemo.java
public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        System.out.println("=== Simple Assignment ===");
        int x = 10;
        System.out.printf("x = %d%n%n", x);
        
        // Addition assignment
        System.out.println("=== Compound Assignment Operators ===");
        x = 10;
        System.out.printf("Initial: x = %d%n", x);
        x += 5;  // x = x + 5
        System.out.printf("After x += 5: x = %d%n", x);
        
        // Subtraction assignment
        x -= 3;  // x = x - 3
        System.out.printf("After x -= 3: x = %d%n", x);
        
        // Multiplication assignment
        x *= 2;  // x = x * 2
        System.out.printf("After x *= 2: x = %d%n", x);
        
        // Division assignment
        x /= 4;  // x = x / 4
        System.out.printf("After x /= 4: x = %d%n", x);
        
        // Modulus assignment
        x %= 5;  // x = x % 5
        System.out.printf("After x %%= 5: x = %d%n%n", x);
        
        // Practical example: Shopping cart
        System.out.println("=== Shopping Cart Example ===");
        double total = 0.0;
        System.out.printf("Initial total: $%.2f%n", total);
        
        total += 29.99;  // Add item 1
        System.out.printf("Added item ($29.99): $%.2f%n", total);
        
        total += 15.50;  // Add item 2
        System.out.printf("Added item ($15.50): $%.2f%n", total);
        
        total += 42.00;  // Add item 3
        System.out.printf("Added item ($42.00): $%.2f%n", total);
        
        total *= 1.08;   // Add 8% tax
        System.out.printf("After tax (8%%): $%.2f%n", total);
        
        total -= 10.00;  // Apply discount
        System.out.printf("After discount: $%.2f%n%n", total);
        
        // Multiple assignments
        System.out.println("=== Multiple Assignments ===");
        int a, b, c;
        a = b = c = 5;
        System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
        
        // Chained operations
        int score = 0;
        score += 10;
        score += 20;
        score += 15;
        System.out.printf("Final score: %d%n", score);
    }
}
```

---

## c. Bitwise Operators

Bitwise operators perform operations on individual bits of integer values.

### Bitwise Operators Table

| Operator | Description | Example | Binary Operation |
|----------|-------------|---------|------------------|
| `&` | AND | `5 & 3` | `0101 & 0011 = 0001` |
| `\|` | OR | `5 \| 3` | `0101 \| 0011 = 0111` |
| `^` | XOR | `5 ^ 3` | `0101 ^ 0011 = 0110` |
| `~` | NOT (complement) | `~5` | `~0101 = 1010` |
| `<<` | Left shift | `5 << 1` | `0101 << 1 = 1010` |
| `>>` | Right shift | `5 >> 1` | `0101 >> 1 = 0010` |
| `>>>` | Unsigned right shift | `5 >>> 1` | Same as `>>` for positive |

### Complete Example
```java
// filepath: BitwiseOperatorsDemo.java
public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        int a = 5;   // Binary: 0101
        int b = 3;   // Binary: 0011
        
        System.out.println("=== Bitwise Operations ===");
        System.out.printf("a = %d (Binary: %s)%n", a, Integer.toBinaryString(a));
        System.out.printf("b = %d (Binary: %s)%n%n", b, Integer.toBinaryString(b));
        
        // AND operation
        int andResult = a & b;
        System.out.printf("AND (a & b): %d (Binary: %s)%n", 
                         andResult, Integer.toBinaryString(andResult));
        
        // OR operation
        int orResult = a | b;
        System.out.printf("OR (a | b): %d (Binary: %s)%n", 
                         orResult, Integer.toBinaryString(orResult));
        
        // XOR operation
        int xorResult = a ^ b;
        System.out.printf("XOR (a ^ b): %d (Binary: %s)%n", 
                         xorResult, Integer.toBinaryString(xorResult));
        
        // NOT operation
        int notResult = ~a;
        System.out.printf("NOT (~a): %d (Binary: %s)%n%n", 
                         notResult, Integer.toBinaryString(notResult));
        
        // Shift operations
        System.out.println("=== Shift Operations ===");
        int x = 8;  // Binary: 1000
        System.out.printf("x = %d (Binary: %s)%n", x, Integer.toBinaryString(x));
        
        int leftShift = x << 2;  // Multiply by 2^2
        System.out.printf("Left shift (x << 2): %d (Binary: %s)%n", 
                         leftShift, Integer.toBinaryString(leftShift));
        
        int rightShift = x >> 2;  // Divide by 2^2
        System.out.printf("Right shift (x >> 2): %d (Binary: %s)%n%n", 
                         rightShift, Integer.toBinaryString(rightShift));
        
        // Practical applications
        System.out.println("=== Practical Applications ===");
        
        // 1. Check if number is even or odd
        int num = 7;
        boolean isEven = (num & 1) == 0;
        System.out.printf("%d is %s%n", num, isEven ? "even" : "odd");
        
        // 2. Multiply by power of 2
        int value = 5;
        int doubled = value << 1;  // Same as value * 2
        int quadrupled = value << 2;  // Same as value * 4
        System.out.printf("%d * 2 = %d%n", value, doubled);
        System.out.printf("%d * 4 = %d%n", value, quadrupled);
        
        // 3. Swap two numbers without temp variable
        System.out.println("\n=== Swap without temp ===");
        int p = 10, q = 20;
        System.out.printf("Before: p = %d, q = %d%n", p, q);
        p = p ^ q;
        q = p ^ q;
        p = p ^ q;
        System.out.printf("After: p = %d, q = %d%n", p, q);
        
        // 4. Set, clear, and toggle bits
        System.out.println("\n=== Bit Manipulation ===");
        int flags = 0;
        System.out.printf("Initial flags: %s%n", Integer.toBinaryString(flags));
        
        // Set bit at position 2
        flags |= (1 << 2);
        System.out.printf("After setting bit 2: %s%n", Integer.toBinaryString(flags));
        
        // Clear bit at position 2
        flags &= ~(1 << 2);
        System.out.printf("After clearing bit 2: %s%n", Integer.toBinaryString(flags));
        
        // Toggle bit at position 1
        flags ^= (1 << 1);
        System.out.printf("After toggling bit 1: %s%n", Integer.toBinaryString(flags));
        
        // 5. Check if power of 2
        int testNum = 16;
        boolean isPowerOf2 = (testNum & (testNum - 1)) == 0 && testNum != 0;
        System.out.printf("\n%d is%s a power of 2%n", testNum, isPowerOf2 ? "" : " not");
    }
}
```

---

# Strings

## a. String Handling

Strings in Java are objects that represent sequences of characters. They are immutable, meaning once created, their values cannot be changed.

### String Creation

```java
// String literal
String str1 = "Hello";

// Using new keyword
String str2 = new String("World");

// From character array
char[] chars = {'J', 'a', 'v', 'a'};
String str3 = new String(chars);
```

### Common String Methods

| Method | Description | Example |
|--------|-------------|---------|
| `length()` | Returns string length | `"Hello".length()` → `5` |
| `charAt(index)` | Returns character at index | `"Hello".charAt(1)` → `'e'` |
| `substring(start, end)` | Extracts substring | `"Hello".substring(1, 4)` → `"ell"` |
| `toLowerCase()` | Converts to lowercase | `"HELLO".toLowerCase()` → `"hello"` |
| `toUpperCase()` | Converts to uppercase | `"hello".toUpperCase()` → `"HELLO"` |
| `trim()` | Removes whitespace | `" Hi ".trim()` → `"Hi"` |
| `concat()` | Concatenates strings | `"Hi".concat(" there")` → `"Hi there"` |
| `replace()` | Replaces characters | `"Hello".replace('l', 'p')` → `"Heppo"` |
| `indexOf()` | Finds first occurrence | `"Hello".indexOf('l')` → `2` |
| `lastIndexOf()` | Finds last occurrence | `"Hello".lastIndexOf('l')` → `3` |
| `equals()` | Compares strings | `"Hi".equals("Hi")` → `true` |
| `equalsIgnoreCase()` | Compares ignoring case | `"Hi".equalsIgnoreCase("hi")` → `true` |
| `contains()` | Checks if contains substring | `"Hello".contains("ell")` → `true` |
| `startsWith()` | Checks if starts with | `"Hello".startsWith("He")` → `true` |
| `endsWith()` | Checks if ends with | `"Hello".endsWith("lo")` → `true` |
| `split()` | Splits into array | `"a,b,c".split(",")` → `["a","b","c"]` |

### Complete Example
```java
// filepath: StringHandlingDemo.java
public class StringHandlingDemo {
    public static void main(String[] args) {
        // String creation
        System.out.println("=== String Creation ===");
        String str1 = "Hello World";
        String str2 = new String("Java Programming");
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(chars);
        
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        
        // String length and character access
        System.out.println("\n=== Length and Character Access ===");
        String text = "Programming";
        System.out.printf("Text: %s%n", text);
        System.out.printf("Length: %d%n", text.length());
        System.out.printf("First character: %c%n", text.charAt(0));
        System.out.printf("Last character: %c%n", text.charAt(text.length() - 1));
        
        // Print all characters
        System.out.print("All characters: ");
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " ");
        }
        System.out.println();
        
        // Substring operations
        System.out.println("\n=== Substring Operations ===");
        String sentence = "Java is awesome";
        System.out.printf("Original: %s%n", sentence);
        System.out.printf("Substring (0, 4): %s%n", sentence.substring(0, 4));
        System.out.printf("Substring (5): %s%n", sentence.substring(5));
        System.out.printf("Substring (8, 15): %s%n", sentence.substring(8, 15));
        
        // Case conversion
        System.out.println("\n=== Case Conversion ===");
        String mixed = "Hello World";
        System.out.printf("Original: %s%n", mixed);
        System.out.printf("Uppercase: %s%n", mixed.toUpperCase());
        System.out.printf("Lowercase: %s%n", mixed.toLowerCase());
        
        // String concatenation
        System.out.println("\n=== String Concatenation ===");
        String first = "Hello";
        String second = "World";
        String result1 = first + " " + second;
        String result2 = first.concat(" ").concat(second);
        System.out.printf("Using +: %s%n", result1);
        System.out.printf("Using concat(): %s%n", result2);
        
        // String replacement
        System.out.println("\n=== String Replacement ===");
        String original = "Hello World";
        System.out.printf("Original: %s%n", original);
        System.out.printf("Replace 'l' with 'p': %s%n", original.replace('l', 'p'));
        System.out.printf("Replace 'World' with 'Java': %s%n", 
                         original.replace("World", "Java"));
        System.out.printf("Replace first 'l': %s%n", 
                         original.replaceFirst("l", "L"));
        
        // String searching
        System.out.println("\n=== String Searching ===");
        String searchText = "Hello World Hello";
        System.out.printf("Text: %s%n", searchText);
        System.out.printf("Index of 'o': %d%n", searchText.indexOf('o'));
        System.out.printf("Last index of 'o': %d%n", searchText.lastIndexOf('o'));
        System.out.printf("Index of 'World': %d%n", searchText.indexOf("World"));
        System.out.printf("Index of 'o' from position 5: %d%n", 
                         searchText.indexOf('o', 5));
        
        // String comparison
        System.out.println("\n=== String Comparison ===");
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "hello";
        String s4 = new String("Hello");
        
        System.out.printf("s1.equals(s2): %b%n", s1.equals(s2));
        System.out.printf("s1.equals(s3): %b%n", s1.equals(s3));
        System.out.printf("s1.equalsIgnoreCase(s3): %b%n", s1.equalsIgnoreCase(s3));
        System.out.printf("s1 == s2: %b%n", s1 == s2);
        System.out.printf("s1 == s4: %b%n", s1 == s4);
        System.out.printf("s1.compareTo(s3): %d%n", s1.compareTo(s3));
        
        // String testing
        System.out.println("\n=== String Testing ===");
        String testStr = "Java Programming";
        System.out.printf("Text: %s%n", testStr);
        System.out.printf("Contains 'Program': %b%n", testStr.contains("Program"));
        System.out.printf("Starts with 'Java': %b%n", testStr.startsWith("Java"));
        System.out.printf("Ends with 'ing': %b%n", testStr.endsWith("ing"));
        System.out.printf("Is empty: %b%n", testStr.isEmpty());
        
        // String trimming
        System.out.println("\n=== String Trimming ===");
        String spacedText = "   Hello World   ";
        System.out.printf("Original: '%s'%n", spacedText);
        System.out.printf("Trimmed: '%s'%n", spacedText.trim());
        
        // String splitting
        System.out.println("\n=== String Splitting ===");
        String csv = "John,25,New York";
        String[] parts = csv.split(",");
        System.out.printf("Original: %s%n", csv);
        System.out.println("Split result:");
        for (int i = 0; i < parts.length; i++) {
            System.out.printf("  parts[%d]: %s%n", i, parts[i]);
        }
        
        // Practical example: Email validation
        System.out.println("\n=== Email Validation ===");
        String email = "user@example.com";
        boolean isValid = email.contains("@") && 
                         email.indexOf("@") > 0 && 
                         email.lastIndexOf("@") == email.indexOf("@") &&
                         email.indexOf(".") > email.indexOf("@") &&
                         email.endsWith(".com");
        System.out.printf("Email: %s%n", email);
        System.out.printf("Is valid: %b%n", isValid);
        
        // Practical example: Word counter
        System.out.println("\n=== Word Counter ===");
        String paragraph = "Java is a powerful programming language";
        String[] words = paragraph.split(" ");
        System.out.printf("Paragraph: %s%n", paragraph);
        System.out.printf("Word count: %d%n", words.length);
        System.out.printf("Character count: %d%n", paragraph.length());
        System.out.printf("Character count (no spaces): %d%n", 
                         paragraph.replace(" ", "").length());
        
        // StringBuilder for mutable strings
        System.out.println("\n=== StringBuilder ===");
        StringBuilder sb = new StringBuilder("Hello");
        System.out.printf("Initial: %s%n", sb);
        
        sb.append(" World");
        System.out.printf("After append: %s%n", sb);
        
        sb.insert(5, ",");
        System.out.printf("After insert: %s%n", sb);
        
        sb.delete(5, 6);
        System.out.printf("After delete: %s%n", sb);
        
        sb.reverse();
        System.out.printf("After reverse: %s%n", sb);
    }
}
```

---

# Typecasting

## a. Typecasting

Typecasting is the process of converting a value from one data type to another.

### Types of Typecasting

1. **Implicit Casting (Widening)**: Automatic conversion from smaller to larger type
2. **Explicit Casting (Narrowing)**: Manual conversion from larger to smaller type

### Type Hierarchy (Widening Path)

```
byte → short → int → long → float → double
         ↑
       char
```

### Complete Example
```java
// filepath: TypecastingDemo.java
public class TypecastingDemo {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        System.out.println("=== Implicit Casting (Widening) ===");
        
        byte byteVal = 10;
        short shortVal = byteVal;  // byte to short
        int intVal = shortVal;     // short to int
        long longVal = intVal;     // int to long
        float floatVal = longVal;  // long to float
        double doubleVal = floatVal; // float to double
        
        System.out.printf("byte: %d%n", byteVal);
        System.out.printf("short: %d%n", shortVal);
        System.out.printf("int: %d%n", intVal);
        System.out.printf("long: %d%n", longVal);
        System.out.printf("float: %.1f%n", floatVal);
        System.out.printf("double: %.1f%n", doubleVal);
        
        // Char to int
        char letter = 'A';
        int asciiValue = letter;
        System.out.printf("\nchar '%c' to int: %d%n", letter, asciiValue);
        
        // Explicit Casting (Narrowing)
        System.out.println("\n=== Explicit Casting (Narrowing) ===");
        
        double d = 100.75;
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;
        
        System.out.printf("double: %.2f%n", d);
        System.out.printf("float: %.2f%n", f);
        System.out.printf("long: %d%n", l);
        System.out.printf("int: %d%n", i);
        System.out.printf("short: %d%n", s);
        System.out.printf("byte: %d%n", b);
        
        // Data loss in narrowing
        System.out.println("\n=== Data Loss in Narrowing ===");
        int largeInt = 300;
        byte smallByte = (byte) largeInt;  // Overflow
        System.out.printf("int value: %d%n", largeInt);
        System.out.printf("byte value (overflow): %d%n", smallByte);
        
        double precise = 9.99;
        int truncated = (int) precise;
        System.out.printf("double value: %.2f%n", precise);
        System.out.printf("int value (truncated): %d%n", truncated);
        
        // Char casting
        System.out.println("\n=== Character Casting ===");
        char ch = 'Z';
        int charCode = (int) ch;
        System.out.printf("char: %c, ASCII: %d%n", ch, charCode);
        
        int code = 97;
        char character = (char) code;
        System.out.printf("ASCII: %d, char: %c%n", code, character);
        
        // String to numeric
        System.out.println("\n=== String to Numeric Conversion ===");
        String numStr = "123";
        int num = Integer.parseInt(numStr);
        double numDouble = Double.parseDouble("45.67");
        long numLong = Long.parseLong("1000000");
        
        System.out.printf("String '%s' to int: %d%n", numStr, num);
        System.out.printf("String to double: %.2f%n", numDouble);
        System.out.printf("String to long: %d%n", numLong);
        
        // Numeric to String
        System.out.println("\n=== Numeric to String Conversion ===");
        int number = 456;
        String str1 = String.valueOf(number);
        String str2 = Integer.toString(number);
        String str3 = "" + number;
        
        System.out.printf("int %d to String: '%s'%n", number, str1);
        System.out.printf("Using toString(): '%s'%n", str2);
        System.out.printf("Using concatenation: '%s'%n", str3);
        
        // Mixed operations
        System.out.println("\n=== Mixed Type Operations ===");
        int intNum = 5;
        double doubleNum = 2.5;
        double result = intNum + doubleNum;  // int promoted to double
        System.out.printf("%d + %.1f = %.1f%n", intNum, doubleNum, result);
        
        int division1 = 7 / 2;           // Integer division
        double division2 = 7.0 / 2;      // Double division
        double division3 = (double) 7 / 2; // Cast before division
        
        System.out.printf("\n7 / 2 (int): %d%n", division1);
        System.out.printf("7.0 / 2 (double): %.1f%n", division2);
        System.out.printf("(double)7 / 2: %.1f%n", division3);
        
        // Practical examples
        System.out.println("\n=== Practical Examples ===");
        
        // Calculate percentage
        int correct = 45;
        int total = 50;
        double percentage = ((double) correct / total) * 100;
        System.out.printf("Score: %d/%d = %.2f%%%n", correct, total, percentage);
        
        // Round to nearest integer
        double price = 19.99;
        int roundedPrice = (int) Math.round(price);
        System.out.printf("Price: $%.2f, Rounded: $%d%n", price, roundedPrice);
        
        // Extract digits
        int fullNumber = 12345;
        int lastDigit = fullNumber % 10;
        int remaining = fullNumber / 10;
        System.out.printf("Number: %d%n", fullNumber);
        System.out.printf("Last digit: %d%n", lastDigit);
        System.out.printf("Remaining: %d%n", remaining);
        
        // Character arithmetic
        char startChar = 'A';
        char endChar = (char) (startChar + 25);  // 'A' + 25 = 'Z'
        System.out.printf("Start: %c, End: %c%n", startChar, endChar);
    }
}
```

---

# Built-in Libraries

## a. Predefined Character Functions

Java provides the `Character` class with methods to work with individual characters.

### Character Methods

| Method | Description | Example |
|--------|-------------|---------|
| `isLetter(ch)` | Checks if letter | `Character.isLetter('A')` → `true` |
| `isDigit(ch)` | Checks if digit | `Character.isDigit('5')` → `true` |
| `isLetterOrDigit(ch)` | Letter or digit | `Character.isLetterOrDigit('@')` → `false` |
| `isUpperCase(ch)` | Checks if uppercase | `Character.isUpperCase('A')` → `true` |
| `isLowerCase(ch)` | Checks if lowercase | `Character.isLowerCase('a')` → `true` |
| `isWhitespace(ch)` | Checks if whitespace | `Character.isWhitespace(' ')` → `true` |
| `toUpperCase(ch)` | Converts to uppercase | `Character.toUpperCase('a')` → `'A'` |
| `toLowerCase(ch)` | Converts to lowercase | `Character.toLowerCase('A')` → `'a'` |

### Complete Example
```java
// filepath: CharacterFunctionsDemo.java
public class CharacterFunctionsDemo {
    public static void main(String[] args) {
        System.out.println("=== Character Type Checking ===");
        
        char[] testChars = {'A', 'z', '5', '@', ' ', '\n'};
        
        for (char ch : testChars) {
            System.out.printf("\nCharacter: '%c' (ASCII: %d)%n", 
                             ch, (int) ch);
            System.out.printf("  isLetter: %b%n", Character.isLetter(ch));
            System.out.printf("  isDigit: %b%n", Character.isDigit(ch));
            System.out.printf("  isLetterOrDigit: %b%n", Character.isLetterOrDigit(ch));
            System.out.printf("  isUpperCase: %b%n", Character.isUpperCase(ch));
            System.out.printf("  isLowerCase: %b%n", Character.isLowerCase(ch));
            System.out.printf("  isWhitespace: %b%n", Character.isWhitespace(ch));
        }
        
        // Case conversion
        System.out.println("\n=== Case Conversion ===");
        char lower = 'a';
        char upper = 'Z';
        
        System.out.printf("'%c' to uppercase: '%c'%n", 
                         lower, Character.toUpperCase(lower));
        System.out.printf("'%c' to lowercase: '%c'%n", 
                         upper, Character.toLowerCase(upper));
        
        // Practical example: Password validator
        System.out.println("\n=== Password Validator ===");
        String password = "Pass123!";
        boolean hasUpper = false, hasLower = false;
        boolean hasDigit = false, hasSpecial = false;
        
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) hasUpper = true;
            if (Character.isLowerCase(ch)) hasLower = true;
            if (Character.isDigit(ch)) hasDigit = true;
            if (!Character.isLetterOrDigit(ch)) hasSpecial = true;
        }
        
        System.out.printf("Password: %s%n", password);
        System.out.printf("Has uppercase: %b%n", hasUpper);
        System.out.printf("Has lowercase: %b%n", hasLower);
        System.out.printf("Has digit: %b%n", hasDigit);
        System.out.printf("Has special char: %b%n", hasSpecial);
        System.out.printf("Is strong: %b%n", 
                         hasUpper && hasLower && hasDigit && hasSpecial);
        
        // Practical example: Character statistics
        System.out.println("\n=== Character Statistics ===");
        String text = "Hello World 123!";
        int letters = 0, digits = 0, spaces = 0, others = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) letters++;
            else if (Character.isDigit(ch)) digits++;
            else if (Character.isWhitespace(ch)) spaces++;
            else others++;
        }
        
        System.out.printf("Text: %s%n", text);
        System.out.printf("Letters: %d%n", letters);
        System.out.printf("Digits: %d%n", digits);
        System.out.printf("Spaces: %d%n", spaces);
        System.out.printf("Others: %d%n", others);
    }
}
```

---

## b. Predefined String Functions

Already covered in the Strings section above. Refer to "String Handling" for complete details.

---

## c. Predefined Math Functions

Java's `Math` class provides mathematical operations and constants.

### Common Math Methods

| Method | Description | Example |
|--------|-------------|---------|
| `abs(x)` | Absolute value | `Math.abs(-5)` → `5` |
| `pow(x, y)` | x raised to y | `Math.pow(2, 3)` → `8.0` |
| `sqrt(x)` | Square root | `Math.sqrt(16)` → `4.0` |
| `ceil(x)` | Round up | `Math.ceil(4.3)` → `5.0` |
| `floor(x)` | Round down | `Math.floor(4.7)` → `4.0` |
| `round(x)` | Round to nearest | `Math.round(4.5)` → `5` |
| `max(x, y)` | Maximum value | `Math.max(5, 10)` → `10` |
| `min(x, y)` | Minimum value | `Math.min(5, 10)` → `5` |
| `random()` | Random [0, 1) | `Math.random()` → `0.xxxxx` |

### Complete Example
```java
// filepath: MathFunctionsDemo.java
public class MathFunctionsDemo {
    public static void main(String[] args) {
        // Math constants
        System.out.println("=== Math Constants ===");
        System.out.printf("PI: %.15f%n", Math.PI);
        System.out.printf("E: %.15f%n", Math.E);
        
        // Absolute value
        System.out.println("\n=== Absolute Value ===");
        System.out.printf("abs(-5): %d%n", Math.abs(-5));
        System.out.printf("abs(-3.14): %.2f%n", Math.abs(-3.14));
        System.out.printf("abs(10): %d%n", Math.abs(10));
        
        // Power and roots
        System.out.println("\n=== Power and Roots ===");
        System.out.printf("pow(2, 3): %.0f%n", Math.pow(2, 3));
        System.out.printf("pow(5, 2): %.0f%n", Math.pow(5, 2));
        System.out.printf("sqrt(16): %.0f%n", Math.sqrt(16));
        System.out.printf("sqrt(2): %.5f%n", Math.sqrt(2));
        System.out.printf("cbrt(27): %.0f%n", Math.cbrt(27));  // Cube root
        
        // Rounding
        System.out.println("\n=== Rounding Functions ===");
        double value = 4.7;
        System.out.printf("Value: %.1f%n", value);
        System.out.printf("ceil(%.1f): %.0f%n", value, Math.ceil(value));
        System.out.printf("floor(%.1f): %.0f%n", value, Math.floor(value));
        System.out.printf("round(%.1f): %d%n", value, Math.round(value));
        
        value = 4.3;
        System.out.printf("\nValue: %.1f%n", value);
        System.out.printf("ceil(%.1f): %.0f%n", value, Math.ceil(value));
        System.out.printf("floor(%.1f): %.0f%n", value, Math.floor(value));
        System.out.printf("round(%.1f): %d%n", value, Math.round(value));
        
        // Min and Max
        System.out.println("\n=== Min and Max ===");
        System.out.printf("max(5, 10): %d%n", Math.max(5, 10));
        System.out.printf("min(5, 10): %d%n", Math.min(5, 10));
        System.out.printf("max(-5, -10): %d%n", Math.max(-5, -10));
        
        // Finding max/min of three numbers
        int a = 15, b = 20, c = 10;
        int maximum = Math.max(a, Math.max(b, c));
        int minimum = Math.min(a, Math.min(b, c));
        System.out.printf("Numbers: %d, %d, %d%n", a, b, c);
        System.out.printf("Maximum: %d%n", maximum);
        System.out.printf("Minimum: %d%n", minimum);
        
        // Trigonometric functions
        System.out.println("\n=== Trigonometric Functions ===");
        double angle = 45;  // degrees
        double radians = Math.toRadians(angle);
        System.out.printf("Angle: %.0f degrees = %.5f radians%n", angle, radians);
        System.out.printf("sin(%.0f°): %.5f%n", angle, Math.sin(radians));
        System.out.printf("cos(%.0f°): %.5f%n", angle, Math.cos(radians));
        System.out.printf("tan(%.0f°): %.5f%n", angle, Math.tan(radians));
        
        // Logarithmic functions
        System.out.println("\n=== Logarithmic Functions ===");
        System.out.printf("log(10): %.5f%n", Math.log(10));      // Natural log
        System.out.printf("log10(100): %.0f%n", Math.log10(100)); // Base 10 log
        System.out.printf("exp(1): %.5f%n", Math.exp(1));        // e^1
        
        // Random numbers
        System.out.println("\n=== Random Numbers ===");
        System.out.println("Random double [0, 1): " + Math.random());
        
        // Random integer in range [min, max]
        int min = 1, max = 100;
        int randomInt = (int)(Math.random() * (max - min + 1)) + min;
        System.out.printf("Random int [%d, %d]: %d%n", min, max, randomInt);
        
        // Generate 5 random numbers
        System.out.print("5 random numbers [1, 10]: ");
        for (int i = 0; i < 5; i++) {
            int rand = (int)(Math.random() * 10) + 1;
            System.out.print(rand + " ");
        }
        System.out.println();
        
        // Practical examples
        System.out.println("\n=== Practical Examples ===");
        
        // Calculate distance between two points
        double x1 = 0, y1 = 0, x2 = 3, y2 = 4;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Distance between (%.0f,%.0f) and (%.0f,%.0f): %.2f%n", 
                         x1, y1, x2, y2, distance);
        
        // Calculate area of circle
        double radius = 5.0;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Circle area (r=%.1f): %.2f%n", radius, area);
        
        // Calculate compound interest
        double principal = 1000;
        double rate = 0.05;  // 5%
        int years = 10;
        double amount = principal * Math.pow(1 + rate, years);
        System.out.printf("Compound interest: $%.2f%n", amount);
        
        // Hypotenuse of right triangle
        double side1 = 3, side2 = 4;
        double hypotenuse = Math.hypot(side1, side2);
        System.out.printf("Hypotenuse of triangle (%.0f, %.0f): %.2f%n", 
                         side1, side2, hypotenuse);
    }
}
```

---

# Selection Structures

## a. Relational Operators

Relational operators compare two values and return a boolean result.

### Relational Operators Table

| Operator | Description | Example | Result |
|----------|-------------|---------|--------|
| `==` | Equal to | `5 == 5` | `true` |
| `!=` | Not equal to | `5 != 3` | `true` |
| `>` | Greater than | `5 > 3` | `true` |
| `<` | Less than | `5 < 3` | `false` |
| `>=` | Greater than or equal | `5 >= 5` | `true` |
| `<=` | Less than or equal | `3 <= 5` | `true` |

### Complete Example
```java
// filepath: RelationalOperatorsDemo.java
public class RelationalOperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 10;
        
        System.out.println("=== Relational Operators ===");
        System.out.printf("a = %d, b = %d, c = %d%n%n", a, b, c);
        
        // Equal to
        System.out.printf("a == b: %b%n", a == b);
        System.out.printf("a == c: %b%n", a == c);
        
        // Not equal to
        System.out.printf("a != b: %b%n", a != b);
        System.out.printf("a != c: %b%n", a != c);
        
        // Greater than
        System.out.printf("a > b: %b%n", a > b);
        System.out.printf("b > a: %b%n", b > a);
        
        // Less than
        System.out.printf("a < b: %b%n", a < b);
        System.out.printf("b < a: %b%n", b < a);
        
        // Greater than or equal
        System.out.printf("a >= c: %b%n", a >= c);
        System.out.printf("a >= b: %b%n", a >= b);
        
        // Less than or equal
        System.out.printf("a <= c: %b%n", a <= c);
        System.out.printf("a <= b: %b%n", a <= b);
        
        // Practical examples
        System.out.println("\n=== Practical Examples ===");
        
        int age = 18;
        System.out.printf("Age: %d%n", age);
        System.out.printf("Is adult (age >= 18): %b%n", age >= 18);
        System.out.printf("Is teenager (age >= 13 && age <= 19): %b%n", 
                         age >= 13 && age <= 19);
        
        double temperature = 25.5;
        System.out.printf("\nTemperature: %.1f°C%n", temperature);
        System.out.printf("Is freezing (temp <= 0): %b%n", temperature <= 0);
        System.out.printf("Is comfortable (temp >= 20 && temp <=# Java Programming Fundamentals - Complete Study Guide

## Table of Contents
1. [Programming Fundamentals](#programming-fundamentals)
2. [Operators](#operators)
3. [Strings](#strings)
4. [Typecasting](#typecasting)
5. [Built-in Libraries](#built-in-libraries)
6. [Selection Structures](#selection-structures)
7. [Iterative Structures](#iterative-structures)
8. [Arrays](#arrays)

---

# Programming Fundamentals

## a. Output Operations

Output operations in Java are used to display data to the console or other output streams.

### Basic Output Methods

**`System.out.print()`** - Prints without newline
```java
System.out.print("Hello");
System.out.print(" World");
// Output: Hello World
```

**`System.out.println()`** - Prints with newline
```java
System.out.println("Hello");
System.out.println("World");
// Output:
// Hello
// World
```

**`System.out.printf()`** - Formatted output
```java
int age = 25;
String name = "John";
System.out.printf("Name: %s, Age: %d%n", name, age);
// Output: Name: John, Age: 25
```

### Complete Example
```java
// filepath: OutputDemo.java
public class OutputDemo {
    public static void main(String[] args) {
        // Simple print
        System.out.print("This is ");
        System.out.print("on one line. ");
        
        // Print with newline
        System.out.println("\nThis is on a new line.");
        System.out.println("This is on another line.");
        
        // Formatted output
        String product = "Laptop";
        double price = 999.99;
        int quantity = 5;
        
        System.out.printf("Product: %s%n", product);
        System.out.printf("Price: $%.2f%n", price);
        System.out.printf("Quantity: %d%n", quantity);
        System.out.printf("Total: $%.2f%n", price * quantity);
    }
}
```

---

## b. Escape Sequences

Escape sequences are special character combinations that represent non-printable or special characters.

### Common Escape Sequences

| Escape Sequence | Description | Example |
|----------------|-------------|---------|
| `\n` | Newline | `"Hello\nWorld"` |
| `\t` | Tab | `"Name:\tJohn"` |
| `\\` | Backslash | `"C:\\Users"` |
| `\"` | Double quote | `"He said \"Hi\""` |
| `\'` | Single quote | `'\'A\''` |
| `\r` | Carriage return | `"Hello\rWorld"` |
| `\b` | Backspace | `"Helo\bo"` |

### Complete Example
```java
// filepath: EscapeSequenceDemo.java
public class EscapeSequenceDemo {
    public static void main(String[] args) {
        // Newline demonstration
        System.out.println("Line 1\nLine 2\nLine 3");
        
        // Tab demonstration
        System.out.println("Name:\tJohn Doe");
        System.out.println("Age:\t25");
        System.out.println("City:\tNew York");
        
        // Quotes demonstration
        System.out.println("He said, \"Java is awesome!\"");
        System.out.println("Single quote: \'A\'");
        
        // Backslash demonstration
        System.out.println("File path: C:\\Program Files\\Java");
        
        // Creating a formatted table
        System.out.println("\n=== Student Record ===");
        System.out.println("ID\tName\t\tGrade");
        System.out.println("1\tAlice\t\tA");
        System.out.println("2\tBob\t\tB+");
        System.out.println("3\tCharlie\t\tA-");
        
        // Creating a box
        System.out.println("\n+----------------+");
        System.out.println("|  Hello World!  |");
        System.out.println("+----------------+");
    }
}
```

---

## c. Placeholders

Placeholders are used in formatted output to specify where and how values should be displayed.

### Format Specifiers

| Specifier | Description | Example |
|-----------|-------------|---------|
| `%d` | Integer | `printf("%d", 42)` |
| `%f` | Float/Double | `printf("%.2f", 3.14159)` |
| `%s` | String | `printf("%s", "Hello")` |
| `%c` | Character | `printf("%c", 'A')` |
| `%b` | Boolean | `printf("%b", true)` |
| `%n` | Newline (platform independent) | `printf("Line%n")` |
| `%x` | Hexadecimal | `printf("%x", 255)` |
| `%o` | Octal | `printf("%o", 8)` |
| `%e` | Scientific notation | `printf("%e", 1000.0)` |

### Width and Precision

```java
%[flags][width][.precision]specifier
```

- **Width**: Minimum number of characters
- **Precision**: Number of decimal places for floating-point
- **Flags**: 
  - `-` : Left-align
  - `+` : Show sign
  - `0` : Zero-padding
  - `,` : Grouping separator

### Complete Example
```java
// filepath: PlaceholderDemo.java
public class PlaceholderDemo {
    public static void main(String[] args) {
        // Basic placeholders
        int age = 25;
        double height = 5.9;
        String name = "John";
        char grade = 'A';
        boolean isPassed = true;
        
        System.out.println("=== Basic Format Specifiers ===");
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d years%n", age);
        System.out.printf("Height: %.1f feet%n", height);
        System.out.printf("Grade: %c%n", grade);
        System.out.printf("Passed: %b%n%n", isPassed);
        
        // Width and alignment
        System.out.println("=== Width and Alignment ===");
        System.out.printf("|%10s|%n", "Right");     // Right-aligned, width 10
        System.out.printf("|%-10s|%n", "Left");     // Left-aligned, width 10
        System.out.printf("|%10d|%n", 42);          // Right-aligned integer
        System.out.printf("|%-10d|%n%n", 42);       // Left-aligned integer
        
        // Precision with floating-point
        double pi = 3.14159265359;
        System.out.println("=== Precision Control ===");
        System.out.printf("Pi with 2 decimals: %.2f%n", pi);
        System.out.printf("Pi with 5 decimals: %.5f%n", pi);
        System.out.printf("Pi in scientific notation: %e%n%n", pi);
        
        // Zero padding
        int orderNumber = 42;
        System.out.printf("Order Number: %05d%n%n", orderNumber);
        
        // Creating a receipt
        System.out.println("=== RECEIPT ===");
        System.out.printf("%-20s %10s %10s%n", "Item", "Qty", "Price");
        System.out.println("--------------------------------------------");
        System.out.printf("%-20s %10d $%9.2f%n", "Laptop", 1, 999.99);
        System.out.printf("%-20s %10d $%9.2f%n", "Mouse", 2, 25.50);
        System.out.printf("%-20s %10d $%9.2f%n", "Keyboard", 1, 75.00);
        System.out.println("--------------------------------------------");
        System.out.printf("%-20s %10s $%9.2f%n", "TOTAL", "", 1126.49);
        
        // Number formatting
        System.out.println("\n=== Number Formatting ===");
        int decimal = 255;
        System.out.printf("Decimal: %d%n", decimal);
        System.out.printf("Hexadecimal: %x%n", decimal);
        System.out.printf("Octal: %o%n", decimal);
        
        // Large numbers with grouping
        long population = 1000000;
        System.out.printf("%nPopulation: %,d%n", population);
    }
}
```

---

## d. Input Operations

Input operations allow programs to receive data from users or other sources.

### Scanner Class

The `Scanner` class is the most common way to get user input in Java.

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
```

### Scanner Methods

| Method | Description | Example |
|--------|-------------|---------|
| `nextInt()` | Read integer | `int num = scanner.nextInt();` |
| `nextDouble()` | Read double | `double price = scanner.nextDouble();` |
| `nextFloat()` | Read float | `float rate = scanner.nextFloat();` |
| `nextLong()` | Read long | `long value = scanner.nextLong();` |
| `nextBoolean()` | Read boolean | `boolean flag = scanner.nextBoolean();` |
| `next()` | Read single word | `String word = scanner.next();` |
| `nextLine()` | Read entire line | `String line = scanner.nextLine();` |

### Complete Example
```java
// filepath: InputDemo.java
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading different data types
        System.out.println("=== Student Registration ===");
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        
        System.out.print("Are you enrolled? (true/false): ");
        boolean isEnrolled = scanner.nextBoolean();
        
        // Clear the newline character
        scanner.nextLine();
        
        System.out.print("Enter your major: ");
        String major = scanner.nextLine();
        
        // Display collected information
        System.out.println("\n=== Registration Summary ===");
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d years%n", age);
        System.out.printf("GPA: %.2f%n", gpa);
        System.out.printf("Enrolled: %b%n", isEnrolled);
        System.out.printf("Major: %s%n", major);
        
        scanner.close();
    }
}
```

### Common Input Pitfalls and Solutions

```java
// filepath: InputPitfallsDemo.java
import java.util.Scanner;

public class InputPitfallsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Problem: nextInt() doesn't consume newline
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Solution: Use nextLine() to clear buffer
        scanner.nextLine(); // Consume leftover newline
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.printf("Number: %d, Name: %s%n", number, name);
        
        // Reading multiple values from one line
        System.out.print("Enter three numbers separated by spaces: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.printf("Sum: %d%n", a + b + c);
        
        // Input validation
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter your age: ");
        
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Enter a number: ");
            scanner.next(); // Discard invalid input
        }
        
        int age = scanner.nextInt();
        System.out.printf("Age entered: %d%n", age);
        
        scanner.close();
    }
}
```

### Complete Input/Output Example
```java
// filepath: CalculatorDemo.java
import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("╔════════════════════════════╗");
        System.out.println("║   Simple Calculator        ║");
        System.out.println("╚════════════════════════════╝");
        
        System.out.print("\nEnter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        boolean validOperation = true;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
                validOperation = false;
        }
        
        if (validOperation) {
            System.out.println("\n" + "=".repeat(30));
            System.out.printf("%.2f %c %.2f = %.2f%n", num1, operator, num2, result);
            System.out.println("=".repeat(30));
        }
        
        scanner.close();
    }
}
```

---

# Operators

## a. Arithmetic Operators

Arithmetic operators perform mathematical operations on numeric values.

### Basic Arithmetic Operators

| Operator | Description | Example | Result |
|----------|-------------|---------|--------|
| `+` | Addition | `5 + 3` | `8` |
| `-` | Subtraction | `5 - 3` | `2` |
| `*` | Multiplication | `5 * 3` | `15` |
| `/` | Division | `5 / 2` | `2` (integer division) |
| `%` | Modulus (remainder) | `5 % 2` | `1` |

### Unary Operators

| Operator | Description | Example |
|----------|-------------|---------|
| `+` | Unary plus | `+5` |
| `-` | Unary minus | `-5` |
| `++` | Increment | `x++` or `++x` |
| `--` | Decrement | `x--` or `--x` |

### Complete Example
```java
// filepath: ArithmeticOperatorsDemo.java
public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 3;
        
        System.out.println("=== Basic Arithmetic Operations ===");
        System.out.printf("a = %d, b = %d%n%n", a, b);
        
        // Basic operations
        System.out.printf("Addition (a + b): %d%n", a + b);
        System.out.printf("Subtraction (a - b): %d%n", a - b);
        System.out.printf("Multiplication (a * b): %d%n", a * b);
        System.out.printf("Division (a / b): %d%n", a / b);
        System.out.printf("Modulus (a %% b): %d%n%n", a % b);
        
        // Integer vs Floating-point division
        System.out.println("=== Division Behavior ===");
        System.out.printf("Integer division: 10 / 3 = %d%n", 10 / 3);
        System.out.printf("Float division: 10.0 / 3 = %.2f%n%n", 10.0 / 3);
        
        // Increment and Decrement
        System.out.println("=== Increment/Decrement ===");
        int x = 5;
        System.out.printf("Initial value: x = %d%n", x);
        System.out.printf("Post-increment (x++): %d, then x = %d%n", x++, x);
        
        x = 5;
        System.out.printf("Pre-increment (++x): %d, x = %d%n", ++x, x);
        
        x = 5;
        System.out.printf("Post-decrement (x--): %d, then x = %d%n", x--, x);
        
        x = 5;
        System.out.printf("Pre-decrement (--x): %d, x = %d%n%n", --x, x);
        
        // Practical examples
        System.out.println("=== Practical Examples ===");
        
        // Calculate average
        int score1 = 85, score2 = 90, score3 = 78;
        double average = (score1 + score2 + score3) / 3.0;
        System.out.printf("Average score: %.2f%n", average);
        
        // Convert temperature
        double celsius = 25.0;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("%.1f°C = %.1f°F%n", celsius, fahrenheit);
        
        // Calculate area and perimeter
        int length = 10, width = 5;
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.printf("Rectangle: Area = %d, Perimeter = %d%n", area, perimeter);
        
        // Time calculation
        int totalSeconds = 3665;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.printf("Time: %02d:%02d:%02d%n", hours, minutes, seconds);
    }
}
```

---

## b. Assignment Operators

Assignment operators assign values to variables with optional arithmetic operations.

### Assignment Operators Table

| Operator | Description | Example | Equivalent |
|----------|-------------|---------|------------|
| `=` | Simple assignment | `x = 5` | - |
| `+=` | Add and assign | `x += 3` | `x = x + 3` |
| `-=` | Subtract and assign | `x -= 3` | `x = x - 3` |
| `*=` | Multiply and assign | `x *= 3` | `x = x * 3` |
| `/=` | Divide and assign | `x /= 3` | `x = x / 3` |
| `%=` | Modulus and assign | `x %= 3` | `x = x % 3` |

### Complete Example
```java
// filepath: AssignmentOperatorsDemo.java
public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        System.out.println("=== Simple Assignment ===");
        int x = 10;
        System.out.printf("x = %d%n%n", x);
        
        // Addition assignment
        System.out.println("=== Compound Assignment Operators ===");
        x = 10;
        System.out.printf("Initial: x = %d%n", x);
        x += 5;  // x = x + 5
        System.out.printf("After x += 5: x = %d%n", x);
        
        // Subtraction assignment
        x -= 3;  // x = x - 3
        System.out.printf("After x -= 3: x = %d%n", x);
        
        // Multiplication assignment
        x *= 2;  // x = x * 2
        System.out.printf("After x *= 2: x = %d%n", x);
        
        // Division assignment
        x /= 4;  // x = x / 4
        System.out.printf("After x /= 4: x = %d%n", x);
        
        // Modulus assignment
        x %= 5;  // x = x % 5
        System.out.printf("After x %%= 5: x = %d%n%n", x);
        
        // Practical example: Shopping cart
        System.out.println("=== Shopping Cart Example ===");
        double total = 0.0;
        System.out.printf("Initial total: $%.2f%n", total);
        
        total += 29.99;  // Add item 1
        System.out.printf("Added item ($29.99): $%.2f%n", total);
        
        total += 15.50;  // Add item 2
        System.out.printf("Added item ($15.50): $%.2f%n", total);
        
        total += 42.00;  // Add item 3
        System.out.printf("Added item ($42.00): $%.2f%n", total);
        
        total *= 1.08;   // Add 8% tax
        System.out.printf("After tax (8%%): $%.2f%n", total);
        
        total -= 10.00;  // Apply discount
        System.out.printf("After discount: $%.2f%n%n", total);
        
        // Multiple assignments
        System.out.println("=== Multiple Assignments ===");
        int a, b, c;
        a = b = c = 5;
        System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
        
        // Chained operations
        int score = 0;
        score += 10;
        score += 20;
        score += 15;
        System.out.printf("Final score: %d%n", score);
    }
}
```

---

## c. Bitwise Operators

Bitwise operators perform operations on individual bits of integer values.

### Bitwise Operators Table

| Operator | Description | Example | Binary Operation |
|----------|-------------|---------|------------------|
| `&` | AND | `5 & 3` | `0101 & 0011 = 0001` |
| `\|` | OR | `5 \| 3` | `0101 \| 0011 = 0111` |
| `^` | XOR | `5 ^ 3` | `0101 ^ 0011 = 0110` |
| `~` | NOT (complement) | `~5` | `~0101 = 1010` |
| `<<` | Left shift | `5 << 1` | `0101 << 1 = 1010` |
| `>>` | Right shift | `5 >> 1` | `0101 >> 1 = 0010` |
| `>>>` | Unsigned right shift | `5 >>> 1` | Same as `>>` for positive |

### Complete Example
```java
// filepath: BitwiseOperatorsDemo.java
public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        int a = 5;   // Binary: 0101
        int b = 3;   // Binary: 0011
        
        System.out.println("=== Bitwise Operations ===");
        System.out.printf("a = %d (Binary: %s)%n", a, Integer.toBinaryString(a));
        System.out.printf("b = %d (Binary: %s)%n%n", b, Integer.toBinaryString(b));
        
        // AND operation
        int andResult = a & b;
        System.out.printf("AND (a & b): %d (Binary: %s)%n", 
                         andResult, Integer.toBinaryString(andResult));
        
        // OR operation
        int orResult = a | b;
        System.out.printf("OR (a | b): %d (Binary: %s)%n", 
                         orResult, Integer.toBinaryString(orResult));
        
        // XOR operation
        int xorResult = a ^ b;
        System.out.printf("XOR (a ^ b): %d (Binary: %s)%n", 
                         xorResult, Integer.toBinaryString(xorResult));
        
        // NOT operation
        int notResult = ~a;
        System.out.printf("NOT (~a): %d (Binary: %s)%n%n", 
                         notResult, Integer.toBinaryString(notResult));
        
        // Shift operations
        System.out.println("=== Shift Operations ===");
        int x = 8;  // Binary: 1000
        System.out.printf("x = %d (Binary: %s)%n", x, Integer.toBinaryString(x));
        
        int leftShift = x << 2;  // Multiply by 2^2
        System.out.printf("Left shift (x << 2): %d (Binary: %s)%n", 
                         leftShift, Integer.toBinaryString(leftShift));
        
        int rightShift = x >> 2;  // Divide by 2^2
        System.out.printf("Right shift (x >> 2): %d (Binary: %s)%n%n", 
                         rightShift, Integer.toBinaryString(rightShift));
        
        // Practical applications
        System.out.println("=== Practical Applications ===");
        
        // 1. Check if number is even or odd
        int num = 7;
        boolean isEven = (num & 1) == 0;
        System.out.printf("%d is %s%n", num, isEven ? "even" : "odd");
        
        // 2. Multiply by power of 2
        int value = 5;
        int doubled = value << 1;  // Same as value * 2
        int quadrupled = value << 2;  // Same as value * 4
        System.out.printf("%d * 2 = %d%n", value, doubled);
        System.out.printf("%d * 4 = %d%n", value, quadrupled);
        
        // 3. Swap two numbers without temp variable
        System.out.println("\n=== Swap without temp ===");
        int p = 10, q = 20;
        System.out.printf("Before: p = %d, q = %d%n", p, q);
        p = p ^ q;
        q = p ^ q;
        p = p ^ q;
        System.out.printf("After: p = %d, q = %d%n", p, q);
        
        // 4. Set, clear, and toggle bits
        System.out.println("\n=== Bit Manipulation ===");
        int flags = 0;
        System.out.printf("Initial flags: %s%n", Integer.toBinaryString(flags));
        
        // Set bit at position 2
        flags |= (1 << 2);
        System.out.printf("After setting bit 2: %s%n", Integer.toBinaryString(flags));
        
        // Clear bit at position 2
        flags &= ~(1 << 2);
        System.out.printf("After clearing bit 2: %s%n", Integer.toBinaryString(flags));
        
        // Toggle bit at position 1
        flags ^= (1 << 1);
        System.out.printf("After toggling bit 1: %s%n", Integer.toBinaryString(flags));
        
        // 5. Check if power of 2
        int testNum = 16;
        boolean isPowerOf2 = (testNum & (testNum - 1)) == 0 && testNum != 0;
        System.out.printf("\n%d is%s a power of 2%n", testNum, isPowerOf2 ? "" : " not");
    }
}
```

---

# Strings

## a. String Handling

Strings in Java are objects that represent sequences of characters. They are immutable, meaning once created, their values cannot be changed.

### String Creation

```java
// String literal
String str1 = "Hello";

// Using new keyword
String str2 = new String("World");

// From character array
char[] chars = {'J', 'a', 'v', 'a'};
String str3 = new String(chars);
```

### Common String Methods

| Method | Description | Example |
|--------|-------------|---------|
| `length()` | Returns string length | `"Hello".length()` → `5` |
| `charAt(index)` | Returns character at index | `"Hello".charAt(1)` → `'e'` |
| `substring(start, end)` | Extracts substring | `"Hello".substring(1, 4)` → `"ell"` |
| `toLowerCase()` | Converts to lowercase | `"HELLO".toLowerCase()` → `"hello"` |
| `toUpperCase()` | Converts to uppercase | `"hello".toUpperCase()` → `"HELLO"` |
| `trim()` | Removes whitespace | `" Hi ".trim()` → `"Hi"` |
| `concat()` | Concatenates strings | `"Hi".concat(" there")` → `"Hi there"` |
| `replace()` | Replaces characters | `"Hello".replace('l', 'p')` → `"Heppo"` |
| `indexOf()` | Finds first occurrence | `"Hello".indexOf('l')` → `2` |
| `lastIndexOf()` | Finds last occurrence | `"Hello".lastIndexOf('l')` → `3` |
| `equals()` | Compares strings | `"Hi".equals("Hi")` → `true` |
| `equalsIgnoreCase()` | Compares ignoring case | `"Hi".equalsIgnoreCase("hi")` → `true` |
| `contains()` | Checks if contains substring | `"Hello".contains("ell")` → `true` |
| `startsWith()` | Checks if starts with | `"Hello".startsWith("He")` → `true` |
| `endsWith()` | Checks if ends with | `"Hello".endsWith("lo")` → `true` |
| `split()` | Splits into array | `"a,b,c".split(",")` → `["a","b","c"]` |

### Complete Example
```java
// filepath: StringHandlingDemo.java
public class StringHandlingDemo {
    public static void main(String[] args) {
        // String creation
        System.out.println("=== String Creation ===");
        String str1 = "Hello World";
        String str2 = new String("Java Programming");
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(chars);
        
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        
        // String length and character access
        System.out.println("\n=== Length and Character Access ===");
        String text = "Programming";
        System.out.printf("Text: %s%n", text);
        System.out.printf("Length: %d%n", text.length());
        System.out.printf("First character: %c%n", text.charAt(0));
        System.out.printf("Last character: %c%n", text.charAt(text.length() - 1));
        
        // Print all characters
        System.out.print("All characters: ");
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " ");
        }
        System.out.println();
        
        // Substring operations
        System.out.println("\n=== Substring Operations ===");
        String sentence = "Java is awesome";
        System.out.printf("Original: %s%n", sentence);
        System.out.printf("Substring (0, 4): %s%n", sentence.substring(0, 4));
        System.out.printf("Substring (5): %s%n", sentence.substring(5));
        System.out.printf("Substring (8, 15): %s%n", sentence.substring(8, 15));
        
        // Case conversion
        System.out.println("\n=== Case Conversion ===");
        String mixed = "Hello World";
        System.out.printf("Original: %s%n", mixed);
        System.out.printf("Uppercase: %s%n", mixed.toUpperCase());
        System.out.printf("Lowercase: %s%n", mixed.toLowerCase());
        
        // String concatenation
        System.out.println("\n=== String Concatenation ===");
        String first = "Hello";
        String second = "World";
        String result1 = first + " " + second;
        String result2 = first.concat(" ").concat(second);
        System.out.printf("Using +: %s%n", result1);
        System.out.printf("Using concat(): %s%n", result2);
        
        // String replacement
        System.out.println("\n=== String Replacement ===");
        String original = "Hello World";
        System.out.printf("Original: %s%n", original);
        System.out.printf("Replace 'l' with 'p': %s%n", original.replace('l', 'p'));
        System.out.printf("Replace 'World' with 'Java': %s%n", 
                         original.replace("World", "Java"));
        System.out.printf("Replace first 'l': %s%n", 
                         original.replaceFirst("l", "L"));
        
        // String searching
        System.out.println("\n=== String Searching ===");
        String searchText = "Hello World Hello";
        System.out.printf("Text: %s%n", searchText);
        System.out.printf("Index of 'o': %d%n", searchText.indexOf('o'));
        System.out.printf("Last index of 'o': %d%n", searchText.lastIndexOf('o'));
        System.out.printf("Index of 'World': %d%n", searchText.indexOf("World"));
        System.out.printf("Index of 'o' from position 5: %d%n", 
                         searchText.indexOf('o', 5));
        
        // String comparison
        System.out.println("\n=== String Comparison ===");
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "hello";
        String s4 = new String("Hello");
        
        System.out.printf("s1.equals(s2): %b%n", s1.equals(s2));
        System.out.printf("s1.equals(s3): %b%n", s1.equals(s3));
        System.out.printf("s1.equalsIgnoreCase(s3): %b%n", s1.equalsIgnoreCase(s3));
        System.out.printf("s1 == s2: %b%n", s1 == s2);
        System.out.printf("s1 == s4: %b%n", s1 == s4);
        System.out.printf("s1.compareTo(s3): %d%n", s1.compareTo(s3));
        
        // String testing
        System.out.println("\n=== String Testing ===");
        String testStr = "Java Programming";
        System.out.printf("Text: %s%n", testStr);
        System.out.printf("Contains 'Program': %b%n", testStr.contains("Program"));
        System.out.printf("Starts with 'Java': %b%n", testStr.startsWith("Java"));
        System.out.printf("Ends with 'ing': %b%n", testStr.endsWith("ing"));
        System.out.printf("Is empty: %b%n", testStr.isEmpty());
        
        // String trimming
        System.out.println("\n=== String Trimming ===");
        String spacedText = "   Hello World   ";
        System.out.printf("Original: '%s'%n", spacedText);
        System.out.printf("Trimmed: '%s'%n", spacedText.trim());
        
        // String splitting
        System.out.println("\n=== String Splitting ===");
        String csv = "John,25,New York";
        String[] parts = csv.split(",");
        System.out.printf("Original: %s%n", csv);
        System.out.println("Split result:");
        for (int i = 0; i < parts.length; i++) {
            System.out.printf("  parts[%d]: %s%n", i, parts[i]);
        }
        
        // Practical example: Email validation
        System.out.println("\n=== Email Validation ===");
        String email = "user@example.com";
        boolean isValid = email.contains("@") && 
                         email.indexOf("@") > 0 && 
                         email.lastIndexOf("@") == email.indexOf("@") &&
                         email.indexOf(".") > email.indexOf("@") &&
                         email.endsWith(".com");
        System.out.printf("Email: %s%n", email);
        System.out.printf("Is valid: %b%n", isValid);
        
        // Practical example: Word counter
        System.out.println("\n=== Word Counter ===");
        String paragraph = "Java is a powerful programming language";
        String[] words = paragraph.split(" ");
        System.out.printf("Paragraph: %s%n", paragraph);
        System.out.printf("Word count: %d%n", words.length);
        System.out.printf("Character count: %d%n", paragraph.length());
        System.out.printf("Character count (no spaces): %d%n", 
                         paragraph.replace(" ", "").length());
        
        // StringBuilder for mutable strings
        System.out.println("\n=== StringBuilder ===");
        StringBuilder sb = new StringBuilder("Hello");
        System.out.printf("Initial: %s%n", sb);
        
        sb.append(" World");
        System.out.printf("After append: %s%n", sb);
        
        sb.insert(5, ",");
        System.out.printf("After insert: %s%n", sb);
        
        sb.delete(5, 6);
        System.out.printf("After delete: %s%n", sb);
        
        sb.reverse();
        System.out.printf("After reverse: %s%n", sb);
    }
}
```

---

# Typecasting

## a. Typecasting

Typecasting is the process of converting a value from one data type to another.

### Types of Typecasting

1. **Implicit Casting (Widening)**: Automatic conversion from smaller to larger type
2. **Explicit Casting (Narrowing)**: Manual conversion from larger to smaller type

### Type Hierarchy (Widening Path)

```
byte → short → int → long → float → double
         ↑
       char
```

### Complete Example
```java
// filepath: TypecastingDemo.java
public class TypecastingDemo {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        System.out.println("=== Implicit Casting (Widening) ===");
        
        byte byteVal = 10;
        short shortVal = byteVal;  // byte to short
        int intVal = shortVal;     // short to int
        long longVal = intVal;     // int to long
        float floatVal = longVal;  // long to float
        double doubleVal = floatVal; // float to double
        
        System.out.printf("byte: %d%n", byteVal);
        System.out.printf("short: %d%n", shortVal);
        System.out.printf("int: %d%n", intVal);
        System.out.printf("long: %d%n", longVal);
        System.out.printf("float: %.1f%n", floatVal);
        System.out.printf("double: %.1f%n", doubleVal);
        
        // Char to int
        char letter = 'A';
        int asciiValue = letter;
        System.out.printf("\nchar '%c' to int: %d%n", letter, asciiValue);
        
        // Explicit Casting (Narrowing)
        System.out.println("\n=== Explicit Casting (Narrowing) ===");
        
        double d = 100.75;
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;
        
        System.out.printf("double: %.2f%n", d);
        System.out.printf("float: %.2f%n", f);
        System.out.printf("long: %d%n", l);
        System.out.printf("int: %d%n", i);
        System.out.printf("short: %d%n", s);
        System.out.printf("byte: %d%n", b);
        
        // Data loss in narrowing
        System.out.println("\n=== Data Loss in Narrowing ===");
        int largeInt = 300;
        byte smallByte = (byte) largeInt;  // Overflow
        System.out.printf("int value: %d%n", largeInt);
        System.out.printf("byte value (overflow): %d%n", smallByte);
        
        double precise = 9.99;
        int truncated = (int) precise;
        System.out.printf("double value: %.2f%n", precise);
        System.out.printf("int value (truncated): %d%n", truncated);
        
        // Char casting
        System.out.println("\n=== Character Casting ===");
        char ch = 'Z';
        int charCode = (int) ch;
        System.out.printf("char: %c, ASCII: %d%n", ch, charCode);
        
        int code = 97;
        char character = (char) code;
        System.out.printf("ASCII: %d, char: %c%n", code, character);
        
        // String to numeric
        System.out.println("\n=== String to Numeric Conversion ===");
        String numStr = "123";
        int num = Integer.parseInt(numStr);
        double numDouble = Double.parseDouble("45.67");
        long numLong = Long.parseLong("1000000");
        
        System.out.printf("String '%s' to int: %d%n", numStr, num);
        System.out.printf("String to double: %.2f%n", numDouble);
        System.out.printf("String to long: %d%n", numLong);
        
        // Numeric to String
        System.out.println("\n=== Numeric to String Conversion ===");
        int number = 456;
        String str1 = String.valueOf(number);
        String str2 = Integer.toString(number);
        String str3 = "" + number;
        
        System.out.printf("int %d to String: '%s'%n", number, str1);
        System.out.printf("Using toString(): '%s'%n", str2);
        System.out.printf("Using concatenation: '%s'%n", str3);
        
        // Mixed operations
        System.out.println("\n=== Mixed Type Operations ===");
        int intNum = 5;
        double doubleNum = 2.5;
        double result = intNum + doubleNum;  // int promoted to double
        System.out.printf("%d + %.1f = %.1f%n", intNum, doubleNum, result);
        
        int division1 = 7 / 2;           // Integer division
        double division2 = 7.0 / 2;      // Double division
        double division3 = (double) 7 / 2; // Cast before division
        
        System.out.printf("\n7 / 2 (int): %d%n", division1);
        System.out.printf("7.0 / 2 (double): %.1f%n", division2);
        System.out.printf("(double)7 / 2: %.1f%n", division3);
        
        // Practical examples
        System.out.println("\n=== Practical Examples ===");
        
        // Calculate percentage
        int correct = 45;
        int total = 50;
        double percentage = ((double) correct / total) * 100;
        System.out.printf("Score: %d/%d = %.2f%%%n", correct, total, percentage);
        
        // Round to nearest integer
        double price = 19.99;
        int roundedPrice = (int) Math.round(price);
        System.out.printf("Price: $%.2f, Rounded: $%d%n", price, roundedPrice);
        
        // Extract digits
        int fullNumber = 12345;
        int lastDigit = fullNumber % 10;
        int remaining = fullNumber / 10;
        System.out.printf("Number: %d%n", fullNumber);
        System.out.printf("Last digit: %d%n", lastDigit);
        System.out.printf("Remaining: %d%n", remaining);
        
        // Character arithmetic
        char startChar = 'A';
        char endChar = (char) (startChar + 25);  // 'A' + 25 = 'Z'
        System.out.printf("Start: %c, End: %c%n", startChar, endChar);
    }
}
```

---

# Built-in Libraries

## a. Predefined Character Functions

Java provides the `Character` class with methods to work with individual characters.

### Character Methods

| Method | Description | Example |
|--------|-------------|---------|
| `isLetter(ch)` | Checks if letter | `Character.isLetter('A')` → `true` |
| `isDigit(ch)` | Checks if digit | `Character.isDigit('5')` → `true` |
| `isLetterOrDigit(ch)` | Letter or digit | `Character.isLetterOrDigit('@')` → `false` |
| `isUpperCase(ch)` | Checks if uppercase | `Character.isUpperCase('A')` → `true` |
| `isLowerCase(ch)` | Checks if lowercase | `Character.isLowerCase('a')` → `true` |
| `isWhitespace(ch)` | Checks if whitespace | `Character.isWhitespace(' ')` → `true` |
| `toUpperCase(ch)` | Converts to uppercase | `Character.toUpperCase('a')` → `'A'` |
| `toLowerCase(ch)` | Converts to lowercase | `Character.toLowerCase('A')` → `'a'` |

### Complete Example
```java
// filepath: CharacterFunctionsDemo.java
public class CharacterFunctionsDemo {
    public static void main(String[] args) {
        System.out.println("=== Character Type Checking ===");
        
        char[] testChars = {'A', 'z', '5', '@', ' ', '\n'};
        
        for (char ch : testChars) {
            System.out.printf("\nCharacter: '%c' (ASCII: %d)%n", 
                             ch, (int) ch);
            System.out.printf("  isLetter: %b%n", Character.isLetter(ch));
            System.out.printf("  isDigit: %b%n", Character.isDigit(ch));
            System.out.printf("  isLetterOrDigit: %b%n", Character.isLetterOrDigit(ch));
            System.out.printf("  isUpperCase: %b%n", Character.isUpperCase(ch));
            System.out.printf("  isLowerCase: %b%n", Character.isLowerCase(ch));
            System.out.printf("  isWhitespace: %b%n", Character.isWhitespace(ch));
        }
        
        // Case conversion
        System.out.println("\n=== Case Conversion ===");
        char lower = 'a';
        char upper = 'Z';
        
        System.out.printf("'%c' to uppercase: '%c'%n", 
                         lower, Character.toUpperCase(lower));
        System.out.printf("'%c' to lowercase: '%c'%n", 
                         upper, Character.toLowerCase(upper));
        
        // Practical example: Password validator
        System.out.println("\n=== Password Validator ===");
        String password = "Pass123!";
        boolean hasUpper = false, hasLower = false;
        boolean hasDigit = false, hasSpecial = false;
        
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) hasUpper = true;
            if (Character.isLowerCase(ch)) hasLower = true;
            if (Character.isDigit(ch)) hasDigit = true;
            if (!Character.isLetterOrDigit(ch)) hasSpecial = true;
        }
        
        System.out.printf("Password: %s%n", password);
        System.out.printf("Has uppercase: %b%n", hasUpper);
        System.out.printf("Has lowercase: %b%n", hasLower);
        System.out.printf("Has digit: %b%n", hasDigit);
        System.out.printf("Has special char: %b%n", hasSpecial);
        System.out.printf("Is strong: %b%n", 
                         hasUpper && hasLower && hasDigit && hasSpecial);
        
        // Practical example: Character statistics
        System.out.println("\n=== Character Statistics ===");
        String text = "Hello World 123!";
        int letters = 0, digits = 0, spaces = 0, others = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) letters++;
            else if (Character.isDigit(ch)) digits++;
            else if (Character.isWhitespace(ch)) spaces++;
            else others++;
        }
        
        System.out.printf("Text: %s%n", text);
        System.out.printf("Letters: %d%n", letters);
        System.out.printf("Digits: %d%n", digits);
        System.out.printf("Spaces: %d%n", spaces);
        System.out.printf("Others: %d%n", others);
    }
}
```

---

## b. Predefined String Functions

Already covered in the Strings section above. Refer to "String Handling" for complete details.

---

## c. Predefined Math Functions

Java's `Math` class provides mathematical operations and constants.

### Common Math Methods

| Method | Description | Example |
|--------|-------------|---------|
| `abs(x)` | Absolute value | `Math.abs(-5)` → `5` |
| `pow(x, y)` | x raised to y | `Math.pow(2, 3)` → `8.0` |
| `sqrt(x)` | Square root | `Math.sqrt(16)` → `4.0` |
| `ceil(x)` | Round up | `Math.ceil(4.3)` → `5.0` |
| `floor(x)` | Round down | `Math.floor(4.7)` → `4.0` |
| `round(x)` | Round to nearest | `Math.round(4.5)` → `5` |
| `max(x, y)` | Maximum value | `Math.max(5, 10)` → `10` |
| `min(x, y)` | Minimum value | `Math.min(5, 10)` → `5` |
| `random()` | Random [0, 1) | `Math.random()` → `0.xxxxx` |

### Complete Example
```java
// filepath: MathFunctionsDemo.java
public class MathFunctionsDemo {
    public static void main(String[] args) {
        // Math constants
        System.out.println("=== Math Constants ===");
        System.out.printf("PI: %.15f%n", Math.PI);
        System.out.printf("E: %.15f%n", Math.E);
        
        // Absolute value
        System.out.println("\n=== Absolute Value ===");
        System.out.printf("abs(-5): %d%n", Math.abs(-5));
        System.out.printf("abs(-3.14): %.2f%n", Math.abs(-3.14));
        System.out.printf("abs(10): %d%n", Math.abs(10));
        
        // Power and roots
        System.out.println("\n=== Power and Roots ===");
        System.out.printf("pow(2, 3): %.0f%n", Math.pow(2, 3));
        System.out.printf("pow(5, 2): %.0f%n", Math.pow(5, 2));
        System.out.printf("sqrt(16): %.0f%n", Math.sqrt(16));
        System.out.printf("sqrt(2): %.5f%n", Math.sqrt(2));
        System.out.printf("cbrt(27): %.0f%n", Math.cbrt(27));  // Cube root
        
        // Rounding
        System.out.println("\n=== Rounding Functions ===");
        double value = 4.7;
        System.out.printf("Value: %.1f%n", value);
        System.out.printf("ceil(%.1f): %.0f%n", value, Math.ceil(value));
        System.out.printf("floor(%.1f): %.0f%n", value, Math.floor(value));
        System.out.printf("round(%.1f): %d%n", value, Math.round(value));
        
        value = 4.3;
        System.out.printf("\nValue: %.1f%n", value);
        System.out.printf("ceil(%.1f): %.0f%n", value, Math.ceil(value));
        System.out.printf("floor(%.1f): %.0f%n", value, Math.floor(value));
        System.out.printf("round(%.1f): %d%n", value, Math.round(value));
        
        // Min and Max
        System.out.println("\n=== Min and Max ===");
        System.out.printf("max(5, 10): %d%n", Math.max(5, 10));
        System.out.printf("min(5, 10): %d%n", Math.min(5, 10));
        System.out.printf("max(-5, -10): %d%n", Math.max(-5, -10));
        
        // Finding max/min of three numbers
        int a = 15, b = 20, c = 10;
        int maximum = Math.max(a, Math.max(b, c));
        int minimum = Math.min(a, Math.min(b, c));
        System.out.printf("Numbers: %d, %d, %d%n", a, b, c);
        System.out.printf("Maximum: %d%n", maximum);
        System.out.printf("Minimum: %d%n", minimum);
        
        // Trigonometric functions
        System.out.println("\n=== Trigonometric Functions ===");
        double angle = 45;  // degrees
        double radians = Math.toRadians(angle);
        System.out.printf("Angle: %.0f degrees = %.5f radians%n", angle, radians);
        System.out.printf("sin(%.0f°): %.5f%n", angle, Math.sin(radians));
        System.out.printf("cos(%.0f°): %.5f%n", angle, Math.cos(radians));
        System.out.printf("tan(%.0f°): %.5f%n", angle, Math.tan(radians));
        
        // Logarithmic functions
        System.out.println("\n=== Logarithmic Functions ===");
        System.out.printf("log(10): %.5f%n", Math.log(10));      // Natural log
        System.out.printf("log10(100): %.0f%n", Math.log10(100)); // Base 10 log
        System.out.printf("exp(1): %.5f%n", Math.exp(1));        // e^1
        
        // Random numbers
        System.out.println("\n=== Random Numbers ===");
        System.out.println("Random double [0, 1): " + Math.random());
        
        // Random integer in range [min, max]
        int min = 1, max = 100;
        int randomInt = (int)(Math.random() * (max - min + 1)) + min;
        System.out.printf("Random int [%d, %d]: %d%n", min, max, randomInt);
        
        // Generate 5 random numbers
        System.out.print("5 random numbers [1, 10]: ");
        for (int i = 0; i < 5; i++) {
            int rand = (int)(Math.random() * 10) + 1;
            System.out.print(rand + " ");
        }
        System.out.println();
        
        // Practical examples
        System.out.println("\n=== Practical Examples ===");
        
        // Calculate distance between two points
        double x1 = 0, y1 = 0, x2 = 3, y2 = 4;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Distance between (%.0f,%.0f) and (%.0f,%.0f): %.2f%n", 
                         x1, y1, x2, y2, distance);
        
        // Calculate area of circle
        double radius = 5.0;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Circle area (r=%.1f): %.2f%n", radius, area);
        
        // Calculate compound interest
        double principal = 1000;
        double rate = 0.05;  // 5%
        int years = 10;
        double amount = principal * Math.pow(1 + rate, years);
        System.out.printf("Compound interest: $%.2f%n", amount);
        
        // Hypotenuse of right triangle
        double side1 = 3, side2 = 4;
        double hypotenuse = Math.hypot(side1, side2);
        System.out.printf("Hypotenuse of triangle (%.0f, %.0f): %.2f%n", 
                         side1, side2, hypotenuse);
    }
}
```

---

# Selection Structures

## a. Relational Operators

Relational operators compare two values and return a boolean result.

### Relational Operators Table

| Operator | Description | Example | Result |
|----------|-------------|---------|--------|
| `==` | Equal to | `5 == 5` | `true` |
| `!=` | Not equal to | `5 != 3` | `true` |
| `>` | Greater than | `5 > 3` | `true` |
| `<` | Less than | `5 < 3` | `false` |
| `>=` | Greater than or equal | `5 >= 5` | `true` |
| `<=` | Less than or equal | `3 <= 5` | `true` |

### Complete Example
```java
// filepath: RelationalOperatorsDemo.java
public class RelationalOperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 10;
        
        System.out.println("=== Relational Operators ===");
        System.out.printf("a = %d, b = %d, c = %d%n%n", a, b, c);
        
        // Equal to
        System.out.printf("a == b: %b%n", a == b);
        System.out.printf("a == c: %b%n", a == c);
        
        // Not equal to
        System.out.printf("a != b: %b%n", a != b);
        System.out.printf("a != c: %b%n", a != c);
        
        // Greater than
        System.out.printf("a > b: %b%n", a > b);
        System.out.printf("b > a: %b%n", b > a);
        
        // Less than
        System.out.printf("a < b: %b%n", a < b);
        System.out.printf("b < a: %b%n", b < a);
        
        // Greater than or equal
        System.out.printf("a >= c: %b%n", a >= c);
        System.out.printf("a >= b: %b%n", a >= b);
        
        // Less than or equal
        System.out.printf("a <= c: %b%n", a <= c);
        System.out.printf("a <= b: %b%n", a <= b);
        
        // Practical examples
        System.out.println("\n=== Practical Examples ===");
        
        int age = 18;
        System.out.printf("Age: %d%n", age);
        System.out.printf("Is adult (age >= 18): %b%n", age >= 18);
        System.out.printf("Is teenager (age >= 13 && age <= 19): %b%n", 
                         age >= 13 && age <= 19);
        
        double temperature = 25.5;
        System.out.printf("\nTemperature: %.1f°C%n", temperature);
        System.out.printf("Is freezing (temp <= 0): %b%n", temperature <= 0);
        System.out.printf("Is comfortable (temp >= 20 && temp <=  25): %b%n", 
                         temperature >= 20 && temperature <= 25);
        
        int score = 85;
        System.out.printf("\nScore: %d%n", score);
        System.out.printf("Passing (score >= 60): %b%n", score >= 60);
        System.out.printf("Excellent (score >= 90): %b%n", score >= 90);
    }
}
```

---

## b. Boolean Operators

Boolean operators combine or modify boolean values.

### Boolean Operators Table

| Operator | Description | Example | Result |
|----------|-------------|---------|--------|
| `&&` | Logical AND | `true && false` | `false` |
| `\|\|` | Logical OR | `true \|\| false` | `true` |
| `!` | Logical NOT | `!true` | `false` |

### Truth Tables

**AND (`&&`)**
| A | B | A && B |
|---|---|--------|
| T | T | T |
| T | F | F |
| F | T | F |
| F | F | F |

**OR (`||`)**
| A | B | A \|\| B |
|---|---|----------|
| T | T | T |
| T | F | T |
| F | T | T |
| F | F | F |

**NOT (`!`)**
| A | !A |
|---|-----|
| T | F |
| F | T |

### Complete Example
```java
// filepath: BooleanOperatorsDemo.java
public class BooleanOperatorsDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        
        System.out.println("=== Boolean Operators ===");
        System.out.printf("a = %b, b = %b%n%n", a, b);
        
        // AND operator
        System.out.println("AND Operator (&&):");
        System.out.printf("true && true = %b%n", true && true);
        System.out.printf("true && false = %b%n", true && false);
        System.out.printf("false && true = %b%n", false && true);
        System.out.printf("false && false = %b%n", false && false);
        
        // OR operator
        System.out.println("\nOR Operator (||):");
        System.out.printf("true || true = %b%n", true || true);
        System.out.printf("true || false = %b%n", true || false);
        System.out.printf("false || true = %b%n", false || true);
        System.out.printf("false || false = %b%n", false || false);
        
        // NOT operator
        System.out.println("\nNOT Operator (!):");
        System.out.printf("!true = %b%n", !true);
        System.out.printf("!false = %b%n", !false);
        
        // Combined operators
        System.out.println("\n=== Combined Operators ===");
        System.out.printf("(true && false) || true = %b%n", (true && false) || true);
        System.out.printf("!(true && false) = %b%n", !(true && false));
        System.out.printf("true && (false || true) = %b%n", true && (false || true));
        
        // Practical examples
        System.out.println("\n=== Practical Examples ===");
        
        // Age verification
        int age = 25;
        boolean hasID = true;
        boolean canEnter = age >= 18 && hasID;
        System.out.printf("Age: %d, Has ID: %b%n", age, hasID);
        System.out.printf("Can enter club: %b%n", canEnter);
        
        // Grade eligibility
        int grade = 85;
        int attendance = 95;
        boolean isEligible = grade >= 75 && attendance >= 80;
        System.out.printf("\nGrade: %d, Attendance: %d%%%n", grade, attendance);
        System.out.printf("Eligible for honor roll: %b%n", isEligible);
        
        // Login validation
        String username = "admin";
        String password = "pass123";
        boolean isValidUser = username.equals("admin") && password.equals("pass123");
        System.out.printf("\nUsername: %s, Password: %s%n", username, password);
        System.out.printf("Login successful: %b%n", isValidUser);
        
        // Weekend check
        String day = "Saturday";
        boolean isWeekend = day.equals("Saturday") || day.equals("Sunday");
        System.out.printf("\nDay: %s%n", day);
        System.out.printf("Is weekend: %b%n", isWeekend);
        
        // Short-circuit evaluation
        System.out.println("\n=== Short-Circuit Evaluation ===");
        int x = 5;
        boolean result1 = (x > 10) && (++x > 0);  // ++x not executed
        System.out.printf("After (x > 10) && (++x > 0): x = %d%n", x);
        
        x = 5;
        boolean result2 = (x < 10) || (++x > 0);  // ++x not executed
        System.out.printf("After (x < 10) || (++x > 0): x = %d%n", x);
    }
}
```

---

## c. If Statement

The `if` statement executes a block of code if a condition is true.

### Syntax
```java
if (condition) {
    // code to execute if condition is true
}
```

### Complete Example
```java
// filepath: IfStatementDemo.java
import java.util.Scanner;

public class IfStatementDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Simple if statement
        System.out.println("=== Simple If Statement ===");
        int number = 10;
        System.out.printf("Number: %d%n", number);
        
        if (number > 0) {
            System.out.println("The number is positive");
        }
        
        if (number % 2 == 0) {
            System.out.println("The number is even");
        }
        
        // Multiple if statements
        System.out.println("\n=== Age Verification ===");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        if (age >= 18) {
            System.out.println("You are an adult");
        }
        
        if (age >= 21) {
            System.out.println("You can drink alcohol (US)");
        }
        
        if (age >= 65) {
            System.out.println("You qualify for senior discount");
        }
        
        // Password validation
        System.out.println("\n=== Password Strength ===");
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if (password.length() >= 8) {
            System.out.println("✓ Password length is adequate");
        }
        
        if (password.matches(".*[A-Z].*")) {
            System.out.println("✓ Contains uppercase letter");
        }
        
        if (password.matches(".*[0-9].*")) {
            System.out.println("✓ Contains digit");
        }
        
        if (password.matches(".*[!@#$%^&*].*")) {
            System.out.println("✓ Contains special character");
        }
        
        // Temperature warning
        System.out.println("\n=== Temperature Check ===");
        System.out.print("Enter temperature in Celsius: ");
        double temp = scanner.nextDouble();
        
        if (temp > 35) {
            System.out.println("⚠ High temperature warning!");
        }
        
        if (temp < 0) {
            System.out.println("⚠ Freezing temperature!");
        }
        
        scanner.close();
    }
}
```

---

## d. If...Else Statement

The `if...else` statement executes one block if the condition is true, and another if false.

### Syntax
```java
if (condition) {
    // code if condition is true
} else {
    // code if condition is false
}
```

### Complete Example
```java
// filepath: IfElseStatementDemo.java
import java.util.Scanner;

public class IfElseStatementDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Simple if-else
        System.out.println("=== Even or Odd ===");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number % 2 == 0) {
            System.out.printf("%d is even%n", number);
        } else {
            System.out.printf("%d is odd%n", number);
        }
        
        // Positive or negative
        System.out.println("\n=== Positive or Negative ===");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (num >= 0) {
            System.out.printf("%d is positive%n", num);
        } else {
            System.out.printf("%d is negative%n", num);
        }
        
        // Pass or fail
        System.out.println("\n=== Exam Result ===");
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        
        if (score >= 60) {
            System.out.println("Result: PASSED ✓");
            System.out.println("Congratulations!");
        } else {
            System.out.println("Result: FAILED ✗");
            System.out.println("Better luck next time!");
        }
        
        // Age category
        System.out.println("\n=== Age Category ===");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        if (age < 18) {
            System.out.println("Category: Minor");
            System.out.println("Parental supervision required");
        } else {
            System.out.println("Category: Adult");
            System.out.println("Full access granted");
        }
        
        // Maximum of two numbers
        System.out.println("\n=== Maximum of Two Numbers ===");
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        if (a > b) {
            System.out.printf("Maximum: %d%n", a);
        } else {
            System.out.printf("Maximum: %d%n", b);
        }
        
        // Leap year check
        System.out.println("\n=== Leap Year Check ===");
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.printf("%d is a leap year%n", year);
        } else {
            System.out.printf("%d is not a leap year%n", year);
        }
        
        scanner.close();
    }
}
```

---

## e. If...Else If...Else Statement

The `if...else if...else` statement checks multiple conditions sequentially.

### Syntax
```java
if (condition1) {
    // code if condition1 is true
} else if (condition2) {
    // code if condition2 is true
} else if (condition3) {
    // code if condition3 is true
} else {
    // code if all conditions are false
}
```

### Complete Example
```java
// filepath: IfElseIfStatementDemo.java
import java.util.Scanner;

public class IfElseIfStatementDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Grade classification
        System.out.println("=== Grade Classification ===");
        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();
        
        if (score >= 90) {
            System.out.println("Grade: A (Excellent)");
        } else if (score >= 80) {
            System.out.println("Grade: B (Good)");
        } else if (score >= 70) {
            System.out.println("Grade: C (Average)");
        } else if (score >= 60) {
            System.out.println("Grade: D (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }
        
        // Age category
        System.out.println("\n=== Age Category ===");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age <= 12) {
            System.out.println("Category: Child");
            System.out.println("Ticket price: $5");
        } else if (age <= 17) {
            System.out.println("Category: Teenager");
            System.out.println("Ticket price: $8");
        } else if (age <= 59) {
            System.out.println("Category: Adult");
            System.out.println("Ticket price: $12");
        } else {
            System.out.println("Category: Senior");
            System.out.println("Ticket price: $7");
        }
        
        // BMI calculator
        System.out.println("\n=== BMI Calculator ===");
        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height (m): ");
        double height = scanner.nextDouble();
        
        double bmi = weight / (height * height);
        System.out.printf("Your BMI: %.2f%n", bmi);
        
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal weight");
        } else if (bmi < 30) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }
        
        // Temperature description
        System.out.println("\n=== Temperature Description ===");
        System.out.print("Enter temperature (°C): ");
        double temp = scanner.nextDouble();
        
        if (temp < 0) {
            System.out.println("Freezing");
        } else if (temp < 10) {
            System.out.println("Very Cold");
        } else if (temp < 20) {
            System.out.println("Cold");
        } else if (temp < 30) {
            System.out.println("Comfortable");
        } else if (temp < 40) {
            System.out.println("Hot");
        } else {
            System.out.println("Very Hot");
        }
        
        // Maximum of three numbers
        System.out.println("\n=== Maximum of Three Numbers ===");
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();
        
        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.printf("Maximum: %d%n", max);
        
        scanner.close();
    }
}
```

---

## f. Switch Statement

The `switch` statement selects one of many code blocks to execute based on a variable's value.

### Syntax
```java
switch (expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code if no case matches
}
```

### Complete Example
```java
// filepath: SwitchStatementDemo.java
import java.util.Scanner;

public class SwitchStatementDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Day of week
        System.out.println("=== Day of Week ===");
        System.out.print("Enter day number (1-7): ");
        int day = scanner.nextInt();
        
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }
        
        // Month days
        System.out.println("\n=== Days in Month ===");
        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();
        
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 or 29 days");
                break;
            default:
                System.out.println("Invalid month");
        }
        
        // Grade description
        System.out.println("\n=== Grade Description ===");
        System.out.print("Enter grade (A/B/C/D/F): ");
        char grade = scanner.next().toUpperCase().charAt(0);
        
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                System.out.println("Score: 90-100");
                break;
            case 'B':
                System.out.println("Good job!");
                System.out.println("Score: 80-89");
                break;
            case 'C':
                System.out.println("Average");
                System.out.println("Score: 70-79");
                break;
            case 'D':
                System.out.println("Passed");
                System.out.println("Score: 60-69");
                break;
            case 'F':
                System.out.println("Failed");
                System.out.println("Score: 0-59");
                break;
            default:
                System.out.println("Invalid grade");
        }
        
        // Simple calculator
        System.out.println("\n=== Simple Calculator ===");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, result);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
        
        // Menu selection
        System.out.println("\n=== Restaurant Menu ===");
        System.out.println("1. Burger - $5.99");
        System.out.println("2. Pizza - $8.99");
        System.out.println("3. Salad - $4.99");
        System.out.println("4. Pasta - $7.99");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("You ordered: Burger");
                System.out.println("Price: $5.99");
                break;
            case 2:
                System.out.println("You ordered: Pizza");
                System.out.println("Price: $8.99");
                break;
            case 3:
                System.out.println("You ordered: Salad");
                System.out.println("Price: $4.99");
                break;
            case 4:
                System.out.println("You ordered: Pasta");
                System.out.println("Price: $7.99");
                break;
            default:
                System.out.println("Invalid choice");
        }
        
        scanner.close();
    }
}
```

---

## g. Nested Decision

Nested decision structures are decision statements inside other decision statements.

### Complete Example
```java
// filepath: NestedDecisionDemo.java
import java.util.Scanner;

public class NestedDecisionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nested if for grade with attendance
        System.out.println("=== Grade with Attendance Check ===");
        System.out.print("Enter score (0-100): ");
        int score = scanner.nextInt();
        System.out.print("Enter attendance percentage: ");
        int attendance = scanner.nextInt();
        
        if (score >= 60) {
            System.out.println("Score: PASSED");
            if (attendance >= 75) {
                System.out.println("Attendance: Sufficient");
                System.out.println("Final Result: PASSED ✓");
            } else {
                System.out.println("Attendance: Insufficient");
                System.out.println("Final Result: FAILED (Low Attendance) ✗");
            }
        } else {
            System.out.println("Score: FAILED");
            System.out.println("Final Result: FAILED ✗");
        }
        
        // Login system
        System.out.println("\n=== Login System ===");
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if (username.equals("admin")) {
            if (password.equals("admin123")) {
                System.out.println("Login successful!");
                System.out.println("Welcome, Admin!");
            } else {
                System.out.println("Incorrect password");
            }
        } else if (username.equals("user")) {
            if (password.equals("user123")) {
                System.out.println("Login successful!");
                System.out.println("Welcome, User!");
            } else {
                System.out.println("Incorrect password");
            }
        } else {
            System.out.println("Username not found");
        }
        
        // Ticket pricing
        System.out.println("\n=== Cinema Ticket Pricing ===");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Is it a weekend? (yes/no): ");
        String isWeekend = scanner.next();
        
        double price;
        if (age < 12) {
            if (isWeekend.equalsIgnoreCase("yes")) {
                price = 8.00;
            } else {
                price = 5.00;
            }
            System.out.println("Category: Child");
        } else if (age >= 60) {
            if (isWeekend.equalsIgnoreCase("yes")) {
                price = 10.00;
            } else {
                price = 7.00;
            }
            System.out.println("Category: Senior");
        } else {
            if (isWeekend.equalsIgnoreCase("yes")) {
                price = 15.00;
            } else {
                price = 12.00;
            }
            System.out.println("Category: Adult");
        }
        System.out.printf("Ticket price: $%.2f%n", price);
        
        // Triangle classifier
        System.out.println("\n=== Triangle Classifier ===");
        System.out.print("Enter side 1: ");
        int side1 = scanner.nextInt();
        System.out.print("Enter side 2: ");
        int side2 = scanner.nextInt();
        System.out.print("Enter side 3: ");
        int side3 = scanner.nextInt();
        
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            System.out.println("Valid triangle");
            
            if (side1 == side2 && side2 == side3) {
                System.out.println("Type: Equilateral");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("Type: Isosceles");
            } else {
                System.out.println("Type: Scalene");
            }
            
            // Check if right triangle
            int a = Math.max(side1, Math.max(side2, side3));
            int b, c;
            if (a == side1) {
                b = side2; c = side3;
            } else if (a == side2) {
                b = side1; c = side3;
            } else {
                b = side1; c = side2;
            }
            
            if (a * a == b * b + c * c) {
                System.out.println("Also a right triangle");
            }
        } else {
            System.out.println("Invalid triangle");
        }
        
        // Scholarship eligibility
        System.out.println("\n=== Scholarship Eligibility ===");
        System.out.print("Enter GPA (0.0-4.0): ");
        double gpa = scanner.nextDouble();
        System.out.print("Enter family income: $");
        double income = scanner.nextDouble();
        System.out.print("Has community service? (yes/no): ");
        String hasService = scanner.next();
        
        if (gpa >= 3.5) {
            System.out.println("GPA: Excellent");
            if (income < 50000) {
                if (hasService.equalsIgnoreCase("yes")) {
                    System.out.println("Scholarship: Full (100%)");
                } else {
                    System.out.println("Scholarship: High (75%)");
                }
            } else {
                if (hasService.equalsIgnoreCase("yes")) {
                    System.out.println("Scholarship: Partial (50%)");
                } else {
                    System.out.println("Scholarship: Basic (25%)");
                }
            }
        } else if (gpa >= 3.0) {
            System.out.println("GPA: Good");
            if (income < 50000 && hasService.equalsIgnoreCase("yes")) {
                System.out.println("Scholarship: Partial (50%)");
            } else {
                System.out.println("Scholarship: Basic (25%)");
            }
        } else {
            System.out.println("GPA: Below requirement");
            System.out.println("Scholarship: Not eligible");
        }
        
        scanner.close();
    }
}
```

---

# Iterative Structures

## a. While Loop

The `while` loop repeats a block of code as long as a condition is true.

### Syntax
```java
while (condition) {
    // code to repeat
}
```

### Complete Example
```java
// filepath: WhileLoopDemo.java
import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Simple counter
        System.out.println("=== Count from 1 to 10 ===");
        int count = 1;
        while (count <= 10) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        
        // Count backwards
        System.out.println("\n=== Countdown from 10 ===");
        int countdown = 10;
        while (countdown >= 1) {
            System.out.print(countdown + " ");
            countdown--;
        }
        System.out.println("Blast off!");
        
        // Sum of numbers
        System.out.println("\n=== Sum of First N Numbers ===");
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.printf("Sum of first %d numbers: %d%n", n, sum);
        
        // Factorial
        System.out.println("\n=== Factorial Calculator ===");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        long factorial = 1;
        int temp = num;
        while (temp > 0) {
            factorial *= temp;
            temp--;
        }
        System.out.printf("%d! = %d%n", num, factorial);
        
        // Digit sum
        System.out.println("\n=== Sum of Digits ===");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int digitSum = 0;
        int original = number;
        while (number > 0) {
            digitSum += number % 10;
            number /= 10;
        }
        System.out.printf("Sum of digits in %d: %d%n", original, digitSum);
        
        // Reverse number
        System.out.println("\n=== Reverse Number ===");
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        int reversed = 0;
        original = number;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        System.out.printf("Original: %d, Reversed: %d%n", original, reversed);
        
        // Password attempts
        System.out.println("\n=== Password System ===");
        String correctPassword = "secret123";
        int attempts = 3;
        scanner.nextLine(); // Clear buffer
        
        while (attempts > 0) {
            System.out.printf("Enter password (%d attempts left): ", attempts);
            String password = scanner.nextLine();
            
            if (password.equals(correctPassword)) {
                System.out.println("Access granted!");
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Incorrect password. Try again.");
                } else {
                    System.out.println("Account locked!");
                }
            }
        }
        
        // Menu system
        System.out.println("\n=== Simple Menu System ===");
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Display Message");
            System.out.println("2. Calculate Square");
            System.out.println("3. Show Date");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Hello, World!");
                    break;
                case 2:
                    System.out.print("Enter number: ");
                    int val = scanner.nextInt();
                    System.out.printf("Square: %d%n", val * val);
                    break;
                case 3:
                    System.out.println("Today is a great day!");
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        
        scanner.close();
    }
}
```

---

## b. For Loop

The `for` loop repeats a block of code a specific number of times.

### Syntax
```java
for (initialization; condition; update) {
    // code to repeat
}
```

### Complete Example
```java
// filepath: ForLoopDemo.java
import java.util.Scanner;

public class ForLoopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Basic counting
        System.out.println("=== Count 1 to 10 ===");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Count backwards
        System.out.println("\n=== Count 10 to 1 ===");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Even numbers
        System.out.println("\n=== Even Numbers 2 to 20 ===");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Multiplication table
        System.out.println("\n=== Multiplication Table ===");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", num, i, num * i);
        }
        
        // Sum and average
        System.out.println("\n=== Sum and Average ===");
        System.out.print("How many numbers? ");
        int count = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            System.out.printf("Enter number %d: ", i);
            sum += scanner.nextInt();
        }
        double average = (double) sum / count;
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %.2f%n", average);
        
        // Factorial
        System.out.println("\n=== Factorial ===");
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.printf("%d! = %d%n", n, factorial);
        
        // Fibonacci sequence
        System.out.println("\n=== Fibonacci Sequence ===");
        System.out.print("How many terms? ");
        int terms = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
        
        // Pattern printing - Right triangle
        System.out.println("\n=== Right Triangle Pattern ===");
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Pattern printing - Pyramid
        System.out.println("\n=== Pyramid Pattern ===");
        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Prime number check
        System.out.println("\n=== Prime Number Check ===");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.printf("%d is %s%n", number, isPrime ? "prime" : "not prime");
        
        scanner.close();
    }
}
```

---

## c. Nested Loop

Nested loops are loops inside other loops.

### Complete Example
```java
// filepath: NestedLoopDemo.java
import java.util.Scanner;

public class NestedLoopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Multiplication table (full)
        System.out.println("=== Full Multiplication Table (1-10) ===");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
        
        // Rectangle pattern
        System.out.println("\n=== Rectangle Pattern ===");
        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter columns: ");
        int cols = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Number pyramid
        System.out.println("\n=== Number Pyramid ===");
        System.out.print("Enter height: ");
        int height = scanner.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        // Diamond pattern
        System.out.println("\n=== Diamond Pattern ===");
        System.out.print("Enter size: ");
        int size = scanner.nextInt();
        
        // Upper half
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower half
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Prime numbers in range
        System.out.println("\n=== Prime Numbers in Range ===");
        System.out.print("Enter start: ");
        int start = scanner.nextInt();
        System.out.print("Enter end: ");
        int end = scanner.nextInt();
        
        System.out.print("Prime numbers: ");
        for (int num = start; num <= end; num++) {
            if (num <= 1) continue;
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        
        // Matrix input and display
        System.out.println("\n=== Matrix Operations ===");
        System.out.print("Enter rows: ");
        int r = scanner.nextInt();
        System.out.print("Enter columns: ");
        int c = scanner.nextInt();
        
        int[][] matrix = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nMatrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
```

---

## d. Break Statement

The `break` statement terminates the loop immediately.

### Complete Example
```java
// filepath: BreakStatementDemo.java
import java.util.Scanner;

public class BreakStatementDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Break at specific number
        System.out.println("=== Break at 5 ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at " + i);
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Find first even number
        System.out.println("\n=== Find First Even ===");
        System.out.print("Enter numbers (0 to stop): ");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break;
            
            if (num % 2 == 0) {
                System.out.printf("First even number found: %d%n", num);
                break;
            }
            System.out.println("Odd number, continue...");
        }
        
        // Search in array
        System.out.println("\n=== Search in Array ===");
        int[] numbers = {5, 12, 8, 3, 19, 7, 15};
        System.out.print("Array: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();
        
        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();
        boolean found = false;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.printf("Found %d at index %d%n", target, i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found");
        }
        
        // Quiz game
        System.out.println("\n=== Quiz Game ===");
        scanner.nextLine(); // Clear buffer
        String[] questions = {
            "What is 2 + 2? ",
            "What is 5 * 3? ",
            "What is 10 - 7? "
        };
        int[] answers = {4, 15, 3};
        int score = 0;
        
        for (int i = 0; i < questions.length; i++) {
            System.out.print(questions[i]);
            int answer = scanner.nextInt();
            
            if (answer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Game Over.");
                break;
            }
        }
        System.out.printf("Final Score: %d/%d%n", score, questions.length);
        
        scanner.close();
    }
}
```

---

## e. Continue Statement

The `continue` statement skips the current iteration and continues with the next.

### Complete Example
```java
// filepath: ContinueStatementDemo.java
import java.util.Scanner;

public class ContinueStatementDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Skip specific number
        System.out.println("=== Skip number 5 ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;  // Skip 5
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Print only odd numbers
        System.out.println("\n=== Odd Numbers Only ===");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;  // Skip even numbers
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Skip multiples of 3
        System.out.println("\n=== Skip Multiples of 3 ===");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Process valid inputs only
        System.out.println("\n=== Process Positive Numbers Only ===");
        System.out.println("Enter 5 numbers:");
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("Number %d: ", i + 1);
            int num = scanner.nextInt();
            
            if (num < 0) {
                System.out.println("Negative number skipped");
                continue;
            }
            
            sum += num;
            count++;
        }
        
        if (count > 0) {
            System.out.printf("Sum of positive numbers: %d%n", sum);
            System.out.printf("Average: %.2f%n", (double) sum / count);
        }
        
        // Skip vowels
        System.out.println("\n=== Remove Vowels ===");
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        System.out.print("Without vowels: ");
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            }
            System.out.print(text.charAt(i));
        }
        System.out.println();
        
        // Grade processing
        System.out.println("\n=== Grade Processing ===");
        System.out.print("How many students? ");
        int students = scanner.nextInt();
        int passCount = 0;
        
        for (int i = 1; i <= students; i++) {
            System.out.printf("Enter grade for student %d: ", i);
            int grade = scanner.nextInt();
            
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade, skipped");
                continue;
            }
            
            if (grade >= 60) {
                passCount++;
            }
        }
        
        System.out.printf("Students passed: %d%n", passCount);
        System.out.printf("Students failed: %d%n", students - passCount);
        
        scanner.close();
    }
}
```

---

# Arrays

## a. One Dimensional Arrays

Arrays are fixed-size containers that hold multiple values of the same type.

### Syntax
```java
// Declaration
dataType[] arrayName = new dataType[size];

// or
dataType[] arrayName = {value1, value2, value3};
```

### Complete Example
```java
// filepath: OneDimensionalArrayDemo.java
import java.util.Scanner;

public class OneDimensionalArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array declaration and initialization
        System.out.println("=== Array Basics ===");
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Array input
        System.out.println("\n=== Array Input ===");
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.printf("Element %d: ", i + 1);
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("You entered: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Sum and average
        System.out.println("\n=== Sum and Average ===");
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %.2f%n", average);
        
        // Find maximum and minimum
        System.out.println("\n=== Maximum and Minimum ===");
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.printf("Maximum: %d%n", max);
        System.out.printf("Minimum: %d%n", min);
        
        // Search element
        System.out.println("\n=== Search Element ===");
        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.printf("Found %d at index %d%n", target, index);
        } else {
            System.out.println("Number not found");
        }
        
        // Count occurrences
        System.out.println("\n=== Count Occurrences ===");
        System.out.print("Enter number to count: ");
        int searchNum = scanner.nextInt();
        int count = 0;
        for (int num : arr) {
            if (num == searchNum) count++;
        }
        System.out.printf("%d appears %d time(s)%n", searchNum, count);
        
        // Reverse array
        System.out.println("\n=== Reverse Array ===");
        System.out.print("Original: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
        
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        
        System.out.print("Reversed: ");
        for (int num : reversed) System.out.print(num + " ");
        System.out.println();
        
        // Copy array
        System.out.println("\n=== Copy Array ===");
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        System.out.println("Array copied successfully");
        
        // Sort array (Bubble Sort)
        System.out.println("\n=== Sort Array ===");
        int[] toSort = arr.clone();
        for (int i = 0; i < toSort.length - 1; i++) {
            for (int j = 0; j < toSort.length - i - 1; j++) {
                if (toSort[j] > toSort[j + 1]) {
                    int temp = toSort[j];
                    toSort[j] = toSort[j + 1];
                    toSort[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int num : toSort) System.out.print(num + " ");
        System.out.println();
        
        scanner.close();
    }
}
```

---

## b. Two Dimensional Arrays

Two-dimensional arrays are arrays of arrays, creating a matrix structure.

### Syntax
```java
// Declaration
dataType[][] arrayName = new dataType[rows][columns];

// or
dataType[][] arrayName = {{row1}, {row2}, {row3}};
```

### Complete Example
```java
// filepath: TwoDimensionalArrayDemo.java
import java.util.Scanner;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 2D array initialization
        System.out.println("=== 2D Array Basics ===");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        
        // Matrix input
        System.out.println("\n=== Matrix Input ===");
        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter columns: ");
        int cols = scanner.nextInt();
        
        int[][] mat = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                mat[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nYour matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", mat[i][j]);
            }
            System.out.println();
        }
        
        // Sum of all elements
        System.out.println("\n=== Sum of All Elements ===");
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += mat[i][j];
            }
        }
        System.out.printf("Total sum: %d%n", sum);
        
        // Row and column sums
        System.out.println("\n=== Row and Column Sums ===");
        System.out.println("Row sums:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += mat[i][j];
            }
            System.out.printf("Row %d: %d%n", i, rowSum);
        }
        
        System.out.println("\nColumn sums:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += mat[i][j];
            }
            System.out.printf("Column %d: %d%n", j, colSum);
        }
        
        // Transpose matrix
        System.out.println("\n=== Transpose Matrix ===");
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = mat[i][j];
            }
        }
        
        System.out.println("Transposed matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.printf("%4d", transpose[i][j]);
            }
            System.out.println();
        }
        
        // Matrix addition
        System.out.println("\n=== Matrix Addition ===");
        if (rows == cols) {
            int[][] mat2 = new int[rows][cols];
            System.out.println("Enter second matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.printf("[%d][%d]: ", i, j);
                    mat2[i][j] = scanner.nextInt();
                }
            }
            
            int[][] result = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = mat[i][j] + mat2[i][j];
                }
            }
            
            System.out.println("\nSum matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.printf("%4d", result[i][j]);
                }
                System.out.println();
            }
        }
        
        scanner.close();
    }
}
```

---

## c. Array Traversal

Array traversal refers to accessing each element of an array systematically.

### Complete Example
```java
// filepath: ArrayTraversalDemo.java
import java.util.Scanner;

public class ArrayTraversalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Standard for loop traversal
        System.out.println("=== Standard For Loop ===");
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Enhanced for loop (for-each)
        System.out.println("\n=== Enhanced For Loop ===");
        System.out.print("Elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Reverse traversal
        System.out.println("\n=== Reverse Traversal ===");
        System.out.print("Elements (reverse): ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Skip elements
        System.out.println("\n=== Skip Every Other Element ===");
        System.out.print("Elements: ");
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // 2D array traversal (row-major)
        System.out.println("\n=== 2D Array Row-Major ===");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.print("Elements: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
        
        // 2D array traversal (column-major)
        System.out.println("\n=== 2D Array Column-Major ===");
        System.out.print("Elements: ");
        for (int j = 0; j < matrix[025): %b%n", 
                         temperature >= 20 && temperature <= 25);
        
        int score = 85;
        System.out.printf("\nScore: %d%n", score);
        System.out.printf("Passing (score >= 60): %b%n", score >= 60);
        System.out.printf("Excellent (score >= 90): %b%n", score >= 90);
    }
}
```

---

## b. Boolean Operators

Boolean operators combine or modify boolean values.

### Boolean Operators Table

| Operator | Description | Example | Result |
|----------|-------------|---------|--------|
| `&&` | Logical AND | `true && false` | `false` |
| `\|\|` | Logical OR | `true \|\| false` | `true` |
| `!` | Logical NOT | `!true` | `false` |

### Truth Tables

**AND (`&&`)**
| A | B | A && B |
|---|---|--------|
| T | T | T |
| T | F | F |
| F | T | F |
| F | F | F |

**OR (`||`)**
| A | B | A \|\| B |
|---|---|----------|
| T | T | T |
| T | F | T |
| F | T | T |
| F | F | F |

**NOT (`!`)**
| A | !A |
|---|-----|
| T | F |
| F | T |

### Complete Example
```java
// filepath: BooleanOperatorsDemo.java
public class BooleanOperatorsDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        
        System.out.println("=== Boolean Operators ===");
        System.out.printf("a = %b, b = %b%n%n", a, b);
        
        // AND operator
        System.out.println("AND Operator (&&):");
        System.out.printf("true && true = %b%n", true && true);
        System.out.printf("true && false = %b%n", true && false);
        System.out.printf("false && true = %b%n", false && true);
        System.out.printf("false && false = %b%n", false && false);
        
        // OR operator
        System.out.println("\nOR Operator (||):");
        System.out.printf("true || true = %b%n", true || true);
        System.out.printf("true || false = %b%n", true || false);
        System.out.printf("false || true = %b%n", false || true);
        System.out.printf("false || false = %b%n", false || false);
        
        // NOT operator
        System.out.println("\nNOT Operator (!):");
        System.out.printf("!true = %b%n", !true);
        System.out.printf("!false = %b%n", !false);
        
        // Combined operators
        System.out.println("\n=== Combined Operators ===");
        System.out.printf("(true && false) || true = %b%n", (true && false) || true);
        System.out.printf("!(true && false) = %b%n", !(true && false));
        System.out.printf("true && (false || true) = %b%n", true && (false || true));
        
        // Practical examples
        System.out.println("\n=== Practical Examples ===");
        
        // Age verification
        int age = 25;
        boolean hasID = true;
        boolean canEnter = age >= 18 && hasID;
        System.out.printf("Age: %d, Has ID: %b%n", age, hasID);
        System.out.printf("Can enter club: %b%n", canEnter);
        
        // Grade eligibility
        int grade = 85;
        int attendance = 95;
        boolean isEligible = grade >= 75 && attendance >= 80;
        System.out.printf("\nGrade: %d, Attendance: %d%%%n", grade, attendance);
        System.out.printf("Eligible for honor roll: %b%n", isEligible);
        
        // Login validation
        String username = "admin";
        String password = "pass123";
        boolean isValidUser = username.equals("admin") && password.equals("pass123");
        System.out.printf("\nUsername: %s, Password: %s%n", username, password);
        System.out.printf("Login successful: %b%n", isValidUser);
        
        // Weekend check
        String day = "Saturday";
        boolean isWeekend = day.equals("Saturday") || day.equals("Sunday");
        System.out.printf("\nDay: %s%n", day);
        System.out.printf("Is weekend: %b%n", isWeekend);
        
        // Short-circuit evaluation
        System.out.println("\n=== Short-Circuit Evaluation ===");
        int x = 5;
        boolean result1 = (x > 10) && (++x > 0);  // ++x not executed
        System.out.printf("After (x > 10) && (++x > 0): x = %d%n", x);
        
        x = 5;
        boolean result2 = (x < 10) || (++x > 0);  // ++x not executed
        System.out.printf("After (x < 10) || (++x > 0): x = %d%n", x);
    }
}
```

---

## c. If Statement

The `if` statement executes a block of code if a condition is true.

### Syntax
```java
if (condition) {
    // code to execute if condition is true
}
```

### Complete Example
```java
// filepath: IfStatementDemo.java
import java.util.Scanner;

public class IfStatementDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Simple if statement
        System.out.println("=== Simple If Statement ===");
        int number = 10;
        System.out.printf("Number: %d%n", number);
        
        if (number > 0) {
            System.out.println("The number is positive");
        }
        
        if (number % 2 == 0) {
            System.out.println("The number is even");
        }
        
        // Multiple if statements
        System.out.println("\n=== Age Verification ===");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        if (age >= 18) {
            System.out.println("You are an adult");
        }
        
        if (age >= 21) {
            System.out.println("You can drink alcohol (US)");
        }
        
        if (age >= 65) {
            System.out.println("You qualify for senior discount");
        }
        
        // Password validation
        System.out.println("\n=== Password Strength ===");
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if (password.length() >= 8) {
            System.out.println("✓ Password length is adequate");
        }
        
        if (password.matches(".*[A-Z].*")) {
            System.out.println("✓ Contains uppercase letter");
        }
        
        if (password.matches(".*[0-9].*")) {
            System.out.println("✓ Contains digit");
        }
        
        if (password.matches(".*[!@#$%^&*].*")) {
            System.out.println("✓ Contains special character");
        }
        
        // Temperature warning
        System.out.println("\n=== Temperature Check ===");
        System.out.print("Enter temperature in Celsius: ");
        double temp = scanner.nextDouble();
        
        if (temp > 35) {
            System.out.println("⚠ High temperature warning!");
        }
        
        if (temp < 0) {
            System.out.println("⚠ Freezing temperature!");
        }
        
        scanner.close();
    }
}
```

---

## d. If...Else Statement

The `if...else` statement executes one block if the condition is true, and another if false.

### Syntax
```java
if (condition) {
    // code if condition is true
} else {
    // code if condition is false
}
```

### Complete Example
```java
// filepath: IfElseStatementDemo.java
import java.util.Scanner;

public class IfElseStatementDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Simple if-else
        System.out.println("=== Even or Odd ===");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number % 2 == 0) {
            System.out.printf("%d is even%n", number);
        } else {
            System.out.printf("%d is odd%n", number);
        }
        
        // Positive or negative
        System.out.println("\n=== Positive or Negative ===");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (num >= 0) {
            System.out.printf("%d is positive%n", num);
        } else {
            System.out.printf("%d is negative%n", num);
        }
        
        // Pass or fail
        System.out.println("\n=== Exam Result ===");
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        
        if (score >= 60) {
            System.out.println("Result: PASSED ✓");
            System.out.println("Congratulations!");
        } else {
            System.out.println("Result: FAILED ✗");
            System.out.println("Better luck next time!");
        }
        
        // Age category
        System.out.println("\n=== Age Category ===");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        if (age < 18) {
            System.out.println("Category: Minor");
            System.out.println("Parental supervision required");
        } else {
            System.out.println("Category: Adult");
            System.out.println("Full access granted");
        }
        
        // Maximum of two numbers
        System.out.println("\n=== Maximum of Two Numbers ===");
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        if (a > b) {
            System.out.printf("Maximum: %d%n", a);
        } else {
            System.out.printf("Maximum: %d%n", b);
        }
        
        // Leap year check
        System.out.println("\n=== Leap Year Check ===");
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.printf("%d is a leap year%n", year);
        } else {
            System.out.printf("%d is not a leap year%n", year);
        }
        
        scanner.close();
    }
}
```

---

## e. If...Else If...Else Statement

The `if...else if...else` statement checks multiple conditions sequentially.

### Syntax
```java
if (condition1) {
    // code if condition1 is true
} else if (condition2) {
    // code if condition2 is true
} else if (condition3) {
    // code if condition3 is true
} else {
    // code if all conditions are false
}
```

### Complete Example
```java
// filepath: IfElseIfStatementDemo.java
import java.util.Scanner;

public class IfElseIfStatementDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Grade classification
        System.out.println("=== Grade Classification ===");
        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();
        
        if (score >= 90) {
            System.out.println("Grade: A (Excellent)");
        } else if (score >= 80) {
            System.out.println("Grade: B (Good)");
        } else if (score >= 70) {
            System.out.println("Grade: C (Average)");
        } else if (score >= 60) {
            System.out.println("Grade: D (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }
        
        // Age category
        System.out.println("\n=== Age Category ===");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age <= 12) {
            System.out.println("Category: Child");
            System.out.println("Ticket price: $5");
        } else if (age <= 17) {
            System.out.println("Category: Teenager");
            System.out.println("Ticket price: $8");
        } else if (age <= 59) {
            System.out.println("Category: Adult");
            System.out.println("Ticket price: $12");
        } else {
            System.out.println("Category: Senior");
            System.out.println("Ticket price: $7");
        }
        
        // BMI calculator
        System.out.println("\n=== BMI Calculator ===");
        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height (m): ");
        double height = scanner.nextDouble();
        
        double bmi = weight / (height * height);
        System.out.printf("Your BMI: %.2f%n", bmi);
        
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal weight");
        } else if (bmi < 30) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }
        
        // Temperature description
        System.out.println("\n=== Temperature Description ===");
        System.out.print("Enter temperature (°C): ");
        double temp = scanner.nextDouble();
        
        if (temp < 0) {
            System.out.println("Freezing");
        } else if (temp < 10) {
            System.out.println("Very Cold");
        } else if (temp < 20) {
            System.out.println("Cold");
        } else if (temp < 30) {
            System.out.println("Comfortable");
        } else if (temp < 40) {
            System.out.println("Hot");
        } else {
            System.out.println("Very Hot");
        }
        
        // Maximum of three numbers
        System.out.println("\n=== Maximum of Three Numbers ===");
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();
        
        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.printf("Maximum: %d%n", max);
        
        scanner.close();
    }
}
```

---

## f. Switch Statement

The `switch` statement selects one of many code blocks to execute based on a variable's value.

### Syntax
```java
switch (expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code if no case matches
}
```

### Complete Example
```java
// filepath: SwitchStatementDemo.java
import java.util.Scanner;

public class SwitchStatementDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Day of week
        System.out.println("=== Day of Week ===");
        System.out.print("Enter day number (1-7): ");
        int day = scanner.nextInt();
        
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }
        
        // Month days
        System.out.println("\n=== Days in Month ===");
        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();
        
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 or 29 days");
                break;
            default:
                System.out.println("Invalid month");
        }
        
        // Grade description
        System.out.println("\n=== Grade Description ===");
        System.out.print("Enter grade (A/B/C/D/F): ");
        char grade = scanner.next().toUpperCase().charAt(0);
        
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                System.out.println("Score: 90-100");
                break;
            case 'B':
                System.out.println("Good job!");
                System.out.println("Score: 80-89");
                break;
            case 'C':
                System.out.println("Average");
                System.out.println("Score: 70-79");
                break;
            case 'D':
                System.out.println("Passed");
                System.out.println("Score: 60-69");
                break;
            case 'F':
                System.out.println("Failed");
                System.out.println("Score: 0-59");
                break;
            default:
                System.out.println("Invalid grade");
        }
        
        // Simple calculator
        System.out.println("\n=== Simple Calculator ===");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, result);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
        
        // Menu selection
        System.out.println("\n=== Restaurant Menu ===");
        System.out.println("1. Burger - $5.99");
        System.out.println("2. Pizza - $8.99");
        System.out.println("3. Salad - $4.99");
        System.out.println("4. Pasta - $7.99");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("You ordered: Burger");
                System.out.println("Price: $5.99");
                break;
            case 2:
                System.out.println("You ordered: Pizza");
                System.out.println("Price: $8.99");
                break;
            case 3:
                System.out.println("You ordered: Salad");
                System.out.println("Price: $4.99");
                break;
            case 4:
                System.out.println("You ordered: Pasta");
                System.out.println("Price: $7.99");
                break;
            default:
                System.out.println("Invalid choice");
        }
        
        scanner.close();
    }
}
```

---

## g. Nested Decision

Nested decision structures are decision statements inside other decision statements.

### Complete Example
```java
// filepath: NestedDecisionDemo.java
import java.util.Scanner;

public class NestedDecisionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nested if for grade with attendance
        System.out.println("=== Grade with Attendance Check ===");
        System.out.print("Enter score (0-100): ");
        int score = scanner.nextInt();
        System.out.print("Enter attendance percentage: ");
        int attendance = scanner.nextInt();
        
        if (score >= 60) {
            System.out.println("Score: PASSED");
            if (attendance >= 75) {
                System.out.println("Attendance: Sufficient");
                System.out.println("Final Result: PASSED ✓");
            } else {
                System.out.println("Attendance: Insufficient");
                System.out.println("Final Result: FAILED (Low Attendance) ✗");
            }
        } else {
            System.out.println("Score: FAILED");
            System.out.println("Final Result: FAILED ✗");
        }
        
        // Login system
        System.out.println("\n=== Login System ===");
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if (username.equals("admin")) {
            if (password.equals("admin123")) {
                System.out.println("Login successful!");
                System.out.println("Welcome, Admin!");
            } else {
                System.out.println("Incorrect password");
            }
        } else if (username.equals("user")) {
            if (password.equals("user123")) {
                System.out.println("Login successful!");
                System.out.println("Welcome, User!");
            } else {
                System.out.println("Incorrect password");
            }
        } else {
            System.out.println("Username not found");
        }
        
        // Ticket pricing
        System.out.println("\n=== Cinema Ticket Pricing ===");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Is it a weekend? (yes/no): ");
        String isWeekend = scanner.next();
        
        double price;
        if (age < 12) {
            if (isWeekend.equalsIgnoreCase("yes")) {
                price = 8.00;
            } else {
                price = 5.00;
            }
            System.out.println("Category: Child");
        } else if (age >= 60) {
            if (isWeekend.equalsIgnoreCase("yes")) {
                price = 10.00;
            } else {
                price = 7.00;
            }
            System.out.println("Category: Senior");
        } else {
            if (isWeekend.equalsIgnoreCase("yes")) {
                price = 15.00;
            } else {
                price = 12.00;
            }
            System.out.println("Category: Adult");
        }
        System.out.printf("Ticket price: $%.2f%n", price);
        
        // Triangle classifier
        System.out.println("\n=== Triangle Classifier ===");
        System.out.print("Enter side 1: ");
        int side1 = scanner.nextInt();
        System.out.print("Enter side 2: ");
        int side2 = scanner.nextInt();
        System.out.print("Enter side 3: ");
        int side3 = scanner.nextInt();
        
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            System.out.println("Valid triangle");
            
            if (side1 == side2 && side2 == side3) {
                System.out.println("Type: Equilateral");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("Type: Isosceles");
            } else {
                System.out.println("Type: Scalene");
            }
            
            // Check if right triangle
            int a = Math.max(side1, Math.max(side2, side3));
            int b, c;
            if (a == side1) {
                b = side2; c = side3;
            } else if (a == side2) {
                b = side1; c = side3;
            } else {
                b = side1; c = side2;
            }
            
            if (a * a == b * b + c * c) {
                System.out.println("Also a right triangle");
            }
        } else {
            System.out.println("Invalid triangle");
        }
        
        // Scholarship eligibility
        System.out.println("\n=== Scholarship Eligibility ===");
        System.out.print("Enter GPA (0.0-4.0): ");
        double gpa = scanner.nextDouble();
        System.out.print("Enter family income: $");
        double income = scanner.nextDouble();
        System.out.print("Has community service? (yes/no): ");
        String hasService = scanner.next();
        
        if (gpa >= 3.5) {
            System.out.println("GPA: Excellent");
            if (income < 50000) {
                if (hasService.equalsIgnoreCase("yes")) {
                    System.out.println("Scholarship: Full (100%)");
                } else {
                    System.out.println("Scholarship: High (75%)");
                }
            } else {
                if (hasService.equalsIgnoreCase("yes")) {
                    System.out.println("Scholarship: Partial (50%)");
                } else {
                    System.out.println("Scholarship: Basic (25%)");
                }
            }
        } else if (gpa >= 3.0) {
            System.out.println("GPA: Good");
            if (income < 50000 && hasService.equalsIgnoreCase("yes")) {
                System.out.println("Scholarship: Partial (50%)");
            } else {
                System.out.println("Scholarship: Basic (25%)");
            }
        } else {
            System.out.println("GPA: Below requirement");
            System.out.println("Scholarship: Not eligible");
        }
        
        scanner.close();
    }
}
```

---

# Iterative Structures

## a. While Loop

The `while` loop repeats a block of code as long as a condition is true.

### Syntax
```java
while (condition) {
    // code to repeat
}
```

### Complete Example
```java
// filepath: WhileLoopDemo.java
import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Simple counter
        System.out.println("=== Count from 1 to 10 ===");
        int count = 1;
        while (count <= 10) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        
        // Count backwards
        System.out.println("\n=== Countdown from 10 ===");
        int countdown = 10;
        while (countdown >= 1) {
            System.out.print(countdown + " ");
            countdown--;
        }
        System.out.println("Blast off!");
        
        // Sum of numbers
        System.out.println("\n=== Sum of First N Numbers ===");
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.printf("Sum of first %d numbers: %d%n", n, sum);
        
        // Factorial
        System.out.println("\n=== Factorial Calculator ===");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        long factorial = 1;
        int temp = num;
        while (temp > 0) {
            factorial *= temp;
            temp--;
        }
        System.out.printf("%d! = %d%n", num, factorial);
        
        // Digit sum
        System.out.println("\n=== Sum of Digits ===");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int digitSum = 0;
        int original = number;
        while (number > 0) {
            digitSum += number % 10;
            number /= 10;
        }
        System.out.printf("Sum of digits in %d: %d%n", original, digitSum);
        
        // Reverse number
        System.out.println("\n=== Reverse Number ===");
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        int reversed = 0;
        original = number;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        System.out.printf("Original: %d, Reversed: %d%n", original, reversed);
        
        // Password attempts
        System.out.println("\n=== Password System ===");
        String correctPassword = "secret123";
        int attempts = 3;
        scanner.nextLine(); // Clear buffer
        
        while (attempts > 0) {
            System.out.printf("Enter password (%d attempts left): ", attempts);
            String password = scanner.nextLine();
            
            if (password.equals(correctPassword)) {
                System.out.println("Access granted!");
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Incorrect password. Try again.");
                } else {
                    System.out.println("Account locked!");
                }
            }
        }
        
        // Menu system
        System.out.println("\n=== Simple Menu System ===");
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Display Message");
            System.out.println("2. Calculate Square");
            System.out.println("3. Show Date");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Hello, World!");
                    break;
                case 2:
                    System.out.print("Enter number: ");
                    int val = scanner.nextInt();
                    System.out.printf("Square: %d%n", val * val);
                    break;
                case 3:
                    System.out.println("Today is a great day!");
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        
        scanner.close();
    }
}
```

---

## b. For Loop

The `for` loop repeats a block of code a specific number of times.

### Syntax
```java
for (initialization; condition; update) {
    // code to repeat
}
```

### Complete Example
```java
// filepath: ForLoopDemo.java
import java.util.Scanner;

public class ForLoopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Basic counting
        System.out.println("=== Count 1 to 10 ===");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Count backwards
        System.out.println("\n=== Count 10 to 1 ===");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Even numbers
        System.out.println("\n=== Even Numbers 2 to 20 ===");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Multiplication table
        System.out.println("\n=== Multiplication Table ===");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", num, i, num * i);
        }
        
        // Sum and average
        System.out.println("\n=== Sum and Average ===");
        System.out.print("How many numbers? ");
        int count = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            System.out.printf("Enter number %d: ", i);
            sum += scanner.nextInt();
        }
        double average = (double) sum / count;
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %.2f%n", average);
        
        // Factorial
        System.out.println("\n=== Factorial ===");
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.printf("%d! = %d%n", n, factorial);
        
        // Fibonacci sequence
        System.out.println("\n=== Fibonacci Sequence ===");
        System.out.print("How many terms? ");
        int terms = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
        
        // Pattern printing - Right triangle
        System.out.println("\n=== Right Triangle Pattern ===");
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Pattern printing - Pyramid
        System.out.println("\n=== Pyramid Pattern ===");
        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Prime number check
        System.out.println("\n=== Prime Number Check ===");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.printf("%d is %s%n", number, isPrime ? "prime" : "not prime");
        
        scanner.close();
    }
}
```

---

## c. Nested Loop

Nested loops are loops inside other loops.

### Complete Example
```java
// filepath: NestedLoopDemo.java
import java.util.Scanner;

public class NestedLoopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Multiplication table (full)
        System.out.println("=== Full Multiplication Table (1-10) ===");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
        
        // Rectangle pattern
        System.out.println("\n=== Rectangle Pattern ===");
        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter columns: ");
        int cols = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Number pyramid
        System.out.println("\n=== Number Pyramid ===");
        System.out.print("Enter height: ");
        int height = scanner.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        // Diamond pattern
        System.out.println("\n=== Diamond Pattern ===");
        System.out.print("Enter size: ");
        int size = scanner.nextInt();
        
        // Upper half
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower half
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Prime numbers in range
        System.out.println("\n=== Prime Numbers in Range ===");
        System.out.print("Enter start: ");
        int start = scanner.nextInt();
        System.out.print("Enter end: ");
        int end = scanner.nextInt();
        
        System.out.print("Prime numbers: ");
        for (int num = start; num <= end; num++) {
            if (num <= 1) continue;
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        
        // Matrix input and display
        System.out.println("\n=== Matrix Operations ===");
        System.out.print("Enter rows: ");
        int r = scanner.nextInt();
        System.out.print("Enter columns: ");
        int c = scanner.nextInt();
        
        int[][] matrix = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nMatrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
```

---

## d. Break Statement

The `break` statement terminates the loop immediately.

### Complete Example
```java
// filepath: BreakStatementDemo.java
import java.util.Scanner;

public class BreakStatementDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Break at specific number
        System.out.println("=== Break at 5 ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at " + i);
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Find first even number
        System.out.println("\n=== Find First Even ===");
        System.out.print("Enter numbers (0 to stop): ");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break;
            
            if (num % 2 == 0) {
                System.out.printf("First even number found: %d%n", num);
                break;
            }
            System.out.println("Odd number, continue...");
        }
        
        // Search in array
        System.out.println("\n=== Search in Array ===");
        int[] numbers = {5, 12, 8, 3, 19, 7, 15};
        System.out.print("Array: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();
        
        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();
        boolean found = false;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.printf("Found %d at index %d%n", target, i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found");
        }
        
        // Quiz game
        System.out.println("\n=== Quiz Game ===");
        scanner.nextLine(); // Clear buffer
        String[] questions = {
            "What is 2 + 2? ",
            "What is 5 * 3? ",
            "What is 10 - 7? "
        };
        int[] answers = {4, 15, 3};
        int score = 0;
        
        for (int i = 0; i < questions.length; i++) {
            System.out.print(questions[i]);
            int answer = scanner.nextInt();
            
            if (answer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Game Over.");
                break;
            }
        }
        System.out.printf("Final Score: %d/%d%n", score, questions.length);
        
        scanner.close();
    }
}
```

---

## e. Continue Statement

The `continue` statement skips the current iteration and continues with the next.

### Complete Example
```java
// filepath: ContinueStatementDemo.java
import java.util.Scanner;

public class ContinueStatementDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Skip specific number
        System.out.println("=== Skip number 5 ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;  // Skip 5
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Print only odd numbers
        System.out.println("\n=== Odd Numbers Only ===");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;  // Skip even numbers
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Skip multiples of 3
        System.out.println("\n=== Skip Multiples of 3 ===");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Process valid inputs only
        System.out.println("\n=== Process Positive Numbers Only ===");
        System.out.println("Enter 5 numbers:");
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("Number %d: ", i + 1);
            int num = scanner.nextInt();
            
            if (num < 0) {
                System.out.println("Negative number skipped");
                continue;
            }
            
            sum += num;
            count++;
        }
        
        if (count > 0) {
            System.out.printf("Sum of positive numbers: %d%n", sum);
            System.out.printf("Average: %.2f%n", (double) sum / count);
        }
        
        // Skip vowels
        System.out.println("\n=== Remove Vowels ===");
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        System.out.print("Without vowels: ");
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            }
            System.out.print(text.charAt(i));
        }
        System.out.println();
        
        // Grade processing
        System.out.println("\n=== Grade Processing ===");
        System.out.print("How many students? ");
        int students = scanner.nextInt();
        int passCount = 0;
        
        for (int i = 1; i <= students; i++) {
            System.out.printf("Enter grade for student %d: ", i);
            int grade = scanner.nextInt();
            
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade, skipped");
                continue;
            }
            
            if (grade >= 60) {
                passCount++;
            }
        }
        
        System.out.printf("Students passed: %d%n", passCount);
        System.out.printf("Students failed: %d%n", students - passCount);
        
        scanner.close();
    }
}
```

---

# Arrays

## a. One Dimensional Arrays

Arrays are fixed-size containers that hold multiple values of the same type.

### Syntax
```java
// Declaration
dataType[] arrayName = new dataType[size];

// or
dataType[] arrayName = {value1, value2, value3};
```

### Complete Example
```java
// filepath: OneDimensionalArrayDemo.java
import java.util.Scanner;

public class OneDimensionalArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array declaration and initialization
        System.out.println("=== Array Basics ===");
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Array input
        System.out.println("\n=== Array Input ===");
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.printf("Element %d: ", i + 1);
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("You entered: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Sum and average
        System.out.println("\n=== Sum and Average ===");
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %.2f%n", average);
        
        // Find maximum and minimum
        System.out.println("\n=== Maximum and Minimum ===");
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.printf("Maximum: %d%n", max);
        System.out.printf("Minimum: %d%n", min);
        
        // Search element
        System.out.println("\n=== Search Element ===");
        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.printf("Found %d at index %d%n", target, index);
        } else {
            System.out.println("Number not found");
        }
        
        // Count occurrences
        System.out.println("\n=== Count Occurrences ===");
        System.out.print("Enter number to count: ");
        int searchNum = scanner.nextInt();
        int count = 0;
        for (int num : arr) {
            if (num == searchNum) count++;
        }
        System.out.printf("%d appears %d time(s)%n", searchNum, count);
        
        // Reverse array
        System.out.println("\n=== Reverse Array ===");
        System.out.print("Original: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
        
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        
        System.out.print("Reversed: ");
        for (int num : reversed) System.out.print(num + " ");
        System.out.println();
        
        // Copy array
        System.out.println("\n=== Copy Array ===");
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        System.out.println("Array copied successfully");
        
        // Sort array (Bubble Sort)
        System.out.println("\n=== Sort Array ===");
        int[] toSort = arr.clone();
        for (int i = 0; i < toSort.length - 1; i++) {
            for (int j = 0; j < toSort.length - i - 1; j++) {
                if (toSort[j] > toSort[j + 1]) {
                    int temp = toSort[j];
                    toSort[j] = toSort[j + 1];
                    toSort[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int num : toSort) System.out.print(num + " ");
        System.out.println();
        
        scanner.close();
    }
}
```

---

## b. Two Dimensional Arrays

Two-dimensional arrays are arrays of arrays, creating a matrix structure.

### Syntax
```java
// Declaration
dataType[][] arrayName = new dataType[rows][columns];

// or
dataType[][] arrayName = {{row1}, {row2}, {row3}};
```

### Complete Example
```java
// filepath: TwoDimensionalArrayDemo.java
import java.util.Scanner;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 2D array initialization
        System.out.println("=== 2D Array Basics ===");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        
        // Matrix input
        System.out.println("\n=== Matrix Input ===");
        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter columns: ");
        int cols = scanner.nextInt();
        
        int[][] mat = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                mat[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nYour matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", mat[i][j]);
            }
            System.out.println();
        }
        
        // Sum of all elements
        System.out.println("\n=== Sum of All Elements ===");
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += mat[i][j];
            }
        }
        System.out.printf("Total sum: %d%n", sum);
        
        // Row and column sums
        System.out.println("\n=== Row and Column Sums ===");
        System.out.println("Row sums:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += mat[i][j];
            }
            System.out.printf("Row %d: %d%n", i, rowSum);
        }
        
        System.out.println("\nColumn sums:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += mat[i][j];
            }
            System.out.printf("Column %d: %d%n", j, colSum);
        }
        
        // Transpose matrix
        System.out.println("\n=== Transpose Matrix ===");
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = mat[i][j];
            }
        }
        
        System.out.println("Transposed matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.printf("%4d", transpose[i][j]);
            }
            System.out.println();
        }
        
        // Matrix addition
        System.out.println("\n=== Matrix Addition ===");
        if (rows == cols) {
            int[][] mat2 = new int[rows][cols];
            System.out.println("Enter second matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.printf("[%d][%d]: ", i, j);
                    mat2[i][j] = scanner.nextInt();
                }
            }
            
            int[][] result = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = mat[i][j] + mat2[i][j];
                }
            }
            
            System.out.println("\nSum matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.printf("%4d", result[i][j]);
                }
                System.out.println();
            }
        }
        
        scanner.close();
    }
}
```

---

## c. Array Traversal

Array traversal refers to accessing each element of an array systematically.

### Complete Example
```java
// filepath: ArrayTraversalDemo.java
import java.util.Scanner;

public class ArrayTraversalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Standard for loop traversal
        System.out.println("=== Standard For Loop ===");
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Enhanced for loop (for-each)
        System.out.println("\n=== Enhanced For Loop ===");
        System.out.print("Elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Reverse traversal
        System.out.println("\n=== Reverse Traversal ===");
        System.out.print("Elements (reverse): ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Skip elements
        System.out.println("\n=== Skip Every Other Element ===");
        System.out.print("Elements: ");
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // 2D array traversal (row-major)
        System.out.println("\n=== 2D Array Row-Major ===");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.print("Elements: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
        
        // 2D array traversal (column-major)
        System.out.println("\n=== 2D Array Column-Major ===");
        System.out.print("Elements: ");
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
        
        // Diagonal traversal
        System.out.println("\n=== Diagonal Traversal ===");
        System.out.print("Main diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        
        System.out.print("Anti-diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix.length - 1 - i] + " ");
        }
        System.out.println();
        
        // Array with while loop
        System.out.println("\n=== Traversal with While Loop ===");
        int index = 0;
        System.out.print("Elements: ");
        while (index < numbers.length) {
            System.out.print(numbers[index] + " ");
            index++;
        }
        System.out.println();
        
        // Process array elements
        System.out.println("\n=== Process Elements ===");
        System.out.print("Original: ");
        for (int num : numbers) System.out.print(num + " ");
        System.out.println();
        
        System.out.print("Doubled: ");
        for (int num : numbers) System.out.print((num * 2) + " ");
        System.out.println();
        
        System.out.print("Squared: ");
        for (int num : numbers) System.out.print((num * num) + " ");
        System.out.println();
        
        scanner.close();
    }
}
```

---

## d. Common Array Operations

### Linear Search
```java
// filepath: LinearSearchDemo.java
import java.util.Scanner;

public class LinearSearchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.print("Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
        
        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();
        
        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                position = i;
                break;
            }
        }
        
        if (position != -1) {
            System.out.printf("Found %d at index %d%n", target, position);
        } else {
            System.out.println("Element not found");
        }
        
        scanner.close();
    }
}
```

### Binary Search
```java
// filepath: BinarySearchDemo.java
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arr = {11, 12, 22, 25, 34, 64, 90}; // Must be sorted
        
        System.out.print("Sorted array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
        
        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();
        
        int left = 0, right = arr.length - 1;
        int position = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                position = mid;
                break;
            }
            
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        if (position != -1) {
            System.out.printf("Found %d at index %d%n", target, position);
        } else {
            System.out.println("Element not found");
        }
        
        scanner.close();
    }
}
```

### Bubble Sort
```java
// filepath: BubbleSortDemo.java
public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.print("Original array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
        
        // Bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Sorted array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
```

### Selection Sort
```java
// filepath: SelectionSortDemo.java
public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.print("Original array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
        
        // Selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        System.out.print("Sorted array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
```

### Insertion Sort
```java
// filepath: InsertionSortDemo.java
public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.print("Original array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
        
        // Insertion sort
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        
        System.out.print("Sorted array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
```

---

## e. Array Manipulation Examples

### Merge Two Arrays
```java
// filepath: MergeArraysDemo.java
public class MergeArraysDemo {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        
        System.out.print("Array 1: ");
        for (int num : arr1) System.out.print(num + " ");
        System.out.println();
        
        System.out.print("Array 2: ");
        for (int num : arr2) System.out.print(num + " ");
        System.out.println();
        
        // Merge arrays
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }
        
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }
        
        System.out.print("Merged array: ");
        for (int num : merged) System.out.print(num + " ");
        System.out.println();
    }
}
```

### Remove Duplicates
```java
// filepath: RemoveDuplicatesDemo.java
public class RemoveDuplicatesDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        
        System.out.print("Original array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
        
        // Remove duplicates (assuming sorted array)
        int[] temp = new int[arr.length];
        int j = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length - 1];
        
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
}
```

### Rotate Array
```java
// filepath: RotateArrayDemo.java
public class RotateArrayDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotations = 2;
        
        System.out.print("Original array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
        
        // Rotate right by rotations positions
        for (int i = 0; i < rotations; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        
        System.out.printf("Array rotated right by %d: ", rotations);
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
```

---

## f. Comprehensive Array Example

```java
// filepath: ArrayManagementSystem.java
import java.util.Scanner;

public class ArrayManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = null;
        
        while (true) {
            System.out.println("\n=== Array Management System ===");
            System.out.println("1. Create Array");
            System.out.println("2. Display Array");
            System.out.println("3. Search Element");
            System.out.println("4. Find Min/Max");
            System.out.println("5. Calculate Sum/Average");
            System.out.println("6. Sort Array");
            System.out.println("7. Reverse Array");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter array size: ");
                    int size = scanner.nextInt();
                    arr = new int[size];
                    System.out.println("Enter " + size + " elements:");
                    for (int i = 0; i < size; i++) {
                        System.out.printf("Element %d: ", i + 1);
                        arr[i] = scanner.nextInt();
                    }
                    System.out.println("Array created successfully!");
                    break;
                    
                case 2:
                    if (arr == null) {
                        System.out.println("Array not created!");
                    } else {
                        System.out.print("Array: ");
                        for (int num : arr) System.out.print(num + " ");
                        System.out.println();
                    }
                    break;
                    
                case 3:
                    if (arr == null) {
                        System.out.println("Array not created!");
                    } else {
                        System.out.print("Enter element to search: ");
                        int target = scanner.nextInt();
                        int index = -1;
                        for (int i = 0; i < arr.length; i++) {
                            if (arr[i] == target) {
                                index = i;
                                break;
                            }
                        }
                        if (index != -1) {
                            System.out.printf("Found %d at index %d%n", target, index);
                        } else {
                            System.out.println("Element not found");
                        }
                    }
                    break;
                    
                case 4:
                    if (arr == null) {
                        System.out.println("Array not created!");
                    } else {
                        int min = arr[0], max = arr[0];
                        for (int num : arr) {
                            if (num < min) min = num;
                            if (num > max) max = num;
                        }
                        System.out.printf("Minimum: %d%n", min);
                        System.out.printf("Maximum: %d%n", max);
                    }
                    break;
                    
                case 5:
                    if (arr == null) {
                        System.out.println("Array not created!");
                    } else {
                        int sum = 0;
                        for (int num : arr) sum += num;
                        double avg = (double) sum / arr.length;
                        System.out.printf("Sum: %d%n", sum);
                        System.out.printf("Average: %.2f%n", avg);
                    }
                    break;
                    
                case 6:
                    if (arr == null) {
                        System.out.println("Array not created!");
                    } else {
                        // Bubble sort
                        for (int i = 0; i < arr.length - 1; i++) {
                            for (int j = 0; j < arr.length - i - 1; j++) {
                                if (arr[j] > arr[j + 1]) {
                                    int temp = arr[j];
                                    arr[j] = arr[j + 1];
                                    arr[j + 1] = temp;
                                }
                            }
                        }
                        System.out.println("Array sorted successfully!");
                        System.out.print("Sorted array: ");
                        for (int num : arr) System.out.print(num + " ");
                        System.out.println();
                    }
                    break;
                    
                case 7:
                    if (arr == null) {
                        System.out.println("Array not created!");
                    } else {
                        for (int i = 0; i < arr.length / 2; i++) {
                            int temp = arr[i];
                            arr[i] = arr[arr.length - 1 - i];
                            arr[arr.length - 1 - i] = temp;
                        }
                        System.out.println("Array reversed successfully!");
                        System.out.print("Reversed array: ");
                        for (int num : arr) System.out.print(num + " ");
                        System.out.println();
                    }
                    break;
                    
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
```

---

# Summary and Best Practices

## Key Takeaways

1. **Variables and Data Types**: Always declare variables with appropriate data types
2. **Operators**: Understand precedence and associativity
3. **Control Structures**: Use appropriate selection and iteration structures
4. **Arrays**: Choose between 1D and 2D arrays based on requirements
5. **Code Quality**: Write readable, maintainable, and efficient code

## Common Pitfalls to Avoid

1. **Array Index Out of Bounds**: Always check array length before accessing
2. **Integer Division**: Use casting when needed for decimal results
3. **Scanner Buffer Issues**: Clear buffer after numeric inputs
4. **Infinite Loops**: Ensure loop conditions can become false
5. **String Comparison**: Use `.equals()` instead of `==`

## Best Practices

1. Use meaningful variable names
2. Add comments for complex logic
3. Follow consistent indentation
4. Handle edge cases
5. Close Scanner objects
6. Use appropriate data structures
7. Validate user input
8. Break complex problems into smaller parts

---

**End of Study Guide**