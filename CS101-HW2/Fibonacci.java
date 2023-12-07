/**
 * Fall 2021 - HW2
 * @author Deniz Polat
 */
public class Fibonacci {

    public int calcFibA(int n) {
         if(n < 2) return n;
         return calcFibA(n - 1) + calcFibA(n- 2);
    }

    public int calcFibB(int n) {
        if(n < 2) return n;

        int prev = 0;
        int number = 1;
        int next = 0;
        int i  = 2;

        while(i < n) {
            next = prev + number;
            prev = number;
            number = next;

            i++;
        }
        return next;
    }

    public static void main(String[] args)
    {
        Fibonacci obj = new Fibonacci();

        for(int i = 0, n = 1; i <= 50; i+=5, n++)
        {
            long start = System.nanoTime();
            obj.calcFibA(i);
            long end = System.nanoTime();
            System.out.println(n + "\t" + (end - start)+ "\t" + "// for n=" + i
            + ", F_" + i + " is calculated in " + (end - start) + " nanoseconds.");
        }

        System.out.println();

        for(int i = 0, n = 1; i <= 50; i+=5, n++)
        {
            long start = System.nanoTime();
            obj.calcFibB(i);
            long end = System.nanoTime();
            System.out.println(n + "\t" + (end - start) + "\t" + "// for n=" + i
                + ", F_" + i + " is calculated in " + (end - start) + " nanoseconds.");
        }
    }
}