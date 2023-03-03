import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        // declared variables
        int playerDieOne;
        int playerDieTwo;
        int rollSum; // to calculate each roll until condition met
        int newRollSum = 0; // in case no condition met in first roll
        String keepPlaying = "";
        boolean endGame = false;

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        while (!endGame) {
            System.out.println("Welcome to Craps. Roll the die to get started");

            // create the random roll from the player and add for result
            playerDieOne = rnd.nextInt(6) + 1; // generates a random int between 1 and 6
            playerDieTwo = rnd.nextInt( 6) + 1; // generates a random int between 1 and 6
            rollSum = playerDieOne + playerDieTwo; // Use as the check against win or lose condition
            System.out.printf("Roll 1 - %d \nRoll 2 - %d \nResult: %d %n", playerDieOne, playerDieTwo, rollSum);

            // Check players first roll for a win
            if (rollSum == 7 || rollSum == 11)
            {
                System.out.println("Congrats! You win with a natural roll!");
                return;
            } // Check for player crapping out
            if (rollSum == 2 || rollSum == 3 || rollSum == 12)
            {
                System.out.println("You crapped out");
                return;
            }

            // if player does not meet either a win or lose condition, keep rolling
            // they need to hit either a 7 to lose or match the sum of their first roll
            while (newRollSum != rollSum && newRollSum != 7) {
                System.out.println("Sum point is now " + rollSum);
                playerDieOne = rnd.nextInt(6) + 1;
                playerDieTwo = rnd.nextInt(6) + 1;
                newRollSum = playerDieOne + playerDieTwo;
                System.out.printf("Roll 1 - %d \nRoll 2 - %d \nResult: %d %n", playerDieOne, playerDieTwo, newRollSum);
            }

            // Check the new sum against the first roll for a win condition
            if (newRollSum == rollSum) {
                System.out.println("Congrats. You win!");
            } else {
                System.out.println("You lose..");
            }

            // logic to end or continue game. Win or lose they receive this prompt
            System.out.print("Another roll? (Y/N): ");
            keepPlaying = in.nextLine();

            if (keepPlaying.equalsIgnoreCase("N"))
            {
                endGame = true;
            }
        }
    }
}