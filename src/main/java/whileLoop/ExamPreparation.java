package whileLoop;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGrades = Integer.parseInt(scanner.nextLine());
        int poorCounter = 0;
        int counter = 0;
        int sumGrade = 0;
        String lastProblem = "";
        double averageScore = 0;
        boolean isFailed = true;
        while (poorCounter < poorGrades) {
            String problemName = scanner.nextLine();
            if (problemName.equals("Enough")) {
                isFailed = true;
                break;
            }
            int taskGrade = Integer.parseInt(scanner.nextLine());
            counter++;
            if (taskGrade <= 4) {
                poorCounter++;
            }
            sumGrade += taskGrade;
            lastProblem = problemName;
            averageScore = (1.0 * sumGrade) / counter;
            if (poorGrades == poorCounter) {
                break;
            }
        }
        if (poorGrades == poorCounter) {
            System.out.printf("You need a break, %d poor grades.", poorCounter);
        } else if (isFailed) {
            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s"
                    , averageScore, counter, lastProblem);
        }
    }
}
