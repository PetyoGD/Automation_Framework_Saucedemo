package cnditionAdvancedEx;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        Double price = 0.0;

        if (budget <= 100) {
            if (season.equals("summer")) {
                price = budget * 0.3;
                System.out.printf("Somewhere in Bulgaria %nCamp - %.2f", price);
            } else if (season.equals("winter")) {
                price = budget * 0.7;
                System.out.printf("Somewhere in Bulgaria %nHotel - %.2f", price);
            }
        } else if (budget <= 1000) {
            if (season.equals("summer")) {
                price = budget * 0.4;
                System.out.printf("Somewhere in Balkans %nCamp - %.2f", price);
            } else if (season.equals("winter")) {
                price = budget * 0.8;
                System.out.printf("Somewhere in Balkans %nHotel - %.2f", price);
            }
        } else {
            price = budget * 0.9;
            System.out.printf("Somewhere in Europe %nHotel - %.2f", price);
        }
    }
}
