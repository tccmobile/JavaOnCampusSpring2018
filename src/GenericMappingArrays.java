import java.util.Scanner;

public class GenericMappingArrays {
    public static <MapType extends Comparable<MapType>>
    MapType getMapping(MapType mapMe, MapType [] mappings) {
        MapType result = mapMe;
        int i = 0;
        int len = mappings.length;
        boolean keepLooking = true;

        System.out.println();
        System.out.print("Mapping range: ");
        for (i = 0; i < len; ++i) {
            System.out.print(mappings[i] + "  ");
        }
        System.out.println();

        i = 0;      // Restart counting
        while ((i < len) && keepLooking) {
            if (mapMe.compareTo(mappings[i]) <= 0) {
                result = mappings[i];
                keepLooking = false;
            }
            else {
                ++i;
            }
        }
        System.out.println(mapMe + " is mapped to " + result);

        return result;
    }

    // ***********************************************************************

    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);

        // Declare various types to use to call getMapping

        Integer mapInt = 0;
        Integer mapIntResult = 0;
        Integer [] mapIntMappings = { 100, 200, 300, 400, 500, 600 };

        Double mapDouble = 0.0;
        Double mapDoubleResult = 0.0;
        Double [] mapDoubleMappings = { -12.0, -6.0, 0.0, 6.0, 12.0 };

        String mapString = "";
        String mapStringResult = "";
        String [] mapStringMappings = { "A","E","I","O","U" };
        String absorbInput = "";      // For reading a string after a number

        // Get values to map, from user input

        System.out.print("\nEnter an integer value to map: ");
        mapInt = scnr.nextInt();
        mapIntResult = getMapping(mapInt, mapIntMappings);

        // FIXME: Add code similar to the integer processing to process
        //        a double and a string

        System.out.print("\nEnter a double value to map: ");
        mapDouble = scnr.nextDouble();
        mapDoubleResult = getMapping(mapDouble,mapDoubleMappings);

        System.out.print("\nEnter a string value to map: ");
        mapString = scnr.next();
        mapStringResult = getMapping(mapString,mapStringMappings);

        return;
    }
}