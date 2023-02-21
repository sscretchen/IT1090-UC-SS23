import java.util.Scanner;
public class CtoF {
    public static void main(String[] args)
    {
        // variables
        double tempC = 0.0;
        double tempF = 0.0;
        String trash = "";
        boolean endConversion = false;

        Scanner in = new Scanner(System.in);

        do {
            // Init program start and temp input
            System.out.println("\nPlease enter outside temperature. The program will convert from Celsius to Fahrenheit");
            System.out.print("Temp (°C): ");
            if (in.hasNextDouble())
            {
                tempC = in.nextDouble();
                in.nextLine(); // clear buffer
                endConversion = true;
            }else {
                // Capture invalid input
                trash = in.nextLine();
                System.out.println("[!] You entered: " + trash + ". Please enter a valid number for temperature (48, 23.6 etc).");
                System.out.println("[!] Re-run program to continue.");
            }
        }while (!endConversion);

        // if valid, perform conversion
        tempF = (tempC * 1.8) + 32;
        // response with results
        System.out.println("[+] Your entry of " + tempC + "°C was converted to: " + tempF + "°F");
    }
}
