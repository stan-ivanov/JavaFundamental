import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        sign(num);
    }

    public static void sign(int number) {

        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if ( number < 0 ) {
            System.out.printf("The number %d is negative.", number);
        } else {
            System.out.printf("The number %d is zero.", number);
        }
    }
}
