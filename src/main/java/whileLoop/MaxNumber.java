package whileLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNum = Integer.MIN_VALUE;
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            int corr = Integer.parseInt(input);
            if (maxNum < corr) {
                maxNum = corr;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%d", maxNum);
    }
}
