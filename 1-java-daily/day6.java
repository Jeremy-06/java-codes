import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Multiplication Table");
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        Multiplication(number);
        scanner.close();
    }
    static void Multiplication(double number){
        for (int i = 1; i <= 10; i++) {
            System.out.println((int)number + " " + "* " + i + " " + "= " + (int)(number*i));
        }
    }
}
