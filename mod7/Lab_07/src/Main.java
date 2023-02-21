public class Main {
    public static void main(String[] args)
    {
        // count up to 30 from 0
        System.out.println("Counting up to 30");
        for (int cnt = 0; cnt <= 30; cnt ++) // stop logic within the for loop
        {
            System.out.println(cnt);
        }

        // count down by 1 from 30 from 0
        System.out.println("\nCounting down from 30");
        for (int cnt = 30; cnt >= 0; cnt --) // stop logic within the for loop
        {
            System.out.println(cnt);
        }

        // count up by 3 from 0 to 18
        System.out.println("\nCounting up to 18 from 0 by 3");
        for (int cnt = 0; cnt <= 18; cnt = cnt + 3) // stop logic within the for loop
        {
            System.out.println(cnt);
        }

        // count down by 2 from 10 to 0
        System.out.println("\nCounting down from 10 by 2 to 0");
        for (int cnt = 10; cnt >= 0; cnt = cnt -2) // stop logic within the for loop
        {
            System.out.println(cnt);
        }

        /*
         * Start of PART b
         */

        // task 5
        System.out.println("\nPrint fig. 5");
        for (int row = 1; row <= 5; row++)
        {
            for (int col = 1; col <= row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // task 6
        System.out.println("\nPrint fig. 6");
        for (int row = 1; row <= 6; row++)
        {
            for (int col = 1; col <= (-1 * row + 6); col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // task 7
        System.out.println("\nPrint fig. 7");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= (-1 * row + 5); col++) {
                System.out.print("*");
            }
            System.out.print("*");
            for (int col = 1; col <= (row - 1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Extra Credit
        System.out.println("\nPrint letter S");
        for (int row=1; row<=11; row++)
        {
            for (int col=1; col<=11; col++)
            {
                if (row==1 || row==11/2 || row==11){
                    System.out.print("*");
                } else if (row<11/2 && col==1) {
                    System.out.print("*");
                } else if (row>11/2 && col==11){
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}