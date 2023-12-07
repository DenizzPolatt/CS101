import java.util.Scanner;

/**
 * This program is the revised version of Question 1. This time, the program will be calculating the area and the circumference of a circle by using the radius input from the user. 
 * 
 * @author Deniz Polat
 */
public class Lab02_Q1_revised {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radiusOfCircle = in.nextDouble();

        in.close();

        double areaOfCircle = Math.PI * (radiusOfCircle * radiusOfCircle);
        double circumferenceOfCircle = 2 * Math.PI * radiusOfCircle;

        System.out.format("%-40s %5.2f \n", "The area of the circle is: ", (double) areaOfCircle);
        System.out.format("%-40s %5.2f \n", "The circumference of the circle is: ", circumferenceOfCircle);

    }
}