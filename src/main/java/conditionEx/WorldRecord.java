package conditionEx;

import java.util.Scanner;

public class WorldRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double worldRecord = Double.parseDouble(scanner.nextLine());
        Double distanceInMeters = Double.parseDouble(scanner.nextLine());
        Double timeToSwimOneMeter = Double.parseDouble(scanner.nextLine());

        Double timeToSwimDistance = distanceInMeters * timeToSwimOneMeter;
        Double allTimeToSlowDown = Math.floor(distanceInMeters / 15) * 12.5;
        Double finalTimeSum = timeToSwimDistance + allTimeToSlowDown;

        if (finalTimeSum < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalTimeSum);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(finalTimeSum - worldRecord));
        }
    }
}
