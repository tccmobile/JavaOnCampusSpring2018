public class NestedLoop {
    public static void main (String [] args) {
        int userNum;
        int i;
        int j;

        userNum  = 3;

        /* Your solution goes here  */
        for (i=0;i<=userNum;i++){
            for ( j = 0; j <i ; j++) {

                System.out.print(" ");
                // TODO: 2/13/18 Add the ability to print tabs rather than spaces
            }
            System.out.println(i);
        }

    }
}