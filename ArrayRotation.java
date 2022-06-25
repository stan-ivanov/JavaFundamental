import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] entry = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int changes = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < changes; i++) {
            int tempValue = entry[0];

            /*for (int k = 0; k < entry.length - 1; k++) {
                entry[k] = entry[k + 1];
            }*/

            System.arraycopy(entry, 1, entry, 0, entry.length - 1);

            entry[entry.length - 1] = tempValue;
        }
        System.out.println(Arrays.toString(entry).replaceAll("[\\[\\],]",""));
    }
}
