import java.util.Scanner;
/**
 * Lab04_Q3_revised
 * 
 * This program is the revised version of Question 3.
 * 
 * @author Deniz Polat
 */
public class Lab04_Q3_revised {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input n: ");
        int n = in.nextInt();
        
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        double sumOfValues = 0.0;
        
        int i = 0;
        while(true) {

            System.out.print("Please enter a positive integer: ");
            int nIntegers = in.nextInt();
            
            sumOfValues += nIntegers;

            if(nIntegers < minValue && nIntegers != n) {
                minValue = nIntegers;
            }
            
            if(nIntegers > maxValue && nIntegers != n) {
                maxValue = nIntegers;
            }

            if(nIntegers == n) {
                break;
            }

            i++;
        }

        double averageOfnIntegers = (sumOfValues - n) / i;
        System.out.println("Min: " + minValue);
        System.out.println("Max: " + maxValue);
        System.out.println("Average: " + averageOfnIntegers);
        
        in.close();
    }   
}
