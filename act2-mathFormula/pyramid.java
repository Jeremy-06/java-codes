import java.util.Scanner;

public class pyramid {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        GeometricFormulas();
        Menu();
        while (true) {
            int choice = userChoice();
            if (choice == 6) {
                System.out.println("Thank you for using the Triangular Pyramid Calculator!");
                break;
            }
            double edgeLength = getEdgeLength();
            result(choice, edgeLength);
            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
        }
        scanner.close();
    }

    public static void GeometricFormulas() {
        System.out.println("==============================================");
        System.out.println("    TRIANGULAR PYRAMID CALCULATOR");
        System.out.println("==============================================");
        System.out.println("This program calculates properties of a regular");
        System.out.println("triangular pyramid (tetrahedron) with edge length 'a'");

        
    }
    public static void Menu() {
        System.out.println("\n==============================================");
        System.out.println("              MENU OPTIONS");
        System.out.println("==============================================");
        System.out.println("1. Calculate Base Area");
        System.out.println("2. Calculate Lateral Area");
        System.out.println("3. Calculate Total Surface Area");
        System.out.println("4. Calculate Height");
        System.out.println("5. Calculate Volume");
        System.out.println("6. Exit");
        System.out.println("==============================================");
    }
    public static int userChoice(){
        System.out.print("Enter your choice (1-6): ");
        while (true) {
             try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                if (choice >= 1 && choice  <= 6){
                    return choice;
                } else {
                    System.out.println("Invalid choice! Please enter a number between 1-6:  ");
                }
            } catch (Exception e) {
                    System.out.print("Invalid input! Please enter a valid number (1-6): ");
                    scanner.nextLine();
            }
        }
    }
    public static double getEdgeLength(){
        while (true) {
            try {
                System.out.print("\nEnter the edge length (a) of the triangular pyramid: ");
                double edgeLength = Double.parseDouble(scanner.nextLine());
                if (edgeLength > 0) {
                    return edgeLength;
                } else {
                    System.out.println("Edge length must be positive! Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
    }
    public static void result(int choice, double a){
        System.out.println("\n==============================================");
        System.out.println("              RESULTS");
        System.out.println("==============================================");
        System.out.println("Using YOUR input value: a = " + a);
        System.out.println("----------------------------------------------");
        switch (choice) {
            case 1:
                BaseArea(a);
                break;
            case 2:
                LateralArea(a);
                break;
            case 3:
                SurfaceArea(a);
                break;
            case 4:
                Height(a);
                break;
            case 5:
                Volume(a);
                break;
            default:
                break;
        }
        System.out.println("==============================================");
    }
    public static void BaseArea(double a) {
        // Base Area: A_base = (√3/4)·a²
        double baseArea = (Math.sqrt(3) / 4) * Math.pow(a, 2);
        System.out.println("Base Area Formula: A_base = (√3/4)·a²");
        System.out.println("Base Area = " + baseArea + " square units");
    }
    public static void LateralArea(double a) {
        // Lateral Area: A_lat = (3√3/4)·a²
        double lateralArea = (3 * Math.sqrt(3) / 4) * Math.pow(a, 2);
        System.out.println("Lateral Area Formula: A_lat = (3√3/4)·a²");
        System.out.println("Lateral Area = " + lateralArea + " square units");
    }
    public static void SurfaceArea(double a) {
        double totalSurfaceArea = Math.sqrt(3) * Math.pow(a, 2);
        System.out.println("Total Surface Area Formula: TSA = √3·a²");
        System.out.println("Total Surface Area = " + totalSurfaceArea + " square units");
    }
    public static void Height(double a) {
        // Height: h = √(2/3)·a
        double height = Math.sqrt(2.0/3.0) * a;
        System.out.println("Height Formula: h = √(2/3)·a");
        System.out.println("Height = " + height + " units");
    }
    public static void Volume(double a) {
        double volume = Math.pow(a, 3) / (6 * Math.sqrt(2));
        System.out.println("Volume Formula: V = a³ / (6√2)");
        System.out.println("Volume = " + volume + " cubic units");
    }
}
