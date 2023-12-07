/**
 * 
 * This program makes calculations to find the proportions of dry and water areas on Earth and in Turkey.
 * 
 * @author Deniz Polat
 */
public class Lab01_Q3 {

    public static void main(String[] args) {

        final long TOTAL_AREA_OF_EARTH = 510072000L;
        double percentageOfWaterAreaOnEarth = 70.8;
        double percentageOfAreaOfTurkey = 0.1536;
        double percentageOfWaterAreaInTurkey = 1.3;

        final long AREA_OF_TURKEY = 
            Math.round(TOTAL_AREA_OF_EARTH * percentageOfAreaOfTurkey / 100.0);

        long waterAreaInTurkey = Math.round(AREA_OF_TURKEY  * percentageOfWaterAreaInTurkey / 100.0);

        long dryAreaInTurkey = AREA_OF_TURKEY - waterAreaInTurkey;

        long waterAreaOnEarth = Math.round(TOTAL_AREA_OF_EARTH * percentageOfWaterAreaOnEarth / 100.0);
        
        long dryAreaOnEarth = TOTAL_AREA_OF_EARTH - waterAreaOnEarth;

        double percentageOfTurkeysDryLandOnEarth =
            (0.0 + dryAreaInTurkey) / dryAreaOnEarth * 100.0;

        double percentageOfTurkeysWaterOnEarth =
            ((double) waterAreaInTurkey) / waterAreaOnEarth * 100.0;

        System.out.println("Earth has " + dryAreaOnEarth + " km2 dry land and "
                             + waterAreaOnEarth + " km2 water.");

        System.out.println("Turkey has " + dryAreaInTurkey + " km2 dry land and "
                             + waterAreaInTurkey + " km2 water.");


        System.out.println("Turkey has " + percentageOfTurkeysDryLandOnEarth
                             + " percent of the Earth's dry land.");

        System.out.println("Turkey has " + percentageOfTurkeysWaterOnEarth
                             + " percent of the Earth's water.");
    }
}
