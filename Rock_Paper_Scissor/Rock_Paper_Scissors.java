import java.util.Random;
import java.util.Scanner;

/**
 * Rock_Paper_Scissors
 */
public class Rock_Paper_Scissors {
    static Thread thread = new Thread();

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String x = "Rock";
        String y = "Papper";
        String z = "Scissor";
        String user_2_move = "";

        System.out.println("Enter your name : ");
        String user_1 = sc.next();
        System.out.println("user 1 is : " + user_1);

        System.out.println("Choose move : " + x + y + z + "\nuser1 : ");
        String user_1_move = sc.next();
        System.out.print(user_1_move);
        System.out.println("user 2 is : hpDesktop");
        switch (random.nextInt(3)) {
            case 0:
                user_2_move = x;
                System.out.println("user2 : " + x);
                break;
            case 1:
                user_2_move = y;
                System.out.println("user2 : " + y);
                break;
            case 2:
                user_2_move = z;
                System.out.println("user2 : " + z);
                break;
            default:
                break;
        }

        Thread.sleep(2000);
        if (user_1_move.compareTo(user_2_move) == 0) {
            System.out.println("draw try again");
        } else if (user_1_move.compareTo("Rock") == 0) {
            if (user_2_move.compareTo("Papper") == 0) {
                System.out.println("user 2 wim");
            } else
                System.out.println("user 1 win : " + user_1);
        } else if (user_1_move.compareTo("Papper") == 0) {
            if (user_2_move.compareTo("Scissor") == 0) {
                System.out.println("user 2 wim");
            } else
                System.out.println("user 1 win : " + user_1);
        } else if (user_1_move.compareTo("Scissor") == 0) {
            if (user_2_move.compareTo("Rock") == 0) {
                System.out.println("user 2 win");
            } else
                System.out.println("user 1 win : " + user_1);
        }
        sc.close();
    }
}