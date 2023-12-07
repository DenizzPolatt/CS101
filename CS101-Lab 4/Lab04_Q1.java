import java.util.Scanner;
/**
 * Lab04_Q1
 * This  program that takes a value 𝑛 from the user and finds the 𝑛th nthFibonacciNum number
 * @author Deniz Polat
 */
public class Lab04_Q1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please input n: ");
        int n = in.nextInt();

        in.close();
    
        final int ZEROTH_FIBONACCI_NUMBER = 0;
        final int FIRST_FIBONACCI_NUMBER  = 1;
    
        int nthFibonacciNum = 1;
        int prevFibonacciNumber = FIRST_FIBONACCI_NUMBER;
        int prevPrevFibonacciNumber = ZEROTH_FIBONACCI_NUMBER;

        int i = 1;
        
        if(n == 0){
            nthFibonacciNum = 0;
        }
        else{
            while (i < n) 
            {
                nthFibonacciNum = prevFibonacciNumber + prevPrevFibonacciNumber;
                prevPrevFibonacciNumber = prevFibonacciNumber;
                prevFibonacciNumber = nthFibonacciNum;

                i++;
            }   
        } 

        System.out.println("F(" + n + ") = " + nthFibonacciNum);

    }
}
