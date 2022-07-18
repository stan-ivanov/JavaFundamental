import java.util.Arrays;
import java.util.Scanner;

public class StringArrayReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        for (int i = 0; i < arr.length / 2; i++) {
            String old = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length -1 -i] = old;
        }
        System.out.println(String.join(" ", arr));
    }
}
