import java.util.Scanner;
/**
 *  This program checks whether a number is a member of Fibonacci series, a
 *  Harshad Number, a Prime number or Narcissistic..
 * 
 *  @author Deniz Polat
 */
public class Lab06_Q1 {

    /**
     * Calculates the number of digits of the number
     * @param x a positive integer
     * @return number of digits
     */
    public static int numberOfDigits(int x) {
        int i = 0;
        while(x > 0)
        {
            x = x / 10;
            i++;
        }

        return i;
    }

    /**
     * Calculates the sum of the digits of a number x
     * @param x a positive integer
     * @return sum of digits
     */
    public static int sumOfDigits(int x)
    {
        int integer = x;
        int sumOfDigits = 0;

        while(integer > 0)
        {
            int lastDigits = 0;

            lastDigits = integer % 10;
            sumOfDigits += lastDigits;
            integer = integer / 10;
        }

        return sumOfDigits;
    }

    /**
     * Checks whether a number is a perfect square
     * @param x a positive integer
     * @return integer floor of x.
     */
    public static boolean isPerfectSquare(int x)
    {
        return Math.sqrt(x) % 1 == 0;
    }  

    /**
     * Checks whether the number is a Fibonacci.
     * @param x a positive integer 
     * @return true if Fibonacci
     */
    public static boolean isFibonacci(int x)
    {
        return isPerfectSquare(5*x*x + 4) || isPerfectSquare(5*x*x - 4);
    }

    /**
     * This program checks whether a number is a Harshad number.
     * @param x a positive integer
     * @return true if Harshad number
     */
    public static boolean isHarshadNumber(int x) {
        int sumOfDigits = 0;
        int integer = x;

        while(integer > 0)
        {
            int lastDigits = integer % 10;
            sumOfDigits += lastDigits;
            integer = integer / 10;
        }

       return x % sumOfDigits == 0;

    }

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
     * This program calculates the y power of x
     * @param x a positive integer
     * @param y number of digits of integer x
     * @return x to the power of y
     */
    public static int power(int x, int y) 
    {
        int i = 0;
        int power = 1;

        while(i < y) {
            power = power * x;
        }

        return power;
    }

    /** 
     * This program checks whether a number is Narcissistic.
     * @param x a positive integer
     * @return isNarcissistic = true if the number is Narcissistic
     */
    public static boolean isNarcissistic(int x)
    {

        int integer = x;
        int result = 0;

        while(integer > 0)
        {
            int lastDigit =integer % 10;
            result += power(lastDigit, numberOfDigits(x));
            integer = integer / 10;

        }

        return result == x;
    }

    public static void main(String[] agrs)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to be examined: ");
        int n = in.nextInt();

        System.out.println("Number of digits: " + numberOfDigits(n));

        System.out.println("Sum of digits: " + sumOfDigits(n));

        if(isFibonacci(n)) {
            System.out.println(n + " is a Fibonacci number.");
        } else {
            System.out.println(n + " is not a Fibonacci number.");
        }

        if(isHarshadNumber(n)) {
            System.out.println(n + " is a Harshad number");
        } else {
            System.out.println(n + " is not a Harshad number.");
        }

        if(isNarcissistic(n)) {
            System.out.println(n + " is Narcissistic.");
        } else {
            System.out.println(n + " is not Narcissistic.");
        }

        if(isPrime(n)) {
            System.out.println(n + " is a Prime number.");
        } else {
            System.out.println(n + " is not a Prime number.");
        }

        in.close();
    }
}