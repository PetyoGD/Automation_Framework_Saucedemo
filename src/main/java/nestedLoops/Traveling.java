package nestedLoops;

import java.util.Scanner;

public class Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        while (!destination.equals("End")) {
            Double budget = Double.parseDouble(scanner.nextLine());
            double sumNeeded = 0;
            while (sumNeeded < budget) {
                Double currentSum = Double.parseDouble(scanner.nextLine());
                sumNeeded += currentSum;
            }
            System.out.printf("Going to %s!\n", destination);
            destination = scanner.nextLine();
        }
    }
}
