import java.util.Scanner;

/**
 * This program will be drawiing a table with the percentages that affects the maintenance of the car. Program gets the mileage from the user as an input.
 * 
 * @author Deniz Polat
 */
public class Lab02_Q2 {

    public static void main(String[] args) {

        //input from the user
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the mileage of the car: ");
        double mileageOfCar = in.nextDouble();

        in.close();
    
        final double totalMaintenanceCost = mileageOfCar * 0.1;
        
        //constants
        double PERC_OF_OIL_CHANGE = 30;
        double PERC_OF_BATTERY    = 15;
        double PERC_OF_BRAKES     = 25;
        double PERC_OF_TIRE       = 13;
        double PERC_OF_OTHER      = 17;   

        double oilChangeCost = (totalMaintenanceCost * PERC_OF_OIL_CHANGE) / 100.0;
        double batteryCost   = (totalMaintenanceCost * PERC_OF_BATTERY) / 100.0;
        double brakesCost    = (totalMaintenanceCost * PERC_OF_BRAKES) / 100.0;
        double tireCost      = (totalMaintenanceCost * PERC_OF_TIRE) / 100.0;
        double otherCost     = (totalMaintenanceCost * PERC_OF_OTHER) / 100.0;

        System.out.println("*************************************************");
        System.out.format("%5s %1s %7s \n",
                    "*****", "Maintenance Cost Distribution Table", "*****" );
        System.out.println("*************************************************");
        System.out.format(
            "*%-20s %10s %15.2f* \n", 
            "Oil Change", "%" + (int) PERC_OF_OIL_CHANGE, oilChangeCost);
        System.out.format(
            "*%-20s %10s %15.2f* \n", 
            "Battery", "%" + (int) PERC_OF_BATTERY, batteryCost);
        System.out.format(
            "*%-20s %10s %15.2f* \n", 
            "Brakes", "%" + (int) PERC_OF_BRAKES, brakesCost);
        System.out.format(
            "*%-20s %10s %15.2f* \n", 
            "Tire", "%" + (int) PERC_OF_TIRE, tireCost);
        System.out.format(
            "*%-20s %10s %15.2f* \n", "Other", 
            "%" + (int) PERC_OF_OTHER, otherCost);
        System.out.format("*%31s %15.2f* \n", "TOTAL", totalMaintenanceCost);
        System.out.println("*************************************************");
    } 
}
