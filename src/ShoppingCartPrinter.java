import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String arg[]){


        ItemToPurchase itemOne = new ItemToPurchase();
        ItemToPurchase itemTwo = new ItemToPurchase();
        Scanner scanner = new Scanner(System.in);
        String name;
        int price, quantity;

        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        name = scanner.nextLine();
        System.out.println("Enter the item price:");
        price = scanner.nextInt();
        System.out.println("Enter the item quantity:");
        quantity = scanner.nextInt();

        itemOne.setName(name);
        itemOne.setPrice(price);
        itemOne.setQuantity(quantity);

        scanner.nextLine();


        System.out.println();
        System.out.println("Item 2");
        System.out.println("Enter the item name:");
        name = scanner.nextLine();
        System.out.println("Enter the item price:");
        price = scanner.nextInt();
        System.out.println("Enter the item quantity:");
        quantity = scanner.nextInt();

        itemTwo.setName(name);
        itemTwo.setPrice(price);
        itemTwo.setQuantity(quantity);

        System.out.println();
        System.out.println("TOTAL COST");
        System.out.println(itemOne.getName()+" "+itemOne.getQuantity()+" @ $"+itemOne.getPrice()+" = $"+(itemOne.getPrice()*itemOne.getQuantity()));
        System.out.println(itemTwo.getName()+" "+itemTwo.getQuantity()+" @ $"+itemTwo.getPrice()+" = $"+(itemTwo.getPrice()*itemTwo.getQuantity()));
        System.out.println();
        System.out.println("Total: $"+((itemOne.getPrice()*itemOne.getQuantity())+(itemTwo.getPrice()*itemTwo.getQuantity())));
    }
}
