import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double gasPrice = 0.0;
        double gallonCount = 0.0; // Amount of gas in car
        double milesPerGallon = 0.0; // Users car efficiency
        double calcFuelEffeciency = 0.0;
        double distanceLeft = 0.0;
        String trash = "";

        Scanner in = new Scanner(System.in);

        System.out.print("[+] Hello. Please enter the number of gallons in your tank: ");
        if (in.hasNextDouble()){
            gallonCount = in.nextDouble();
            in.nextLine(); // clear buffer
        }else {
            trash = in.nextLine();
            System.out.println("[!] Invalid input " + trash + ". Please re-run the program and enter a number");
            System.exit(0); // end program
        }

        System.out.print("[+] Now enter the fuel efficiency of your vehicle (mpg): ");
        if (in.hasNextDouble()){
            milesPerGallon = in.nextDouble();
            in.nextLine(); // clear buffer
        }else {
            trash = in.nextLine();
            System.out.println("[!] Invalid input " + trash + ". Please re-run the program and enter a number");
            System.exit(0); // end program
        }

        System.out.print("[+] What is the cost of fuel (per gallon): ");
        if (in.hasNextDouble()){
            gasPrice = in.nextDouble();
            in.nextLine(); // clear buffer
        }else {
            trash = in.nextLine();
            System.out.println("[!] Invalid input " + trash + ". Please re-run the program and enter a number");
            System.exit(0); // end program
        }

        calcFuelEffeciency = 100 / (int)milesPerGallon; // checking every 100 miles the cost of fuel to the rider
        distanceLeft = gallonCount * milesPerGallon; // Multiply gas on hand by the mpg calculation

        System.out.println("Your car takes " + milesPerGallon + "mpg. The cost of your vehicle is $" + calcFuelEffeciency + " per 100 miles");
        System.out.println("You have " + distanceLeft + " miles left until you need to fill up again.");
    }
}