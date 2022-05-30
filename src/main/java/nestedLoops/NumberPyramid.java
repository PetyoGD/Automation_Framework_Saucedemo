package nestedLoops;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean flag = false;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                counter++;
                if (counter > n) {
                    flag = true;
                    break;
                }
                System.out.print(counter + " ");
            }
            if (flag) {
                break;
            }
            System.out.println();
        }
    }
}
