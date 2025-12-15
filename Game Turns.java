import java.util.Scanner;

public class TurnBasedGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array to store health of players
        int[] health = {100, 100};

        // Array to store attack power
        int[] attack = {20, 15};

        int turn = 0;

        System.out.println("=== Simple Turn-Based Battle Game ===");

        while (health[0] > 0 && health[1] > 0) {

            int attacker = turn % 2;
            int defender = (turn + 1) % 2;

            System.out.println("\nPlayer " + (attacker + 1) + " attacks!");
            health[defender] -= attack[attacker];

            System.out.println("Player 1 Health: " + health[0]);
            System.out.println("Player 2 Health: " + health[1]);

            turn++;
        }

        if (health[0] <= 0) {
            System.out.println("\nPlayer 2 Wins!");
        } else {
            System.out.println("\nPlayer 1 Wins!");
        }

        sc.close();
    }
}
