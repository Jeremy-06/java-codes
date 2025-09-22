import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        System.err.print("Reverse word: ");
        revereString(word);
        scanner.close();
    }
    static void revereString(String word){
        for (int i = word.length() - 1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
    }
}
