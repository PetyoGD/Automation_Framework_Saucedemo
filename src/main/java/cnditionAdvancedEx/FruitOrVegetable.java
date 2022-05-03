package cnditionAdvancedEx;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item = scanner.nextLine();

        if (item.equals("banana") || item.equals("apple") || item.equals("kiwi") || item.equals("cherry") ||
                item.equals("lemon") || item.equals("grapes")) {
            System.out.println("fruit");
        } else if (item.equals("tomato") || item.equals("cucumber") || item.equals("pepper") || item.equals("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
