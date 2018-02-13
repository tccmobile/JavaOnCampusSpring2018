import java.util.Scanner;

public class GrocerySorter {
    public enum GroceryItem {GR_APPLES, GR_BANANAS, GR_JUICE, GR_WATER};

    public static void main (String [] args) {
        GroceryItem userItem;

        userItem = GroceryItem.GR_APPLES;

        /* Your solution goes here  */
        switch (userItem){
            case GR_APPLES:
                System.out.println("Fruit");
                break;
            case GR_BANANAS:
                System.out.println("Fruit");
                break;
            case GR_JUICE:
                System.out.println("Drink");
                break;
            case GR_WATER:
                System.out.println("Drink");
                break;
                default:
                    System.out.println("Unknown");
                    break;

        }

    }
}