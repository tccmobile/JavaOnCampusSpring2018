import java.util.ArrayList;

public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems;

    public ShoppingCart() {
        customerName = "none";
        currentDate = "January 1, 2016";
        cartItems = new ArrayList<ItemToPurchase>();
    }

    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
        cartItems = new ArrayList<ItemToPurchase>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDate() {
        return currentDate;
    }

    public void addItem(ItemToPurchase item){
        /**
         * Adds an item to cartItems arrayList
         */
    }

    public void removeItem(String itemName){
        /**
         * Removes item from cartItems array.
         * If item name cannot be found, output this message:
         * Item not found in cart. Nothing removed.
         */

    }

    public void modifyItem(ItemToPurchase item){
        /**
         * Modifies an item's description, price, and/or quantity.
         * If item can be found (by name) in cart, check if parameter has default values for description, price, and quantity. If not, modify item in cart.
         * If item cannot be found (by name) in cart, output this message: Item not found in cart. Nothing modified.
         */

    }

    public int getNumItemsInCart(){
        int itemTotal=0;
        /**
         * Returns quantity of all items in cart.
         */
       return itemTotal;
    }

    public int getCostOfCart(){
        int costTotal = 0;
        /**
         * Determines and returns the total cost of items in cart.
         */
        return costTotal;
    }

    public void printTotal(){
        /**
         * Outputs total of objects in cart.
         * If cart is empty, output this message: SHOPPING CART IS EMPTY
         */
    }

    public void printDescriptions(){
        /**
         * Outputs each item's description.
         */
    }
}
