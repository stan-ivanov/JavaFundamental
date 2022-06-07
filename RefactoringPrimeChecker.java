import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int prime = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= prime; i++) {
            boolean isItPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isItPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isItPrime);
        }
    }
}
