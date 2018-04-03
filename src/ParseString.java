import java.util.Scanner;

public class ParseString {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String lineString = "";
        String firstWord = "";
        String secondWord = "";
        int commaLocation = 0;
        boolean inputDone = false;             // Flag to indicate next iteration

        while (!inputDone) {
            System.out.println("Enter input string:");
            lineString = scnr.nextLine();

            // If string does not contain comma and is not quit, then string format is incorrect
            while ((lineString.indexOf(',') == -1) && (lineString.equals("q") == false)) {
                System.out.println("Error: No comma in string.\n");
                System.out.println("Enter input string:");
                lineString = scnr.nextLine();
            }


            if (lineString.equals("q")) {
                inputDone = true;
            }
            else {
                commaLocation = lineString.indexOf(',');

                firstWord = lineString.substring(0, commaLocation);
                firstWord = firstWord.replace(" ", "");

                secondWord = lineString.substring(commaLocation + 1, lineString.length());
                secondWord = secondWord.replace(" ", "");

                System.out.println("First word: " + firstWord);
                System.out.println("Second word: " + secondWord);
                System.out.println("");
            }
        }
    }
}
