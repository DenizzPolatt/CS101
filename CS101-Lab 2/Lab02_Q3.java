import java.util.Scanner;

/**
 * This program prints the specific features of the string input that is written by the user.
 * 
 *@author Deniz Polat
 */
public class Lab02_Q3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the title: ");
        String title = in.nextLine();

        in.close();

        System.out.println("Number of characters: " + title.length());
        System.out.println("All uppercase: " + title.toUpperCase());
        System.out.println("Remove leading and trailing blank characters:" + title.trim());
        System.out.println("Character at index position 5: " 
            + title.charAt(5));
        System.out.println(
            "Title from 3rd character to 8th character (not included): " 
            + title.substring(3, 7));
        System.out.println("First occurance of character 'a': " 
            + title.indexOf("a"));
        System.out.println("First occurance of character 'a': " 
            + title.lastIndexOf("a"));

    }
}
