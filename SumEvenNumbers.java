import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int[] arr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for (int current : arr) {
            if (current % 2 == 0) {
                sum += current;
            }
        }
        System.out.println(sum);
    }
}
