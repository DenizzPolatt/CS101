import java.util.Scanner;
/**
 * This program takes an integer year input from the user to calculate the 
 * century of the year and decide whether it is a leap year or not according 
 * to the Gregorian calendar.
 * 
 * @author Deniz Polat
 */
public class Lab03_Q2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the year to be evaluated: ");
        int userYear = in.nextInt();

        in.close();

        boolean divisibleBy4 = userYear % 4 == 0;
        boolean divisibleBy100 = userYear % 100 == 0;
        boolean divisibleBy400 = userYear % 400 == 0;
        boolean userYearIsLeapYear =
            divisibleBy4 && (!divisibleBy100 || divisibleBy400);

        String leapnessAuxiliaryText = "is not"; 
        if(userYearIsLeapYear){
            leapnessAuxiliaryText = "is";
        }

        int century = ((userYear - 1) / 100) + 1;
        
        String centuryOrdinal = century + "th";
        if(century % 10 == 1 && century != 11) {
            centuryOrdinal = century + "st";
        }
        else if(century % 10 == 2 && century != 12) {
            centuryOrdinal = century + "nd";
        }
        else if(century % 10 == 3 && century != 13) {
            centuryOrdinal = century + "rd";
        }
        
        System.out.println("The year " + userYear + " is in the " 
            + centuryOrdinal + " century and " + leapnessAuxiliaryText
            + " a leap year.");
    }
}

