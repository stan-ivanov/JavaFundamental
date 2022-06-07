import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.next());
        int elevatorCapacity = Integer.parseInt(scanner.next());

        int courses = 1;
        if ( numberOfPeople > elevatorCapacity ) {
            courses = (int) Math.ceil((double)numberOfPeople / elevatorCapacity);
        }

        System.out.println(courses);
    }
}
