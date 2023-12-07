import java.util.Scanner;
/**
 * Lab04_Q4_revised
 * 
 * This program is the revised version of question 4. 
 * 
 * @author Deniz Polat
 */
public class Lab04_Q4_revised {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = in.nextInt();

        int i = 1;
        String symbol = "*";
        String space = " ";
        
        while(i <= n) {
            String line = symbol.repeat((2*i)-1);
            System.out.println(space.repeat(n-i) + line);

            i++;
        }
        
        in.close();

    }
}