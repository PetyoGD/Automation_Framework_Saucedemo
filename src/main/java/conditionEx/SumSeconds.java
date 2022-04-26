package conditionEx;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        int allTime = firstTime + secondTime + thirdTime;
        int minute = allTime / 60;
        int seconds = allTime % 60;
        System.out.printf("%d:%02d",minute,seconds);

     /*   if(seconds < 10){
            System.out.printf("%d:0%d",minute,seconds);
        }else{
            System.out.printf("%d:%d",minute,seconds);
        } */
    }
}
