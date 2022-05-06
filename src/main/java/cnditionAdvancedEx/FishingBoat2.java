package cnditionAdvancedEx;

import java.util.Scanner;

public class FishingBoat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishmen = Integer.parseInt(scanner.nextLine());

        Double rent = 0.0;

        if (season.equals("Spring")) {
            rent = 3000.00;
        } else if (season.equals("Summer")) {
            rent = 4200.00;
        } else if (season.equals("Autumn")) {
            rent = 4200.00;
        } else if (season.equals("Winter")) {
            rent = 2600.00;
        }
        if (fishmen <= 6) {
            rent = rent - rent * 0.1;
        } else if (fishmen <= 11) {
            rent = rent - rent * 0.15;
        } else {
            rent = rent - rent * 0.25;
        }
        if (season.equals("Spring") || season.equals("Summer") || season.equals("Winter")) {
            if (fishmen % 2 == 0) {
                rent = rent - rent * 0.05;
            }
        }
        if (budget >= rent) {
            System.out.printf("Yes! You have %.2f leva left.", budget - rent);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", rent - budget);
        }
    }
}
