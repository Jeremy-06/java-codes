import java.util.Scanner;

public class day8 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("\nFind the Maximum\n");
        System.out.print("Enter numbers(num1, num2, ..., lastNum): ");
        String numbers = scan.nextLine();
        String[] stringArray = numbers.split(",");
        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i].trim());
        }
        int Maximum = 0;
        Maximum = maximumNum(intArray);
        System.out.println("The maximum value is: " + Maximum + "\n");
        scan.close();
    }
    static int maximumNum(int[] intArray) {
        int Maximum = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (Maximum < intArray[i]) {
                Maximum = intArray[i];
            }
        }    
        return Maximum;
    }
}
