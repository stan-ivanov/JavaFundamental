import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lowerOrUpper = scanner.nextLine();

        if (lowerOrUpper.equals(lowerOrUpper.toUpperCase())) {
            System.out.println("upper-case");
        } else if (lowerOrUpper.equals(lowerOrUpper.toLowerCase())) {
            System.out.println("lower-case");
        }
    }
}
