public class Main {
    public static void main(String[] args)
    {
        int numToGuess = 5;
        double numCheck = 0;
        double modCheck = 0;

        numCheck = numToGuess / 2;
        modCheck = numToGuess % 2;

        System.out.println("Enter a number. The computer will perform modulo on the number and guess Odd or Even");
        // user enters number
        if(numToGuess % 2 == 0)
            System.out.println("Your guess: " + numToGuess + " is even");
        else
            System.out.println("Your guess: " + numToGuess + " is odd");
        System.out.println("To confirm. Your guess: " + numToGuess + " divided by 2 is " + numCheck + " remainder " + modCheck);
    }
}