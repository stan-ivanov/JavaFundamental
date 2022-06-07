import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPourings = Integer.parseInt(scanner.nextLine());
        int waterTankCapacity = 255;
        int sum = 0;

        for ( int i = 1; i <= numberOfPourings ; i++ ) {
            int addedWater = Integer.parseInt(scanner.nextLine());
            sum += addedWater;

            if ( sum > waterTankCapacity) {
                System.out.println("Insufficient capacity!");
                sum -= addedWater;
            }
        }
        System.out.println(sum);
    }
}
