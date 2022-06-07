import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGroup = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double totalPrice = 0;

        switch (typeOfGroup) {
            case "Students":
                if ( dayOfWeek.equals("Friday") ) {
                    totalPrice = numberOfGroup * 8.45;
                    if ( numberOfGroup >= 30 ) {
                        totalPrice = ( numberOfGroup * 8.45 ) * 0.85;
                    }
                } else if ( dayOfWeek.equals("Saturday")) {
                    totalPrice = numberOfGroup * 9.80;
                    if ( numberOfGroup >= 30 ) {
                        totalPrice = ( numberOfGroup * 9.80 ) * 0.85;
                    }
                } else if ( dayOfWeek.equals("Sunday")) {
                    totalPrice = numberOfGroup * 10.46;
                    if ( numberOfGroup >= 30 ) {
                        totalPrice = ( numberOfGroup * 10.46 ) * 0.85;
                    }
                }
                break;
            case "Business":
                if ( dayOfWeek.equals("Friday") ) {
                    totalPrice = numberOfGroup * 10.90;
                    if ( numberOfGroup >= 100 ) {
                        totalPrice = numberOfGroup - 10;
                        totalPrice = numberOfGroup * 10.90;
                    }
                } else if ( dayOfWeek.equals("Saturday")) {
                    totalPrice = numberOfGroup * 15.60;
                    if ( numberOfGroup >= 100 ) {
                        totalPrice = numberOfGroup - 10;
                        totalPrice = numberOfGroup * 15.60;
                    }

                } else if ( dayOfWeek.equals("Sunday")) {
                    totalPrice = numberOfGroup * 16;
                    if ( numberOfGroup >= 100 ) {
                        totalPrice = numberOfGroup - 10;
                        totalPrice = numberOfGroup * 16;
                    }
                }
                break;
            case "Regular":
                if ( dayOfWeek.equals("Friday") ) {
                    totalPrice = numberOfGroup * 15;
                    if ( numberOfGroup >= 10 && numberOfGroup <= 20 ) {
                        totalPrice = ( numberOfGroup * 15 ) * 0.95;
                    }
                } else if ( dayOfWeek.equals("Saturday")) {
                    totalPrice = numberOfGroup * 20;
                    if ( numberOfGroup >= 10 && numberOfGroup <= 20 ) {
                        totalPrice = ( numberOfGroup * 20 ) * 0.95;
                    }

                } else if ( dayOfWeek.equals("Sunday")) {
                    totalPrice = numberOfGroup * 22.50;
                    if ( numberOfGroup >= 10 && numberOfGroup <= 20 ) {
                        totalPrice = ( numberOfGroup * 22.50 ) * 0.95;
                    }
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}