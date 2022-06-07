import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Scanner scanner = new Scanner(System.in).useDelimiter("[,\\s+]");

        int howManyNumbers = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < howManyNumbers; i++) {
            String numbers = scanner.nextLine();

            int sum = 0;

            String[] parts = numbers.split(" ");
            long leftNumber = Long.parseLong(parts[0]);
            long rightNumber = Long.parseLong(parts[1]);

            long bigger = Math.abs(Math.max(leftNumber, rightNumber));
            while (bigger > 0) {
                sum += bigger % 10;
                bigger /= 10;
            }

            System.out.println(sum);
        }
    }
}
