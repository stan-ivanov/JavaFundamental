import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < inputArr.length; i++) {
            boolean isItBigger = true;
            for (int j = i + 1; j < inputArr.length; j++) {
                if (inputArr[i] <= inputArr[j]) {
                    isItBigger = false;
                }
            }
            if (isItBigger) {
                System.out.print(inputArr[i] + " ");
            }
        }
    }
}
