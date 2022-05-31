package nestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examiners = Integer.parseInt(scanner.nextLine());
        String title = scanner.nextLine();
        double allGrade = 0;
        double allGrade1 = 0;
        int counter1 = 0;
        while (!title.equals("Finish")) {
            String input = scanner.nextLine();
            allGrade1 = 0;
            int counter = 0;
            double grade1 = Double.parseDouble(input);
            for (int i = 1; i <= examiners; i++) {
                counter1++;
                allGrade1 += grade1;
                allGrade += grade1;
                counter++;
                if (counter == examiners) {
                    System.out.printf("%s - %.2f.%n", title, allGrade1 / examiners);
                    break;
                }
                input = scanner.nextLine();
                grade1 = Double.parseDouble(input);
            }
            title = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", allGrade / counter1);
    }
}
