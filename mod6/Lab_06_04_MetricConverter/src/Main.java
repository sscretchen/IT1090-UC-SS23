import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // variables
        double userMeasurement = 0;
        double miles;
        double feet;
        double inches;
        String trash;
        // conversions
        double metToMile = 0.000621;
        double metToInch = 39.37;
        double metToFeet = 3.28;


        Scanner in = new Scanner(System.in);

        System.out.print("Enter your measurement (in meters): ");

        if (in.hasNextDouble())
        {
            userMeasurement = in.nextDouble();
            in.nextLine(); // clear buffer
        }else {
            // Capture invalid input
            trash = in.nextLine();
            System.out.println("[!] You entered: " + trash + ". Please enter a valid number for conversion");
            System.out.println("[!] Re-run program to continue.");
            System.exit(0); // end program
        }

        System.out.printf("Meter to Miles conversion: %10.6f\n", userMeasurement * metToMile); // meter to mile conv
        System.out.printf("Meter to Feet conversion: %10.6f\n", userMeasurement * metToFeet); // meter to feet conv
        System.out.printf("Meter to Inches conversion: %10.6f\n", userMeasurement * metToInch); // meter to inches conv
    }
}