import java.util.Scanner;
import java.nio.channels.Pipe.SourceChannel;
import java.util.HashMap;
import java.util.Map;

public class day18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer, Integer> numbers = new HashMap<>();

        System.out.println("\nTwo Sum Problem]n");
        System.out.print("Enter numbers(num1, num2, ..., lastNum): ");
        String numString = scan.nextLine();
        String[] stringArray = numString.split(",");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i].trim());
        }
        System.out.print("Enter taget: ");
        int target = scan.nextInt();
        System.out.print("Indices: ");
        for (int i = 0; i < intArray.length; i++) {
            int pair = target - intArray[i];
            if (numbers.containsKey(pair)) {
                System.out.println(numbers.get(pair) + ", " + i);
                break;
            }
            numbers.put(intArray[i], i);
        }
    }
}
