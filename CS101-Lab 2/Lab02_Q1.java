import java.util.Scanner;

/**
 * This program will be calculating the area, the circumference and the diagonal of the rectangle by using the width and height inputs from the user. 
 * 
 * @author Deniz Polat
 */
public class Lab02_Q1 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the width of the rectangle: ");
        double widthOfRectangle = in.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        double heightOfRectangle = in.nextDouble();

        in.close();

        double areaOfRectangle = widthOfRectangle * heightOfRectangle;
        double circumferenceOfRectangle = 
            2 * (widthOfRectangle + heightOfRectangle);
        double diagonalOfRectangle = Math.sqrt(
            Math.pow(widthOfRectangle, 2.0) + Math.pow(heightOfRectangle, 2.0));

        System.out.println("The area of the rectangle is: " + areaOfRectangle);
        System.out.println("The circumference of the rectangle is: " 
            + circumferenceOfRectangle);
        System.out.println(
            "The diagonal of the rectangle is: " + diagonalOfRectangle);

    }
}
