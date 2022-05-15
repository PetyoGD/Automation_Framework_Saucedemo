package cnditionAdvancedEx.forLoopEx;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ntournament = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int w = 0;
        int f = 0;
        int sf = 0;
        double wNumber = 0;
        for (int i = 1; i <= ntournament; i++) {
            String tournament = scanner.nextLine();
            switch (tournament) {
                case "W":
                    wNumber++;
                    int w1 = 2000;
                    startPoints += w1;
                    w += w1;
                    break;
                case "F":
                    int f1 = 1200;
                    startPoints += f1;
                    f += f1;
                    break;
                case "SF":
                    int sf1 = 720;
                    startPoints += sf1;
                    sf += sf1;
                    break;
            }
        }
        System.out.printf("Final points: %d%n", startPoints);
        System.out.printf("Average points: %d%n", (w + f + sf) / ntournament);
        System.out.printf("%.2f%%", (wNumber / ntournament) * 100);
    }
}
