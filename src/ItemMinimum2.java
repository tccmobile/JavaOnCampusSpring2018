public class ItemMinimum2 {

    public static <TheType extends Number>
    Double tripleAvg(TheType item1, TheType item2, TheType item3) {
        Double tripleSum = 0.0;

        tripleSum = item1.doubleValue() + item2.doubleValue() + item3.doubleValue();

        return tripleSum / 3.0;
    }

    public static void main(String[] args) {
        Integer intVal1 = 55;
        Integer intVal2 = 99;
        Integer intVal3 = 66;

        Double doubleVal1 = 14.5;
        Double doubleVal2 = 12.3;
        Double doubleVal3 = 1.75;

        // Try tripleAvg method with Integers
        System.out.println("Items: " + intVal1 + " " + intVal2 + " " + intVal3);
        System.out.println("Avg: " + tripleAvg(intVal1, intVal2, intVal3) + "\n");

        // Try tripleAvg method with Doubles
        System.out.println("Items: " + doubleVal1 + " " + doubleVal2 + " " + doubleVal3);
        System.out.println("Avg: " + tripleAvg(doubleVal1, doubleVal2, doubleVal3) + "\n");

        return;
    }
}
