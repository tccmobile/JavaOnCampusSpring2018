public class RecursiveCalls {
    public static void backwardsAlphabet(char currLetter) {
        if (currLetter == 'a') {
            System.out.println("I found my treasure: "+currLetter);
        }
        else {
            System.out.println("Digging Down with: "+currLetter + " ");
            backwardsAlphabet(--currLetter);
            System.out.println("Digging Out with: "+currLetter + " ");

        }
        return;
    }

    public static void main (String [] args) {
        char startingLetter = '-';

        startingLetter = 'z';

        /* Your solution goes here  */
        backwardsAlphabet(startingLetter);

        return;
    }
}