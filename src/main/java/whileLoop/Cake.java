package whileLoop;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int allPieces = length * width;
        int remainPieces = 0;
        while (allPieces >= 0) {
            String stop = scanner.nextLine();
            if (stop.equals("STOP")) {
                break;
            }
            int takenPiece = Integer.parseInt(stop);
            allPieces -= takenPiece;
        }
        if (allPieces >= 0) {
            System.out.printf("%d pieces are left.", allPieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(allPieces));
        }
    }
}
