public class Main {
    public static void main(String[] args)
    {
        //class CheckAge
        //   main()
        //      	num birthMonth // age of user
        //	String userBirthMonth // store selection of birth mom
        //output “Please enter your birth month using 1 for January, 2 for February and so on: ”
        //input birthMonth
        //userBirthMonth = birthMonth
        //if userBirthMonth >= 1 and userBirthMonth <= 12 then:
        //output “Your birth month is: ” + userBirthMonth
        //endif
        //else:
        //	output “You entered an incorrect month value: ” + userBirthMonth
        //return
        //end class

        int userAgeMonth = 32;
        String wrongMonth = "You entered an incorrect month value: ";

        System.out.println("Please enter your birth month (min: Jan=1, max: Dec=12): ");

        if (userAgeMonth >= 1 && userAgeMonth <= 12)
        {
            System.out.println("Your birth month is: " + userAgeMonth);
        }
        else
        {
            System.out.println(wrongMonth + userAgeMonth);
            System.out.println("Please enter a month value 1 through 12");
        }
    }
}