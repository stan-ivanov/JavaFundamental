import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagon = Integer.parseInt(scanner.nextLine());
        int[] array = new int[wagon];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum = sum + array[i];
        }
        System.out.println(Arrays.toString(array)
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));
        System.out.println(sum);
    }
}
