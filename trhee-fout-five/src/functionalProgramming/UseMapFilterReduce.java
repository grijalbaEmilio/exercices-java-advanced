package functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseMapFilterReduce {

    static final String[] MY_ARRAY_NAME = { "Luis", "Juan", "Laura", "Pepe", "Claudia",
            "Andrea", "Jimena", "Matitza", "Roberto", "Raúl" };

    static ArrayList<String> MY_LIST_LASTNAME = new ArrayList<String>();

    public static void main(String[] args) {
        MY_LIST_LASTNAME.add("Ramirez");
        MY_LIST_LASTNAME.add("Vidal");
        MY_LIST_LASTNAME.add("Torres");
        MY_LIST_LASTNAME.add("Olgín");
        MY_LIST_LASTNAME.add("Toro");
        MY_LIST_LASTNAME.add("Blandón");

        // names end with a character and converse in upercase; print array list
        Stream<String> nameStartA = Arrays.stream(MY_ARRAY_NAME);
        nameStartA = nameStartA
                .filter(x -> x.endsWith("a"))
                .map(x -> x.toUpperCase());

        ArrayList<String> namesInList = (ArrayList<String>) nameStartA.collect(Collectors.toList());
        System.out.println(namesInList);

        Stream<String> nameStartACopy = Arrays.stream(MY_ARRAY_NAME);
        String concatNames = nameStartACopy.reduce("", (x, y) -> x + y + " ");
        System.out.println(concatNames);

    }

}
