import java.util.ArrayList;
import java.util.Scanner;

public class doubleJkery {

    // General-purpose UI constants and methods
    public static final String DIVIDER = "===========================================================\n";
    public static final String SMALL_DIVIDER = "-----------------------------------------------------------\n";
    public static final String VERTICAL = "│";
    public static final String RESET = ""; // Used for color reset, empty for standard consoles

    //Prints a full-width header with a title.
    public static void printHeader(String title) {
        System.out.println(DIVIDER);
        System.out.println("\t" + title);
        System.out.println(DIVIDER);
    }

    //Prints a sub-header with a smaller divider.
    public static void printSubHeader(String title) {
        System.out.println("\n" + title);
        System.out.println(SMALL_DIVIDER);
    }

    //Prints the top border of a box.
    public static void printTopBorder(int width) {
        System.out.print("┌");
        for (int i = 0; i < width - 2; i++) {
            System.out.print("─");
        }
        System.out.println("┐");
    }

    //Prints the bottom border of a box.
    public static void printBottomBorder(int width) {
        System.out.print("└");
        for (int i = 0; i < width - 2; i++) {
            System.out.print("─");
        }
        System.out.println("┘");
    }

    //Prints a separating middle border in a box.
    public static void printMiddleBorder(int width) {
        System.out.print("├");
        for (int i = 0; i < width - 2; i++) {
            System.out.print("─");
        }
        System.out.println("┤");
    }

    //Prints text centered within a box's borders.
    public static void printCenteredText(String text, int width, String color) {
        int paddingTotal = width - 2 - text.length();
        int leftPadding = paddingTotal / 2;
        int rightPadding = paddingTotal - leftPadding;

        System.out.print(VERTICAL + RESET);
        for (int i = 0; i < leftPadding; i++) System.out.print(" ");
        System.out.print(text);
        for (int i = 0; i < rightPadding; i++) System.out.print(" ");
        System.out.println(RESET + VERTICAL);
    }

    // Product class with constructor, getters, and setters
    static class Product {
        private String name;
        private double price;
        private String description;
        private int stock;

        // Constructor
        public Product(String name, double price, String description, int stock) {
            this.name = name;
            this.price = price;
            this.description = description;
            this.stock = stock;
        }

        // Getters
        public String getName() { return name; }
        public double getPrice() { return price; }
        public String getDescription() { return description; }
        public int getStock() { return stock; }

        // Setters
        public void setName(String name) { this.name = name; }
        public void setPrice(double price) {
            if (price >= 0) {
                this.price = price;
            } else {
                System.out.println("Price cannot be negative!");
            }
        }
        public void setDescription(String description) { this.description = description; }
        public void setStock(int stock) {
            if (stock >= 0) {
                this.stock = stock;
            } else {
                System.out.println("Stock cannot be negative!");
            }
        }

        // Method to reduce stock when item is purchased
        public boolean reduceStock(int quantity) {
            if (stock >= quantity) {
                stock -= quantity;
                return true;
            } else {
                return false;
            }
        }

        @Override
        public String toString() {
            return String.format("%-15s - ₱%.2f - %s (Stock: %d)",
                name, price, description, stock);
        }
    }

    // Shop class to manage products and operations
    static class PastryShop {
        private ArrayList<Product> products;
        private ArrayList<Product> cart;
        private Scanner scanner;

        // Constructor
        public PastryShop() {
            products = new ArrayList<>();
            cart = new ArrayList<>();
            scanner = new Scanner(System.in);
            initializeProducts();
        }

        // Initialize shop with products
        private void initializeProducts() {
            products.add(new Product("Ardéchois", 185.50, "Traditional French chestnut cake from Ardèche", 15));
            products.add(new Product("Canelé", 95.00, "Small French pastry with soft custard center and caramelized crust", 25));
            products.add(new Product("Beignet", 75.00, "Light and airy French doughnut dusted with powdered sugar", 30));
            products.add(new Product("Cannoli", 120.00, "Italian tube-shaped shells filled with sweet ricotta", 20));
            products.add(new Product("Charlotte", 220.00, "Elegant molded dessert with ladyfingers and cream", 10));
            products.add(new Product("Chou à la Crème", 85.00, "Cream puff filled with vanilla pastry cream", 35));
            products.add(new Product("Macarons", 65.00, "Delicate French sandwich cookies with ganache filling", 50));
            products.add(new Product("Flan", 110.00, "Classic custard dessert with caramel sauce", 18));
            products.add(new Product("Éclair", 105.00, "Oblong pastry filled with cream and topped with fondant", 22));
            products.add(new Product("Fraisier", 285.00, "French strawberry cake with mousseline cream", 8));
        }

        public void displayProducts() {
            System.out.println();
            printHeader("DOUBLEJKERY\n\tFine French Pastries & Desserts");

            for (int i = 0; i < products.size(); i++) {
                Product p = products.get(i);
                System.out.printf("%2d. %-15s P%.2f - %s (Stock: %d)%n",
                    (i + 1), p.getName(), p.getPrice(), p.getDescription(), p.getStock());
            }
            System.out.println(DIVIDER);
        }

        public void searchByPriceRange() {
            System.out.println();
            printHeader("SEARCH BY PRICE RANGE");

            System.out.print("Enter minimum price (P): ");
            double minPrice = scanner.nextDouble();
            System.out.print("Enter maximum price (P): ");
            double maxPrice = scanner.nextDouble();

            System.out.println();
            printSubHeader(String.format("Products in range P%.2f - P%.2f", minPrice, maxPrice));

            boolean found = false;
            for (Product p : products) {
                if (p.getPrice() >= minPrice && p.getPrice() <= maxPrice) {
                    System.out.printf("%-15s P%.2f - %s (Stock: %d)%n",
                        p.getName(), p.getPrice(), p.getDescription(), p.getStock());
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No products found in the specified price range.");
            }
            System.out.println(DIVIDER);
        }

        // Add product to cart
        public void addToCart() {
            displayProducts();
            System.out.print("\nEnter product number to add to cart: ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= products.size()) {
                Product selectedProduct = products.get(choice - 1);

                if (selectedProduct.getStock() > 0) {
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();

                    if (quantity > 0 && quantity <= selectedProduct.getStock()) {
                        // Create new product instance for cart
                        Product cartItem = new Product(selectedProduct.getName(),
                            selectedProduct.getPrice(),
                            selectedProduct.getDescription(),
                            quantity);
                        cart.add(cartItem);
                        selectedProduct.reduceStock(quantity);
                        System.out.println("✓ Added " + quantity + " " + selectedProduct.getName() + "(s) to cart!");
                    } else if (quantity > selectedProduct.getStock()) {
                        System.out.println("Sorry, only " + selectedProduct.getStock() + " items available.");
                    } else {
                        System.out.println("Invalid quantity!");
                    }
                } else {
                    System.out.println("Sorry, this item is out of stock!");
                }
            } else {
                System.out.println("Invalid product number!");
            }
        }

        // Display cart contents with elegant styling
        public void displayCart() {
            if (cart.isEmpty()) {
                System.out.println();
                printTopBorder(50);
                printCenteredText("YOUR CART", 50, "");
                printCenteredText("Your cart is empty!", 50, "");
                printBottomBorder(50);
                return;
            }

            System.out.println();
            printTopBorder(70);
            printCenteredText("YOUR SHOPPING CART", 70, "");
            printMiddleBorder(70);

            double total = 0;
            for (int i = 0; i < cart.size(); i++) {
                Product item = cart.get(i);
                double itemTotal = item.getPrice() * item.getStock(); // Here getStock() is quantity
                String cartLine = String.format("%d. %-15s x%-2d = ₱%.2f",
                    (i + 1), item.getName(), item.getStock(), itemTotal);

                System.out.print(VERTICAL + " " + RESET);
                System.out.print(cartLine);

                int remainingSpace = 68 - cartLine.length();
                for (int j = 0; j < remainingSpace; j++) {
                    System.out.print(" ");
                }
                System.out.println(RESET + VERTICAL);
                total += itemTotal;
            }

            printMiddleBorder(70);
            String totalLine = String.format("TOTAL: ₱%.2f", total);
            printCenteredText(totalLine, 70, "");
            printBottomBorder(70);
        }

        // Checkout process
        public void checkout() {
            if (cart.isEmpty()) {
                System.out.println();
                printTopBorder(45);
                printCenteredText("Cart Empty", 45, "");
                printCenteredText("Add some items first!", 45, "");
                printBottomBorder(45);
                return;
            }

            displayCart();
            System.out.print(" Proceed to checkout? (y/n): " + RESET);
            String confirm = scanner.next();

            if (confirm.equalsIgnoreCase("y") || confirm.equalsIgnoreCase("yes")) {
                double total = 0;
                for (Product item : cart) {
                    total += item.getPrice() * item.getStock();
                }

                System.out.print(" Enter payment amount (₱): " + RESET);
                double payment = scanner.nextDouble();

                if (payment >= total) {
                    double change = payment - total;

                    // Receipt design
                    System.out.println();
                    printTopBorder(55);
                    printCenteredText("OFFICIAL RECEIPT", 55, "");
                    printCenteredText("DOUBLEJKERY", 55, "");
                    printCenteredText("Thank you for your purchase!", 55, "");
                    printMiddleBorder(55);

                    for (Product item : cart) {
                        String receiptLine = String.format("%-15s x%-2d = ₱%.2f",
                            item.getName(), item.getStock(),
                            item.getPrice() * item.getStock());

                        System.out.print(VERTICAL + " " + RESET);
                        System.out.print(receiptLine);

                        int remainingSpace = 53 - receiptLine.length();
                        for (int j = 0; j < remainingSpace; j++) {
                            System.out.print(" ");
                        }
                        System.out.println(RESET + VERTICAL);
                    }

                    printMiddleBorder(55);

                    String[] paymentInfo = {
                        String.format("SUBTOTAL:  ₱%.2f", total),
                        String.format("PAYMENT:   ₱%.2f", payment),
                        String.format("CHANGE:    ₱%.2f", change)
                    };

                    for (String info : paymentInfo) {
                        printCenteredText(info, 55, "");
                    }

                    if (total >= 500) {
                        printMiddleBorder(55);
                        printCenteredText("5% DISCOUNT APPLIED!", 55, "");
                        printCenteredText("Spending over ₱500", 55, "");
                    } else if (total >= 300) {
                        printMiddleBorder(55);
                        printCenteredText("FREE DELIVERY!", 55, "");
                        printCenteredText("Spending over ₱300", 55, "");
                    }

                    printBottomBorder(55);

                    cart.clear(); // Empty the cart after successful checkout

                    System.out.println();
                    printTopBorder(45);
                    printCenteredText("Thank you! Come again!", 45, "");
                    printBottomBorder(45);

                } else {
                    System.out.println();
                    printTopBorder(50);
                    printCenteredText("INSUFFICIENT PAYMENT", 50, "");
                    printCenteredText(String.format("You need ₱%.2f more", total - payment), 50, "");
                    printBottomBorder(50);
                }
            } else {
                System.out.println();
                printTopBorder(35);
                printCenteredText("Checkout cancelled.", 35, "");
                printBottomBorder(35);
            }
        }

        // Update product information
        public void updateProduct() {
            displayProducts();
            System.out.print("\nEnter product number to update: ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= products.size()) {
                Product product = products.get(choice - 1);
                System.out.println("\nCurrent product details:");
                System.out.println(product);

                System.out.println("\nWhat would you like to update?");
                System.out.println("1. Price");
                System.out.println("2. Stock");
                System.out.println("3. Description");
                System.out.print("Choose option: ");
                int updateChoice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (updateChoice) {
                    case 1:
                        System.out.print("Enter new price: ₱");
                        double newPrice = scanner.nextDouble();
                        product.setPrice(newPrice);
                        System.out.println("Price updated successfully!");
                        break;
                    case 2:
                        System.out.print("Enter new stock quantity: ");
                        int newStock = scanner.nextInt();
                        product.setStock(newStock);
                        System.out.println("Stock updated successfully!");
                        break;
                    case 3:
                        System.out.print("Enter new description: ");
                        String newDescription = scanner.nextLine();
                        product.setDescription(newDescription);
                        System.out.println("Description updated successfully!");
                        break;
                    default:
                        System.out.println("Invalid option!");
                        break;
                }
            } else {
                System.out.println("Invalid product number!");
            }
        }

        // Main menu loop for the shop
        public void runShop() {
            System.out.println();
            printTopBorder(60);
            printCenteredText("WELCOME TO DOUBLEJKERY", 60, "");
            printCenteredText("Authentic French Pastries", 60, "");
            printBottomBorder(60);

            int choice;
            do {
                System.out.println();
                printTopBorder(50);
                printCenteredText("MAIN MENU", 50, "");
                printMiddleBorder(50);

                String[] menuItems = {
                    "1. View All Products",
                    "2. Search by Price Range",
                    "3. Add to Cart",
                    "4. View Cart",
                    "5. Checkout",
                    "6. Update Product (Admin)",
                    "0. Exit"
                };

                for (String menuItem : menuItems) {
                    System.out.print(VERTICAL + " " + RESET);
                    System.out.print(menuItem);

                    int remainingSpace = 47 - menuItem.length();
                    for (int j = 0; j < remainingSpace; j++) {
                        System.out.print(" ");
                    }
                    System.out.println(RESET + VERTICAL);
                }

                printBottomBorder(50);
                System.out.print(" Enter your choice: " + RESET);
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        displayProducts();
                        break;
                    case 2:
                        searchByPriceRange();
                        break;
                    case 3:
                        addToCart();
                        break;
                    case 4:
                        displayCart();
                        break;
                    case 5:
                        checkout();
                        break;
                    case 6:
                        updateProduct();
                        break;
                    case 0:
                        System.out.println();
                        printTopBorder(55);
                        printCenteredText("Thank you for visiting!", 55, "");
                        printCenteredText("DOUBLEJKERY", 55, "");
                        printCenteredText("Au revoir!", 55, "");
                        printBottomBorder(55);
                        break;
                    default:
                        System.out.println();
                        printTopBorder(40);
                        printCenteredText("Invalid choice!", 40, "");
                        printCenteredText("Please try again.", 40, "");
                        printBottomBorder(40);
                        break;
                }

            } while (choice != 0);
        }
    }

    public static void main(String[] args) {
        PastryShop shop = new PastryShop();
        shop.runShop();
    }
}