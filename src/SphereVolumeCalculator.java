public class SphereVolumeCalculator {
    public static void main (String [] args) {
        final double PIVAL = 3.14159;

        double sphereVolume;
        double sphereRadius;



        sphereRadius = 1.0;


        /* Your solution goes here  */
        sphereVolume = (4.0/3.0)*PIVAL*Math.pow(sphereRadius,3.0);

        System.out.println("Sphere volume: " + sphereVolume);
    }
}
