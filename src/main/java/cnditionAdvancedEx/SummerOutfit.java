package cnditionAdvancedEx;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degree = Integer.parseInt(scanner.nextLine());
        String timeOfTheDay = scanner.nextLine();

        switch (timeOfTheDay) {
            case "Morning":
                if (degree >= 10 && degree <= 18) {
                    System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", degree);
                    break;
                } else if (degree > 18 && degree <= 24) {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
                    break;
                } else if (degree >= 25) {
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degree);
                    break;
                }
                System.out.println("wrong data");
            case "Afternoon":
                if (degree >= 10 && degree <= 18) {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
                    break;
                } else if (degree > 18 && degree <= 24) {
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degree);
                    break;
                } else if (degree >= 25) {
                    System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", degree);
                    break;
                }
            case "Evening":
                if (degree >= 10 && degree <= 18) {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
                    break;
                } else if (degree > 18 && degree <= 24) {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
                    break;
                } else if (degree >= 25) {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
                    break;
                }
            default:
                System.out.println("wrong data");
        }
    }
}
