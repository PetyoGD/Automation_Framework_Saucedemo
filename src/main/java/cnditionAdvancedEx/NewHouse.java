package cnditionAdvancedEx;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlours = scanner.nextLine();
        int flourNumber = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        Double price = 0.0;

        if (typeFlours.equals("Roses")) {
            if (flourNumber <= 80) {
                price = flourNumber * 5.0;
            } else {
                price = flourNumber * 5.0 - flourNumber * 5.0 * 0.1;
            }
        } else if (typeFlours.equals("Dahlias")) {
            if (flourNumber <= 90) {
                price = flourNumber * 3.80;
            } else {
                price = flourNumber * 3.80 - flourNumber * 3.80 * 0.15;
            }
        } else if (typeFlours.equals("Tulips")) {
            if (flourNumber <= 80) {
                price = flourNumber * 2.80;
            } else {
                price = (flourNumber * 2.80) - (flourNumber * 2.80 * 0.15);
            }
        } else if (typeFlours.equals("Narcissus")) {
            if (flourNumber > 120) {
                price = flourNumber * 3.0;
            } else {
                price = flourNumber * 3.0 + flourNumber * 3.0 * 0.15;
            }
        } else if (typeFlours.equals("Gladiolus")) {
            if (flourNumber >= 80) {
                price = flourNumber * 2.50;
            } else {
                price = flourNumber * 2.50 + flourNumber * 2.50 * 0.2;
            }
        }
        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flourNumber, typeFlours,
                    budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}