import java.util.Scanner;

public class MetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meter = Double.parseDouble(scanner.nextLine());
        meter = meter / 1000;
        System.out.printf("%.2f", meter);
    }
}
