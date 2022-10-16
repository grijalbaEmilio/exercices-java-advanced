import java.util.function.Function;

public class RefactorComments {

    static Function<String, String> myFunction = (x) -> "hello, input is: " + x;

    public static void main(String[] args) {

        testFunction(myFunction, "Patricio");

        // TODO: implement static function adn use Class::functionStatic
        
        // testFunction(Main::lamdaInMain, "Patricio");

    }

    static void testFunction(Function<String, String> x, String parametter) {
        System.out.println(x.apply(parametter));
    }

}
