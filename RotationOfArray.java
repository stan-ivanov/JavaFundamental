import java.util.Arrays;
import java.util.Scanner;

public class RotationOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // the array
        String[] arrayToRotate = scanner.nextLine().split(" ");
        // the new position length - newPosition
        int toPosition = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= toPosition; i++) {
            String firstElement = arrayToRotate[0];
            System.arraycopy(arrayToRotate, 1, arrayToRotate, 0, arrayToRotate.length - 1);
            arrayToRotate[arrayToRotate.length - 1] = firstElement;
        }

        System.out.println(Arrays.toString(arrayToRotate).replace("[", "").replace("]", " ").replace(",", ""));
    }
}
