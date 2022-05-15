package whileLoop;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int minNum = Integer.MAX_VALUE;
        int corr = 0;
        while (!input.equals("Stop")) {
            corr = Integer.parseInt(input);
            if (minNum > corr) {
                minNum = corr;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%d", minNum);
    }
}
