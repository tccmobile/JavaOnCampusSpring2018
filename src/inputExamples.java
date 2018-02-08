import java.util.Scanner;

public class inputExamples {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gimme a word:");

       // char userInput = scanner.next().charAt(0);
        String userInput = scanner.next();

        System.out.println("I got: "+userInput);
        System.out.println("Its is "+userInput.length()+" characters long");
        System.out.println(userInput.toUpperCase());


        System.out.println("How old are you anyway?");

        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("You are "+age+" years old.");

       /* System.out.println("Gimma a bunch of words");

        userInput = scanner.nextLine();

        System.out.println("I got: "+userInput);
*/





    }
}
