import java.util.Scanner;

public class day26 {
    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[m + 1 + i];
        }

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
                k++;
            } else {
                arr[k] = R[j];
                j++;
                k++;
            } 
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort (int[] num, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(num, l, m);
            mergeSort(num, m + 1, r);

            merge(num, l, m, r);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nMerge Sort Algorithm");
        System.out.print("\nEnter an unsorted numbers(num1, num2, ..., lastNum): ");
        String numbers = scan.nextLine();
        String[] numStrings = numbers.split(",");
        int[] numInt = new int[numStrings.length];

        for (int i = 0; i < numStrings.length; i++) {
            numInt[i] = Integer.parseInt(numStrings[i].trim());
        }

        mergeSort(numInt, 0, numInt.length - 1);
        System.out.print("Sorted numbers: ");
        for (int i = 0; i < numInt.length; i++) {
            System.out.print(numInt[i]);
            if (i != numInt.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
        scan.close();
    }
}