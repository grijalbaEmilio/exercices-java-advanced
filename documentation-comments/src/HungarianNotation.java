import java.util.Arrays;

public class HungarianNotation {

    static double DESCOUNT_PRICE = 0.3;

    public static void main(String[] args) {
        double[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(priceLessDescount(1, 2, 3, 4, 5));
        System.out.println(priceLessDescount(nums));

        printStrings("Juan", "Mariana", "Laura");
    }

    /**
     * calcule accumulated price of one or more prices
     * 
     * @param dBasePrices
     * @return
     */
    static double priceLessDescount(double... dBasePrices) {

        return Arrays.stream(dBasePrices)
                .map(x -> x + x * DESCOUNT_PRICE)
                .sum();
    }


    /**
     * print in console words
     * 
     * @param sWords
     */
    static void printStrings(String... sWords) {
        for (String word : sWords) {
            System.out.println(word);
        }
    }

}