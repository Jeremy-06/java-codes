import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nFactorial with Recursion\n");
        do{ System.out.print("Enter a number: ");
            int number = scan.nextInt();
            if (number >= 0) {
                System.out.println(number + " Factorial: " + Factorial(number) + "\n\n");
                break;
            }
            System.out.println("Number cannot be negative");
        } while (true);
        scan.close();
    }
    public static int Factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * Factorial(number - 1);
    }
}
