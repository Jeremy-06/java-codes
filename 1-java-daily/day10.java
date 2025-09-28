import java.util.Scanner;

public class day10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nFibonacci Sequence\n");
        System.out.print("Enter (n): ");
        int n = scan.nextInt();
        
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(FibonacciSequence(i));
            if (i != n-1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");  
        scan.close();
    }
    public static int FibonacciSequence(int n){
        if (n == 0) {return 0;}
        if (n == 1) {return 1;}
        return FibonacciSequence(n-1) + FibonacciSequence(n -2);
    }
}
