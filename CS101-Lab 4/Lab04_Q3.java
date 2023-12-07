import java.util.Scanner;
/**
 * Lab04_Q3
 * This program takes a number (positive integer) 𝑛 and reads 𝑛 positive integer values from the user,
 * and finds the minimum and maximum values as well as the average of these integers
 * 
 * @author Deniz Polat
 */
public class Lab04_Q3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input n: ");
        int n = in.nextInt();
        
        System.out.println("Now input " + n + " positive integers:");
        
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        double sumOfValues = 0.0;

        int i = 0;
        while(i < n) {
            int nIntegers = in.nextInt();
            sumOfValues += nIntegers;

            if(nIntegers < minValue) {
                minValue = nIntegers;
            }
            
            if(nIntegers > maxValue) {
                maxValue = nIntegers;
            }

            i++;
        }

        double averageOfnIntegers = sumOfValues / n;
        System.out.println("Min: " + minValue);
        System.out.println("Max: " + maxValue);
        System.out.println("Average: " + averageOfnIntegers);
        
        in.close();
    }   
}
