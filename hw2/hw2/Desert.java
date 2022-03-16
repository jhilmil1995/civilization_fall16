import java.util.Scanner;
import java.util.Random;

public class Desert {
    private Scanner scan = new Scanner(System.in);
    private static Random randomGenerator = new Random();

    public int findTreasure() {
        // YOUR CODE HERE
        // A valid treasure trove must be greater than 0
        boolean lostPlayer = true;
        while (lostPlayer) {
            int playerMove = randomGenerator.nextInt(10);
            if (playerMove != 0) {
                lostPlayer = false;
            } else {
                lost()
            }
        }
        return randomGenerator.nextInt(500) + 1;
    }

    public boolean lost() {
        System.out.println("You have gotten lost! Press 1 to try escaping the"
            + " Desert.\nHopefully you can make it out alive.");
        int move = scan.nextInt();
        return (move == 1) ? false : true;
    }
}
