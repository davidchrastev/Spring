package ConditionalStatementsExercise;

import java.util.Scanner;

public class ToyShop04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVacation = Double.parseDouble(scanner.nextLine());
        int numberPuzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double allSum = (numberPuzzles * 2.60) + (dolls * 3) + (bears * 4.10) + (minions * 8.20) + (trucks * 2);

        int countAllToys = numberPuzzles + dolls + bears + minions + trucks;

        if (countAllToys >= 50) {
            allSum = allSum - (allSum * 0.25);

        }

        allSum = allSum - (allSum * 0.10);

        double diff = Math.abs(allSum - priceVacation);

        if (allSum >= priceVacation) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
