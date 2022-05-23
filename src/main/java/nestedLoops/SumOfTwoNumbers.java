package nestedLoops;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean flag = false;
        for (int i = a; i <= b; i++) {
            for (int j = a; j <= b; j++) {
                counter++;
                if (i + j == m) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, m);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (!flag) {
            System.out.printf("%d combinations - neither equals %d", counter, m);
        }
    }
}
