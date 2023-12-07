import java.util.Scanner;
/**
 * Lab04_Q4
 */
public class Lab04_Q4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = in.nextInt();

        int i = 0;
        String line = " ";
        
        while(i < n) {
            line += "*";
            System.out.println(line);

            i++;
        }
        
        in.close();

    }
}