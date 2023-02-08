public class Main {
    public static void main(String[] args)
    {
        //class VerifyGuest
        //   main()
        //      	num age // The age of the guest
        //          String paperBand // Printed message stating “Age approved”
        //          bool ageConf // Confirm age is 21 or older
        //          paperBand = “Age Verified”
        //      	output “Welcome. Please enter your age: ”
        //      	input age
        //      	if age >= 21 then:
        //	output paperBand + “, Welcome”
        //else:
        //	pass
        //   return
        //end class
        int patronAge = 20;
        boolean canPass = true;

        while (canPass)
        {
            System.out.println("Please enter your age: ");
            // user enters age
            if (patronAge >= 21)
            {
                System.out.println("Patron entered: " + patronAge);
                System.out.println("You get a wristband.");
            }
            else
            {
                break;
            }
        }
    }
}