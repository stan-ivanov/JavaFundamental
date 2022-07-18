import java.util.Arrays;
import java.util.Scanner;

public class CondensedSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while ( numbers.length > 1 ) {
            int[] temp = new int[numbers.length - 1];

            for (int i = 0; i < numbers.length - 1; i++) {
                temp[i] = numbers[i] + numbers[ i + 1];
            }

            numbers = temp;
        }
        System.out.println(Arrays.toString(numbers).replace("[", "").replace("]", " "));
    }
}
