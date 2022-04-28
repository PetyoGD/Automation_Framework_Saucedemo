package conditionEx;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double budgetPeter = Double.parseDouble(scanner.nextLine());
        int videoCardsNum = Integer.parseInt(scanner.nextLine());
        int processorsNum = Integer.parseInt(scanner.nextLine());
        int ramMemosNum = Integer.parseInt(scanner.nextLine());

        int priceVideoCard = videoCardsNum * 250;
        Double priceProcessor = priceVideoCard * 0.35;
        Double allProcessorsPrice = priceProcessor * processorsNum;

        Double priceRam = priceVideoCard * 0.1;
        Double allRamPrice = priceRam * ramMemosNum;

        Double allItems = priceVideoCard + allProcessorsPrice + allRamPrice;
        if (videoCardsNum > processorsNum) {
            allItems = allItems - allItems * 0.15;
        }
        if (budgetPeter >= allItems) {
            System.out.printf("You have %.2f leva left!", budgetPeter - allItems);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budgetPeter - allItems));
        }
    }
}
