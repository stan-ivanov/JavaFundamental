import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int sum;
        for ( sum = 0; numberOne != 0; numberOne = numberOne / 10) {
            sum = sum + numberOne % 10;
        }
        System.out.println(sum);
    }
}
