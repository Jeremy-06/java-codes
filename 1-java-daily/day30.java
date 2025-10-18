import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;

class day30Contacts {
    private final HashMap<String, String> contact;
    public static final String contactsFile = "day30Contacts.txt";

    public day30Contacts(HashMap<String, String> contact) {
        this.contact = new HashMap<>(contact == null ? Collections.emptyMap() : contact);
    }
    public String getContacts(String name) {
        return contact.get(name);
    }
    public void setContacts(String name, String number) {
        this.contact.put(name, number);
    }
    public void removeContacts(String name) {
        this.contact.remove(name);
    }

    public void displayAll() {
        if (contact.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("\nAll contacts");
            contact.forEach((name, number) -> System.out.println(name + ": " + number));
        }
    }

    public void saveContacts(){
        //BufferedWriter bufferedWriter = null;
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(contactsFile))) {
            for (String name : contact.keySet()) {
                bufferedWriter.write(name + ": " + contact.get(name));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("BufferedWriter Error: " + e.getMessage());
        }// finally {
        //     if (bufferedWriter != null) {
        //         try {
        //             bufferedWriter.close();
        //         } catch (IOException e) {
        //             System.out.println("Error closing BufferedWriter: " + e.getMessage());
        //         }
        //     }
        // }
    }

    public void loadContacts(){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(contactsFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arrayLine = line.split(":", 2);
                if (arrayLine.length == 2) {
                    String name = arrayLine[0].trim();
                    String number = arrayLine[1].trim();
                    setContacts(name.toLowerCase(), number);
                }
            }
        } catch (IOException e) {
          System.out.println("BufferedReader error: " + e.getMessage());
        }
    }
}
public class day30 {

    public static void addContacts(Scanner scan, day30Contacts contacts) {
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
        contacts.saveContacts();
    }

    public static void searchContact(Scanner scan, day30Contacts contacts) {
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

    public static void deleteContact(Scanner scan, day30Contacts contacts) {
        scan.nextLine();
        System.out.print("\nEnter name to Delete: ");
        String name = scan.nextLine().trim();
        String lCaseName = name.toLowerCase();
        String number = contacts.getContacts(lCaseName);

        if (number != null) {
            do {
                System.out.print("Confirm delete " + '"');
                System.out.print(name + ": " + number);
                System.out.print('"' + " [Y/N]: ");
                try {
                    char confirm = scan.nextLine().charAt(0);
                    if (confirm == 'y' || confirm == 'Y') {
                        contacts.removeContacts(lCaseName);
                        System.out.println('"' + name + ": " + number + '"' + " Deleted Successfully");
                        contacts.saveContacts();
                        break;
                    } else {
                        System.out.println("Cancelled!!!");
                        break;
                    }
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println("Please input a valid character.");
                }
            } while (true);

        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void Menu(){
        System.out.println("\nMenu:");
        System.out.println("1. Add Contact");
        System.out.println("2. Search Contact");
        System.out.println("3. Delete Contact");
        System.out.println("4. Save");
        System.out.println("5. Display All");
        System.out.println("0. Exit");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        day30Contacts contacts = new day30Contacts(new HashMap<>());

        System.out.println("\nContact Book Application - Part 1");
        contacts.loadContacts();
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
                        deleteContact(scan, contacts);
                        break;
                    case 4:
                        contacts.saveContacts();
                        System.out.println("\nContacts saved successfully!");
                        break;
                    case 5:
                        contacts.displayAll();
                        break;
                    case 0:
                        System.out.println("\nExiting program...");
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
