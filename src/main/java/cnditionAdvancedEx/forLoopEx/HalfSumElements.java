package cnditionAdvancedEx.forLoopEx;

import java.util.Scanner;

public class HalfSumElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            if (num1 > maxValue) {
                maxValue = num1;
            }
            sum += num1;
        }
        if ((sum - maxValue) == maxValue) {
            System.out.printf("Yes%nSum = %d", maxValue);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(maxValue * 2 - sum));
        }
    }
}
