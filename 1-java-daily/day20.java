import java.util.Scanner;

public class day20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nPrime Number Checker");
        boolean exit = false;
        int num;
        do {
            System.out.print("\nEnter a number: ");
            num = scan.nextInt();
            if (num < 0) {
                System.out.println("Number must be positive");
            } else {
                exit = true;
            }
        } while (!exit);
        boolean isPrime = primeChecker(num);
        System.out.println("Is it a Prime number? " + isPrime);
    }
    static boolean primeChecker(int num) {
        boolean isPrime = false;
        int numSqrt = (int)Math.sqrt(num);
        //System.out.println(numSqrt);
        if (num == 2 || num == 3){
            return true;
        }
        for (int i = numSqrt; i >= 2; i--) {
            if (num % i == 0) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }      
        }
        return isPrime;
    }
}