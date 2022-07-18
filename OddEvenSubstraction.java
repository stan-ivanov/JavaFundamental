import java.util.Arrays;
import java.util.Scanner;

public class OddEvenSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            if ( numbersArr[i] % 2 == 0 ) {
                sumEven += numbersArr[i];
            }
            if ( numbersArr[i] % 2 != 0) {
                sumOdd += numbersArr[i];
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
