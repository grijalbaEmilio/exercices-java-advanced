package args;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        System.out.println(args.length);
        Options options = new Options();

        for (int i = 0; i < args.length; i += 2) {
            options.addOption(args[i], args[i + 1]);
        }

        try {
            division(3, 0);

        } catch (ArithmeticException e) {
            System.out.println("arithmetic exeption: " + e.getMessage());
        }

        try {
            bucleInArray(1, 2, 3, 4, 5, 6);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index exception: " + e.getMessage());
        }

        try {
            InputStream myFile = new FileInputStream(options.getOption("--filePath"));

        } catch (FileNotFoundException e) {
            System.out.println("file exception: " + e.getMessage());
        }
        System.out.println();
    }

    static double division(double numerator, double denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("imposible dividir por cero");
        }
        return numerator / denominator;
    }

    static void bucleInArray(int... numbers) throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i < 9; i++) {
            int nn = numbers[i];
            continue;
        }
    }
}
