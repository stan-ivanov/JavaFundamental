import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double poundToDollar = Double.parseDouble(scanner.nextLine());

        poundToDollar = poundToDollar * 1.36;

        System.out.printf("%.3f", poundToDollar);
    }
}
