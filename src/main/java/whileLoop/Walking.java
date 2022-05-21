package whileLoop;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stepCounter = 0;
        int allSteps = 0;
        int counter = 0;
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("")) {
                break;
            }
            if (command.equals("Going home")) {
                int stepsHome = Integer.parseInt(scanner.nextLine());
                allSteps += stepsHome;
                break;
            }
            stepCounter = Integer.parseInt(command);
            counter++;
            allSteps += stepCounter;
            if (allSteps >= 10000) {
                break;
            }
        }
        if (allSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", allSteps - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", (10000 - allSteps));
        }
    }
}
