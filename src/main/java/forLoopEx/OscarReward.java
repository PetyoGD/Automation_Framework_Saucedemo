package forLoopEx;

import java.util.Scanner;

public class OscarReward {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actor = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());

        int numExaminers = Integer.parseInt(scanner.nextLine());
        double allPoints = 0;

        for (int i = 1; i <= numExaminers; i++) {
            String nameExaminers = scanner.nextLine();
            double pointsExaminers = Double.parseDouble(scanner.nextLine());
            int nameLength = nameExaminers.length();
            double prePoints = nameLength * pointsExaminers * 1.0 / 2;
            allPoints = points + prePoints;
            points = allPoints;
            if (points > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, points);
                break;
            }
        }
        if (points < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actor, (1250.5 - points));
        }
    }
}
