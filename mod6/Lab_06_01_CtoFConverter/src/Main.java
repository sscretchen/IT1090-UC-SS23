import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Old pseudo code
        //        class TempConversion
        //   main()
        //        num tempF // The users temperature to be converted
        //        num tempC // The output from F to C formula (F -32) * 5/9
        //        output “Enter a temperature in Fahrenheit to see its Celsius conversion: ”
        //        input tempF
        //        tempC = (tempF - 32) * (5/9)
        //        output “Your temperature “ + tempF + “in Celsius is “ + tempC
        //        return
        //                end class

        // Variables
        double tempC = 0.0;
        double tempF = 0.0;
        String trash = "";

        Scanner in = new Scanner(System.in);

        // Init program start and temp input
        System.out.println("Please enter outside temperature. The program will convert from Celsius to Fahrenheit");
        System.out.print("Temp (°C): ");
        if (in.hasNextDouble())
        {
            tempC = in.nextDouble();
            in.nextLine(); // clear buffer
        }else {
            // Capture invalid input
            trash = in.nextLine();
            System.out.println("[!] You entered: " + trash + ". Please enter a valid number for temperature (48, 23.6 etc).");
            System.out.println("[!] Re-run program to continue.");
            System.exit(0); // end program
        }

        // if valid, perform conversion
        tempF = (tempC * 1.8) + 32;

        // response with results
        System.out.println("[+] Your entry of " + tempC + "°C was converted to: " + tempF + "°F");
    }
}