import java.util.Scanner;

public class day9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nSum of Array Elements");
        System.out.print("Enter numbers(num1, num2, ..., lastNum): ");
        String numbers = scan.nextLine();
        String[] stringArray = numbers.split(",");
        double[] doubleArray = new double[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            doubleArray[i] = Double.parseDouble(stringArray[i].trim());
        }
        double sum = 0;
        sum = sumOfArray(doubleArray);
        System.out.print("Sum of Array: " + sum + "\n\n");
        scan.close();
    }
    public static double sumOfArray(double[] doubleArray) {
        double sum = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            sum += doubleArray[i];
        }
        return sum;
    }
}
