import java.util.Scanner;

public class day1 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        
        System.out.println("Hello, " + name + "!");
    }
}
