import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumEveryEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumEvens = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumEvens += numbers[i];
            }
        }
        System.out.println(sumEvens);
    }
}
