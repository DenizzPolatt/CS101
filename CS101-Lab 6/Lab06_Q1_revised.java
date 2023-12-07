import java.util.Scanner;
/**
 * Extension of the Question 1 in Lab 06.
 * 
 * This program checks whether the reversed of a Prime number is also a Prime number.
 * These numbers are called "Twisted Prime Numbers"
 * 
 * @author Deniz Polat
 */

public class Lab06_Q1_revised {

    /**
     * This program checks whether a number is a Prime number.
     * @param x a positive integer
     * @return true if the number is Prime
     */
    public static boolean isPrime(int x)
    {

        for(int i = 2; i*i <= x; i++) {
            if ( x % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param number input
     * @return reverse of a number
     */
    public static int reverseNumber(int x)
    {
        int i = x;
        int iReversed = 0;

        while(i > 0) {
            int modulus = i % 10;
            iReversed = iReversed * 10 + modulus;
            
            i = i/10;
        }

        return iReversed;
    }

    /**
     * This program checks whether a number is a Twisted Prime Number
     * @param x a positive integer
     * @return isTwistedPrime if the reverse of the Prime number is also a Prime number;
     */
    public static boolean isTwistedPrime(int x)
    {
        return isPrime(reverseNumber(x)) && isPrime(x);
    }

    public static void main(String[] agrs)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to be examined: ");
        int n = in.nextInt();


        if(isTwistedPrime(n)) {
            System.out.println(n + " is a Twisted Prime number.");
        } else {
            System.out.println(n + " is not a Twisted Prime number.");
        }

        in.close();
    }
}
