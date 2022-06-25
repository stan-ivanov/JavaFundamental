import java.util.Arrays;
import java.util.Scanner;


public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[numbers];
        int[] secondArray = new int[numbers];

        for (int i = 0; i < numbers; i++) {
            int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < input.length - 1; j++) {
                secondArray[i] = input[j];
                firstArray[i] = input[j + 1];
            }
        }

        for (int i = 0; i < numbers; i += 2) {
            int temp = 0;
            temp = secondArray[i];
            secondArray[i] = firstArray[i];
            firstArray[i] = temp;
        }

        System.out.println(Arrays.toString(firstArray).replaceAll("[\\[\\],]",""));
        System.out.println(Arrays.toString(secondArray).replaceAll("[\\[\\],]",""));
    }
}
