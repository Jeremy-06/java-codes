import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class day28 {
    public static final String todosFile = "day28todos.txt";

    public static void addTask(ArrayList<String> tasks, Scanner scan){
        System.out.print("\nAdd: ");
        String newTask = scan.nextLine();
        if (!(tasks.contains(newTask))) {
            tasks.add(newTask);
            System.out.println('"' + newTask + '"' + " Added Successfully!");
            saveTask(tasks);
        } else {
            System.out.println('"' + newTask + '"' + " Already exist in the list!!!");
        }
    }

    public static void deleteTask(ArrayList<String> tasks, Scanner scan) {
        boolean exit = false;
        
        do {
            System.out.print("\nEnter task number you want to Delete [0 = cancel]: ");
            try {
                int num = scan.nextInt();
                if (num > 0) {
                    if (!(num > tasks.size())) {
                        boolean innerExit = false;
                        scan.nextLine();
                        do {
                            System.out.print("Are you sure you want to delete " + '"' +  tasks.get(num - 1) + '"' + " ?[yes/no]: ");
                            String delete = scan.nextLine();
                            String LcaseDelete = delete.toLowerCase();
                            if (LcaseDelete.equals("yes")) {
                                System.out.println(tasks.get(num - 1) + " Successfully Deleted!!!");
                                tasks.remove(num - 1);
                                innerExit = true;
                                saveTask(tasks);
                            } else if (LcaseDelete.equals("no")) {
                                System.out.println("Cancelled!!!");
                                innerExit = true;
                            } else {
                                System.out.println("Invalid input!!!");
                            }
                            exit = true;
                        } while (!innerExit);
                    } else {
                        System.out.println("Task number " + num + " does not exist!!!");
                    }
                } else if (num == 0){
                    System.out.println("Cancelled!!!");
                    break;
                } else {
                    System.out.println("Number must be positive!!!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                scan.nextLine();
            }
        } while (!exit);
    }

    public static void saveTask(ArrayList<String> tasks) {
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(todosFile));
            for (int i = 0; i < tasks.size(); i++) {
                bufferedWriter.write(tasks.get(i));
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("BufferedWriter Error: " + e.getMessage());
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    // TODO: handle exception
                    System.out.println("Error closing BufferedWriter: " + e.getMessage());
                }
            }
        }
    }

    public static void viewTask(ArrayList<String> tasks){
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
    
    public static void loadTasks(ArrayList<String> tasks) {
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(todosFile));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                tasks.add(line);
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("BufferedReader error: " + e.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    // TODO: handle exception
                    System.err.println("Error closing BufferedReader: " + e.getMessage());
                }
            }
        }
    }
    public static void displayCommands() {
        System.out.println("\nCommands: ");
        System.out.println("1. Add Task");
        System.out.println("2. Delete Task");
        System.out.println("3. Save Task");
        System.out.println("4. View All Task");
        System.out.println("0. Exit");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        System.out.println("\nSimple To-Do List");
        loadTasks(tasks);
        boolean exit = false;
        do {
            displayCommands();
            System.out.print("Choice: ");
            try {
                int choice = scan.nextInt();
                scan.nextLine();
                switch (choice) {
                    case 1:
                        addTask(tasks, scan);
                        break;
                    case 2:
                        deleteTask(tasks, scan);
                        break;
                    case 3:
                        System.out.println("\nTasks are auto-saved. Manual save complete!");
                        saveTask(tasks);
                        break;
                    case 4: 
                        System.out.println("\nAll tasks: ");
                        viewTask(tasks);
                        break;
                    case 0:
                        System.out.println("Exiting program...");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice!!!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                scan.nextLine();
            }
        } while (!exit);
    }
}
