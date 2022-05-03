package cnditionAdvancedEx;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeProjection = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());

        switch (typeProjection) {
            case "Premiere":
                System.out.printf("%.2f leva", row * column * 12.00);
                break;
            case "Normal":
                System.out.printf("%.2f leva", row * column * 7.50);
                break;
            case "Discount":
                System.out.printf("%.2f leva", row * column * 5.00);
                break;
            default:
                System.out.println("Something went wrong ");
        }
    }
}
