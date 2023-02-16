import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args)
    {
        // Variables
        int lSide = 0;
        int wSide = 0;
        int recPerimeter; // P = 2(l + w)
        int recArea; // A = wl
        int recDiagonal; // Using the Pythagorean theorem
        String trash; //capture invalid input

        Scanner in = new Scanner(System.in);

        // Prompt user
        System.out.println("Enter the length and width of the Rectangle.");

        // Length
        System.out.print("[+] Length: ");
        if (in.hasNextInt()){
            lSide = in.nextInt();
            in.nextLine(); // Clear the buffer
        } else {
            trash = in.nextLine();
            System.out.println("[!] Invalid input: " + trash + ". Rectangles need numbers.");
            System.out.println("[!] Please restart the program and try again.");
            System.exit(0); // close program
        }
        // Width
        System.out.print("[+] Width: ");
        if (in.hasNextInt()){
            wSide = in.nextInt();
            in.nextLine(); // Clear the buffer
        } else {
            trash = in.nextLine();
            System.out.println("[!] Invalid input: " + trash + ". Rectangles need numbers.");
            System.out.println("[!] Please restart the program and try again.");
            System.exit(0); // close program on bad input
        }
        // Calculate the perimeter & area
        recPerimeter = 2 * (lSide + wSide);
        System.out.println("The perimeter of this Rectangle is: " + recPerimeter);

        recArea = lSide * wSide;
        System.out.println("The area of the Rectangle is: " + recArea);

        // Calculate the diagonal
        recDiagonal = (lSide * lSide) + (wSide * wSide);
        System.out.println("The Diagonal of this Rectangle is: " + Math.sqrt(recDiagonal));
    }
}