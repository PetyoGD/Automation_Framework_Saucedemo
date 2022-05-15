package cnditionAdvancedEx.forLoopEx;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String webSide = scanner.nextLine();

            if (webSide.equals("Facebook")) {
                salary -= 150;

            } else if (webSide.equals("Instagram")) {
                salary -= 100;

            } else if (webSide.equals("Reddit")) {
                salary -= 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.println(salary);
        }
    }
}