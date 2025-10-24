# Object-Oriented Programming Concepts: Complete Guide with Unique Examples

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

### Detailed Definition
**Inheritance** is a fundamental OOP mechanism that allows a new class (called a child class, derived class, or subclass) to acquire properties (fields/attributes) and behaviors (methods) from an existing class (called a parent class, base class, or superclass). This promotes code reusability and establishes an "IS-A" relationship between classes.

**Key Points:**
- The child class inherits all non-private members from the parent class
- Child classes can add their own unique fields and methods
- Supports code reusability and logical hierarchies
- Uses the `extends` keyword in Java
- Single inheritance (Java) vs. multiple inheritance (C++)

### Simple Unique Program: Coffee Shop Beverages

```java
// Parent class containing common beverage properties
class Beverage {
    protected String name;
    protected double basePrice;
    protected int temperature; // in Celsius
    
    // Constructor
    public Beverage(String name, double basePrice, int temperature) {
        this.name = name;
        this.basePrice = basePrice;
        this.temperature = temperature;
    }
    
    // Method to display beverage information
    public void displayInfo() {
        System.out.println("Beverage: " + name);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Temperature: " + temperature + "°C");
    }
    
    // Method to prepare the beverage
    public void prepare() {
        System.out.println("Preparing " + name + "...");
    }
}

// Child class inheriting from Beverage
class Coffee extends Beverage {
    private String roastType;
    private boolean hasMilk;
    
    // Constructor
    public Coffee(String name, double basePrice, String roastType, boolean hasMilk) {
        // Call parent constructor using super()
        super(name, basePrice, 85); // Coffee is typically 85°C
        this.roastType = roastType;
        this.hasMilk = hasMilk;
    }
    
    // Coffee-specific method
    public void addShot() {
        System.out.println("Adding extra espresso shot to " + name);
        basePrice += 0.75;
    }
    
    // Display coffee details (uses inherited fields)
    public void displayCoffeeDetails() {
        displayInfo(); // Calling inherited method
        System.out.println("Roast Type: " + roastType);
        System.out.println("Has Milk: " + (hasMilk ? "Yes" : "No"));
    }
}

// Another child class inheriting from Beverage
class Smoothie extends Beverage {
    private String[] fruits;
    private boolean hasProtein;
    
    public Smoothie(String name, double basePrice, String[] fruits, boolean hasProtein) {
        super(name, basePrice, 4); // Smoothies are cold, around 4°C
        this.fruits = fruits;
        this.hasProtein = hasProtein;
    }
    
    // Smoothie-specific method
    public void blend() {
        System.out.println("Blending " + name + " with: " + String.join(", ", fruits));
    }
    
    public void displaySmoothieDetails() {
        displayInfo(); // Calling inherited method
        System.out.println("Fruits: " + String.join(", ", fruits));
        System.out.println("Protein Added: " + (hasProtein ? "Yes" : "No"));
    }
}

// Main class to demonstrate inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        System.out.println("=== INHERITANCE DEMONSTRATION ===\n");
        
        // Create a Coffee object (child class)
        Coffee latte = new Coffee("Caramel Latte", 4.50, "Medium", true);
        latte.displayCoffeeDetails();
        latte.addShot();
        latte.prepare(); // Using inherited method
        
        System.out.println("\n" + "-".repeat(40) + "\n");
        
        // Create a Smoothie object (child class)
        Smoothie berryBlast = new Smoothie("Berry Blast", 5.25, 
            new String[]{"Strawberry", "Blueberry", "Banana"}, true);
        berryBlast.displaySmoothieDetails();
        berryBlast.blend();
        berryBlast.prepare(); // Using inherited method
        
        System.out.println("\n✅ Both Coffee and Smoothie inherited from Beverage!");
    }
}
```

---

## 2. CLASS HIERARCHY

### Detailed Definition
**Class Hierarchy** is the organizational structure of classes arranged in a tree-like pattern, showing the inheritance relationships from the most general (abstract) classes at the top to the most specific (concrete) classes at the bottom. It represents the "family tree" of classes where each level inherits characteristics from the level above it.

**Key Points:**
- Shows parent-child relationships visually
- Top level: most general/abstract classes
- Bottom level: most specific/concrete classes
- Multiple levels of inheritance create deeper hierarchies
- Helps in understanding system architecture

### Simple Unique Program: Vehicle Classification System

```java
// ROOT LEVEL - Most general class
class Vehicle {
    protected String registrationNumber;
    protected int yearManufactured;
    
    public Vehicle(String registrationNumber, int yearManufactured) {
        this.registrationNumber = registrationNumber;
        this.yearManufactured = yearManufactured;
    }
    
    public void displayBasicInfo() {
        System.out.println("Registration: " + registrationNumber);
        System.out.println("Year: " + yearManufactured);
    }
}

// LEVEL 2 - More specific categories
class LandVehicle extends Vehicle {
    protected int numberOfWheels;
    
    public LandVehicle(String registrationNumber, int yearManufactured, int numberOfWheels) {
        super(registrationNumber, yearManufactured);
        this.numberOfWheels = numberOfWheels;
    }
    
    public void drive() {
        System.out.println("Driving on " + numberOfWheels + " wheels");
    }
}

class WaterVehicle extends Vehicle {
    protected String hullType;
    
    public WaterVehicle(String registrationNumber, int yearManufactured, String hullType) {
        super(registrationNumber, yearManufactured);
        this.hullType = hullType;
    }
    
    public void sail() {
        System.out.println("Sailing with " + hullType + " hull");
    }
}

// LEVEL 3 - Even more specific
class Motorcycle extends LandVehicle {
    private String handlebarType;
    
    public Motorcycle(String registrationNumber, int yearManufactured, String handlebarType) {
        super(registrationNumber, yearManufactured, 2);
        this.handlebarType = handlebarType;
    }
    
    public void wheelie() {
        System.out.println("Performing wheelie with " + handlebarType + " handlebars!");
    }
}

class Truck extends LandVehicle {
    private double cargoCapacity; // in tons
    
    public Truck(String registrationNumber, int yearManufactured, double cargoCapacity) {
        super(registrationNumber, yearManufactured, 18);
        this.cargoCapacity = cargoCapacity;
    }
    
    public void loadCargo() {
        System.out.println("Loading cargo (Capacity: " + cargoCapacity + " tons)");
    }
}

// Main demonstration class
public class ClassHierarchyExample {
    public static void main(String[] args) {
        System.out.println("=== CLASS HIERARCHY DEMONSTRATION ===\n");
        
        System.out.println("CLASS HIERARCHY STRUCTURE:");
        System.out.println("Vehicle (ROOT)");
        System.out.println("├── LandVehicle");
        System.out.println("│   ├── Motorcycle");
        System.out.println("│   └── Truck");
        System.out.println("└── WaterVehicle");
        
        System.out.println("\n✅ Each class inherits from all levels above it!");
    }
}
```

---

## 3. SUPERCLASS / SUBCLASS

### Detailed Definition
A **Superclass** (also called parent class or base class) is a class that provides common attributes and methods to other classes. A **Subclass** (also called child class or derived class) is a class that inherits these attributes and methods from the superclass and can extend or modify them.

**Key Points:**
- **Superclass**: Contains general/common features shared by multiple classes
- **Subclass**: Contains specific features while inheriting common ones
- Relationship: "Subclass IS-A type of Superclass"
- Subclass can access superclass members (except private ones)
- Use `super` keyword to reference superclass members
- Subclass can have its own unique members in addition to inherited ones

### Simple Unique Program: Smart Home Devices

```java
// SUPERCLASS - Defines common features for all smart devices
class SmartDevice {
    protected String deviceName;
    protected String manufacturer;
    protected boolean isPoweredOn;
    protected int batteryLevel;
    
    public SmartDevice(String deviceName, String manufacturer) {
        this.deviceName = deviceName;
        this.manufacturer = manufacturer;
        this.isPoweredOn = false;
        this.batteryLevel = 100;
    }
    
    public void powerOn() {
        isPoweredOn = true;
        System.out.println("[" + deviceName + "] Device powered ON");
    }
    
    public void powerOff() {
        isPoweredOn = false;
        System.out.println("[" + deviceName + "] Device powered OFF");
    }
    
    public void checkBattery() {
        System.out.println("[" + deviceName + "] Battery Level: " + batteryLevel + "%");
    }
}

// SUBCLASS - Smart Thermostat
class SmartThermostat extends SmartDevice {
    private int targetTemperature;
    private int currentTemperature;
    
    public SmartThermostat(String deviceName, String manufacturer, int currentTemp) {
        super(deviceName, manufacturer);
        this.currentTemperature = currentTemp;
        this.targetTemperature = 22;
    }
    
    public void setTemperature(int temperature) {
        this.targetTemperature = temperature;
        System.out.println("[" + deviceName + "] Target temperature set to: " + temperature + "°C");
    }
}

public class SuperSubclassExample {
    public static void main(String[] args) {
        SmartThermostat thermostat = new SmartThermostat("Living Room Thermostat", "NestTech", 18);
        thermostat.powerOn();           // Inherited from SUPERCLASS
        thermostat.setTemperature(24);  // Unique to SUBCLASS
        thermostat.checkBattery();      // Inherited from SUPERCLASS
    }
}
```

---

## 4. OVERWRITING (Method Overriding)

### Detailed Definition
**Method Overriding** occurs when a subclass provides its own specific implementation of a method that is already defined in its superclass. The overridden method must have the same name, same parameters, and same or compatible return type.

**Key Points:**
- The subclass method replaces the superclass method
- Same method signature required
- Uses `@Override` annotation in Java
- Enables runtime polymorphism
- Can call superclass method using `super.methodName()`

### Simple Unique Program: Package Delivery Service

```java
// Superclass
class Package {
    protected String packageID;
    protected double weight;
    protected String destination;
    
    public Package(String packageID, double weight, String destination) {
        this.packageID = packageID;
        this.weight = weight;
        this.destination = destination;
    }
    
    public double calculateDeliveryCost() {
        return 10.0 + (weight * 2.0);
    }
    
    public String getEstimatedDeliveryTime() {
        return "3-5 business days";
    }
}

// Subclass - OVERRIDES methods
class ExpressPackage extends Package {
    private boolean requiresSignature;
    
    public ExpressPackage(String packageID, double weight, String destination, boolean requiresSignature) {
        super(packageID, weight, destination);
        this.requiresSignature = requiresSignature;
    }
    
    @Override
    public double calculateDeliveryCost() {
        double cost = super.calculateDeliveryCost();
        cost = cost * 2.5; // Express is 2.5x more expensive
        if (requiresSignature) {
            cost += 5.0;
        }
        return cost;
    }
    
    @Override
    public String getEstimatedDeliveryTime() {
        return "Next day delivery ⚡";
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Package standard = new Package("PKG-001", 5.0, "New York");
        ExpressPackage express = new ExpressPackage("EXP-002", 5.0, "LA", true);
        
        System.out.println("Standard cost: $" + standard.calculateDeliveryCost());
        System.out.println("Express cost: $" + express.calculateDeliveryCost());
    }
}
```

---

## 5. POLYMORPHISM

### Detailed Definition
**Polymorphism** means "many forms" - the ability of objects of different classes to be treated as objects of a common superclass, while each responds to the same method call in its own unique way.

**Key Points:**
- **Compile-time**: Method overloading
- **Runtime**: Method overriding
- Parent reference can hold child objects
- Enables flexible and maintainable code
- Actual method determined at runtime

### Simple Unique Program: Music Streaming Service

```java
// Superclass
class MediaContent {
    protected String title;
    protected String creator;
    
    public MediaContent(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }
    
    public void play() {
        System.out.println("Playing: " + title);
    }
}

class Song extends MediaContent {
    private String genre;
    
    public Song(String title, String artist, String genre) {
        super(title, artist);
        this.genre = genre;
    }
    
    @Override
    public void play() {
        System.out.println("🎵 Playing Song: " + title + " by " + creator);
    }
}

class Podcast extends MediaContent {
    private int episodeNumber;
    
    public Podcast(String title, String host, int episodeNumber) {
        super(title, host);
        this.episodeNumber = episodeNumber;
    }
    
    @Override
    public void play() {
        System.out.println("🎙️  Playing Podcast: " + title + " - Episode " + episodeNumber);
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // POLYMORPHISM - Array of parent type holding different child objects
        MediaContent[] playlist = new MediaContent[2];
        playlist[0] = new Song("Bohemian Rhapsody", "Queen", "Rock");
        playlist[1] = new Podcast("Tech Talk", "Sarah", 42);
        
        // Same method call, different behaviors
        for (MediaContent media : playlist) {
            media.play(); // Polymorphic call
        }
    }
}
```

---

## 6. ENCAPSULATION

### Detailed Definition
**Encapsulation** is bundling data and methods within a single unit (class) while restricting direct access to some components. Achieved by making fields private and providing public getter/setter methods.

**Key Points:**
- **Data Hiding**: Internal details hidden
- **Access Modifiers**: private, protected, public
- **Getters/Setters**: Controlled access
- **Validation**: Control data modification
- **Security**: Prevents unauthorized access

### Simple Unique Program: Bank Account System

```java
class BankAccount {
    // ENCAPSULATION: Private fields
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String pin;
    
    public BankAccount(String accountNumber, String accountHolderName, String pin, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.pin = pin;
        this.balance = initialDeposit;
    }
    
    // Public getter - controlled access
    public double getBalance() {
        return balance;
    }
    
    // Public method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposited: $" + amount);
        } else {
            System.out.println("❌ Invalid amount");
        }
    }
    
    // Method with authentication
    public void withdraw(String pin, double amount) {
        if (!this.pin.equals(pin)) {
            System.out.println("❌ Incorrect PIN");
            return;
        }
        
        if (amount > balance) {
            System.out.println("❌ Insufficient funds");
            return;
        }
        
        balance -= amount;
        System.out.println("✅ Withdrawn: $" + amount);
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC123", "Jeremy-06", "1234", 500.0);
        
        // ❌ CANNOT do: account.balance = 9999999; (private field)
        // ✅ CAN do: 
        account.deposit(200);
        account.withdraw("1234", 100);
        System.out.println("Balance: $" + account.getBalance());
    }
}
```

---

## 7. ABSTRACTION

### Detailed Definition
**Abstraction** hides complex implementation details and shows only essential features. Abstract classes cannot be instantiated and may contain abstract methods that subclasses must implement.

**Key Points:**
- **Abstract Class**: Cannot be instantiated
- **Abstract Methods**: No implementation in abstract class
- Focuses on *what* rather than *how*
- Forces subclasses to provide implementations
- Uses `abstract` keyword

### Simple Unique Program: Payment Processing System

```java
// ABSTRACTION: Abstract class
abstract class Payment {
    protected String paymentID;
    protected double amount;
    
    public Payment(String paymentID, double amount) {
        this.paymentID = paymentID;
        this.amount = amount;
    }
    
    // Abstract methods - must be implemented by subclasses
    public abstract boolean processPayment();
    public abstract String getTransactionID();
    
    // Concrete method
    public void displayInfo() {
        System.out.println("Payment ID: " + paymentID);
        System.out.println("Amount: $" + amount);
    }
}

class CreditCardPayment extends Payment {
    private String cardNumber;
    
    public CreditCardPayment(String paymentID, double amount, String cardNumber) {
        super(paymentID, amount);
        this.cardNumber = cardNumber;
    }
    
    @Override
    public boolean processPayment() {
        System.out.println("💳 Processing credit card payment...");
        // Complex payment logic hidden
        return true;
    }
    
    @Override
    public String getTransactionID() {
        return "CC-" + paymentID + "-" + System.currentTimeMillis();
    }
}

class PayPalPayment extends Payment {
    private String email;
    
    public PayPalPayment(String paymentID, double amount, String email) {
        super(paymentID, amount);
        this.email = email;
    }
    
    @Override
    public boolean processPayment() {
        System.out.println("🅿️  Processing PayPal payment...");
        return true;
    }
    
    @Override
    public String getTransactionID() {
        return "PP-" + paymentID + "-" + System.currentTimeMillis();
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // ❌ CANNOT do: Payment p = new Payment("P1", 100); (abstract class)
        
        // ✅ CAN do:
        Payment payment1 = new CreditCardPayment("P001", 150.0, "1234-5678-9012-3456");
        Payment payment2 = new PayPalPayment("P002", 75.0, "user@email.com");
        
        payment1.processPayment();
        System.out.println("Transaction ID: " + payment1.getTransactionID());
        
        payment2.processPayment();
        System.out.println("Transaction ID: " + payment2.getTransactionID());
    }
}
```

---

## 8. INTERFACE

### Detailed Definition
An **Interface** is a contract that defines method signatures without implementation. Classes that implement an interface must provide concrete implementations of all its methods. It represents pure abstraction.

**Key Points:**
- Pure abstraction (traditionally)
- All methods are public and abstract (Java 7)
- Can have default/static methods (Java 8+)
- Class can implement multiple interfaces
- Uses `implements` keyword
- Defines "CAN-DO" relationship

### Simple Unique Program: Smart Device Control System

```java
// INTERFACE: Defines contract for controllable devices
interface Controllable {
    void turnOn();
    void turnOff();
    boolean isOn();
}

// INTERFACE: Defines contract for dimmable devices
interface Dimmable {
    void setBrightness(int level);
    int getBrightness();
}

// Class implementing ONE interface
class Fan implements Controllable {
    private boolean isOn;
    private int speed;
    
    public Fan() {
        this.isOn = false;
        this.speed = 0;
    }
    
    @Override
    public void turnOn() {
        isOn = true;
        speed = 1;
        System.out.println("💨 Fan turned ON");
    }
    
    @Override
    public void turnOff() {
        isOn = false;
        speed = 0;
        System.out.println("💨 Fan turned OFF");
    }
    
    @Override
    public boolean isOn() {
        return isOn;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("💨 Fan speed set to: " + speed);
    }
}

// Class implementing MULTIPLE interfaces
class SmartBulb implements Controllable, Dimmable {
    private boolean isOn;
    private int brightness;
    
    public SmartBulb() {
        this.isOn = false;
        this.brightness = 0;
    }
    
    @Override
    public void turnOn() {
        isOn = true;
        brightness = 100;
        System.out.println("💡 Smart Bulb turned ON");
    }
    
    @Override
    public void turnOff() {
        isOn = false;
        brightness = 0;
        System.out.println("💡 Smart Bulb turned OFF");
    }
    
    @Override
    public boolean isOn() {
        return isOn;
    }
    
    @Override
    public void setBrightness(int level) {
        if (isOn && level >= 0 && level <= 100) {
            this.brightness = level;
            System.out.println("💡 Brightness set to: " + level + "%");
        } else {
            System.out.println("❌ Cannot set brightness (device off or invalid level)");
        }
    }
    
    @Override
    public int getBrightness() {
        return brightness;
    }
}

// Remote control that works with any Controllable device
class RemoteControl {
    public void operate(Controllable device) {
        if (!device.isOn()) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        System.out.println("=== INTERFACE DEMONSTRATION ===\n");
        
        // Create devices
        Fan ceilingFan = new Fan();
        SmartBulb livingRoomBulb = new SmartBulb();
        
        // Remote control works with any Controllable device
        RemoteControl remote = new RemoteControl();
        
        System.out.println("Using remote with Fan:");
        remote.operate(ceilingFan);
        
        System.out.println("\nUsing remote with Smart Bulb:");
        remote.operate(livingRoomBulb);
        
        // Smart bulb has additional dimmable functionality
        System.out.println("\nUsing dimming feature:");
        livingRoomBulb.setBrightness(50);
        
        System.out.println("\n✅ Interface allows different classes to share common behavior!");
        System.out.println("✅ Classes can implement multiple interfaces!");
    }
}
```

---

## Summary

| Concept | Description | Key Benefit |
|---------|-------------|-------------|
| **Inheritance** | Child class inherits from parent | Code reusability |
| **Class Hierarchy** | Tree structure of classes | Organization |
| **Superclass/Subclass** | Parent-child relationship | Specialization |
| **Overriding** | Subclass replaces parent method | Customization |
| **Polymorphism** | Same interface, different forms | Flexibility |
| **Encapsulation** | Hide data, controlled access | Security |
| **Abstraction** | Hide complexity, show essentials | Simplicity |
| **Interface** | Contract for implementation | Standardization |

---

**Created by:** Jeremy-06  
**Date:** 2025-10-24  
**Purpose:** Comprehensive OOP concepts guide with unique, practical examples