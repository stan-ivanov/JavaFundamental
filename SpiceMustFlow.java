import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int numberOfDays = 0;
        int totalSpices = 0;
        //int workersConsumed = 26;

        while ( startingYield >= 100 ) {
            int spiceField = startingYield - 26;
            //startingYield = startingYield - workersConsumed;
            totalSpices += spiceField;
            numberOfDays++;
            startingYield -= 10;

        }
        System.out.println(numberOfDays);
        if(totalSpices >= 26) {
            totalSpices -= 26;
        }
        System.out.println(totalSpices);
    }
}
