import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //import tools
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        //variables
        int userNumGuess;
        int min = 1;
        int max = 10;
        int compNumGuess;
        boolean userWins = false;

        // Intro to program and start computer guess
        System.out.println("Welcome to the Guess Game. Its you vs the CPU!");

        compNumGuess = random.nextInt(max) + 1;

        // Loop until user guesses correct then exit and they win
        while (!userWins)
        {
            System.out.print("User Guess: ");
            userNumGuess = in.nextInt();
            in.nextLine(); // clear buffer

            // Low guess
            if (userNumGuess < compNumGuess) {
                System.out.println("Too low. Try again");
                // high guess
            } else if (userNumGuess > compNumGuess) {
                // correct guess. Exit loop
                System.out.println("Too High. Try again");
            } else {
                System.out.println("Right on the money!");
                userWins = true;
            }
        }
        System.out.println("Thanks for playing");
    }
}