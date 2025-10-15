import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class day27 {
    public static void addTask(ArrayList<String> tasks, String newTask){
        tasks.add(newTask);
    }

    public static void viewTask(ArrayList<String> tasks){
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i+1 + ". " + tasks.get(i));
        }
            
    }
    public static void displayCommands() {
        System.out.println("\nCommands: ");
        System.out.println("1. Add Task");
        System.out.println("2. View All Task");
        System.out.println("0. Exit");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        System.out.println("\n Simple To-Do List");
        displayCommands();
        boolean exit = false;
        do {
            System.out.print("Choice: ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Add: ");
                    String newTask = scan.nextLine();
                    addTask(tasks, newTask);
                    break;
                case 2:
                    System.out.println("\nAll tasks: ");
                    viewTask(tasks);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    break;
            }
        } while (!exit);
        
    }
}
