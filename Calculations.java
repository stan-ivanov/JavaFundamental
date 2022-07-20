import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());

        switch (type) {
            case "add":
                add(numberOne, numberTwo);
                break;
            case "multiply":
                multiply(numberOne, numberTwo);
                break;
            case "subtract":
                subtract(numberOne, numberTwo);
                break;
            case "divide":
                divide(numberOne, numberTwo);
                break;
        }
    }

    public static void add(int first, int end){
        System.out.println(first + end);
    }
    public static void multiply(int first, int end){
        System.out.println(first * end);
    }
    public static void subtract(int first, int end){
        System.out.println(first - end);
    }
    public static void divide(int first, int end){
        System.out.println(first / end);
    }
}
