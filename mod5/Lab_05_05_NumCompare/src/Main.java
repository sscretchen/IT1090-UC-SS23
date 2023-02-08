public class Main {
    public static void main(String[] args)
    {
        //class MatchMaking
        //   main()
        //	num check1 // choose first number value.
        //	num check2 // choose second number value.
        //output “Input two numbers for comparison”
        //output “Number 1: ”
        //input check1
        //output “Number 2: ”
        //input check2
        //
        //if check1 == check2 then:
        //	output “Your numbers are equal”
        //else if check1 < check2 then:
        //output “Your first number ” + check1 + “ is less than your second number “ + check2
        //	endif
        //else:
        //output “Your second number ” + check2 + “ is less than your first number “ + check1
        //return
        //end class
        int userNumOne = 37;
        int userNumTwo = 37;

        System.out.println("Please enter first number: ");
        // user enters first number

        System.out.println("Please enter second number for comparison: ");
        // user enters second number

        if (userNumOne == userNumTwo)
        {
            System.out.println("Both numbers are equal: " + userNumOne + " = " + userNumTwo);
        } else if (userNumOne > userNumTwo) {
            System.out.println("Number one: " + userNumOne + " is greater than number two: " + userNumTwo);
        } else if (userNumOne < userNumTwo) {
            System.out.println("Number two: " + userNumTwo + " is greater than number one: " + userNumOne);
        }
        else
        {
            System.out.println("You did not enter a number. Try again");
        }
    }
}