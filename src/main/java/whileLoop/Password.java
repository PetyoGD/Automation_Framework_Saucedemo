package whileLoop;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        while (!password.equals(password)) {
            password = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}
