package conditionEx;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double budget = Double.parseDouble(scanner.nextLine());
        int numberStatists = Integer.parseInt(scanner.nextLine());
        Double priceClothing = Double.parseDouble(scanner.nextLine());
        Double priceDiscount;
        Double decor = budget * 0.1;
        if(numberStatists >= 150){
            priceClothing = priceClothing - priceClothing * 0.1;
        }
        Double priceStatClothing = numberStatists * priceClothing;
        Double finalBudget = decor + priceStatClothing;
        //Double moneyNeeded = finalBudget - budget;
        //Double moneyLeft = budget - finalBudget;

        if(finalBudget >= budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",Math.abs(budget - finalBudget));
        }else{
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",Math.abs(budget - finalBudget));
        }
    }
}
