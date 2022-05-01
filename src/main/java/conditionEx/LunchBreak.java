package conditionEx;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String episode = new String(scanner.nextLine());
        int durationOfEpisode = Integer.parseInt(scanner.nextLine());
        int durationOfBreak = Integer.parseInt(scanner.nextLine());
        Double durationOfLunch = durationOfBreak / 8.00;
        Double durationOfRest = durationOfBreak / 4.00;
        Double durationLeft = durationOfBreak - durationOfLunch - durationOfRest;

        if (durationLeft >= durationOfEpisode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", episode, Math.ceil(durationLeft - durationOfEpisode));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", episode, Math.ceil(durationOfEpisode - durationLeft));
        }
    }
}
