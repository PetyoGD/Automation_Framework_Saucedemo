package whileLoop;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalSum = 0;
        while (!input.equals("NoMoreMoney")) {

            Double currentInput = Double.parseDouble(input);
            if (currentInput < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            totalSum += currentInput;
            System.out.printf("Increase: %.2f%n", currentInput);
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", totalSum);
    }
}
