import java.io.IOException;
import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String input = "";

        while (true) {
            input = scan.nextLine();

            if ("END".equals(input)) {
                break;
            }

            boolean isInt = true;
            try {
                int integer = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                isInt = false;
            }

            boolean isDouble = true;
            try {
                double dbl = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                isDouble = false;
            }

            if (isInt) {
                System.out.printf("%s is integer type%n", input);
            } else if (isDouble) {
                System.out.printf("%s is floating point type%n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);
            } else if ("true".equalsIgnoreCase(input) || "false".equalsIgnoreCase(input)) {
                System.out.printf("%s is boolean type%n", input);
            } else {
                System.out.printf("%s is string type%n", input);
            }
        }
    }
}
