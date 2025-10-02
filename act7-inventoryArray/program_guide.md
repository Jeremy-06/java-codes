# Lab Equipment System - Complete Program Guide

## Table of Contents
1. [Class Structure Overview](#class-structure-overview)
2. [Objects and Arrays](#objects-and-arrays)
3. [Main Menu Operations](#main-menu-operations)
4. [Modify Menu Operations](#modify-menu-operations)
5. [Helper Methods](#helper-methods)

---

## Class Structure Overview

### **Item Class** (Equipment Entity)
Represents a single piece of lab equipment with inventory tracking capabilities.

#### Attributes
| Attribute | Type | Description |
|-----------|------|-------------|
| `name` | String | Equipment name (e.g., "Vernier Caliper") |
| `totalQuantity` | int | Maximum available units |
| `availableQuantity` | int | Current units available for borrowing |

#### Methods
| Method | Return Type | Description | Usage in Program |
|--------|-------------|-------------|------------------|
| `getName()` | String | Returns equipment name | Display items, search operations |
| `getTotalQuantity()` | int | Returns total stock | Display inventory tables |
| `getAvailableQuantity()` | int | Returns available stock | Check availability before borrowing |
| `setName(String)` | void | Updates equipment name | Edit item name in modify menu |
| `setTotalQuantity(int)` | void | Updates total quantity | Edit item quantity in modify menu |
| `borrowItem(int)` | boolean | Reduces available quantity | Borrow operation validation |
| `returnItem(int)` | boolean | Increases available quantity | Return operation validation |

---

### **Borrower Class** (Transaction Record)
Represents a single borrowing transaction linking a person to an item.

#### Attributes
| Attribute | Type | Description |
|-----------|------|-------------|
| `id` | String | Borrower identification (TUPT-ID) |
| `itemName` | String | Name of borrowed equipment |
| `quantityBorrowed` | int | Number of units borrowed |

#### Methods
| Method | Return Type | Description | Usage in Program |
|--------|-------------|-------------|------------------|
| `getId()` | String | Returns borrower ID | Search borrower records |
| `getItemName()` | String | Returns borrowed item name | Display borrower list, return operations |
| `getQuantityBorrowed()` | int | Returns borrowed quantity | Display amounts, validate returns |
| `reduceQuantity(int)` | void | Decreases borrowed amount | Partial return processing |

---

### **mekanInventory Class** (Main Controller)
Central system that manages all operations, objects, and user interactions.

#### Static Variables
| Variable | Type | Description |
|----------|------|-------------|
| `MAX_ITEMS` | int (100) | Maximum inventory capacity |
| `MAX_BORROWERS` | int (200) | Maximum borrower records |
| `items[]` | Item[] | Array storing all equipment objects |
| `itemCount` | int | Current number of items in inventory |
| `borrowers[]` | Borrower[] | Array storing all transaction records |
| `borrowerCount` | int | Current number of active borrowers |
| `scanner` | Scanner | Input handler for user interaction |

---

## Objects and Arrays

### **items[] Array** (Equipment Database)
```
items[0] = Item("Vernier Caliper", 20)
items[1] = Item("Micrometer Screw Gauge", 15)
items[2] = Item("Dial Indicator", 10)
...
items[25] = Item("Safety Gear", 40)
```
**Purpose**: Stores all equipment objects. Each index holds one Item object.

**Operations**:
- **Add**: `items[itemCount++] = new Item(name, qty)`
- **Access**: `items[i].getName()`
- **Delete**: Shift array elements left, decrement itemCount
- **Search**: Loop through array comparing names

---

### **borrowers[] Array** (Transaction Database)
```
borrowers[0] = Borrower("TUPT-2024-001", "Vernier Caliper", 5)
borrowers[1] = Borrower("TUPT-2024-001", "Micrometer", 2)
borrowers[2] = Borrower("TUPT-2024-002", "Stopwatch", 1)
```
**Purpose**: Records who borrowed what. Multiple records per borrower allowed.

**Operations**:
- **Add**: `borrowers[borrowerCount++] = new Borrower(id, item, qty)`
- **Search**: Loop comparing IDs
- **Remove**: Shift array elements left, decrement borrowerCount
- **Update**: `borrowers[i].reduceQuantity(amt)`

---

## Main Menu Operations

### **1. View All Items**

#### Menu Option: `case 1`
**Method Called**: `viewAllItems()`

#### Process Flow
```
1. Check if itemCount > 0
2. Display table header
3. Loop through items[] array
4. For each item: display number, name, available, total
5. Return to menu
```

#### Objects/Methods Used
| Object/Method | Purpose |
|---------------|---------|
| `items[]` | Access all equipment |
| `items[i].getName()` | Get equipment name |
| `items[i].getAvailableQuantity()` | Get current stock |
| `items[i].getTotalQuantity()` | Get maximum stock |
| `itemCount` | Loop boundary |

#### Example Output
```
No.   Item Name                    Available  Total
1     Vernier Caliper              15         20
2     Micrometer Screw Gauge       15         15
```

---

### **2. Borrow Item**

#### Menu Option: `case 2`
**Method Called**: `borrowItem()`

#### Process Flow
```
1. Call viewAllItems() to show inventory
2. Get borrower ID (TUPT-ID)
3. Validate ID is not empty
4. Get item number selection
5. Validate item index (0 to itemCount-1)
6. Get quantity to borrow
7. Validate quantity > 0 and <= available
8. Call items[index].borrowItem(qty)
9. Call addBorrower() to create record
10. Display success message
```

#### Objects/Methods Used
| Object/Method | Purpose |
|---------------|---------|
| `viewAllItems()` | Display available items |
| `items[index].borrowItem(qty)` | Validate and reduce stock |
| `items[index].getAvailableQuantity()` | Check availability |
| `addBorrower(id, name, qty)` | Create transaction record |
| `getStringInput()` | Get borrower ID |
| `getIntInputWithRetry()` | Get item number and quantity |

#### Key Validation
- Borrower ID cannot be empty
- Item number must exist (1 to itemCount)
- Quantity must be positive
- Quantity must not exceed available stock

#### State Changes
**Before**: `items[5].availableQuantity = 20`
**User Action**: Borrows 5 units
**After**: `items[5].availableQuantity = 15`
**Record Created**: `borrowers[0] = Borrower("TUPT-001", "Item Name", 5)`

---

### **3. Return Item**

#### Menu Option: `case 3`
**Method Called**: `returnItem()`

#### Process Flow
```
1. Check if borrowerCount > 0
2. Call viewBorrowers() to show active borrowers
3. Get borrower ID
4. Search borrowers[] for matching ID
5. Display all items borrowed by that ID
6. Get item selection
7. Get return quantity
8. Validate quantity <= borrowed amount
9. Find item in items[] array
10. Call items[index].returnItem(qty)
11. Call borrowers[index].reduceQuantity(qty)
12. If quantity becomes 0, call removeBorrower(index)
13. Display success message
```

#### Objects/Methods Used
| Object/Method | Purpose |
|---------------|---------|
| `viewBorrowers()` | Display active transactions |
| `borrowers[i].getId()` | Search for borrower |
| `borrowers[i].getItemName()` | Get borrowed item name |
| `borrowers[i].getQuantityBorrowed()` | Check borrowed amount |
| `items[index].returnItem(qty)` | Validate and increase stock |
| `borrowers[index].reduceQuantity(qty)` | Update borrower record |
| `removeBorrower(index)` | Delete completed transaction |

#### Key Validation
- Borrower must exist in system
- Return quantity must be positive
- Cannot return more than borrowed
- Item must exist in inventory

#### State Changes
**Before**: 
- `items[5].availableQuantity = 15`
- `borrowers[0].quantityBorrowed = 5`

**User Action**: Returns 3 units

**After**: 
- `items[5].availableQuantity = 18`
- `borrowers[0].quantityBorrowed = 2`

**User Returns Remaining 2**:
- `items[5].availableQuantity = 20`
- `borrowers[0]` deleted (record removed)

---

### **4. Modify Items (Sub-Menu)**

#### Menu Option: `case 4`
**Method Called**: `modifyMenu()`

Displays secondary menu with 4 options. See [Modify Menu Operations](#modify-menu-operations) section.

---

### **5. View Borrowers**

#### Menu Option: `case 5`
**Method Called**: `viewBorrowers()`

#### Process Flow
```
1. Check if borrowerCount > 0
2. Display table header
3. Loop through borrowers[] array
4. For each borrower: display ID, item name, quantity
5. Return to menu
```

#### Objects/Methods Used
| Object/Method | Purpose |
|---------------|---------|
| `borrowers[]` | Access all transaction records |
| `borrowers[i].getId()` | Get borrower ID |
| `borrowers[i].getItemName()` | Get borrowed item |
| `borrowers[i].getQuantityBorrowed()` | Get quantity |
| `borrowerCount` | Loop boundary |

#### Example Output
```
Borrower ID     Item Name                    Quantity
TUPT-2024-001   Vernier Caliper              5
TUPT-2024-001   Micrometer                   2
TUPT-2024-002   Stopwatch                    1
```

---

### **6. Exit**

#### Menu Option: `case 6`
**Action**: `return` statement exits main method, terminating program.

---

## Modify Menu Operations

### **Modify Menu Display**
**Method**: `modifyMenu()`
**Purpose**: Secondary menu for inventory management operations.

---

### **4.1 Add New Item**

#### Sub-Menu Option: `case 1`
**Method Called**: `addNewItem()`

#### Process Flow
```
1. Check if itemCount < MAX_ITEMS
2. Get item name from user
3. Validate name is not empty
4. Check for duplicate names in items[]
5. Get quantity from user
6. Validate quantity > 0
7. Call addItem(name, qty)
8. Increment itemCount
9. Display success message
```

#### Objects/Methods Used
| Object/Method | Purpose |
|---------------|---------|
| `MAX_ITEMS` | Check capacity limit |
| `itemCount` | Track array size |
| `items[i].getName()` | Check for duplicates |
| `addItem(name, qty)` | Create and store new Item object |
| `getStringInput()` | Get item name |
| `getIntInputWithRetry()` | Get quantity |

#### Key Validation
- Cannot exceed MAX_ITEMS (100)
- Item name cannot be empty
- Item name must be unique
- Quantity must be positive

#### State Changes
**Before**: `itemCount = 26`
**User Action**: Adds "Hydraulic Press" with quantity 2
**After**: 
- `items[26] = new Item("Hydraulic Press", 2)`
- `itemCount = 27`

---

### **4.2 Edit Existing Item**

#### Sub-Menu Option: `case 2`
**Method Called**: `editItem()`

#### Process Flow
```
1. Call viewAllItems()
2. Get item number to edit
3. Validate item index
4. Display edit options (Name or Quantity)
5a. If editing name:
    - Get new name
    - Validate not empty
    - Call items[index].setName(newName)
5b. If editing quantity:
    - Get new quantity
    - Validate > 0
    - Validate >= currently borrowed
    - Call items[index].setTotalQuantity(newQty)
6. Display success message
```

#### Objects/Methods Used
| Object/Method | Purpose |
|---------------|---------|
| `viewAllItems()` | Display items for selection |
| `items[index].getName()` | Show current name |
| `items[index].setName(name)` | Update equipment name |
| `items[index].setTotalQuantity(qty)` | Update total stock |
| `items[index].getTotalQuantity()` | Get current total |
| `items[index].getAvailableQuantity()` | Calculate borrowed amount |

#### Key Validation
**For Name**:
- Cannot be empty

**For Quantity**:
- Must be positive
- Must be >= (totalQuantity - availableQuantity)
  - This ensures new total can accommodate currently borrowed items

#### Example Scenario
**Current State**:
- Total: 20, Available: 12 (8 borrowed)

**User tries to set total to 5**: ❌ BLOCKED
- Reason: 5 < 8 borrowed items

**User sets total to 10**: ✅ ALLOWED
- Result: Total: 10, Available: 2 (8 still borrowed)

---

### **4.3 Delete Item**

#### Sub-Menu Option: `case 3`
**Method Called**: `deleteItem()`

#### Process Flow
```
1. Call viewAllItems()
2. Get item number to delete
3. Validate item index
4. Check if item is currently borrowed
5. If borrowed, block deletion
6. If not borrowed, ask for confirmation
7. If confirmed, shift array elements left
8. Decrement itemCount
9. Set last position to null
10. Display success message
```

#### Objects/Methods Used
| Object/Method | Purpose |
|---------------|---------|
| `viewAllItems()` | Display items for selection |
| `items[index].getAvailableQuantity()` | Check if borrowed |
| `items[index].getTotalQuantity()` | Check if borrowed |
| `getStringInput()` | Get confirmation |
| Array shifting | Remove item from array |

#### Key Validation
- Cannot delete if `availableQuantity < totalQuantity` (items borrowed)
- Requires "yes" confirmation

#### Deletion Process
```
Before: items = [Item0, Item1, Item2, Item3, Item4]
Delete Item2
After:  items = [Item0, Item1, Item3, Item4, null]
itemCount: 5 → 4
```

#### Array Shift Logic
```java
for (int i = itemIndex; i < itemCount - 1; i++) {
    items[i] = items[i + 1];  // Shift left
}
items[--itemCount] = null;  // Clear last position
```

---

### **4.4 Back to Main Menu**

#### Sub-Menu Option: `case 4`
**Action**: `return` statement exits modifyMenu(), returns to main menu loop.

---

## Helper Methods

These utility methods support all menu operations by handling input, validation, and data management.

---

### **Input Handlers**

#### `getIntInput(String prompt)`
**Purpose**: Read integer from user with basic validation.

**Usage**:
- Main menu choice selection
- Edit menu choice selection

**Process**:
```
1. Display prompt
2. Check if next input is integer
3. If not, display error and retry
4. If yes, read integer
5. Clear input buffer
6. Return value
```

**Error Handling**: Loops until valid integer entered.

---

#### `getIntInputWithRetry(String prompt)`
**Purpose**: Read integer with persistent retry loop.

**Usage**:
- Item number selection
- Quantity inputs (borrow/return)
- All numeric inputs requiring validation

**Process**:
```
1. Display prompt
2. Check if next input is integer
3. If not, display error, clear buffer, retry
4. If yes, read integer and clear buffer
5. Return value
```

**Difference from getIntInput()**: More robust error recovery.

---

#### `getStringInput(String prompt)`
**Purpose**: Read text input from user.

**Usage**:
- Borrower ID entry
- Item name entry
- Confirmation prompts (yes/no)
- Cancel operations

**Process**:
```
1. Display prompt
2. Read full line
3. Trim whitespace
4. Return string
```

---

### **Data Management Methods**

#### `addItem(String name, int quantity)`
**Purpose**: Create new Item object and add to inventory.

**Usage**:
- Initial system setup (initializeItems)
- Add new item operation

**Process**:
```
1. Check if itemCount < MAX_ITEMS
2. Create: new Item(name, quantity)
3. Store in: items[itemCount]
4. Increment: itemCount++
```

**Objects Created**: New Item object with specified parameters.

---

#### `addBorrower(String id, String itemName, int quantity)`
**Purpose**: Create new Borrower record for transaction.

**Usage**:
- After successful borrow operation

**Process**:
```
1. Check if borrowerCount < MAX_BORROWERS
2. Create: new Borrower(id, itemName, quantity)
3. Store in: borrowers[borrowerCount]
4. Increment: borrowerCount++
```

**Objects Created**: New Borrower object linking ID to borrowed item.

---

#### `removeBorrower(int index)`
**Purpose**: Delete borrower record from array.

**Usage**:
- When all borrowed items are returned

**Process**:
```
1. Shift array elements left starting from index
2. Decrement borrowerCount
3. Set last position to null
```

**Example**:
```
Before: [Borrower0, Borrower1, Borrower2]
Remove index 1
After:  [Borrower0, Borrower2, null]
```

---

#### `initializeItems()`
**Purpose**: Pre-load system with 26 standard lab equipment items.

**Usage**: Called once at program startup.

**Process**:
```
For each of 26 items:
    Call addItem(name, quantity)
```

**Equipment Categories Loaded**:
- Measurement tools (5 items)
- Material testing (6 items)
- Thermal/fluid lab (5 items)
- Workshop tools (5 items)
- Common items (5 items)

---

## Method Usage Summary by Menu

### Main Menu (Option → Methods Called)

| Option | Primary Method | Helper Methods | Objects Modified |
|--------|---------------|----------------|------------------|
| 1 | `viewAllItems()` | None | None (read-only) |
| 2 | `borrowItem()` | `viewAllItems()`<br>`getStringInput()`<br>`getIntInputWithRetry()`<br>`addBorrower()` | `items[i]`<br>`borrowers[]` |
| 3 | `returnItem()` | `viewBorrowers()`<br>`getStringInput()`<br>`getIntInputWithRetry()`<br>`removeBorrower()` | `items[i]`<br>`borrowers[i]` |
| 4 | `modifyMenu()` | See Modify Menu below | Varies |
| 5 | `viewBorrowers()` | None | None (read-only) |
| 6 | Exit | None | None |

---

### Modify Menu (Option → Methods Called)

| Option | Primary Method | Helper Methods | Objects Modified |
|--------|---------------|----------------|------------------|
| 1 | `addNewItem()` | `getStringInput()`<br>`getIntInputWithRetry()`<br>`addItem()` | `items[]`<br>`itemCount` |
| 2 | `editItem()` | `viewAllItems()`<br>`getStringInput()`<br>`getIntInput()`<br>`getIntInputWithRetry()` | `items[i]` |
| 3 | `deleteItem()` | `viewAllItems()`<br>`getStringInput()`<br>`getIntInputWithRetry()` | `items[]`<br>`itemCount` |
| 4 | Return | None | None |

---

## Quick Reference: Object Lifecycle

### Item Object Lifecycle
```
1. CREATED: initializeItems() or addNewItem()
   → new Item(name, quantity)
   → Stored in items[] array

2. MODIFIED: 
   → borrowItem(): availableQuantity decreases
   → returnItem(): availableQuantity increases
   → editItem(): name or totalQuantity changes

3. DELETED: deleteItem()
   → Removed from items[] array
   → Array shifted, itemCount decreased
```

### Borrower Object Lifecycle
```
1. CREATED: addBorrower()
   → new Borrower(id, itemName, quantity)
   → Stored in borrowers[] array

2. MODIFIED: returnItem()
   → reduceQuantity(): quantityBorrowed decreases

3. DELETED: removeBorrower()
   → When quantityBorrowed reaches 0
   → Removed from borrowers[] array
   → Array shifted, borrowerCount decreased
```

---

## Program Flow Summary

```
START
  ↓
Initialize 26 Items (creates 26 Item objects)
  ↓
MAIN LOOP:
  Display Menu
  Get Choice
  ↓
  Execute Operation:
    - Read operations: Access objects, display data
    - Write operations: Modify objects, create/delete objects
  ↓
  Return to Menu
  ↓
  Repeat until Exit
  ↓
END
```

---

## Key Programming Concepts Used

1. **Encapsulation**: Item and Borrower hide data behind getters/setters
2. **Arrays as Databases**: items[] and borrowers[] store collections
3. **Object State Management**: Objects track their own data
4. **Validation**: Multiple layers prevent invalid operations
5. **Separation of Concerns**: 
   - Item/Borrower: Data and business logic
   - mekanInventory: User interface and coordination
6. **Static Context**: Main class doesn't need instantiation
7. **Error Recovery**: Loops allow retry on invalid input

---

## Summary

This program demonstrates a complete inventory management system using:
- **2 Data Classes** (Item, Borrower) representing real-world entities
- **1 Controller Class** (mekanInventory) managing everything
- **2 Arrays** acting as simple databases
- **Multiple Validation Layers** ensuring data integrity
- **User-Friendly Interface** with error recovery

Every operation follows the pattern: **Input → Validate → Modify Objects → Confirm → Return to Menu**