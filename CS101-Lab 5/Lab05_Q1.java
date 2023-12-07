import java.util.Scanner;
/**
 * Lab05_Q1
 */
public class Lab05_Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter city plan string: ");
        String buildingHeights = in.nextLine();

        int buildingCount = buildingHeights.length();
        int highestFloor = 0;

        for(int i = 0; i < buildingCount; ++i)
        {
            int buildingHeight = buildingHeights.charAt(i) - '0';

            if(buildingHeight > highestFloor)
            {
                highestFloor = buildingHeight;
            }
        }
        String space = " ";
        String cityMatrix = space.repeat(buildingCount * highestFloor);

        for(int buildingIndex = 0; buildingIndex < buildingCount; 
            buildingIndex++) 
        {
            int buildingHeight = buildingHeights.charAt(buildingIndex) - '0';

            for(int floorIndex = 0; floorIndex < buildingHeight; floorIndex++) 
            {
                int cityMatrixRow = (highestFloor - 1) - floorIndex;
                int cityMatrixIndex = 
                    cityMatrixRow * buildingCount + buildingIndex;

                cityMatrix = 
                    cityMatrix.substring(0, cityMatrixIndex) + "*"
                    + cityMatrix.substring(cityMatrixIndex + 1);
            }
        }

        for(int currentRow = 0; currentRow < highestFloor; currentRow++)
        {
            int rowStartIndex = currentRow * buildingCount;
            System.out.println(
                cityMatrix.substring(
                    rowStartIndex, rowStartIndex + buildingCount));
        }

        in.close();
    }           
}