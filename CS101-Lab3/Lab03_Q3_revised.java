import java.util.Scanner;
/**
 * This program operates the user's bankings. It checks the PIN, calculates the 
 * new balances and opens new bank account for TRY or USD. User's initial PIN is
 * 1234 and initial balance is 1000.0 TRY.
 * 
 * @author Deniz Polat
 */

public class Lab03_Q3_revised {

    public static void main(String[] args) {

        String userPIN;
        userPIN = "1234";
        double initialBalance = 1000.0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        String pinInput = in.nextLine();

        if(!userPIN.equals(pinInput)) {
            System.out.println("Invalid PIN! Bye!");
            System.exit(0);
        }

        System.out.println("1- Request a credit card");
        System.out.println("2- Withdraw Money");
        System.out.println("3- Open a new account");
        System.out.println("3- Change PIN");
        System.out.print("Select an operation: ");

        int operation = in.nextInt();
        if(operation == 1) {
            System.out.print("Enter the card limit (cannot exceed 2 * your balance): ");
            double creditCardLimit = in.nextDouble();

                if(creditCardLimit > 0 && creditCardLimit <= 2 * initialBalance) {
                    System.out.println("Your credit card request has been successfully received! Bye!");
                }
                else {
                    System.out.println("You entered an invalid amount! Bye!");
                }
        }
        else if(operation == 2) {
            System.out.print("Enter the amount to withdraw: ");
            double withdrawedAmount = in.nextDouble();

            double newBalance = initialBalance - withdrawedAmount;
            System.out.println("Your new balance is " + newBalance + ". Bye!");
        }
        else if(operation == 3) {
            System.out.println("1- TRY");
            System.out.println("2- USD");
            System.out.println("3- EUR");
            System.out.println("4- XAU");
            System.out.print("Select currency type: ");

            int currencyOption = in.nextInt();

            String openedAccountCurrency = null;
            if(currencyOption == 1 || currencyOption == 2 || currencyOption == 3 || currencyOption == 4) {
                if(currencyOption == 1) {
                    openedAccountCurrency = "TRY";
                }
                else if(currencyOption == 2) {
                    openedAccountCurrency = "USD";
                }
                else if (currencyOption == 3){
                    openedAccountCurrency = "EUR";
                }
                else if (currencyOption == 4){
                    openedAccountCurrency = "XAU";
                }
                System.out.println("You now have a new " + openedAccountCurrency + " account. Bye!");
            }
            else {
                    System.out.println("Your selection is invalid! Bye!");
            }
        }
        else {
            System.out.print("Enter your new PIN: ");
            String newPIN = in.next();
            
            System.out.println("Your PIN is changed to " + (newPIN.charAt(0))
                + "**" + (newPIN.charAt(3)));
        }
        
        in.close();
    }
}
