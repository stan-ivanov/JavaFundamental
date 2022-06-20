import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[numbers];

        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            arr[i] = n;

        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
