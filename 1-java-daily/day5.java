import java.util.Scanner;

public class day5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int randomNum = (int)(Math.random() * 101);

        System.out.println("Guess the random number 0-100");
        int i = 0;
        while (i != 1) {
            System.out.print("Enter your guess: ");
            int number = scanner.nextInt();
            i = random(number, randomNum, i);     
        }
        scanner.close();
    }
    static int random(int number, int randomNum, int i){
        if (randomNum == number){
            System.out.println("Correct!");
            i = 1;
        } else if (randomNum > number){
            System.out.println("Too low!");
            i = 0;
        } else if (randomNum < number){
            System.out.println("Too high!");
            i = 0;
        }
        return i;
    }
}