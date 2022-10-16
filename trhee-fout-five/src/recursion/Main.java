package recursion;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("sum imperative 1 + 2 + 3 + 4 + 5 = " + addImperative(5));
        System.out.println("sum recursive 1 + 2 + 3 + 4 + 5 = " + addRecursive(5));

        System.out.println("reverse the hola with recursion is: " + reverseStringRecursive("hola", null));
        System.out.println("reverse the hola functional form is: " + reverseStringFunctional("hola"));

    }

    public int factorialRecursive(int number) {
        if (number == 1) {
            return 1;
        }

        return number * factorialRecursive(number - 1);
    }

    public static int addImperative(int baseNumber) {
        int adition = 0;

        for (int i = 0; i <= baseNumber; i++) {
            adition += i;
        }

        return adition;
    }

    public static int addRecursive(int baseNumber) {
        if (baseNumber == 1) {
            return 1;
        }

        return baseNumber + addRecursive(baseNumber - 1);
    }

    public static String reverseStringRecursive(String text, Integer textLength) {
        if (textLength == null) {
            textLength = text.length();
        }

        String character = text.split("")[textLength - 1];

        if (textLength == 1) {
            return character;
        }

        return character + reverseStringRecursive(text, textLength - 1);
    }

    public static String reverseStringFunctional(String text) {
        return Arrays
                .stream(text.split(""))
                .reduce("", (x, y) -> y + x);

    }
}
