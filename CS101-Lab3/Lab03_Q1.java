import java.util.Scanner;
/**
 * 
 * This program will calculate the BMI of the user by using the weight and height inputs.
 * The program also tells the user which category they belong among “underwieght”, “healthy”, “overweight” and “obese” categories.
 * 
 * @author Deniz Polat
 */
public class Lab03_Q1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double userWeight = in.nextDouble();

        System.out.print("Enter your height in meters: ");
        double userHeight = in.nextDouble();

        in.close();

        double userBMI = userWeight / (userHeight * userHeight);

        double UNDER_WEIGHT_BMI_BOUNDARY = 18.5;
        double HEALTHY_BMI_BOUNDARY = 25.5;
        double OVERWEIGHT_BMI_BOUNDARY = 30;
        
        String bmiCategory = "obese";
        if(userBMI < UNDER_WEIGHT_BMI_BOUNDARY){  
            bmiCategory = "underweight.";
        }
        else if(userBMI < HEALTHY_BMI_BOUNDARY) {  
            bmiCategory = "healthy.";
        }  
        else if(userBMI < OVERWEIGHT_BMI_BOUNDARY) {   
            bmiCategory = "overweight.";
        }  
         
        System.out.format("Your BMI is " + "%.2f"
            + " and you are in the category of " + bmiCategory, userBMI);
    }
}