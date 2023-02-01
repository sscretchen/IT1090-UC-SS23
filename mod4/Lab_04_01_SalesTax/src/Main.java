public class Main {
    public static void main(String[] args)
    {
        double salesTax = 0.05;
        double itemPrice = 25.00;
        double totalCost = 0;

        totalCost = (itemPrice * salesTax) + itemPrice;

        System.out.println("Thank you for your purchase");
        System.out.println("The cost of your item is: $" + itemPrice + ". This will incur a 5% sales Tax.");
        System.out.println("Total cost, including sales tax is: $" + totalCost);
    }
}