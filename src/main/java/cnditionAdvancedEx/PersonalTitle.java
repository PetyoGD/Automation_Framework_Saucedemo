package cnditionAdvancedEx;

import java.util.Scanner;

public class PersonalTitle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double age = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();

        if (age >= 16) {
            if (sex.equals("m")) {
                System.out.println("Mr.");
            } else {
                System.out.println("Ms.");
            }
        } else if (age <= 16) {
            if (sex.equals("f")) {
                System.out.println("Miss");
            } else {
                System.out.println("Master");
            }
        }
    }
}
