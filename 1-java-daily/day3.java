import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("EVEN OR ODD?");
        System.out.print("\nEnter a Number: ");
        double num = scanner.nextDouble();
        evenOdd(num);
        scanner.close();
    }
    static void evenOdd(double num){
        if (num % 2 == 1 ){
            System.out.println("The number is odd.");
        } else {
            System.err.println("The number is even");
        }
    }
}
