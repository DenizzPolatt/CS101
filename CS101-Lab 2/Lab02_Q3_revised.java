/**
 * Now in addition to what is printed out in part 3, first define and initialize a string as "War and
 * Peace". Then write the code that will change this string to "and War PeAce" and display it on the
 * console.
 * 
 * @author Deniz Polat
 * 
 */
public class Lab02_Q3_revised {
    
    public static void main(String[] args){

        String warAndPeace = "War and Peace";

        System.out.print(warAndPeace.substring(4, 8));
        System.out.print(warAndPeace.substring(0, 3));
        System.out.print(warAndPeace.substring(7, 10));
        System.out.print(warAndPeace.substring(10, 11).toUpperCase());
        System.out.println(warAndPeace.substring(11));
    }
}
