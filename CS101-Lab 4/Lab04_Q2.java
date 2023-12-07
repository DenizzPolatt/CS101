import java.util.Scanner;
/**
 * Lab04_Q2
 * This program checks if the input string is a palindrome. 
 * @author Deniz Polat
 */
public class Lab04_Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input the string: ");
        String userInput = in.nextLine();

        in.close();
        
        int length = userInput.length();

        int beginning = 0;
        int ending = length - 1;

        String palindromenessText = "a palindrome.";
        while(beginning < ending){
            char beginningChar = userInput.charAt(beginning);
            char endingChar = userInput.charAt(ending);
            
            if(beginningChar != endingChar) {
                palindromenessText = "not a palindrome.";
            }

            beginning++;
            ending--;
        }
        
        System.out.println("It is " + palindromenessText);

    }
}