import java.util.Scanner;

public class TrainPassengersCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPassengers = Integer.parseInt(scanner.nextLine());
        int[] passengers = new int[numberOfPassengers];
        int sum = 0;

        for (int i = 0; i < numberOfPassengers; i++) {
            int newNumbers = Integer.parseInt(scanner.nextLine());
            passengers[i] = newNumbers;
        }
        for (int passenger : passengers) {
            sum += passenger;
            System.out.print(passenger + " ");
        }
        System.out.println("\n" + sum);
    }
}
