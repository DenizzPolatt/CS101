import java.util.Scanner;
/**
 * Lab05_Q1_revised
 */
public class Lab05_Q1_revised {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter city plan string: ");
        String buildingHeights = in.nextLine();

        int buildingCount = buildingHeights.length();
        int highestFloor = 0;
        int buildingHeight = 0;

        for(int i = 0; i < buildingCount; ++i)
        {
            buildingHeight = buildingHeights.charAt(i) - '0';

            if(buildingHeights.charAt(i) != 'P'){
                if(buildingHeight > highestFloor)
                {
                highestFloor = buildingHeight;
                }
            }
        }

        for( int floor = highestFloor; floor > 0; floor--) {

            for(int i = 0; i < buildingCount; i++) {
                buildingHeight = buildingHeights.charAt(i) - '0';

                if(buildingHeights.charAt(i) == 'P') {
                    if(floor != 1){
                        for(int j = 0; j < buildingHeights.indexOf('P') + 1; j++) {
                            System.out.print(" ");
                        }
                    }
                    else {
                        for(int j = 0; j < buildingHeights.indexOf('P') + 1; j++) {
                            System.out.print("*");
                        }
                    }
                }
                else if(i != buildingHeights.indexOf('P') + 1) {
                    if(buildingHeight >= floor) 
                    {
                    System.out.print("*");
                    }
                    else {
                    System.out.print(" ");
                    }   
                }
            }
            System.out.println();
        } 
    }
}
