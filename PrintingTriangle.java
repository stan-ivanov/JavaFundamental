import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int triangleNumber = Integer.parseInt(scanner.nextLine());

        printTriangle(triangleNumber);
    }

    public static void printTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            printLine(1, i);
        }
        for (int i = number - 1; i >= 1 ; i--) {
            printLine(1, i);
        }
    }
    public static void printLine(int numberStart, int numberEnd) {

        for (int i = numberStart; i <= numberEnd; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
