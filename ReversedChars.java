import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstChar = scanner.nextLine();
        String secondChar = scanner.nextLine();
        String thirdChar = scanner.nextLine();

        System.out.printf("%s %s %s", thirdChar, secondChar, firstChar);
        
    }
}
