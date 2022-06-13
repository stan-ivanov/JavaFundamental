import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSymbols = Integer.parseInt(scanner.nextLine());
        int numberOfOpenBrackets = 0;
        int numberOfClosingBrackets = 0;
        boolean isBalanced = true;

        for (int i = 1; i <= numberOfSymbols; i++) {
            String symbol = scanner.nextLine();

            if ( symbol.equals("(")) {
                numberOfOpenBrackets++;

                if (numberOfOpenBrackets - numberOfClosingBrackets >= 2) {
                    isBalanced = false;
                    break;
                }
            } else if ( symbol.equals(")")) {
                numberOfClosingBrackets++;

                if (numberOfClosingBrackets > numberOfOpenBrackets) {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (numberOfOpenBrackets != numberOfClosingBrackets) {
            isBalanced = false;
        }
        if (!isBalanced) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }
    }
}
