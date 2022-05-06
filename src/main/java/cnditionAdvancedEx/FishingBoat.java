package cnditionAdvancedEx;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherNum = Integer.parseInt(scanner.nextLine());
        Double totalPrice = 0.0;
        switch (season) {
            case "Spring":
                if (fisherNum <= 6 && fisherNum % 2 == 0) {
                    totalPrice = 3000 - 3000 * 0.1 - 3000 * 0.05;
                } else if (fisherNum <= 6 && fisherNum % 2 != 0) {
                    totalPrice = 3000 - 3000 * 0.1;
                } else if (fisherNum > 6 && fisherNum <= 11 && fisherNum % 2 == 0) {
                    totalPrice = 3000 - 3000 * 0.15 - 3000 * 0.05;
                } else if (fisherNum > 6 && fisherNum <= 11 && fisherNum % 2 != 0) {
                    totalPrice = 3000 - 3000 * 0.15;
                } else if (fisherNum > 11 && fisherNum % 2 == 0) {
                    totalPrice = 3000 - 3000 * 0.25 - 3000 * 0.05;
                } else if (fisherNum > 1 && fisherNum % 2 != 0) {
                    totalPrice = 3000 - 3000 * 0.25;
                }
                break;
            case "Summer":
                if (fisherNum <= 6 && fisherNum % 2 == 0) {
                    totalPrice = 4200 - 4200 * 0.1 - 4200 * 0.05;
                } else if (fisherNum <= 6 && fisherNum % 2 != 0) {
                    totalPrice = 4200 - 4200 * 0.1;
                } else if (fisherNum > 6 && fisherNum <= 11 && fisherNum % 2 == 0) {
                    totalPrice = 4200 - 4200 * 0.15 - 4200 * 0.05;
                } else if (fisherNum > 6 && fisherNum <= 11 && fisherNum % 2 != 0) {
                    totalPrice = 4200 - 4200 * 0.15;
                } else if (fisherNum > 11 && fisherNum % 2 == 0) {
                    totalPrice = 4200 - 4200 * 0.25 - 4200 * 0.05;
                } else if (fisherNum > 11 && fisherNum % 2 != 0) {
                    totalPrice = 4200 - 4200 * 0.25;
                }
                break;
            case "Autumn":
                if (fisherNum <= 6 && fisherNum % 2 == 0) {
                    totalPrice = 4200 - (4200 * 0.1);
                } else if (fisherNum > 6 && fisherNum <= 11) {
                    totalPrice = 4200 - 4200 * 0.15;
                } else if (fisherNum > 11) {
                    totalPrice = 4200 - 4200 * 0.25;
                }
                break;
            case "Winter":
                if (fisherNum <= 6 && fisherNum % 2 == 0) {
                    totalPrice = 2600 - 2600 * 0.1 - 2600 * 0.05;
                } else if (fisherNum <= 6 && fisherNum % 2 != 0) {
                    totalPrice = 2600 - 2600 * 0.1;
                } else if (fisherNum > 6 && fisherNum <= 11 && fisherNum % 2 == 0) {
                    totalPrice = 2600 - 2600 * 0.15 - 2600 * 0.05;
                } else if (fisherNum > 6 && fisherNum <= 11 && fisherNum % 2 != 0) {
                    totalPrice = 2600 - 2600 * 0.15;
                } else if (fisherNum > 11 && fisherNum % 2 == 0) {
                    totalPrice = 2600 - 2600 * 0.25 - 2600 * 0.05;
                } else if (fisherNum > 11 && fisherNum % 2 != 0) {
                    totalPrice = 2600 - 2600 * 0.25;
                }
                break;
        }
        if (budget >= totalPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", totalPrice - budget);
        }
    }
}

