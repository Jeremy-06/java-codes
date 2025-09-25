import java.util.Scanner;

public class day7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vowelCount = 0;

        System.out.println("Vowel Counter");
        System.out.print("Enter a word/s: ");
        String words = scanner.nextLine();
        vowelCount = vowelCounter(words, vowelCount);
        System.out.println("\nNumber of vowels: " + vowelCount);
        scanner.close();
    }
    static int vowelCounter(String words, int vowelCount) {
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        String lowerWords = words.toLowerCase();

        for (int i = 0; i < lowerWords.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (lowerWords.charAt(i) == vowels[j]) {
                    vowelCount++;
                }
            }
        }
        return vowelCount;
    }
}
