import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int numberOfChar = Integer.parseInt(scanner.nextLine());
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= numberOfChar; i++) {

            int sumAscii = scanner.next().charAt(0);
            sumAscii += key;

            output.append((char) sumAscii);
        }
        System.out.print(output);
    }
}
