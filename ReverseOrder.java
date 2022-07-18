import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int[] n = new int[number];

        for (int i = 0; i < number; i++) {
            int newNumbers = Integer.parseInt(scanner.nextLine());
            n[i] = newNumbers;
        }
        for (int i = n.length-1; i >= 0; i--) {
            System.out.print(n[i] + " ");
        }
    }
}
