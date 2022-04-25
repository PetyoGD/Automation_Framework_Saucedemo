package conditionEx;

import java.util.Scanner;

public class AreaOfFigurs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();
         if(shape.equals("square")){
             Double squareSide = Double.parseDouble(scanner.nextLine());
             Double area = squareSide * squareSide;
             System.out.printf("%.3f",area);
         }else if(shape.equals("rectangle")){
             Double rectangleSide1 = Double.parseDouble(scanner.nextLine());
             Double rectangleSide2 = Double.parseDouble(scanner.nextLine());
             Double area = rectangleSide1 * rectangleSide2;
             System.out.printf("%.3f",area);
         }else if(shape.equals("circle")){
             Double radiusCircle = Double.parseDouble(scanner.nextLine());
             Double area = radiusCircle * radiusCircle * Math.PI;
             System.out.printf("%.3f",area);
         }else if(shape.equals("triangle")){
             Double triangleSide = Double.parseDouble(scanner.nextLine());
             Double triangleHeight = Double.parseDouble(scanner.nextLine());
             Double area = triangleSide * triangleHeight / 2;
             System.out.printf("%.3f",area);
         }
    }
}
