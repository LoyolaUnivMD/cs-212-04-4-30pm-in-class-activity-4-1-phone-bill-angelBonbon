// Programmers: Bonita Rodrigues
// Course: CS212, Professor Nweke
// Due Date: 2/8/24
// Lab Assignment: Phone Bill (Class Assessment)
// Problem Statement: Calculates the users phone bill based on package type and GB of data used
// Data In: package type (str), data used (int)
// Data Out: total cost of phone bill
// Credits: none

// Importing classes
import java.util.Scanner;
import java.text.DecimalFormat;
class HelloWorld {
    public static void main(String[] args) {
        // Calls on classes
        Scanner input = new Scanner(System.in);
        DecimalFormat moneyForm = new DecimalFormat("#$00.00");

        //Opening statements
        System.out.println("Phone Bill Activity!");
        System.out.println("\nCalculate your phone bill according to your phone plan!");
        // Asks the user for their package type
        System.out.println("What type of package do you have? (enter: green, blue, or purple) ");
        String packType = input.nextLine();
        packType = packType.toLowerCase();
        double cost = 0;

        // Error checking: makes sure user enters valid package type
        while (!((packType.equals("green")) || (packType.equals("blue")) || (packType.equals("purple")))){
            // Repeats until correct package type is entered
            System.out.println("\nThat is an invalid package type. Please enter again.");
            System.out.println("What type of package do you have? (enter: green, blue, or purple) ");
            packType = input.nextLine();
        }

        // Different costs based on package type
        if (packType.equals("green")) {
            cost = 49.99;
            System.out.println("\nHow many GBs of data did you use? ");
            int data = input.nextInt();
            // Adds additional fees for GBs over 2
            if (data > 2){
                cost = cost + (data-2)*15;
            }
            // Adds a coupon if cost is over $75
            if (cost >= 75){
                cost = cost - 20;
            }
        } else if (packType.equals("blue")) {
            cost = 70;
            System.out.println("\nHow many GBs of data did you use? ");
            int data = input.nextInt();
            // Adds additional fees for GBs over 4
            if (data > 4){
                cost = cost + (data-4)*10;
            }
        } else {
            cost = 99.95;// Nothing much happens for purple package
        }

        // Outputs the total cost to the user
        System.out.println("\nThe total cost of your package will be " + moneyForm.format(cost));
        // Ending statements
        System.out.println("Thank you for using our program!");
        
    }
}
