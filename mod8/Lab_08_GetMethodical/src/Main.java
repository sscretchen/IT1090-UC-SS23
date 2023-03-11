import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        int favNum = 0;
        double favDouble = 0;
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMin = 0;
        boolean keepShopping = false;
        double itemSum = 0.0;
        double itemPrice = 0;
        String userSSN = "";
        String studentMNum = "";
        String menuItems = "O - open S - save V - view Q - quit";
        String menuChoice = "";
        int row = 0;
        int col = 0;
        String msg = "";


//        // Get username
//        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
//        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
//        System.out.println("\nYour full name is: " + firstName + " " + lastName);
//
//        // Favorite number & double
//        favNum = SafeInput.getInt(in, "What is your favorite number? ");
//        System.out.println("Your favorite number is: " + favNum);
//
//        favDouble = SafeInput.getDouble(in, "What is your favorite Double value (ex:3.0)? ");
//        System.out.println("Your favorite double number is: " + favDouble);
//
//        // Date and Time of Birth (BirthDateTime.java)
//        birthYear = SafeInput.getRangedInt(in, "Enter your birth year (1950-2010): ", 1950, 2010);
//        birthMonth = SafeInput.getRangedInt(in, "Enter your birth Month ", 1, 12);
//        birthDay = SafeInput.getRangedInt(in, "Enter your birth day: ", 1, 31);
//        birthHour = SafeInput.getRangedInt(in, "Enter the hour of your birth (1-24): ", 1, 24);
//        birthMin = SafeInput.getRangedInt(in, "Enter the minute of your birth (1-59): ", 1, 59);
//
//        System.out.println("Your birthday is: " + "Year: " + birthYear + " Month: " + birthMonth + " Day: " + birthDay + " Hour: " + birthHour + " Minute: " + birthMin);

//        // Check Out at the 10$ Store (CheckOut.java)
//
//        do {
//            itemPrice = SafeInput.getRangedDouble(in, "Please enter the price of the item (0.50-9.99): ", (int) .50, (int) 9.99);
//            itemSum = itemPrice + itemSum;
//            keepShopping = SafeInput.getYNConfirm(in, "Do you have any other items ");
//        } while (keepShopping);

//        // RegEx is Magic (Reggie.java)
//        userSSN = SafeInput.getRegExString(in, "Please enter your SSN (###-##-####): ", "\\d{3}-\\d{2}-\\d{4}");
//        studentMNum = SafeInput.getRegExString(in, "Enter your University of Cincinnati M number: ", "(M|m)\\d{5}");
//        menuItems = SafeInput.getRegExString(in, "Enter your menu selection ", "[OoSsVvQq]");

        // Pretty Header
        msg = SafeInput.prettyHeader(in, "Testing");


    }
}