package whileLoop;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int counter = 0;
        String book = scanner.nextLine();

        while (!book.equals("No More Books")) {
            if (book.equals(input)) {
                System.out.printf("You checked %d books and found it.", counter);
                break;
            }
            counter++;
            book = scanner.nextLine();
            if (book.equals("No More Books")) {
                System.out.printf("The book you search is not here!%nYou checked %d books.", counter);
                break;
            }
        }
    }
}


