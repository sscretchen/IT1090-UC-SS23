public class Main {
    public static void main(String[] args)
    {
        //class ShipCost
        //   main()
        //      	num itemPrice // Cost of the item
        //	num shipTax // 2% shipping cost if over $100 otherwise keep at 0
        //	num totalCost // calculate total cost based on price and shipping if over $100
        //bool shipFree// Cost of item is more than $100, shipping is free, otherwise apply shipTax
        //output “Please enter price of your item to determine shipping cost: ”
        //output “Items $100 or more are free to ship. Otherwise, a 2% shipping fee is applied ”
        //shipTax = 0
        //totalCost = 0
        //input itemPrice
        //shipFree = itemPrice
        //if shipFree then:
        //	totalCost = itemPrice + shipTax
        //	output “Your shipping cost is ” + shipTax + “. You qualify for free shipping”
        //	output “Total cost is: “ + totalCost
        //else:
        //	shipTax = 0.02 * itemPrice
        //	totalCost = itemPrice + shipTax
        //output “Your shipping cost is ” + shipTax
        //	endif
        //return
        //end class
        double itemPrice = 28;
        double shipCost = 0.00;
        double shipFee = 0.02;
        double finalCost;

        System.out.println("Please enter the price of your item: ");
        System.out.println("[!] A 2% tax will be applied for orders under $100");

        if (itemPrice >= 100)
        {
            finalCost = itemPrice + shipCost;
            System.out.println("Your shipping is free!");
            System.out.println("Shipping cost: " + shipCost + " Item price: " + itemPrice);
            System.out.println("Total cost: " + finalCost);
        }
        else
        {
            shipCost = itemPrice * shipFee;
            finalCost = shipCost + itemPrice;
            System.out.println("Shipping cost: " + shipCost + " Item price: " + itemPrice);
            System.out.println("Total cost: " + finalCost);
        }
    }
}