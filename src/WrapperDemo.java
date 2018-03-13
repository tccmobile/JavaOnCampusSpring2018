import java.util.Scanner;

public class WrapperDemo {

    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);

        int myInt = 0;
        Integer myInteger = 0; // Integer myInteger = new Integer(0);
        String name = "will"; // String name = new String("will");
        String intData;

        System.out.println("Please enter an integer");
        //myInteger = scanner.nextInt();

        intData = scanner.next();

        //intData++; Its a String - cannot increment a string!

        myInt = Integer.parseInt(intData);

        myInt++; // Can increment an int

        System.out.println("myInt = " + intData);






    }
}
