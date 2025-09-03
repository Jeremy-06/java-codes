import java.util.Scanner;

public class biodata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=======================================");
        System.out.println("       BIODATA INFORMATION SYSTEM     ");
        System.out.println("=======================================");
        System.out.println();
        
        // Collect user input
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your gender (M/F/Other): ");
        String gender = scanner.nextLine();
        
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
        
        System.out.print("Enter your nationality: ");
        String nationality = scanner.nextLine();
        
        System.out.print("Are you a student or working professional? ");
        String occupation = scanner.nextLine();
        
        System.out.print("How many hobbies do you have? ");
        int numHobbies = scanner.nextInt();
        scanner.nextLine();
        
        String[] hobbies = new String[numHobbies];
        System.out.println("Enter your hobbies (one per line):");
        for (int i = 0; i < numHobbies; i++) {
            System.out.print("Hobby " + (i + 1) + ": ");
            hobbies[i] = scanner.nextLine();
        }
        
        // Display biodata
        System.out.println("\n=======================================");
        System.out.println("           YOUR BIODATA               ");
        System.out.println("=======================================");
        System.out.println("Full Name      : " + fullName);
        System.out.println("Age            : " + age + " years");
        System.out.println("Gender         : " + gender);
        System.out.println("Email          : " + email);
        System.out.println("Phone Number   : " + phoneNumber);
        System.out.println("Address        : " + address);
        System.out.println("Occupation     : " + occupation);
        System.out.println("Nationality    : " + nationality);
        System.out.print("Hobbies        : ");
        for (int i = 0; i < hobbies.length; i++) {
            if (i == 0) {
                System.out.println(hobbies[i]);
            } else {
                System.out.println("                 " + hobbies[i]);
            }
        }
        System.out.println("=======================================");
        
        scanner.close();
        System.out.println("\nThank you for using the Biodata System!");
    }
}
