import java.util.Scanner;

public class day19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nBubble Sort Implementation");

        System.out.print("\nEnter a number(num1, num2, ..., lastNum): ");
        String numbers = scan.nextLine();
        String[] numArray = numbers.split(",");
        int[] num = new int[numArray.length];
        for (int i = 0; i < numArray.length; i++) {
            num[i] = Integer.parseInt(numArray[i].trim());
        }
        System.out.print("Sorted Array: ");
        bubbleSort(num);
    }
    //5, 1, 4, 2, 8
    //0, 1, 2, 3, 4
    static void bubbleSort(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j  + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i != num.length - 1) {
                System.out.print(", ");
            }
        } 
    }
}
