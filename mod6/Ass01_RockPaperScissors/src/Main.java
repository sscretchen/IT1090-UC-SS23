import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Old pseudo program
        //        class RockPaperGame
        //	main()
        //        String playerA// (R) Rock, (P) Paper, (S) Scissors
        //        String playerB// (R) Rock, (P) Paper, (S) Scissors
        //        String keepPlaying
        //        do
        //            ouput "Continue playing (Y/N)? "
        //        input keepPlaying
        //        while keepPlaying == "Y":
        //        ouput "Player 1 turn (R/P/S: "
        //        input playerA
        //        ouput "Player 2 turn (R/P/S: "
        //        input playerB
        //        if playerA == "R":
        //        if playerB == "R":
        //        ouput "TIED!"
        //        ouput "Continue playing (Y/N)? "
        //        input keepPlaying
        //			else if playerB == "P":
        //        output "Paper covers Rock. Player 2 wins"
        //        ouput "Continue playing (Y/N)? "
        //        input keepPlaying
        //			else if playerB == "S":
        //        output "Rock breaks Scissors. Player 1 wins"
        //        ouput "Continue playing (Y/N)? "
        //        input keepPlaying
        //        if playerA == "S":
        //        if playerB == "S":
        //        ouput "TIED!"
        //        ouput "Continue playing (Y/N)? "
        //        input keepPlaying
        //			else if playerB == "P":
        //        output "Scissors cut Paper. Player 2 wins"
        //        ouput "Continue playing (Y/N)? "
        //        input keepPlaying
        //			else if playerB == "R":
        //        output "Rock breaks Scissors. Player 2 wins"
        //        ouput "Continue playing (Y/N)? "
        //        input keepPlaying
        //        if playerA == "P":
        //        if playerB == "P":
        //        ouput "TIED!"
        //        ouput "Continue playing (Y/N)? "
        //        input keepPlaying
        //			else if playerB == "R":
        //        output "Paper covers Rock. Player 1 wins"
        //        ouput "Continue playing (Y/N)? "
        //        input keepPlaying
        //			else if playerB == "S":
        //        output "Scissors cut paper. Player 2 wins"
        //        ouput "Continue playing (Y/N)? "
        //        input keepPlaying
        //        endif
        //                endwhile
        //        return()
        //        end class

        // Variables
        String playerAMove = "";
        String playerBMove = "";
        String keepPlaying = "";
        boolean playerAInput = false;
        boolean playerBInput = false;
        boolean endGame = false;

        Scanner in = new Scanner(System.in);
        do {
            // Start of game & introduction
            System.out.println("Welcome to Rock, Paper, Scissor.");
            System.out.println("Please choose (R)ock, (P)aper, or (S)cissors");

            // Player 1 move and input check
            do {
                System.out.print("[+] Player 1 move: ");
                playerAMove =  in.nextLine();
                playerAInput = playerAMove.equalsIgnoreCase("r") || playerAMove.equalsIgnoreCase("p") || playerAMove.equalsIgnoreCase("s");
                if (!playerAInput)
                {
                    System.out.println("Invalid input: " + playerAMove + ", Please select one of the following [R,P,S]");
                }
            }while (!playerAInput);
            if (playerAMove.equalsIgnoreCase("R")){
                System.out.println("Player 1 chose Rock");
            } else if (playerAMove.equalsIgnoreCase("P")) {
                System.out.println("Player 1 chose Paper");
            } else {
                System.out.println("Player 1 chose Scissors");
            }

            // Player 2 move and input check
            do {
                System.out.print("[+] Player 2 move: ");
                playerBMove =  in.nextLine();
                playerBInput = playerBMove.equalsIgnoreCase("r") || playerBMove.equalsIgnoreCase("p") || playerBMove.equalsIgnoreCase("s");
                if (!playerBInput)
                {
                    System.out.println("Invalid input: " + playerBMove + ", Please select one of the following [R,P,S]");
                }
            }while (!playerBInput);
            if (playerBMove.equalsIgnoreCase("R")){
                System.out.println("Player 2 chose Rock");
            } else if (playerBMove.equalsIgnoreCase("P")) {
                System.out.println("Player 2 chose Paper");
            } else {
                System.out.println("Player 2 chose Scissors");
            }

            // Check for winner - Rock
            if (playerAMove.equalsIgnoreCase("r")){
                if (playerBMove.equalsIgnoreCase("r")){
                    System.out.println("Rock vs. Rock, it's a tie!");
                } else if (playerBMove.equalsIgnoreCase("p")){
                    System.out.println("Paper Covers Rock. Player 2 wins!");
                } else if (playerBMove.equalsIgnoreCase("s")){
                    System.out.println("Rock breaks Scissors. Player 1 wins!");
                }
            }
            // Check for winner - Paper
            if (playerAMove.equalsIgnoreCase("p")){
                if (playerBMove.equalsIgnoreCase("p")){
                    System.out.println("Paper vs. Paper, it's a tie!");
                } else if (playerBMove.equalsIgnoreCase("r")){
                    System.out.println("Paper Covers Rock. Player 1 wins!");
                } else if (playerBMove.equalsIgnoreCase("s")){
                    System.out.println("Scissors cuts Paper. Player 2 wins!");
                }
            }
            // Check for winner - Scissor
            if (playerAMove.equalsIgnoreCase("s")){
                if (playerBMove.equalsIgnoreCase("s")){
                    System.out.println("Scissors vs. Scissors, it's a tie!");
                } else if (playerBMove.equalsIgnoreCase("p")){
                    System.out.println("Scissors cuts Paper. Player 1 wins!");
                } else if (playerBMove.equalsIgnoreCase("s")){
                    System.out.println("Rock breaks Scissors. PLayer 2 wins!");
                }
            }

            // loop logic to end or continue game
            System.out.print("Would you like to play another match (Y/N): ");
            keepPlaying = in.nextLine();

            if (keepPlaying.equalsIgnoreCase("N"))
            {
                endGame = true;
            }
        }while (!endGame);
    }
}