import java.util.Scanner;

/* Program #1
    Will Smith
    1/23/2018
 */

public class Demo {

    /**
     * This is the bootstrap method for my solution
     * @param args
     */


    public static void main(String[] args) {

        int num = 17;

        Scanner scanner = new Scanner(System.in);
        //creating input object

        System.out.println ("Please enter your age:");

        num = scanner.   nextInt(); // reads input from user

        System.out.println("You are "+num+" years old.");
    }
}
