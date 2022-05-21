package whileLoop;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volume = length * width * height;
        int emptySpace = 0;

        while (emptySpace < volume) {
            String done = scanner.nextLine();
            if (done.equals("Done")) {
                break;
            }
            int box = Integer.parseInt(done);
            emptySpace += box;
        }
        if (volume >= emptySpace) {
            System.out.printf("%d Cubic meters left.", volume - emptySpace);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", emptySpace - volume);
        }
    }
}
