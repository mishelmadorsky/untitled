import java.util.Random;
import java.util.Scanner;

public class ExNumber10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int cnt1 = 0;
        int cnt2 = 0;
        int player = 0;
        boolean isOver = false;
        int randomNumber = random.nextInt(1000);

        while (isOver == false) {

            if (player == 0) {
                cnt1++;
                System.out.println("Player 1 enter your guess");
                int guess = scanner.nextInt();
                isOver = play(guess, randomNumber, cnt1);
                player = 1;
            } else {
                cnt2++;
                System.out.println("Player 2 enter your guess");
                int guess = scanner.nextInt();
                isOver = play(guess, randomNumber, cnt2);
                player = 0;
            }
        }
    }

    public static boolean play(int guess, int randomNumber, int cnt) {
        if (randomNumber < guess) {
            System.out.println("The secret number is smaller than your guess");
        } else if (randomNumber > guess) {
            System.out.println("The secret number is bigger than your guess");
        } else {
            System.out.println("You won after guesses" + cnt);
            return true;
        }
        return false;
    }
}
