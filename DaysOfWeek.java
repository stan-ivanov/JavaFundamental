import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayOfWeekNumber = Integer.parseInt(scanner.nextLine());

        String[] days = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        if ( dayOfWeekNumber >= 1 && dayOfWeekNumber <= 7) {
            System.out.println(days[dayOfWeekNumber-1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
