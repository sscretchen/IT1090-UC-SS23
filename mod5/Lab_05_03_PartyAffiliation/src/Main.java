public class Main {
    public static void main(String[] args)
    {
        //class PoliticalParty
        //   main()
        //	String userParty // User store their party affiliation.
        //output “Please enter your party affiliation (Democrat, Republican, or Independent) ”
        //input userParty
        //if userParty == “Democrat” then:
        //	output “You get a Democratic Donkey”
        //else if userParty == “Republican” then:
        //output “You get a Republican Elephant”
        //	endif
        //else:
        //output “You get an Independent Man”
        //return
        //end class
        String demoDonkey = "You get a Democratic Donkey.";
        String publicanPhant = "You get a Republican Elephant.";
        String indoMan = "You get an Independent Person";
        String noParty = "You chose Other party.";
        String userParty = "w";

        System.out.println("Hello. Please choose your party affiliation: ");
        System.out.println("(D)Democrat, (R)Republican, (I)Independent, (O)Other");

        System.out.println("You selected: " + userParty);

        if (userParty.equalsIgnoreCase("D"))
        {
            System.out.println(demoDonkey);
        } else if (userParty.equalsIgnoreCase("R")) {
            System.out.println(publicanPhant);
        } else if (userParty.equalsIgnoreCase("I")) {
            System.out.println(indoMan);
        }
        else {
            System.out.println(noParty);
        }
    }
}