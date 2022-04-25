package conditionEx;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int result = Integer.parseInt(Scanner.nextLine());
        if (result >= 5) {
            System.out.println("Excellent!");
        }
    }
}
