import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int max = Math.max(number1, Math.max(number2, number3));
        int min = Math.min(number1, Math.min(number2, number3));
        int mid = number1 + number2 + number3 - max - min;
        System.out.printf("%d%n%d%n%d%n", max, mid, min);
    }
}
