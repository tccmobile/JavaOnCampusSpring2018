import java.util.Scanner;

public class TextMsgAbbreviation {

    public static void main(String[] args){
        String userInput;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input an abbreviation:");
        userInput = scanner.next();


        //This part below was added to illustrate using indexOf

        if (userInput.indexOf('O')!=-1){
            System.out.println("String contains an O");
        } else {
            System.out.println("String does not contain an O");
        }

        if (userInput.equals("LOL")){
            System.out.println("laughing out loud");
        } else if (userInput.equals("IDK")){
            System.out.println("I don't know");
        } else if (userInput.equals("BFF")){
            System.out.println("best friends forever");
        } else if (userInput.equals("IMHO")){
            System.out.println("in my humble opinion");
        } else if (userInput.equals("TMI")){
            System.out.println("too much information");
        } else {
            System.out.println("Unknown abbreviation");
        }


    }
}
