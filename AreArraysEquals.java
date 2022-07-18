import java.util.Arrays;
import java.util.Scanner;

public class AreArraysEquals {

    public static void main(final String[] args) {
         Scanner scanner = new Scanner(System.in);


            int[] arrOne = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] arrTwo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int sumArrOne = 0;
            int invalidIndex = Integer.MIN_VALUE;
            int diffIndex = invalidIndex;

            int minLen = Math.min(arrOne.length, arrTwo.length);
            for (int i = 0; i < minLen; i++) {
                sumArrOne += arrOne[i];
                if (arrOne[i] != arrTwo[i]) {
                    diffIndex = i;
                    break;
                }
            }

            if (diffIndex != invalidIndex) {
                System.out.println("Arrays are not identical. Found difference at " + diffIndex + " index.");
            } else if (arrOne.length != arrTwo.length) {
                System.out.println("Arrays are equal but have different length!");
            } else {
                System.out.println("Arrays are identical. Sum: " + sumArrOne);
            }
    }
}
