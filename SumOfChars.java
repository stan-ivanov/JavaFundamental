import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfChars = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for ( int i = 0; i < numberOfChars ; i++ ) {
            String letter = scanner.nextLine();
            char valueOf = letter.charAt(0);
            sum += (int)valueOf;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
