package whileLoop;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationCost = Double.parseDouble(scanner.nextLine());
        double presentMoney = Double.parseDouble(scanner.nextLine());
        int counter = 0;
        int everyDayCount = 0;
        double money = 0;
        double currentMoney = presentMoney - money;
        while (currentMoney < vacationCost) {
            String operation = scanner.nextLine();
            everyDayCount++;
            money = Double.parseDouble(scanner.nextLine());

            switch (operation) {
                case "spend":
                    counter++;
                    currentMoney -= money;
                    if (counter >= 5) {
                        System.out.printf("You can't save the money.%n%d", counter);
                    }
                    break;
                case "save":
                    if (currentMoney < 0) {
                        currentMoney = 0;
                    }
                    currentMoney += money;
                    break;
            }
            if (counter >= 5) {
                break;
            }
        }
        if (vacationCost <= currentMoney) {
            System.out.printf("You saved the money for %d days.", everyDayCount);
        }
    }
}
