public class TripleItemManager {
    public static void main(String[] args) {

        // TripleItem class with Integers
        TripleItem<Integer> triInts = new TripleItem<Integer>(9999, 5555, 6666);

        // TripleItem class with Shorts
        TripleItem<Short> triShorts = new TripleItem<Short>((short)99, (short)55, (short)66);

        // Try methods from TripleItem
        triInts.printAll();
        System.out.println("Min: " + triInts.minItem() + "\n");

        triShorts.printAll();
        System.out.println("Min: " + triShorts.minItem());

        return;
    }
}