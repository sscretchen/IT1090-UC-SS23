public class Main {
    public static void main(String[] args)
    {
        int springCost = 100;
        int summerCost = 225;
        int fallCost = 432;
        int winterCost = 89;
        double totalYearlyCost = 0;

        System.out.println("Please add your maintenance cost for each season: ");
        totalYearlyCost = springCost + summerCost + fallCost + winterCost;
        // Simulating input for now
        System.out.println("Your total yearly maintenance cost is " + totalYearlyCost);
        System.out.println("Cost by season broken down:");
        System.out.println("Spring: " + springCost);
        System.out.println("Summer: " + summerCost);
        System.out.println("Fall: " + fallCost);
        System.out.println("Winter: " + winterCost);
    }
}