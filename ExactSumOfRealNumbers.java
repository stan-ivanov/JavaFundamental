import java.util.Scanner;
import java.math.BigDecimal;
public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < n; i++) {
            BigDecimal number = new BigDecimal(scanner.nextLine());
            sum = sum.add(number);

        }
        System.out.println(sum);
    }
}
