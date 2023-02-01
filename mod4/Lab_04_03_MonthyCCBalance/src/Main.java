public class Main {
    public static void main(String[] args)
    {
        double creditCardBalance = 5000.00;
        double interestRate = 0.17;
        int debtorPayment = 0;
        double firstMonthBal = 0.00;
        double secondMonthBal = firstMonthBal;


        System.out.println("Your current credit card balance is: " + creditCardBalance);
        System.out.println("The current interest on this card is: " + interestRate + "%");
        System.out.println("Please enter your payment amount");
        // no payments made by user
        firstMonthBal = (creditCardBalance * interestRate) + creditCardBalance;
        System.out.println("End of month 1 balance: " + firstMonthBal);

        System.out.println("Please enter your payment amount");
        // no payments made by user
        secondMonthBal = (firstMonthBal * interestRate) + firstMonthBal;
        System.out.println("End of month 2 balance: " + secondMonthBal);
    }
}