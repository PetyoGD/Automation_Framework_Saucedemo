package nestedLoops;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int primeNum = 0;
        int nonPrime = 0;

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            boolean flag = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    nonPrime += number;
                    flag = false;
                    break;
                }
            }
            if (flag) {
                primeNum += number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n", primeNum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrime);
    }
}
