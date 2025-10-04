import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> wordsCount = new HashMap<>();

        System.out.println("\nWord Frequency Counter\n");

        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine();
        String[] words = sentence.split(" ");

        //Java is fun and Java is powerful
        // for (int i = 0; i < words.length; i++) {
        //     if (!wordsCount.containsKey(words[i])) {
        //         wordsCount.put(words[i], 1);
        //     } else {
        //         int Value = wordsCount.get(words[i]);
        //         wordsCount.put(words[i], Value+1);
        //     }
        // }
        for (int i = 0; i < words.length; i++) {
            wordsCount.put(words[i], wordsCount.getOrDefault(words[i], 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            System.out.println(entry.getKey() + " = " +  entry.getValue());
        }
    }
}
