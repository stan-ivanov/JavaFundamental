import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());
        int numberFour = Integer.parseInt(scanner.nextLine());

        int sum = ( (numberOne + numberTwo) / numberThree ) * numberFour;
        System.out.println(sum);
    }
}
