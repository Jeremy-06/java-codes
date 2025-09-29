import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nPalindrome Checker");
        System.out.print("Enter a word: ");
        String word = scan.nextLine();

        String lowerWord = word.toLowerCase();
        System.out.print("Palindrome: " + palindromeCheck(lowerWord) + "\n\n");
        scan.close();
    }
    public static boolean palindromeCheck(String lowerWord) {
        String reverseWord = "";
        for (int i = lowerWord.length() - 1; i >= 0; i--) {
            reverseWord += lowerWord.charAt(i);
        }
        System.out.println(reverseWord);
        System.out.println(lowerWord);
        return reverseWord.equals(lowerWord);
    }
}