# Object-Oriented Programming (OOP) Concepts Guide

**Author:** Ron Jeremy Primavera (Jeremy-06)  
**Date:** 2025-10-24  
**Purpose:** Simple and easy-to-understand OOP concepts with practical examples

---

## Table of Contents
1. [Inheritance](#1-inheritance)
2. [Class Hierarchy](#2-class-hierarchy)
3. [Superclass / Subclass](#3-superclass--subclass)
4. [Overwriting (Method Overriding)](#4-overwriting-method-overriding)
5. [Polymorphism](#5-polymorphism)
6. [Encapsulation](#6-encapsulation)
7. [Abstraction](#7-abstraction)
8. [Interface](#8-interface)

---

## 1. INHERITANCE

### Definition
**Inheritance** allows a class to inherit properties and methods from another class. The child class gets all the features of the parent class and can add its own.

**Think of it as:** A child inheriting traits from their parents.

### Simple Example: Animals

```java
// Parent class
class Animal {
    String name;
    
    void eat() {
        System.out.println(name + " is eating");
    }
    
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Child class inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking: Woof!");
    }
}

// Child class inherits from Animal
class Cat extends Animal {
    void meow() {
        System.out.println(name + " is meowing: Meow!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.eat();    // Inherited from Animal
        myDog.sleep();  // Inherited from Animal
        myDog.bark();   // Dog's own method
        
        Cat myCat = new Cat();
        myCat.name = "Whiskers";
        myCat.eat();    // Inherited from Animal
        myCat.meow();   // Cat's own method
    }
}
```

**Output:**
```
Buddy is eating
Buddy is sleeping
Buddy is barking: Woof!
Whiskers is eating
Whiskers is meowing: Meow!
```

**✅ Key Point:** Dog and Cat both inherit `eat()` and `sleep()` from Animal, so we don't need to write those methods again!

---

## 2. CLASS HIERARCHY

### Definition
**Class Hierarchy** is the tree-like structure showing how classes are related through inheritance. Parent classes are at the top, child classes below.

**Think of it as:** A family tree.

### Simple Example: Shapes

```java
// Level 1: Most general
class Shape {
    String color;
    
    void display() {
        System.out.println("This is a " + color + " shape");
    }
}

// Level 2: More specific
class TwoDimensional extends Shape {
    void draw() {
        System.out.println("Drawing 2D shape");
    }
}

class ThreeDimensional extends Shape {
    void render() {
        System.out.println("Rendering 3D shape");
    }
}

// Level 3: Most specific
class Circle extends TwoDimensional {
    double radius;
    
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle area: " + area);
    }
}

class Square extends TwoDimensional {
    double side;
    
    void calculateArea() {
        double area = side * side;
        System.out.println("Square area: " + area);
    }
}

public class ClassHierarchyExample {
    public static void main(String[] args) {
        System.out.println("CLASS HIERARCHY:");
        System.out.println("Shape");
        System.out.println("├── TwoDimensional");
        System.out.println("│   ├── Circle");
        System.out.println("│   └── Square");
        System.out.println("└── ThreeDimensional");
        
        System.out.println("\nExample:");
        Circle c = new Circle();
        c.color = "red";
        c.radius = 5;
        c.display();       // From Shape (Level 1)
        c.draw();          // From TwoDimensional (Level 2)
        c.calculateArea(); // From Circle (Level 3)
    }
}
```

**Output:**
```
CLASS HIERARCHY:
Shape
├── TwoDimensional
│   ├── Circle
│   └── Square
└── ThreeDimensional

Example:
This is a red shape
Drawing 2D shape
Circle area: 78.5
```

**✅ Key Point:** Circle inherits from all levels above it (TwoDimensional and Shape).

---

## 3. SUPERCLASS / SUBCLASS

### Definition
- **Superclass (Parent):** The class that is inherited from
- **Subclass (Child):** The class that inherits

**Think of it as:** Teacher (superclass) and Student (subclass) - student learns from teacher.

### Simple Example: Phones

```java
// SUPERCLASS
class Phone {
    String brand;
    String model;
    
    void call(String number) {
        System.out.println("Calling " + number + "...");
    }
    
    void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

// SUBCLASS
class Smartphone extends Phone {
    int cameraMP;
    
    void takePhoto() {
        System.out.println("Taking photo with " + cameraMP + "MP camera");
    }
    
    void browseInternet() {
        System.out.println("Browsing the internet...");
    }
}

public class SuperSubclassExample {
    public static void main(String[] args) {
        // Using Smartphone (subclass)
        Smartphone myPhone = new Smartphone();
        myPhone.brand = "Samsung";
        myPhone.model = "Galaxy S24";
        myPhone.cameraMP = 108;
        
        // Methods from SUPERCLASS
        myPhone.showInfo();
        myPhone.call("123-456-7890");
        
        // Methods from SUBCLASS
        myPhone.takePhoto();
        myPhone.browseInternet();
    }
}
```

**Output:**
```
Brand: Samsung
Model: Galaxy S24
Calling 123-456-7890...
Taking photo with 108MP camera
Browsing the internet...
```

**✅ Key Point:** Smartphone has everything Phone has, PLUS its own special features.

---

## 4. OVERWRITING (Method Overriding)

### Definition
**Method Overriding** is when a child class creates its own version of a method that already exists in the parent class. Same method name, different behavior.

**Think of it as:** A cover song - same song name, different artist, different style.

### Simple Example: Transportation

```java
class Vehicle {
    String name;
    
    void move() {
        System.out.println(name + " is moving");
    }
    
    void describe() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    @Override  // This tells Java we're overriding
    void move() {
        System.out.println(name + " is driving on the road 🚗");
    }
    
    @Override
    void describe() {
        System.out.println("This is a car with 4 wheels");
    }
}

class Boat extends Vehicle {
    @Override
    void move() {
        System.out.println(name + " is sailing on water ⛵");
    }
    
    @Override
    void describe() {
        System.out.println("This is a boat that floats");
    }
}

class Plane extends Vehicle {
    @Override
    void move() {
        System.out.println(name + " is flying in the sky ✈️");
    }
    
    @Override
    void describe() {
        System.out.println("This is a plane with wings");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Toyota";
        car.move();
        car.describe();
        
        System.out.println();
        
        Boat boat = new Boat();
        boat.name = "Titanic";
        boat.move();
        boat.describe();
        
        System.out.println();
        
        Plane plane = new Plane();
        plane.name = "Boeing 747";
        plane.move();
        plane.describe();
    }
}
```

**Output:**
```
Toyota is driving on the road 🚗
This is a car with 4 wheels

Titanic is sailing on water ⛵
This is a boat that floats

Boeing 747 is flying in the sky ✈️
This is a plane with wings
```

**✅ Key Point:** Same method name `move()`, but each class has its own version!

---

## 5. POLYMORPHISM

### Definition
**Polymorphism** means "many forms." One method name can do different things depending on the object. You can treat different objects the same way, but they behave differently.

**Think of it as:** A remote control - same "power" button works on TV, fan, or AC, but each does something different.

### Simple Example: Musical Instruments

```java
class Instrument {
    String name;
    
    void play() {
        System.out.println("Playing instrument");
    }
}

class Guitar extends Instrument {
    @Override
    void play() {
        System.out.println("🎸 Strumming guitar: *strum strum*");
    }
}

class Piano extends Instrument {
    @Override
    void play() {
        System.out.println("🎹 Playing piano: *ding ding ding*");
    }
}

class Drums extends Instrument {
    @Override
    void play() {
        System.out.println("🥁 Hitting drums: *boom boom boom*");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // POLYMORPHISM: Same type (Instrument), different objects
        Instrument instrument1 = new Guitar();
        Instrument instrument2 = new Piano();
        Instrument instrument3 = new Drums();
        
        // Same method call, different results!
        instrument1.play();
        instrument2.play();
        instrument3.play();
        
        System.out.println("\nUsing an array:");
        Instrument[] band = {new Guitar(), new Piano(), new Drums()};
        
        // Same loop, different behaviors
        for (Instrument inst : band) {
            inst.play();
        }
    }
}
```

**Output:**
```
🎸 Strumming guitar: *strum strum*
🎹 Playing piano: *ding ding ding*
🥁 Hitting drums: *boom boom boom*

Using an array:
🎸 Strumming guitar: *strum strum*
🎹 Playing piano: *ding ding ding*
🥁 Hitting drums: *boom boom boom*
```

**✅ Key Point:** We call `play()` the same way for all instruments, but each produces its own sound!

---

## 6. ENCAPSULATION

### Definition
**Encapsulation** means hiding data inside a class and controlling access to it. Make variables `private` and use `public` methods (getters/setters) to access them.

**Think of it as:** A capsule/pill - the medicine is protected inside, you can't touch it directly.

### Simple Example: Person

```java
class Person {
    // Private variables - cannot be accessed directly from outside
    private String name;
    private int age;
    private String password;
    
    // Constructor
    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
    
    // PUBLIC method to get name (Getter)
    public String getName() {
        return name;
    }
    
    // PUBLIC method to set name (Setter with validation)
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
            System.out.println("✅ Name changed to: " + name);
        } else {
            System.out.println("❌ Invalid name!");
        }
    }
    
    // PUBLIC method to get age
    public int getAge() {
        return age;
    }
    
    // PUBLIC method to set age (with validation)
    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
            System.out.println("✅ Age updated to: " + age);
        } else {
            System.out.println("❌ Invalid age!");
        }
    }
    
    // PUBLIC method to verify password (NOT showing the actual password)
    public boolean checkPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }
    
    // NO getter for password - it's secret!
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Password: ******** (hidden)");
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Person person = new Person("Jeremy", 21, "secret123");
        
        // ❌ CANNOT do this (private variables):
        // person.name = "Hacker";  // Compiler error!
        // person.password = "123"; // Compiler error!
        
        // ✅ CAN do this (public methods):
        person.displayInfo();
        
        System.out.println("\nTrying to change name:");
        person.setName("Ron Jeremy");
        person.setName("");  // This will fail validation
        
        System.out.println("\nTrying to change age:");
        person.setAge(22);
        person.setAge(200);  // This will fail validation
        
        System.out.println("\nChecking password:");
        System.out.println("Password 'wrong': " + person.checkPassword("wrong"));
        System.out.println("Password 'secret123': " + person.checkPassword("secret123"));
        
        System.out.println("\nFinal info:");
        person.displayInfo();
    }
}
```

**Output:**
```
Name: Jeremy
Age: 21
Password: ******** (hidden)

Trying to change name:
✅ Name changed to: Ron Jeremy
❌ Invalid name!

Trying to change age:
✅ Age updated to: 22
❌ Invalid age!

Checking password:
Password 'wrong': false
Password 'secret123': true

Final info:
Name: Ron Jeremy
Age: 22
Password: ******** (hidden)
```

**✅ Key Point:** Data is protected. You can only change it through controlled methods that validate the input!

---

## 7. ABSTRACTION

### Definition
**Abstraction** means showing only what's necessary and hiding the complex details. Abstract classes cannot be created directly - they're templates for other classes.

**Think of it as:** A car - you know how to drive (gas, brake, steering), but you don't need to know how the engine works internally.

### Simple Example: Employee Salary System

```java
// ABSTRACT class - cannot create objects from this
abstract class Employee {
    String name;
    int id;
    
    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    // ABSTRACT method - no implementation here
    // Each employee type must define their own salary calculation
    abstract double calculateSalary();
    
    // Concrete method - same for all employees
    void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + calculateSalary());
    }
}

// Concrete class 1
class FullTimeEmployee extends Employee {
    double monthlySalary;
    
    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    
    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

// Concrete class 2
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;
    
    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Concrete class 3
class Freelancer extends Employee {
    double projectRate;
    int projectsCompleted;
    
    public Freelancer(String name, int id, double projectRate, int projectsCompleted) {
        super(name, id);
        this.projectRate = projectRate;
        this.projectsCompleted = projectsCompleted;
    }
    
    @Override
    double calculateSalary() {
        return projectRate * projectsCompleted;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // ❌ CANNOT do this:
        // Employee emp = new Employee("John", 1); // Error! Abstract class
        
        // ✅ CAN do this:
        FullTimeEmployee emp1 = new FullTimeEmployee("Alice", 101, 5000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Bob", 102, 20, 80);
        Freelancer emp3 = new Freelancer("Charlie", 103, 500, 4);
        
        System.out.println("FULL-TIME EMPLOYEE:");
        emp1.displayInfo();
        
        System.out.println("\nPART-TIME EMPLOYEE:");
        emp2.displayInfo();
        
        System.out.println("\nFREELANCER:");
        emp3.displayInfo();
    }
}
```

**Output:**
```
FULL-TIME EMPLOYEE:
ID: 101
Name: Alice
Salary: $5000.0

PART-TIME EMPLOYEE:
ID: 102
Name: Bob
Salary: $1600.0

FREELANCER:
ID: 103
Name: Charlie
Salary: $2000.0
```

**✅ Key Point:** We use `calculateSalary()` without knowing HOW each employee type calculates it. That's abstraction!

---

## 8. INTERFACE

### Definition
An **Interface** is a contract that says "any class that implements me MUST have these methods." It's like a blueprint. A class can implement multiple interfaces.

**Think of it as:** A job description - it lists what skills you need, but not how you learned them.

### Simple Example: Devices

```java
// INTERFACE 1
interface Chargeable {
    void charge();
    int getBatteryLevel();
}

// INTERFACE 2
interface Portable {
    double getWeight();
    void carry();
}

// Class implementing ONE interface
class Laptop implements Chargeable {
    int battery = 50;
    
    @Override
    public void charge() {
        battery = 100;
        System.out.println("💻 Laptop charging... Battery: " + battery + "%");
    }
    
    @Override
    public int getBatteryLevel() {
        return battery;
    }
}

// Class implementing TWO interfaces
class Smartphone implements Chargeable, Portable {
    int battery = 30;
    double weight = 0.2; // kg
    
    @Override
    public void charge() {
        battery = 100;
        System.out.println("📱 Smartphone charging... Battery: " + battery + "%");
    }
    
    @Override
    public int getBatteryLevel() {
        return battery;
    }
    
    @Override
    public double getWeight() {
        return weight;
    }
    
    @Override
    public void carry() {
        System.out.println("📱 Carrying smartphone in pocket (" + weight + " kg)");
    }
}

// Class implementing TWO interfaces
class Tablet implements Chargeable, Portable {
    int battery = 75;
    double weight = 0.5; // kg
    
    @Override
    public void charge() {
        battery = 100;
        System.out.println("📱 Tablet charging... Battery: " + battery + "%");
    }
    
    @Override
    public int getBatteryLevel() {
        return battery;
    }
    
    @Override
    public double getWeight() {
        return weight;
    }
    
    @Override
    public void carry() {
        System.out.println("📱 Carrying tablet in bag (" + weight + " kg)");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Smartphone phone = new Smartphone();
        Tablet tablet = new Tablet();
        
        // All are Chargeable
        System.out.println("CHARGING ALL DEVICES:");
        laptop.charge();
        phone.charge();
        tablet.charge();
        
        System.out.println("\nCARRYING PORTABLE DEVICES:");
        // laptop.carry(); // Error! Laptop is not Portable
        phone.carry();
        tablet.carry();
        
        System.out.println("\nBATTERY LEVELS:");
        System.out.println("Laptop: " + laptop.getBatteryLevel() + "%");
        System.out.println("Phone: " + phone.getBatteryLevel() + "%");
        System.out.println("Tablet: " + tablet.getBatteryLevel() + "%");
    }
}
```

**Output:**
```
CHARGING ALL DEVICES:
💻 Laptop charging... Battery: 100%
📱 Smartphone charging... Battery: 100%
📱 Tablet charging... Battery: 100%

CARRYING PORTABLE DEVICES:
📱 Carrying smartphone in pocket (0.2 kg)
📱 Carrying tablet in bag (0.5 kg)

BATTERY LEVELS:
Laptop: 100%
Phone: 100%
Tablet: 100%
```

**✅ Key Point:** Interfaces define WHAT methods a class must have. A class can implement multiple interfaces!

---

## Quick Summary Table

| Concept | Simple Explanation | Example |
|---------|-------------------|---------|
| **Inheritance** | Child gets parent's features | Dog inherits from Animal |
| **Class Hierarchy** | Family tree of classes | Shape → 2D → Circle |
| **Superclass/Subclass** | Parent and child relationship | Phone (parent), Smartphone (child) |
| **Method Overriding** | Child creates own version of parent's method | Car, Boat, Plane all override `move()` |
| **Polymorphism** | Same action, different behaviors | All instruments `play()` differently |
| **Encapsulation** | Hide and protect data | Private variables with getters/setters |
| **Abstraction** | Hide complexity, show only essentials | Abstract Employee with different salary calculations |
| **Interface** | Contract of required methods | Chargeable devices must have `charge()` |

---

## Benefits of OOP

✅ **Code Reusability** - Write once, use many times  
✅ **Organization** - Code is structured and easy to understand  
✅ **Security** - Data is protected through encapsulation  
✅ **Flexibility** - Easy to modify and extend  
✅ **Maintenance** - Easier to fix bugs and add features  

---

**End of Guide** 🎉