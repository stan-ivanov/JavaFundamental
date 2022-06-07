import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userString = scanner.nextLine();
        String reversedString = "";
        for(int i = userString.length()-1; i >= 0; i--){
            reversedString = reversedString + userString.charAt(i);
        }
        System.out.println(reversedString);
    }
}
