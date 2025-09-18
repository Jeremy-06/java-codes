Here is a 30-day Java Daily Challenge schedule designed to take you from beginner to advanced concepts.

### **Week 1: The Basics**

**Day 1: Greeting a User**
*   **Difficulty:** Easy
*   **Description:** Write a program that asks for the user's name and then prints a personalized greeting.
*   **Expected Input:** `Alice`
*   **Expected Output:** `Hello, Alice!`
*   **Hints or Concepts to Practice:** Variables (`String`), user input (`Scanner`), basic output (`System.out.println`).

**Day 2: Simple Calculator**
*   **Difficulty:** Easy
*   **Description:** Create a program that takes two numbers as input and performs basic arithmetic operations (addition, subtraction, multiplication, division).
*   **Expected Input:** `10`, `5`
*   **Expected Output:** `Addition: 15, Subtraction: 5, Multiplication: 50, Division: 2`
*   **Hints or Concepts to Practice:** Data types (`int`, `double`), arithmetic operators, user input.

**Day 3: Even or Odd Checker**
*   **Difficulty:** Easy
*   **Description:** Write a program that checks if a given number is even or odd.
*   **Expected Input:** `7`
*   **Expected Output:** `The number is odd.`
*   **Hints or Concepts to Practice:** Conditional statements (`if-else`), modulo operator (`%`).

**Day 4: String Reverser**
*   **Difficulty:** Easy
*   **Description:** Create a program that takes a string as input and prints the reversed version of it.
*   **Expected Input:** `Java`
*   **Expected Output:** `avaJ`
*   **Hints or Concepts to Practice:** Loops (`for`), `String` manipulation (`charAt`, `length`).

**Day 5: Number Guessing Game**
*   **Difficulty:** Easy
*   **Description:** Implement a simple game where the program generates a random number and the user has to guess it. Provide feedback if the guess is too high or too low.
*   **Expected Input:** (User guesses) `50`, `75`, `67`
*   **Expected Output:** `Too low!`, `Too high!`, `Correct!`
*   **Hints or Concepts to Practice:** Loops (`while`), random number generation (`Math.random`), conditionals.

**Day 6: Multiplication Table**
*   **Difficulty:** Easy
*   **Description:** Write a program that prints the multiplication table for a given number from 1 to 10.
*   **Expected Input:** `5`
*   **Expected Output:** `5 * 1 = 5`, `5 * 2 = 10`, ..., `5 * 10 = 50`
*   **Hints or Concepts to Practice:** `for` loops.

**Day 7: Vowel Counter**
*   **Difficulty:** Easy
*   **Description:** Create a function that counts the number of vowels in a given string.
*   **Expected Input:** `Hello World`
*   **Expected Output:** `Number of vowels: 3`
*   **Hints or Concepts to Practice:** String manipulation, loops, conditionals (`if` or `switch`).

**Day 8: Find the Maximum**
*   **Difficulty:** Easy
*   **Description:** Write a program that finds the largest element in an array of integers.
*   **Expected Input:** `[10, 5, 25, 8, 15]`
*   **Expected Output:** `The maximum value is: 25`
*   **Hints or Concepts to Practice:** Arrays, loops.

**Day 9: Sum of Array Elements**
*   **Difficulty:** Easy
*   **Description:** Calculate the sum of all elements in an integer array.
*   **Expected Input:** `[1, 2, 3, 4, 5]`
*   **Expected Output:** `Sum: 15`
*   **Hints or Concepts to Practice:** Arrays, loops.

**Day 10: Fibonacci Sequence**
*   **Difficulty:** Easy
*   **Description:** Generate the first 'n' numbers of the Fibonacci sequence.
*   **Expected Input:** `10`
*   **Expected Output:** `0, 1, 1, 2, 3, 5, 8, 13, 21, 34`
*   **Hints or Concepts to Practice:** Loops, variables to store previous terms.

### **Week 2: Methods, OOP, and Data Structures**

**Day 11: Palindrome Checker**
*   **Difficulty:** Medium
*   **Description:** Write a method that checks if a given string is a palindrome (reads the same forwards and backward, ignoring case).
*   **Expected Input:** `Racecar`
*   **Expected Output:** `true`
*   **Hints or Concepts to Practice:** Methods, `String` manipulation, loops.

**Day 12: Factorial with Recursion**
*   **Difficulty:** Medium
*   **Description:** Create a recursive method to calculate the factorial of a non-negative integer.
*   **Expected Input:** `5`
*   **Expected Output:** `120`
*   **Hints or Concepts to Practice:** Recursion, base cases.

**Day 13: Introduction to OOP: Create a `Car` Class**
*   **Difficulty:** Medium
*   **Description:** Define a `Car` class with attributes like `make`, `model`, and `year`, and methods like `startEngine()` and `stopEngine()`.
*   **Expected Input:** (In code) Create a `Car` object and call its methods.
*   **Expected Output:** `Engine started.`
*   **Hints or Concepts to Practice:** Object-Oriented Programming (OOP), classes, objects, methods, attributes.

**Day 14: Using ArrayList**
*   **Difficulty:** Medium
*   **Description:** Write a program that uses an `ArrayList` to store a list of names. Implement functionalities to add, remove, and display names.
*   **Expected Input:** Add "Alice", Add "Bob", Remove "Alice"
*   **Expected Output:** `[Bob]`
*   **Hints or Concepts to Practice:** `ArrayList`, methods (`add`, `remove`, `get`).

**Day 15: Simple Bank Account**
*   **Difficulty:** Medium
*   **Description:** Create a `BankAccount` class with methods to deposit, withdraw, and check the balance. Encapsulate the balance variable to make it private.
*   **Expected Input:** Deposit 100, Withdraw 30
*   **Expected Output:** `Current Balance: 70`
*   **Hints or Concepts to Practice:** OOP, encapsulation (`private`), getters/setters.

**Day 16: Word Frequency Counter**
*   **Difficulty:** Medium
*   **Description:** Count the frequency of each word in a given sentence using a `HashMap`.
*   **Expected Input:** `Java is fun and Java is powerful`
*   **Expected Output:** `{Java=2, is=2, fun=1, and=1, powerful=1}`
*   **Hints or Concepts to Practice:** `HashMap`, `String` splitting.

**Day 17: Simple Inheritance**
*   **Difficulty:** Medium
*   **Description:** Create a superclass `Animal` with a method `makeSound()`. Create subclasses like `Dog` and `Cat` that override this method to make their specific sounds.
*   **Expected Input:** (In code) Create `Dog` and `Cat` objects and call `makeSound()`.
*   **Expected Output:** `Woof`, `Meow`
*   **Hints or Concepts to Practice:** OOP, inheritance, method overriding.

**Day 18: Two Sum Problem**
*   **Difficulty:** Medium
*   **Description:** Given an array of integers and a target sum, find two numbers in the array that add up to the target.
*   **Expected Input:** `nums = [2, 7, 11, 15]`, `target = 9`
*   **Expected Output:** `Indices: 0, 1`
*   **Hints or Concepts to Practice:** Arrays, nested loops or `HashMap` for optimization.

**Day 19: Bubble Sort Implementation**
*   **Difficulty:** Medium
*   **Description:** Implement the bubble sort algorithm to sort an array of integers in ascending order.
*   **Expected Input:** `[5, 1, 4, 2, 8]`
*   **Expected Output:** `[1, 2, 4, 5, 8]`
*   **Hints or Concepts to Practice:** Sorting algorithms, nested loops, array manipulation.

**Day 20: Prime Number Checker**
*   **Difficulty:** Medium
*   **Description:** Write an efficient method to check if a number is prime.
*   **Expected Input:** `29`
*   **Expected Output:** `true`
*   **Hints or Concepts to Practice:** Methods, loops, mathematical logic for optimization.

### **Week 3: Advanced Concepts and Mini-Projects**

**Day 21: Valid Parentheses**
*   **Difficulty:** Hard
*   **Description:** Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid. An input string is valid if open brackets are closed by the same type of brackets and in the correct order.
*   **Expected Input:** `({[]})`
*   **Expected Output:** `true`
*   **Hints or Concepts to Practice:** Data Structures (`Stack`).

**Day 22: File Reading and Word Count**
*   **Difficulty:** Hard
*   **Description:** Write a program that reads a text file and counts the total number of words.
*   **Expected Input:** A file `sample.txt` containing "This is a sample file."
*   **Expected Output:** `Word count: 5`
*   **Hints or Concepts to Practice:** File I/O (`FileReader`, `BufferedReader`), exception handling (`try-catch`).

**Day 23: Implement a Queue**
*   **Difficulty:** Hard
*   **Description:** Implement a basic `Queue` data structure from scratch using an array or `LinkedList` with `enqueue` (add) and `dequeue` (remove) methods.
*   **Expected Input:** Enqueue 10, Enqueue 20, Dequeue
*   **Expected Output:** `10`
*   **Hints or Concepts to Practice:** Data Structures (`Queue`), OOP, array or `LinkedList` manipulation.

**Day 24: Custom Exception Handling**
*   **Difficulty:** Hard
*   **Description:** Enhance the `BankAccount` from Day 15. Create a custom exception, `InsufficientFundsException`, that is thrown when a withdrawal amount is greater than the balance.
*   **Expected Input:** Balance is 50, Withdraw 100
*   **Expected Output:** `Exception thrown: Insufficient funds.`
*   **Hints or Concepts to Practice:** Custom exceptions, `throw`, `throws`, advanced exception handling.

**Day 25: Implement a Singly Linked List**
*   **Difficulty:** Hard
*   **Description:** Create a basic singly `LinkedList` class from scratch with methods to add a node to the end and display the list.
*   **Expected Input:** Add 1, Add 2, Add 3
*   **Expected Output:** `1 -> 2 -> 3 -> NULL`
*   **Hints or Concepts to Practice:** Data Structures (`LinkedList`), OOP, references/pointers.

**Day 26: Merge Sort Algorithm**
*   **Difficulty:** Hard
*   **Description:** Implement the merge sort algorithm, a more efficient, recursive sorting algorithm.
*   **Expected Input:** `[8, 3, 5, 4, 7, 6, 1, 2]`
*   **Expected Output:** `[1, 2, 3, 4, 5, 6, 7, 8]`
*   **Hints or Concepts to Practice:** Advanced sorting algorithms, recursion (`divide and conquer`).

**Day 27: Simple To-Do List - Part 1 (Console App)**
*   **Difficulty:** Hard
*   **Description:** Start a console-based to-do list application. Implement features to add a task, view all tasks, and exit the program.
*   **Expected Input:** (User commands) `add "Buy milk"`, `view`
*   **Expected Output:** `1. Buy milk`
*   **Hints or Concepts to Practice:** Combining concepts: `ArrayList`, `Scanner`, `while` loop, OOP.

**Day 28: Simple To-Do List - Part 2 (Delete & Save)**
*   **Difficulty:** Hard
*   **Description:** Add functionality to the to-do list to delete a task by its number and to save the current list to a file.
*   **Expected Input:** (User commands) `delete 1`, `save`
*   **Expected Output:** The to-do list is updated and saved to `todos.txt`.
*   **Hints or Concepts to Practice:** File I/O (`FileWriter`), error handling.

**Day 29: Contact Book Application - Part 1**
*   **Difficulty:** Hard
*   **Description:** Begin a contact book application. Create a `Contact` class and use a `HashMap` to store contacts, with the name as the key. Implement add and search functionalities.
*   **Expected Input:** `add "John Doe" "123-456-7890"`, `search "John Doe"`
*   **Expected Output:** `Contact Found: John Doe - 123-456-7890`
*   **Hints or Concepts to Practice:** `HashMap`, OOP, console application structure.

**Day 30: Contact Book Application - Part 2**
*   **Difficulty:** Hard
*   **Description:** Complete the contact book application by adding functionality to delete a contact and to load/save the contact list from/to a file.
*   **Expected Input:** `delete "John Doe"`, `save`, `load`
*   **Expected Output:** Contacts are managed and persisted to a file.
*   **Hints or Concepts to Practice:** Final project, integrating all major concepts learned.