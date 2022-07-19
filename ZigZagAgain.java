import java.util.Arrays;
import java.util.Scanner;

public class ZigZagAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int howManyNumbers = Integer.parseInt(scanner.nextLine());
        int[] arrOne = new int[howManyNumbers];
        int[] arrTwo = new int[howManyNumbers];

        for (int i = 1; i <= howManyNumbers ; i++) {
            String numbers = scanner.nextLine();
            int first = Integer.parseInt(numbers.split(" ")[0]);
            int second = Integer.parseInt(numbers.split(" ")[1]);
            if ( i % 2 == 0 ) {
                arrOne[i - 1] = second;
                arrTwo[i - 1] = first;
            } else {
                arrOne[i - 1] = first;
                arrTwo[i - 1] = second;
            }
        }
        for (int number : arrOne) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : arrTwo) {
            System.out.print(number + " ");
        }

    }
}
