package cnditionAdvancedEx;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String rate = scanner.nextLine();

        Double allStay = 0.0;

        switch (typeRoom) {
            case "room for one person":
                days = days - 1;
                allStay = days * 18.00;
                break;
            case "apartment":
                days = days - 1;
                allStay = days * 25.00;
                if (days < 10) {
                    allStay = allStay - allStay * 0.3;
                } else if (days >= 10 && days <= 15) {
                    allStay = allStay - allStay * 0.35;
                } else {
                    allStay = allStay - allStay * 0.5;
                }
                break;
            case "president apartment":
                days = days - 1;
                allStay = days * 35.00;
                if (days < 10) {
                    allStay = allStay - allStay * 0.1;
                } else if (days >= 10 && days <= 15) {
                    allStay = allStay - allStay * 0.15;
                } else {
                    allStay = allStay - allStay * 0.2;
                }
                break;
        }
        if (rate.equals("positive")) {
            allStay = allStay + allStay * 0.25;
            System.out.printf("%.2f", allStay);
        } else {
            allStay = allStay - allStay * 0.1;
            System.out.printf("%.2f", allStay);
        }
    }
}

