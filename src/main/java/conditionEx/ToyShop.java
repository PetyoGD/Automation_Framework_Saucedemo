package conditionEx;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double excursion = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int talkingDoll = Integer.parseInt(scanner.nextLine());
        int teddyBear = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int lorry = Integer.parseInt(scanner.nextLine());
        int numberToys = puzzle + talkingDoll + teddyBear + minions + lorry;
        Double prePrice = puzzle * 2.60 + talkingDoll * 3 + teddyBear * 4.10 + minions * 8.20 + lorry * 2;
        Double disPrice;
        Double postnumberDiscount;

        if(numberToys >= 50){
            disPrice = prePrice * 0.25;
            prePrice = prePrice - disPrice;
        }
        Double rentCheck = prePrice * 0.1;

        Double finalIncome = prePrice - rentCheck;
        Double moneyLeft = finalIncome - excursion;
        Double moneyNeeded = excursion - finalIncome;

        if(finalIncome >= excursion){
            System.out.printf("Yes! %.2f lv left.",moneyLeft);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.",moneyNeeded);
        }
    }
}
