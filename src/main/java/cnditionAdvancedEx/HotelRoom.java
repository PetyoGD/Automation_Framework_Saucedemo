package cnditionAdvancedEx;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numberLodging = Integer.parseInt(scanner.nextLine());

        Double studio = 0.0;
        Double apartment = 0.0;

        switch (month) {
            case "May":
            case "October":
                studio = numberLodging * 50.00;
                apartment = numberLodging * 65.00;
                if (numberLodging > 7 && numberLodging <= 14) {
                    studio = studio - studio * 0.05;
                    System.out.printf("Apartment: %.2f lv.", apartment);
                    System.out.printf("Studio: %.2f lv.", studio);
                } else if (numberLodging > 14) {
                    studio = studio - studio * 0.3;
                    apartment = apartment - apartment * 0.1;
                    System.out.printf("Apartment: %.2f lv.", apartment);
                    System.out.printf("%nStudio: %.2f lv.", studio);
                }
                break;
            case "June":
            case "September":
                studio = numberLodging * 75.20;
                apartment = numberLodging * 68.70;
                if (numberLodging > 14) {
                    studio = studio - studio * 0.2;
                    apartment = apartment - apartment * 0.1;
                }
                System.out.printf("Apartment: %.2f lv.", apartment);
                System.out.printf("%nStudio: %.2f lv.", studio);
                break;
            case "July":
            case "August":
                studio = numberLodging * 76.00;
                apartment = numberLodging * 77.00;
                if (numberLodging > 14) {
                    apartment = apartment - apartment * 0.1;
                }
                System.out.printf("Apartment: %.2f lv.", apartment);
                System.out.printf("%nStudio: %.2f lv.", studio);
                break;
        }
    }
}
