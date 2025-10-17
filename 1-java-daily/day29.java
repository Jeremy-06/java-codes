import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;

class day29Contacts {
    private final HashMap<String, String> contact;

    public day29Contacts(HashMap<String, String> contact) {
        this.contact = new HashMap<>(contact == null ? Collections.emptyMap() : contact);
    }
    public String getContacts(String name) {
        return contact.get(name);
    }
    public void setContacts(String name, String number) {
        this.contact.put(name, number);
    }

    public void displayAll() {
        if (contact.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("\n");
            contact.forEach((name, number) -> System.out.println(name + ": " + number));
        }
    }
}
public class day29 {
    public static void addContacts(Scanner scan, day29Contacts contacts) {
        scan.nextLine();
        System.out.print("\nAdd (name, number): ");
        String addString = scan.nextLine();
        String[] arrayStrings = addString.split(",");
        if (arrayStrings.length != 2) {
            System.out.println("Invalid format. Use: name, number");
            return;
        }
        String name = arrayStrings[0].trim();
        String number = arrayStrings[1].trim();
        contacts.setContacts(name.toLowerCase(), number);
        System.out.println("Contact added successfully!");
    }

    public static void searchContact(Scanner scan, day29Contacts contacts) {
        scan.nextLine();
        System.out.print("\nEnter name to Search: ");
        String name = scan.nextLine().trim();
        String lCaseName = name.toLowerCase();
        String number = contacts.getContacts(lCaseName);

        if (number != null) {
            System.out.println(name + ": " + number);
        } else {
            System.out.println("Contact not found.");
        }
    }
    public static void Menu(){
        System.out.println("\nMenu");
        System.out.println("1. Add Contact");
        System.out.println("2. Search Contact");
        System.out.println("3. Display All Contacts");
        System.out.println("0. Exit");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        day29Contacts contacts = new day29Contacts(new HashMap<>());

        System.out.println("\nContact Book Application - Part 1");
        boolean exit = false;
        do {
            Menu();
            System.out.print("Choice: ");
            try {
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        addContacts(scan, contacts);
                        break;
                    case 2:
                        searchContact(scan, contacts);
                        break;
                    case 3:
                        contacts.displayAll();
                        break;
                    case 0:
                        System.out.println("Exiting program...");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number");
                scan.nextLine();
            }
        } while (!exit);
        scan.close();
    }
}
