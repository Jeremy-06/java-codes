import java.util.Scanner;
import java.util.Stack;

public class day21 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if (s == null || s.isEmpty()) {return true;}
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty(); 
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nValid Parentheses");
        System.out.print("\nEnter a text with parentheses: ");
        String s = scan.nextLine();
        boolean valid = isValid(s);
        System.out.println("Valid Parentheses: " + valid);
        scan.close();
    }
}
