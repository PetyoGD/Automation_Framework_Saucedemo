package conditionEx;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Double bonus = 0.0;

        if (number <= 100) {
            bonus = 5.0;
        } else if (number > 1000) {
            bonus = number * 0.1;
        } else {
            bonus = number * 0.2;
        }
        if (number % 2 == 0) {
            bonus = bonus + 1;
        } else if (number % 10 == 5) {
            bonus = bonus + 2;
        }
        System.out.println(bonus);
        System.out.println(number + bonus);
    }
}
