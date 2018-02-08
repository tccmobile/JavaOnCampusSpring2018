
import java.util.Scanner;

public class StringCensoring {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userWord;

        System.out.print("Enter a word: ");
        userWord = scnr.next();

        if (userWord.equalsIgnoreCase("Voldemort")) {
            System.out.println("He who must not be named");
        }
        else {
            System.out.println(userWord);
        }
    }
}