import java.util.Objects;
import java.util.Scanner;

public class Commons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrOne = scanner.nextLine().split(" ");
        String[] arrTwo = scanner.nextLine().split(" ");

        for (String s : arrTwo) {
            for (int j = arrOne.length - 1; j >= 0; j--) {
                if (Objects.equals(arrOne[j], s)) {
                    System.out.print(arrOne[j] + " ");
                }
            }
        }
    }
}
