package cnditionAdvancedEx.forLoopEx;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Double washerPrice = Double.parseDouble(scanner.nextLine());
        int toysPrice = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int brother = 0;
        int toys = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                if (i == 2) {
                    sum = 10;
                } else {
                    sum += 10 * i / 2;
                }
                brother++;
            } else {
                toys++;
            }
        }
        Double toysMoney = toys * toysPrice * 1.0;
        Double totalMoney = toysMoney + sum - brother;

        if (totalMoney > washerPrice) {
            System.out.printf("Yes! %.2f", totalMoney - washerPrice);
        } else {
            System.out.printf("No! %.2f", Math.abs(totalMoney - washerPrice));
        }
    }
}

