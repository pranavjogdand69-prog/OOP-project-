 Simple Turn-Based Battle Game (Using Arrays)

Concept Used

Arrays

Loops

Conditional statements

Basic game logic



---

Game Description

There are two players.

Each player has health points (HP) stored in an array.

Players take turns to attack.

Each attack reduces the opponent’s health.

The game ends when one player’s health becomes 0 or less.



---

Java Program

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


---

Explanation

health[] array stores health of both players.

attack[] array stores attack power.

turn variable decides whose turn it is.

% (modulus) is used to alternate turns.

The loop continues until one player’s health becomes zero.



---

How Arrays Help in Game Logic

Purpose	Array Usage

Player Health	health[]
Attack Power	attack[]
Turn Management	Index-based access
Game State	Easy update and tracking



---

Advantages of Using Arrays in Games

Easy to manage multiple players

Fast access to data

Less code and simple logic

Ideal for beginner-level games



---

Conclusion

Arrays play an important role in implementing game mechanics such as:

Turn-based combat

Player stats tracking

Game state management


This simple Java program demonstrates how arrays can be effectively used to build basic game logic.


