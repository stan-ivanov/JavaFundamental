import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfKegs = Integer.parseInt(scanner.nextLine());
        double maxSoFar = Double.MIN_VALUE;
        String kegName = "";
        for (int i = 1; i <= numberOfKegs; i++) {
            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volumeOfTheKeg = Math.PI * Math.pow(radius, 2) * height;

            if ( volumeOfTheKeg > maxSoFar ) {
                maxSoFar = volumeOfTheKeg;
                kegName = kegModel;
            }
        }
        System.out.println(kegName);
    }
}
