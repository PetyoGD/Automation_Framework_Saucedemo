package conditionEx;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int time = hour * 60 + minutes + 15;
        int newHour = time / 60;
        int newMin = time % 60;

        if (newHour > 23) {
            newHour = 0;
        }
        System.out.printf("%d:%02d", newHour, newMin);
    }
}
