import java.util.Scanner;

public class SafeInput {
    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;
    }

    /**
     * Get an int value within a numeric range
     *@param - Pipe is a Scanner object that you created in main in the usual way i.e. in or console
     *@param - Prompt is the message to display as the prompt for the input.
     *@param - Low is the low value for the input range
     *@param - High is the high value for the input range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            {
                System.out.println("\n" + prompt + "[" + low + "-" + high + "]: ");
                if (pipe.hasNext())
                {
                    retVal = pipe.nextInt();
                    pipe.nextLine();
                    if (retVal >= low && retVal <= high)
                    {
                        done = true;
                    }
                    else
                    {
                        System.out.println("\nNumber is out of range [" + low + "-" + high + "]: " + retVal);
                    }
                }
                else
                {
                    trash = pipe.nextLine();
                    System.out.println("You must enter an int: " + trash);
                }
            }
        } while (!done);

        return retVal;
    }

    /**
     * Get an int value
     * @param pipe - is a Scanner object that you created in main in the usual way i.e. in or console
     * @param prompt - is the message to display as the prompt for the input.
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
            }
        } while (!done);

        return retVal;
    }

    /**
     * prompts the user to input a double within a specified inclusive range
     * @param -	Pipe is a Scanner object that you created in main i.e. in
     * @param -	Prompt is the message to display as the prompt for the input
     * @param -	Low is the low value for the input range
     * @param -	High is the high value for the input range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, int low, int high)
    {
        {
            double retVal = 0;
            String trash = "";
            boolean done = false;

            do {
                {
                    System.out.println("\n" + prompt + "[" + low + "-" + high + "]: ");
                    if (pipe.hasNextDouble())
                    {
                        retVal = pipe.nextDouble();
                        pipe.nextLine();
                        if (retVal >= low && retVal <= high)
                        {
                            done = true;
                        }
                        else
                        {
                            System.out.println("\nNumber is out of range [" + low + "-" + high + "]: " + retVal);
                        }
                    }
                    else
                    {
                        trash = pipe.nextLine();
                        System.out.println("You must enter a double: " + trash);
                    }
                }
            } while (!done);

            return retVal;
        }
    }

    /**
     * prompts the user to input any double value.
     * @param -	Pipe is a Scanner object that you created in main in the usual way i.e. in or console
     * @param -	Prompt is the message to display as the prompt for the input.
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a double: " + trash);
            }
        } while (!done);

        return retVal;
    }

    /**
     * input method that gets a Yes or No [Y/N] returning true for yes and false for no
     * @param -	Pipe is a Scanner object that you created in main i.e. in, console
     * @param -	Prompt is the message to display as the prompt for the input
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retVal = true;
        String response = "";
        boolean gotAVal = false;

        do {
            System.out.print("\n" + prompt + "[Y/N] ");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y"))
            {
                gotAVal = true;
                retVal = true;
            }
            else if (response.equalsIgnoreCase("N"))
            {
                gotAVal = true;
                retVal = false;
            }
            else
            {
                System.out.println("You must answer [Y/N]! " + response);
            }
        } while (!gotAVal);

        return retVal;
    }

    /**
     * a method called getRegExString that prompts the user to input a String that matches a RegEx pattern
     * @param -	Pipe is a Scanner object that you created in main in the usual way i.e. in or console
     * @param -	Prompt is the message to display as the prompt for the input.
     * @param -	RegEx is the regEx pattern in java String format to use for matching
     */
    public static String getRegExString(Scanner pipe, String prompt, String regExPattern)
    {
        String response = "";
        boolean gotAVal = false;

        do {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();
            if (response.matches(regExPattern))
            {
                gotAVal = true;
            }
            else
            {
                System.out.println("\n" + response + " must match the pattern " + regExPattern);
                System.out.println("Try again!");
            }
        } while (!gotAVal);

        return response;

    }

    public static String prettyHeader(Scanner pipe, String prompt)
    {
        final int CHAR_COUNT = 60; // max character allowed is 60
        String msg = "";

        do
        {
            int totalSpaces = CHAR_COUNT - 6 - msg.length(); //Define the space after the message
            int leftSpaces, rightSpaces;

            if (totalSpaces % 2 == 0) // testing for even spaces using modulo, this makes it exactly centered!
            {
                leftSpaces = rightSpaces = totalSpaces / 2;
            }
            else
            {
                rightSpaces = totalSpaces / 2;
                leftSpaces = rightSpaces + 1;
            }
            // print left spaces, we figured this out before
            for(int ch = 0; ch < leftSpaces; ch++)
                System.out.print(" ");
            // print msg that was fed to the method as a parameter
            System.out.print(msg);
            // print right spaces,
            for(int ch = 0; ch < rightSpaces; ch++)
                System.out.print(" ");
        }while(msg.length() > 0);

        return msg;
    }

}
