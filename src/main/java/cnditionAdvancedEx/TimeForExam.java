package cnditionAdvancedEx;

import java.util.Scanner;

public class TimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int hourArr = Integer.parseInt(scanner.nextLine());
        int minArr = Integer.parseInt(scanner.nextLine());

        int exam = hourExam * 60 + minExam;
        int arr = hourArr * 60 + minArr;

        if ((exam - arr) == 0) {
            System.out.println("On time");
        } else if ((exam - arr) <= 30 && (exam - arr) > 0) {
            System.out.println("On time");
            System.out.printf("%d minutes before the start", (exam - arr));
        } else if ((exam - arr) > 30 && (exam - arr) <= 59) {
            System.out.println("Early");
            System.out.printf("%d minutes before the start", (exam - arr) % 60);
        } else if ((exam - arr) >= 60) {
            System.out.println("Early");
            if ((exam - arr) % 60 <= 9) {
                System.out.printf("%d:0%d hours before the start", (hourExam - hourArr), (exam - arr) % 60);
            } else {
                System.out.printf("%d:%d hours before the start", (hourExam - hourArr), (exam - arr) % 60);
            }
        } else if ((arr - exam) <= 59 && (arr - exam) > 0) {
            System.out.println("Late");
            System.out.printf("%d minutes after the start", Math.abs(arr - exam) % 60);
        } else if ((arr - exam) >= 60) {
            System.out.println("Late");
            if ((arr - exam) % 60 <= 9) {
                System.out.printf("%d:0%d hours after the start", (hourArr - hourExam), (arr - exam) % 60);
            } else {
                System.out.printf("%d:%d hours after the start", (hourArr - hourExam), (arr - exam) % 60);
            }
        }
    }
}
