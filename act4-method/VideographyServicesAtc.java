import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class VideographyServicesAtc {
    
    // Simple cart to hold selected services before payment
    private static final List<CartItem> cart = new ArrayList<>();
    
    // Represents one item added to the cart
    private static class CartItem {
        String serviceName;
        double basePrice;
        int baseHours;
        int extraHours;
        boolean rushDelivery;
        boolean rawFootage;
        boolean droneFootage;
        double totalPrice;
        
        CartItem(String serviceName, double basePrice, int baseHours, int extraHours,
                 boolean rushDelivery, boolean rawFootage, boolean droneFootage, double totalPrice) {
            this.serviceName = serviceName;
            this.basePrice = basePrice;
            this.baseHours = baseHours;
            this.extraHours = extraHours;
            this.rushDelivery = rushDelivery;
            this.rawFootage = rawFootage;
            this.droneFootage = droneFootage;
            this.totalPrice = totalPrice;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        while (true) {
            displayMenu();
            System.out.print("Choose an option: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    showAllServices();
                    break;
                case 2:
                    calculatePrice(scanner);
                    break;
                case 3:
                    viewCartAndCheckout(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for choosing our services!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("\nPress Enter to continue...");
            scanner.nextLine(); // consume leftover newline
            scanner.nextLine(); // wait for user to press Enter
        }
    }
    
    public static void displayMenu() {
        System.out.println( "-".repeat(70) + "\n\t\t\t JJ's Video Services \n" + "-".repeat(70));
        System.out.println( "\n\t\t\t      Main Menu \n");
        System.out.println("\t\t    1. View All Services");
        System.out.println("\t\t    2. Choose Service");
        System.out.println("\t\t    3. View Cart / Checkout");
        System.out.println("\t\t    4. Exit\n");
    }
    
    public static void showAllServices() {
        System.out.println( "-".repeat(80) + "\n\t\t\t Available Videography Services \n" + "-".repeat(80));
        
        System.out.println("\n1. EVENT COVERAGE\n");
        System.out.println("   - Wedding - PHP 1,500 (8 hours)");
        System.out.println("     Includes: Recording, editing, highlights, raw files");
        System.out.println("   - Birthday Party - PHP 600 (4 hours)");
        System.out.println("     Includes: Recording, basic editing, highlights");
        System.out.println("   - Debut - PHP 800 (6 hours)");
        System.out.println("     Includes: Recording, editing, highlights, ceremony coverage");
        System.out.println("   - Graduation - PHP 700 (5 hours)");
        System.out.println("     Includes: Recording, editing, highlights");
        System.out.println("   - Baptism - PHP 500 (3 hours)");
        System.out.println("     Includes: Recording, basic editing, ceremony focus");
        
        System.out.println("\n2. CREATIVE PROJECTS\n");
        System.out.println("   - Short Films - PHP 2,000 (20 hours)");
        System.out.println("     Includes: Script consultation, filming, advanced editing, color grading");
        System.out.println("   - Music Videos - PHP 1,500 (12 hours)");
        System.out.println("     Includes: Creative direction, filming, editing, visual effects");
        System.out.println("   - Documentaries - PHP 2,500 (25 hours)");
        System.out.println("     Includes: Research, interviews, filming, advanced editing");
        System.out.println("   - Art/Fashion Videos - PHP 1,200 (10 hours)");
        System.out.println("     Includes: Creative filming, professional editing, styling support");
        
        System.out.println("\n3. COMMERCIAL / PRODUCT VIDEOGRAPHY\n");
        System.out.println("   - Product Showcase - PHP 800 (6 hours)");
        System.out.println("     Includes: Professional lighting, multiple angles, clean editing");
        System.out.println("   - Restaurant/Food Menu - PHP 600 (4 hours)");
        System.out.println("     Includes: Food styling, close-up shots, appetizing presentation");
        System.out.println("   - Advertisement - PHP 1,200 (8 hours)");
        System.out.println("     Includes: Concept development, filming, professional editing");
        System.out.println("   - Business Promotional - PHP 900 (6 hours)");
        System.out.println("     Includes: Company overview, service showcase, professional presentation");
    }
    
    public static void calculatePrice(Scanner scanner) {
        System.out.println( "-".repeat(70) + "\n\t\t\t  Price Calculator \n" + "-".repeat(70));
        
        System.out.println("\t\t    Select a service category:\n");
        System.out.println("\t\t    1. Event Coverage");
        System.out.println("\t\t    2. Creative Projects");
        System.out.println("\t\t    3. Commercial/Product\n");
        
        int category;
        while (true) {
            System.out.print("Enter category number: ");
            if (scanner.hasNextInt()) {
                category = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume invalid input
            }
        }
        
        double basePrice = 0;
        String serviceName = "";
        int baseHours = 0;
        
        switch (category) {
            case 1: // Event Coverage
                System.out.println("\nEvent types:\n");
                System.out.println("\t1. Wedding          - PHP 1,500");
                System.out.println("\t2. Birthday Party   - PHP 600");
                System.out.println("\t3. Debut            - PHP 800");
                System.out.println("\t4. Graduation       - PHP 700");
                System.out.println("\t5. Baptism          - PHP 500\n");
                System.out.print("Select event type: ");
                int eventType = scanner.nextInt();
                
                switch (eventType) {
                    case 1: basePrice = 1500; serviceName = "Wedding"; baseHours = 8; break;
                    case 2: basePrice = 600; serviceName = "Birthday Party"; baseHours = 4; break;
                    case 3: basePrice = 800; serviceName = "Debut"; baseHours = 6; break;
                    case 4: basePrice = 700; serviceName = "Graduation"; baseHours = 5; break;
                    case 5: basePrice = 500; serviceName = "Baptism"; baseHours = 3; break;
                    default: System.out.println("Invalid selection."); return;
                }
                break;
                
            case 2: // Creative Projects
                System.out.println("\nCreative services:\n");
                System.out.println("\t1. Short Films        - PHP 2,000");
                System.out.println("\t2. Music Videos       - PHP 1,500");
                System.out.println("\t3. Documentaries      - PHP 2,500");
                System.out.println("\t4. Art/Fashion Videos - PHP 1,200\n");
                System.out.print("Select service: ");
                int creativeType = scanner.nextInt();
                
                switch (creativeType) {
                    case 1: basePrice = 2000; serviceName = "Short Films"; baseHours = 20; break;
                    case 2: basePrice = 1500; serviceName = "Music Videos"; baseHours = 12; break;
                    case 3: basePrice = 2500; serviceName = "Documentaries"; baseHours = 25; break;
                    case 4: basePrice = 1200; serviceName = "Art/Fashion Videos"; baseHours = 10; break;
                    default: System.out.println("Invalid selection."); return;
                }
                break;
                
            case 3: // Commercial/Product
                System.out.println("\nCommercial services:\n");
                System.out.println("\t1. Product Showcase     - PHP 800");
                System.out.println("\t2. Restaurant/Food Menu - PHP 600");
                System.out.println("\t3. Advertisement        - PHP 1,200");
                System.out.println("\t4. Business Promotional - PHP 900\n");
                System.out.print("Select service: ");
                int commercialType = scanner.nextInt();
                
                switch (commercialType) {
                    case 1: basePrice = 800; serviceName = "Product Showcase"; baseHours = 6; break;
                    case 2: basePrice = 600; serviceName = "Restaurant/Food Menu"; baseHours = 4; break;
                    case 3: basePrice = 1200; serviceName = "Advertisement"; baseHours = 8; break;
                    case 4: basePrice = 900; serviceName = "Business Promotional"; baseHours = 6; break;
                    default: System.out.println("Invalid selection."); return;
                }
                break;
                
            default:
                System.out.println("Invalid category selection.");
                return;
        }
        
        // Additional options
        int extraHours = -1;
        while (true) {
            System.out.print("\nNeed extra hours? Enter additional hours (0 if none): ");
            if (scanner.hasNextInt()) {
                extraHours = scanner.nextInt();
                if (extraHours >= 0) {
                    break;
                } else {
                    System.out.println("Please enter a valid number of hours (0 or more).");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume invalid input
            }
        }
        
        String rushDelivery;
        while (true) {
            System.out.print("Need rush delivery? (y/n): ");
            rushDelivery = scanner.next();
            if (rushDelivery.equalsIgnoreCase("y") || rushDelivery.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        }

        String rawFootage;
        while (true) {
            System.out.print("Need raw footage files? (y/n): ");
            rawFootage = scanner.next();
            if (rawFootage.equalsIgnoreCase("y") || rawFootage.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        }

        String droneFootage;
        while (true) {
            System.out.print("Need drone footage add-on? (y/n): ");
            droneFootage = scanner.next();
            if (droneFootage.equalsIgnoreCase("y") || droneFootage.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        }
        
        // Calculate total price
        double totalPrice = basePrice;
        double extraHourRate = 100; // PHP 100 per extra hour
        
        if (extraHours > 0) {
            totalPrice += extraHours * extraHourRate;
        }
        
        if (rushDelivery.equalsIgnoreCase("y")) {
            totalPrice += basePrice * 0.25; // 25% rush fee
        }
        
        if (rawFootage.equalsIgnoreCase("y")) {
            totalPrice += 1500; // PHP 1,500 for raw footage
        }

        if (droneFootage.equalsIgnoreCase("y")) {
            totalPrice += 3000; // PHP 3,000 for drone add-on
        }
        
        // Find the longest label for alignment
        String[] labels = {
            "Service:",
            "Base Price:",
            "Base Hours:",
            "Extra Hours:",
            "Rush Delivery (25%):",
            "Raw Footage Files:",
            "Drone Footage Add-on:",
            "TOTAL PRICE:"
        };
        int maxLabelLength = 0;
        for (String label : labels) {
            if (label.length() > maxLabelLength) maxLabelLength = label.length();
        }
        String formatLabel = "\t\t%-" + maxLabelLength + "s %s\n";

        System.out.println( "-".repeat(70) + "\n\t\t\t      Summary \n" + "-".repeat(70));

        System.out.printf(formatLabel, "Service:", serviceName);
        System.out.printf(formatLabel, "Base Price:", "PHP " + String.format("%.0f", basePrice));
        System.out.printf(formatLabel, "Base Hours:", baseHours + " hours");

        if (extraHours > 0) {
            String extraText = extraHours + " x PHP " + String.format("%.0f", extraHourRate) + " = PHP " + String.format("%.0f", (extraHours * extraHourRate));
            System.out.printf(formatLabel, "Extra Hours:", extraText);
        }

        if (rushDelivery.equalsIgnoreCase("y")) {
            System.out.printf(formatLabel, "Rush Delivery (25%):", "PHP " + String.format("%.0f", basePrice * 0.25));
        }

        if (rawFootage.equalsIgnoreCase("y")) {
            System.out.printf(formatLabel, "Raw Footage Files:", "PHP 1,500");
        }

        if (droneFootage.equalsIgnoreCase("y")) {
            System.out.printf(formatLabel, "Drone Footage Add-on:", "PHP 3,000");
        }
        
        System.out.println("\n");
        System.out.printf( formatLabel, "TOTAL PRICE:", "PHP " + String.format("%.0f", totalPrice));
        
        // Show what's included
        System.out.println( "-".repeat(70) + "\n\t\t\t What's Included\n" + "-".repeat(70));
        
        // Show what's included
        switch (category) {
            case 1: // Events
                System.out.println("- Professional recording equipment");
                System.out.println("- Video editing and post-production");
                System.out.println("- Highlight reel/summary video");
                if (serviceName.equals("Wedding")) {
                    System.out.println("- Ceremony and reception coverage");
                    System.out.println("- Raw footage files included");
                }
                break;
            case 2: // Creative
                System.out.println("- Pre-production planning");
                System.out.println("- Professional filming");
                System.out.println("- Advanced editing and color grading");
                if (serviceName.equals("Short Films") || serviceName.equals("Documentaries")) {
                    System.out.println("- Script consultation");
                }
                break;
            case 3: // Commercial
                System.out.println("- Professional lighting setup");
                System.out.println("- Multiple camera angles");
                System.out.println("- Professional editing");
                System.out.println("- Ready-to-use final product");
                break;
        }

        // Automatically add to cart (no prompt)
        addToCart(new CartItem(
            serviceName,
            basePrice,
            baseHours,
            extraHours,
            rushDelivery.equalsIgnoreCase("y"),
            rawFootage.equalsIgnoreCase("y"),
            droneFootage.equalsIgnoreCase("y"),
            totalPrice
        ));
        System.out.println("\nItem added to cart. Proceed to 'View Cart / Checkout' from the main menu when ready.");
    }

    // Adds an item to the cart
    private static void addToCart(CartItem item) {
        cart.add(item);
    }

    // Shows cart contents and allows checkout or basic item removal
    private static void viewCartAndCheckout(Scanner scanner) {
        if (cart.isEmpty()) {
            System.out.println("\nYour cart is empty.");
            return;
        }
        System.out.println("-".repeat(70) + "\n\t\t\t    Your Cart\n" + "-".repeat(70));
        double grandTotal = 0;
        for (int i = 0; i < cart.size(); i++) {
            CartItem it = cart.get(i);
            System.out.println((i + 1) + ") " + it.serviceName + " - PHP " + String.format("%.0f", it.totalPrice));
            System.out.println("    Base: PHP " + String.format("%.0f", it.basePrice) + ", Hours: " + it.baseHours + (it.extraHours > 0 ? (", +" + it.extraHours + " extra hrs") : ""));
            List<String> opts = new ArrayList<>();
            if (it.rushDelivery) opts.add("Rush (25%)");
            if (it.rawFootage) opts.add("Raw Files");
            if (it.droneFootage) opts.add("Drone");
            if (!opts.isEmpty()) {
                System.out.println("    Add-ons: " + String.join(", ", opts));
            }
            grandTotal += it.totalPrice;
        }
        System.out.println("\nTOTAL DUE: PHP " + String.format("%.0f", grandTotal));

        System.out.println("\nOptions: ");
        System.out.println("  1. Proceed to Payment");
        System.out.println("  2. Remove an Item");
        System.out.println("  3. Clear Cart");
        System.out.println("  4. Back to Menu");

        int action;
        while (true) {
            System.out.print("Choose an option: ");
            if (scanner.hasNextInt()) {
                action = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        switch (action) {
            case 1:
                // Ask for PWD/Senior discount eligibility and process payment
                boolean eligible = false;
                while (true) {
                    System.out.print("\nAre you a Senior Citizen or PWD? (y/n): ");
                    String yn = scanner.next();
                    if (yn.equalsIgnoreCase("y")) { eligible = true; break; }
                    if (yn.equalsIgnoreCase("n")) { eligible = false; break; }
                    System.out.println("Invalid input. Please enter 'y' or 'n'.");
                }

                double discountRate = eligible ? 0.20 : 0.0; // 20% discount
                double discountAmount = grandTotal * discountRate;
                double finalTotal = grandTotal - discountAmount;

                System.out.println("\n" + "-".repeat(70));
                System.out.println("\t\t\t    Checkout Summary");
                System.out.println("-".repeat(70));
                System.out.println("Subtotal: PHP " + String.format("%.0f", grandTotal));
                if (eligible) {
                    System.out.println("PWD/Senior Discount (20%): -PHP " + String.format("%.0f", discountAmount));
                }
                System.out.println("TOTAL DUE: PHP " + String.format("%.0f", finalTotal));

                System.out.println("\nProcessing payment... Done! Thank you for your purchase.");
                cart.clear();
                break;
            case 2:
                while (true) {
                    System.out.print("Enter item number to remove: ");
                    if (scanner.hasNextInt()) {
                        int idx = scanner.nextInt();
                        if (idx >= 1 && idx <= cart.size()) {
                            CartItem removed = cart.remove(idx - 1);
                            System.out.println("Removed '" + removed.serviceName + "' from cart.");
                            break;
                        } else {
                            System.out.println("Invalid item number. Try again.");
                        }
                    } else {
                        System.out.println("Invalid input. Enter a number.");
                        scanner.next();
                    }
                }
                break;
            case 3:
                cart.clear();
                System.out.println("Cart cleared.");
                break;
            case 4:
                // back
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}