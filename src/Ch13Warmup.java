import java.util.Scanner;

public class Ch13Warmup {

    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);
        int num,denom;

        System.out.println("Enter 2 numbers:");
        num = scanner.nextInt();
        denom = scanner.nextInt();

        try{

            if (denom==0){
                throw new ArithmeticException();
            }



            double total = (double)num/denom;
            System.out.println("a/b = "+total);

        } catch (ArithmeticException e){
            System.out.println("Exception: Division by zero");
        }

    }
}
