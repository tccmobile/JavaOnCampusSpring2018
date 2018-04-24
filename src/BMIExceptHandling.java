import java.util.Scanner;

public class BMIExceptHandling {
    public static int getWeight() throws Exception {
        Scanner scnr = new Scanner(System.in);
        int weightParam = 0; // User defined weight (lbs)

        // Get user data
        System.out.print("Enter weight (in pounds): ");
        weightParam = scnr.nextInt();

        // Error checking, non-negative weight
        if (weightParam < 0) {
            throw new Exception("Invalid weight.");
        }
        return weightParam;
    }

    public static int getHeight() throws Exception {
        Scanner scnr = new Scanner(System.in);
        int heightParam = 0; // User defined height (in)

        // Get user data
        System.out.print("Enter height (in inches): ");
        heightParam = scnr.nextInt();

        // Error checking, non-negative height
        if (heightParam < 0) {
            throw new Exception("Invalid height.");
        }
        return heightParam;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int weightVal = 0;    // User defined weight (lbs)
        int heightVal = 0;    // User defined height (in)
        float bmiCalc = 0.0f; // Resulting BMI
        char quitCmd = 'a';   // Indicates quit/continue

        while (quitCmd != 'q') {

            try {
                //Get user data
                weightVal = getWeight();
                heightVal = getHeight();

                // Calculate BMI and print user health info if no input error
                // Source: http://www.cdc.gov/
                bmiCalc = ((float) weightVal /
                        (float) (heightVal * heightVal)) * 703.0f;

                System.out.println("BMI: " + bmiCalc);
                System.out.println("(CDC: 18.6-24.9 normal)");
            } catch (Throwable excpt) {
                // Prints the error message passed by throw statement
                System.out.println(excpt.getMessage());
                System.out.println("Cannot compute health info");
            }

            // Prompt user to continue/quit
            System.out.print("\nEnter any key ('q' to quit): ");
            quitCmd = scnr.next().charAt(0);
        }

        return;
    }

}