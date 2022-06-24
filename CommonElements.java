import java.util.Objects;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split("\\s+");
        String[] secondArray = scanner.nextLine().split("\\s+");;

        for (String s : secondArray) {
            for (String value : firstArray) {
                if (Objects.equals(value, s)) {
                    System.out.print(s + " ");
                }
            }
        }
    }
}
