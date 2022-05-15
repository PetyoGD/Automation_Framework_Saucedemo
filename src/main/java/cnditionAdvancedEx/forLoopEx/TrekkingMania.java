package cnditionAdvancedEx.forLoopEx;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nGroup = Integer.parseInt(scanner.nextLine());
        double percent = 0;
        double allPeople = 0;
        double sumGroup1 = 0;
        double sumGroup2 = 0;
        double sumGroup3 = 0;
        double sumGroup4 = 0;
        double sumGroup5 = 0;
        for (int i = 1; i <= nGroup; i++) {
            int peoplesGroup = Integer.parseInt(scanner.nextLine());
            allPeople += peoplesGroup;
            if (peoplesGroup <= 5) {
                sumGroup1 += peoplesGroup;
            } else if (peoplesGroup <= 12) {
                sumGroup2 += peoplesGroup;
            } else if (peoplesGroup <= 25) {
                sumGroup3 += peoplesGroup;
            } else if (peoplesGroup <= 40) {
                sumGroup4 += peoplesGroup;
            } else {
                sumGroup5 += peoplesGroup;
            }
        }
        if (sumGroup1 == 0) {
            System.out.println("0.00%");
        } else {
            System.out.printf("%.2f%%%n", (sumGroup1 / allPeople) * 100);
        }
        if (sumGroup2 == 0) {
            System.out.println("0.00%");
        } else {
            System.out.printf("%.2f%%%n", (sumGroup2 / allPeople) * 100);
        }
        if (sumGroup3 == 0) {
            System.out.println("0.00%");
        } else {
            System.out.printf("%.2f%%%n", (sumGroup3 / allPeople) * 100);
        }
        if (sumGroup4 == 0) {
            System.out.println("0.00%");
        } else {
            System.out.printf("%.2f%%%n", (sumGroup4 / allPeople) * 100);
        }
        if (sumGroup5 == 0) {
            System.out.println("0.00%");
        } else {
            System.out.printf("%.2f%%", (sumGroup5 / allPeople) * 100);
        }
    }
}
