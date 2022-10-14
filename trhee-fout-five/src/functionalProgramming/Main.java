package functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    static String lamdaInMain(String x) {
        return "parameter is: " + x;
    }

    public static void main(String[] args) {

        /* functions assing to variables */
        Function<String, Integer> myFunction = (x) -> {
            System.out.println("hello" + x);
            return 4;
        };

        /*
         * Function<Integer, Void> secondFunction = (x) -> {
         * continue;
         * };
         */

        /* apoy use for execut function */
        // Integer num = myFunction.apply("pepe");
        // System.out.println(num + 3);

        /* filter, map, reduce */

        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("luis");
        listOne.add("Emilio");
        listOne.add("Grijlaba");
        listOne.add("Ramirez");

        Stream<String> oneStream = listOne.stream().map((x) -> "hola, " + x).filter(x -> x.endsWith("z"));
        // oneStream.forEach(x -> System.out.println(x));

        listOne = new ArrayList(Arrays.asList(oneStream.toArray()));

        // System.out.println(listOne);

        int[] arrayNums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        IntStream numsStream = Arrays.stream(arrayNums);

        int sumaPares = numsStream
                .filter(x -> x % 2 == 0)
                .sum();

        // System.out.println(sumaPares);

        /* explore method Array and List for converse to stream */

        List<Integer> listtest = null;
        // listtest.stream(); // return Stream<Integer>

        Arrays.stream(arrayNums); // require Array

        /* explore Stram methods */

        // list stream string

        String[] arrayString = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        Stream<String> stringStream = Arrays.stream(arrayString);

        // convertir a numeros
        Stream<Integer> stringStreamiNT = stringStream
                .map(x -> Integer.parseInt(x) * 4);

        System.out.println(Arrays.asList(stringStreamiNT.toArray()));

    }

}