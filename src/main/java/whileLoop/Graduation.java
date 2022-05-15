package whileLoop;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double averageGrade = 0;
        double grade = Double.parseDouble(scanner.nextLine());
        int number = 0;
        int failure = 0;

        while (true) {
            if (grade < 4) {
                failure++;
            }
            if (failure >= 2) {
                System.out.printf("%s has been excluded at %d grade", name, number);
                break;
            }
            averageGrade += grade;
            number++;
            if (number == 12) {
                System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade / number);
                break;
            }
            grade = Double.parseDouble(scanner.nextLine());
        }
    }
}




