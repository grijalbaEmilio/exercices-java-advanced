package functionalProgramming;

import java.util.function.Function;

public class UseLambdaInFunctions {

    static Function<String, String> myFunction = (x) -> "hello, input is: " + x;

    public static void main(String[] args) {

        testFunction(myFunction, "Patricio");
        testFunction(Main::lamdaInMain, "Patricio");

    }

    static void testFunction(Function<String, String> x, String parametter) {
        System.out.println(x.apply(parametter));
    }

}
