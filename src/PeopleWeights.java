import java.util.Scanner;

public class PeopleWeights {

    public static void main(String arg[]){

        double weights[] = new double[5];
        int i;
        double total, average, max;
        Scanner scanner = new Scanner(System.in);

        //Part I
        for (i = 0; i < weights.length; i++) {
            System.out.println("Enter weight "+(i+1)+":");
            weights[i] = scanner.nextDouble();
        }

        System.out.print("You entered: ");

        for ( i = 0; i < weights.length ; i++) {
            System.out.print(weights[i]+" ");
        }
        System.out.println();

        //Part II III & IV
        total = 0;
        max = weights[0];
        for (i = 0; i <weights.length ; i++) {
            total+=weights[i];
            if (weights[i]>max){
                max =  weights[i];
            }
        }

        System.out.println();
        System.out.println("Total weight: "+total);
        System.out.println("Average weight: "+(total/weights.length));
        System.out.println("Max weight: "+max);
    }
}
