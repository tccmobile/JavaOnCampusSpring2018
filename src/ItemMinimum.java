public class ItemMinimum {
    public static <TheType extends Comparable<TheType>>
    TheType tripleMin(TheType item1, TheType item2, TheType item3) {
        TheType minVal = item1; // Holds min item value, init to first item

        if (item2.compareTo(minVal) < 0) {
            minVal = item2;
        }
        if (item3.compareTo(minVal) < 0) {
            minVal = item3;
        }
        return minVal;
    }

    public static void main(String[] args) {
        Integer num1 = 55;    // Test case 1, item1
        Integer num2 = 99;    // Test case 1, item2
        Integer num3 = 66;    // Test case 1, item3

        Character let1 = 'a'; // Test case 2, item1
        Character let2 = 'z'; // Test case 2, item2
        Character let3 = 'm'; // Test case 2, item3

        String str1 = "zzz";  // Test case 3, item1
        String str2 = "aaa";  // Test case 3, item2
        String str3 = "mmm";  // Test case 3, item3

        // Try tripleMin method with Integers
        System.out.println("Items: " + num1 + " " + num2 + " " + num3);
        System.out.println("Min: " + tripleMin(num1, num2, num3) + "\n");

        // Try tripleMin method with Characters
        System.out.println("Items: " + let1 + " " + let2 + " " + let3);
        System.out.println("Min: " + tripleMin(let1, let2, let3) + "\n");

        // Try tripleMin method with Strings
        System.out.println("Items: " + str1 + " " + str2 + " " + str3);
        System.out.println("Min: " + tripleMin(str1, str2, str3) + "\n");

        return;
    }
}