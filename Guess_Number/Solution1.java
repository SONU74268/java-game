import java.util.Random;
import java.util.Scanner;

public class Solution1 {

    private static void guesNumber() {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int correct_guess = random.nextInt(100);
        System.out.println(correct_guess);

        // System.out.println("What's your good name : ");
        // String user_name = in.next();

        // System.out.println("Welcome to Java Guess Number Game");
        // System.out.println("Hiii... : " + user_name);

        // System.out.println("Hey " + user_name + "\nGuess requied :");
        System.out.println("Please Choose the value between 5 to 10 : ");
        int max_guess_no = in.nextInt();
        for (int i = 1; i <= max_guess_no; i++) {

            System.out.println("Guess number : ");
            ;
            int user_guess = in.nextInt();
            if (correct_guess == user_guess) {
                System.out.println("Congratulation! You Win!!!");
                break;
            } else if (correct_guess > user_guess) {
                System.out.println("Number is greater than : " + user_guess);
            } else {
                System.out.println("Number is lesser than : " + user_guess);
            }
            if (i == max_guess_no) {
                System.out.println("Better luck next Time!!");
            }
        }
        in.close();
    }

    public static void main(String[] args) {
        Solution1.guesNumber();
    }
}