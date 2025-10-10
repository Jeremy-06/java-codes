import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class day22 {
    private static final String fileName = "day22.txt";
    public static void main(String[] args) {
        System.out.println("\nFile Reading and Word Count");

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));

            String line;
            int wordCount = 0;
            System.out.println("--------");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                if (!line.trim().isEmpty()){
                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                }
            }
            System.out.println("--------");
            System.out.println("\nWord count: " + wordCount + "\n");
        } catch (IOException e) {
            // TODO: handle exception
            System.err.println("BufferedReader error: " + e.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.err.println("Error closing BufferedReader: " + e.getMessage());
                }
            }
        }
    }    
}
