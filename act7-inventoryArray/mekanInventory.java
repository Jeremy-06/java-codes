import java.util.Scanner;

// Item class to represent lab equipment
class Item {
    private String name;
    private int totalQuantity;
    private int availableQuantity;
    
    public Item(String name, int quantity) {
        this.name = name;
        this.totalQuantity = quantity;
        this.availableQuantity = quantity;
    }
    
    public String getName() { return name; }
    public int getTotalQuantity() { return totalQuantity; }
    public int getAvailableQuantity() { return availableQuantity; }
    
    public void setName(String name) { this.name = name; }
    public void setTotalQuantity(int quantity) { 
        this.totalQuantity = quantity;
        if (availableQuantity > totalQuantity) {
            availableQuantity = totalQuantity;
        }
    }
    
    public boolean borrowItem(int quantity) {
        if (quantity <= 0) {
            System.out.println("Error: Quantity must be positive!");
            return false;
        }
        if (quantity > availableQuantity) {
            System.out.println("Error: Not enough items available! (Available: " + availableQuantity + ")");
            return false;
        }
        availableQuantity -= quantity;
        return true;
    }
    
    public boolean returnItem(int quantity) {
        if (quantity <= 0) {
            System.out.println("Error: Quantity must be positive!");
            return false;
        }
        if (availableQuantity + quantity > totalQuantity) {
            System.out.println("Error: Cannot return more than borrowed! (Max returnable: " + (totalQuantity - availableQuantity) + ")");
            return false;
        }
        availableQuantity += quantity;
        return true;
    }
}

// Borrower class to track who borrowed what
class Borrower {
    private String id;
    private String itemName;
    private int quantityBorrowed;
    
    public Borrower(String id, String itemName, int quantity) {
        this.id = id;
        this.itemName = itemName;
        this.quantityBorrowed = quantity;
    }
    
    public String getId() { return id; }
    public String getItemName() { return itemName; }
    public int getQuantityBorrowed() { return quantityBorrowed; }
    
    public void reduceQuantity(int amount) {
        quantityBorrowed -= amount;
    }
}

public class mekanInventory {
    private static final int MAX_ITEMS = 100;
    private static final int MAX_BORROWERS = 200;
    
    private static Item[] items = new Item[MAX_ITEMS];
    private static int itemCount = 0;
    
    private static Borrower[] borrowers = new Borrower[MAX_BORROWERS];
    private static int borrowerCount = 0;
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("\n═══════════════════════════════════════════");
        System.out.println("    WELCOME TO MEKANINVENTORY SYSTEM <3");
        System.out.println("═══════════════════════════════════════════");
        initializeItems();
        
        while (true) {
            try {
                displayMainMenu();
                int choice = getIntInput("Enter your choice: ");
                
                switch (choice) {
                    case 1: viewAllItems(); break;
                    case 2: borrowItem(); break;
                    case 3: returnItem(); break;
                    case 4: modifyMenu(); break;
                    case 5: viewBorrowers(); break;
                    case 6: 
                        System.out.println("\n Thank you for using MekanInventory Lab Equipment System!");
                        return;
                    default: 
                        System.out.println("Error: Invalid choice! Please enter 1-6.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); // Clear buffer
            }
        }
    }
    
    private static void initializeItems() {
        // General Measurement & Testing Tools
        addItem("Vernier Caliper", 20);
        addItem("Micrometer Screw Gauge", 15);
        addItem("Dial Indicator", 10);
        addItem("Steel Rule / Measuring Tape", 25);
        addItem("Bevel Protractor", 10);
        
        // Material Testing Equipment
        addItem("Universal Testing Machine (UTM)", 2);
        addItem("Hardness Tester (Rockwell)", 1);
        addItem("Hardness Tester (Brinell)", 1);
        addItem("Impact Testing Machine (Charpy/Izod)", 1);
        addItem("Fatigue Testing Machine", 1);
        addItem("Torsion Testing Machine", 1);
        
        // Thermal & Fluid Laboratory
        addItem("Thermocouple / Digital Thermometer", 10);
        addItem("Manometer", 8);
        addItem("Flow Meter (Venturi/Orifice/Rotameter)", 3);
        addItem("Heat Exchanger Apparatus", 1);
        addItem("Reynolds Apparatus", 1);
        
        // Workshop / Fabrication Tools
        addItem("Drilling Machine", 3);
        addItem("Lathe Machine", 6);
        addItem("Milling Machine", 3);
        addItem("Grinding Machine", 2);
        addItem("Welding Machine (Arc/MIG/TIG)", 4);
        
        // Other Common Lab Items
        addItem("Stopwatch", 20);
        addItem("Weighing Scale", 5);
        addItem("Clamps & Stands", 15);
        addItem("Bench Vise", 10);
        addItem("Safety Gear (Goggles, Gloves, Helmets)", 40);
    }
    
    private static void addItem(String name, int quantity) {
        if (itemCount >= MAX_ITEMS) {
            System.out.println("Error: Cannot add more items. Maximum capacity reached!");
            return;
        }
        items[itemCount++] = new Item(name, quantity);
    }
    
    private static void displayMainMenu() {
        System.out.println("\n═══════════════════════════════════════════");
        System.out.println("    LAB EQUIPMENT BORROW & RETURN SYSTEM");
        System.out.println("═══════════════════════════════════════════");
        System.out.println("1. View All Items");
        System.out.println("2. Borrow Item");
        System.out.println("3. Return Item");
        System.out.println("4. Modify Items (Add/Edit/Delete)");
        System.out.println("5. View Borrowers");
        System.out.println("6. Exit");
        System.out.println("═══════════════════════════════════════════");
    }
    
    private static void viewAllItems() {
        if (itemCount == 0) {
            System.out.println("\nNo items in the system.");
            return;
        }
        
        System.out.println("\n═══════════════════════════════════════════════════════════");
        System.out.printf("%-5s %-40s %-10s %-10s%n", "No.", "Item Name", "Available", "Total");
        System.out.println("═══════════════════════════════════════════════════════════");
        
        for (int i = 0; i < itemCount; i++) {
            System.out.printf("%-5d %-40s %-10d %-10d%n", 
                (i + 1), 
                items[i].getName(), 
                items[i].getAvailableQuantity(),
                items[i].getTotalQuantity());
        }
        System.out.println("═══════════════════════════════════════════════════════════");
    }
    
    private static void borrowItem() {
        viewAllItems();
        
        if (itemCount == 0) return;
        
        while (true) {
            try {
                String borrowerId = getStringInput("\nEnter TUPT-ID (or 'cancel' to go back): ");
                if (borrowerId.equalsIgnoreCase("cancel")) {
                    return;
                }
                if (borrowerId.trim().isEmpty()) {
                    System.out.println("Error: Borrower ID cannot be empty! Please try again.");
                    continue;
                }
                
                int itemIndex = getIntInputWithRetry("Enter item number to borrow (or 0 to cancel): ") - 1;
                if (itemIndex == -1) {
                    return;
                }
                
                if (itemIndex < 0 || itemIndex >= itemCount) {
                    System.out.println("Error: Invalid item number! Please try again.");
                    continue;
                }
                
                int quantity = getIntInputWithRetry("Enter quantity to borrow (or 0 to cancel): ");
                if (quantity == 0) {
                    return;
                }
                
                if (items[itemIndex].borrowItem(quantity)) {
                    addBorrower(borrowerId, items[itemIndex].getName(), quantity);
                    System.out.println("Successfully borrowed " + quantity + " " + items[itemIndex].getName());
                    return;
                } else {
                    System.out.println("Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
    }
    
    private static void returnItem() {
        if (borrowerCount == 0) {
            System.out.println("\nNo active borrowers in the system.");
            return;
        }
        
        viewBorrowers();
        
        while (true) {
            try {
                String borrowerId = getStringInput("\nEnter Borrower ID (or 'cancel' to go back): ");
                if (borrowerId.equalsIgnoreCase("cancel")) {
                    return;
                }
                
                // Find all items borrowed by this ID
                int[] matchIndices = new int[borrowerCount];
                int matchCount = 0;
                
                for (int i = 0; i < borrowerCount; i++) {
                    if (borrowers[i].getId().equalsIgnoreCase(borrowerId)) {
                        matchIndices[matchCount] = i;
                        matchCount++;
                    }
                }
                
                if (matchCount == 0) {
                    System.out.println("Error: No records found for Borrower ID: " + borrowerId);
                    System.out.println("Please try again.");
                    continue;
                }
                
                System.out.println("\nItems borrowed by " + borrowerId + ":");
                for (int i = 0; i < matchCount; i++) {
                    System.out.println((i + 1) + ". " + borrowers[matchIndices[i]].getItemName() + 
                                     " (Quantity: " + borrowers[matchIndices[i]].getQuantityBorrowed() + ")");
                }
                
                int itemChoice = getIntInputWithRetry("\nEnter item number to return (or 0 to cancel): ") - 1;
                if (itemChoice == -1) {
                    return;
                }
                
                if (itemChoice < 0 || itemChoice >= matchCount) {
                    System.out.println("Error: Invalid item number! Please try again.");
                    continue;
                }
                
                int borrowerIndex = matchIndices[itemChoice];
                String itemName = borrowers[borrowerIndex].getItemName();
                
                int returnQty = getIntInputWithRetry("Enter quantity to return (or 0 to cancel): ");
                if (returnQty == 0) {
                    return;
                }
                
                if (returnQty <= 0) {
                    System.out.println("Error: Return quantity must be positive! Please try again.");
                    continue;
                }
                
                if (returnQty > borrowers[borrowerIndex].getQuantityBorrowed()) {
                    System.out.println("Error: Cannot return more than borrowed! (Borrowed: " + 
                                     borrowers[borrowerIndex].getQuantityBorrowed() + ")");
                    System.out.println("Please try again.");
                    continue;
                }
                
                // Find the item in inventory
                int itemIndex = -1;
                for (int i = 0; i < itemCount; i++) {
                    if (items[i].getName().equalsIgnoreCase(itemName)) {
                        itemIndex = i;
                        break;
                    }
                }
                
                if (itemIndex == -1) {
                    System.out.println("Error: Item not found in inventory!");
                    return;
                }
                
                if (items[itemIndex].returnItem(returnQty)) {
                    borrowers[borrowerIndex].reduceQuantity(returnQty);
                    
                    // Remove borrower if all items returned
                    if (borrowers[borrowerIndex].getQuantityBorrowed() == 0) {
                        removeBorrower(borrowerIndex);
                        System.out.println("All items returned. Borrower record removed.");
                    } else {
                        System.out.println("Successfully returned " + returnQty + " " + itemName);
                    }
                    return;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
    }
    
    private static void modifyMenu() {
        while (true) {
            System.out.println("\n═══════════════════════════════════════════");
            System.out.println("              MODIFY ITEMS MENU");
            System.out.println("═══════════════════════════════════════════");
            System.out.println("1. Add New Item");
            System.out.println("2. Edit Existing Item");
            System.out.println("3. Delete Item");
            System.out.println("4. Back to Main Menu");
            System.out.println("═══════════════════════════════════════════");
            
            int choice = getIntInput("Enter your choice: ");
            
            switch (choice) {
                case 1: addNewItem(); break;
                case 2: editItem(); break;
                case 3: deleteItem(); break;
                case 4: return;
                default: 
                    System.out.println("Error: Invalid choice! Please try again.");
            }
        }
    }
    
    private static void addNewItem() {
        if (itemCount >= MAX_ITEMS) {
            System.out.println("Error: Cannot add more items. Maximum capacity reached!");
            return;
        }
        
        while (true) {
            try {
                String name = getStringInput("\nEnter item name (or 'cancel' to go back): ");
                if (name.equalsIgnoreCase("cancel")) {
                    return;
                }
                if (name.trim().isEmpty()) {
                    System.out.println("Error: Item name cannot be empty! Please try again.");
                    continue;
                }
                
                // Check for duplicates
                boolean duplicate = false;
                for (int i = 0; i < itemCount; i++) {
                    if (items[i].getName().equalsIgnoreCase(name)) {
                        System.out.println("Error: Item already exists! Please try again.");
                        duplicate = true;
                        break;
                    }
                }
                if (duplicate) continue;
                
                int quantity = getIntInputWithRetry("Enter total quantity (or 0 to cancel): ");
                if (quantity == 0) {
                    return;
                }
                if (quantity < 0) {
                    System.out.println("Error: Quantity must be positive! Please try again.");
                    continue;
                }
                
                addItem(name, quantity);
                System.out.println("Item added successfully!");
                return;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
    }
    
    private static void editItem() {
        viewAllItems();
        
        if (itemCount == 0) return;
        
        while (true) {
            try {
                int itemIndex = getIntInputWithRetry("\nEnter item number to edit (or 0 to cancel): ") - 1;
                if (itemIndex == -1) {
                    return;
                }
                
                if (itemIndex < 0 || itemIndex >= itemCount) {
                    System.out.println("Error: Invalid item number! Please try again.");
                    continue;
                }
                
                System.out.println("\nEditing: " + items[itemIndex].getName());
                System.out.println("1. Edit Name");
                System.out.println("2. Edit Total Quantity");
                System.out.println("3. Cancel");
                
                int choice = getIntInput("Enter your choice: ");
                
                switch (choice) {
                    case 1:
                        String newName = getStringInput("Enter new name: ");
                        if (!newName.trim().isEmpty()) {
                            items[itemIndex].setName(newName);
                            System.out.println("Name updated successfully!");
                            return;
                        } else {
                            System.out.println("Error: Name cannot be empty! Please try again.");
                        }
                        break;
                    case 2:
                        int newQty = getIntInputWithRetry("Enter new total quantity: ");
                        if (newQty <= 0) {
                            System.out.println("Error: Quantity must be positive! Please try again.");
                        } else if (newQty < (items[itemIndex].getTotalQuantity() - items[itemIndex].getAvailableQuantity())) {
                            System.out.println("Error: New quantity cannot be less than borrowed items! Please try again.");
                        } else {
                            items[itemIndex].setTotalQuantity(newQty);
                            System.out.println("Quantity updated successfully!");
                            return;
                        }
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Error: Invalid choice! Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
    }
    
    private static void deleteItem() {
        viewAllItems();
        
        if (itemCount == 0) return;
        
        while (true) {
            try {
                int itemIndex = getIntInputWithRetry("\nEnter item number to delete (or 0 to cancel): ") - 1;
                if (itemIndex == -1) {
                    return;
                }
                
                if (itemIndex < 0 || itemIndex >= itemCount) {
                    System.out.println("Error: Invalid item number! Please try again.");
                    continue;
                }
                
                // Check if item is currently borrowed
                if (items[itemIndex].getAvailableQuantity() < items[itemIndex].getTotalQuantity()) {
                    System.out.println("Error: Cannot delete item that is currently borrowed!");
                    System.out.println("Please try again or type 'cancel' to go back.");
                    continue;
                }
                
                String confirmation = getStringInput("Are you sure you want to delete '" + 
                                                    items[itemIndex].getName() + "'? (yes/no): ");
                
                if (confirmation.equalsIgnoreCase("yes")) {
                    // Shift array elements
                    for (int i = itemIndex; i < itemCount - 1; i++) {
                        items[i] = items[i + 1];
                    }
                    items[--itemCount] = null;
                    System.out.println("Item deleted successfully!");
                    return;
                } else if (confirmation.equalsIgnoreCase("no")) {
                    System.out.println("Deletion cancelled.");
                    return;
                } else {
                    System.out.println("Invalid response! Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
    }
    
    private static void viewBorrowers() {
        if (borrowerCount == 0) {
            System.out.println("\n No active borrowers in the system.");
            return;
        }
        
        System.out.println("\n═══════════════════════════════════════════════════════════");
        System.out.printf("%-15s %-35s %-10s%n", "Borrower ID", "Item Name", "Quantity");
        System.out.println("═══════════════════════════════════════════════════════════");
        
        for (int i = 0; i < borrowerCount; i++) {
            System.out.printf("%-15s %-35s %-10d%n", 
                borrowers[i].getId(), 
                borrowers[i].getItemName(),
                borrowers[i].getQuantityBorrowed());
        }
        System.out.println("═══════════════════════════════════════════════════════════");
    }
    
    private static void addBorrower(String id, String itemName, int quantity) {
        if (borrowerCount >= MAX_BORROWERS) {
            System.out.println("Error: Borrower list is full!");
            return;
        }
        borrowers[borrowerCount++] = new Borrower(id, itemName, quantity);
    }
    
    private static void removeBorrower(int index) {
        for (int i = index; i < borrowerCount - 1; i++) {
            borrowers[i] = borrowers[i + 1];
        }
        borrowers[--borrowerCount] = null;
    }
    
    private static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Please enter a number: ");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        return value;
    }
    
    private static int getIntInputWithRetry(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                return value;
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
    }
    
    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}