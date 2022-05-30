package nestedLoops;

import java.util.Scanner;

public class EqualSumEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        for (int i = a; i <= b; i++) {
            int currentNumber = i;
            int evenNum = 0;
            int oddNum = 0;
            for (int j = 6; j >= 1; j--) {
                int digit = currentNumber % 10;
                if (j % 2 == 0) {
                    evenNum += digit;
                } else {
                    oddNum += digit;
                }
                currentNumber /= 10;
            }
            if (evenNum == oddNum) {
                System.out.print(i + " ");
            }
        }
    }
}
