package ConditionalStatementsExercise;

import java.util.Scanner;

public class GodzillavsKong05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetFilm = Double.parseDouble(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());

        double decor = budgetFilm * 0.10;
        double priceClothes = clothes * number;
        double allSum = decor + priceClothes;



        if (number > 150) {
            allSum = allSum - (priceClothes * 0.10);

        }

        double diff = Math.abs(budgetFilm - allSum);

        if (allSum > budgetFilm) {

            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);

        } else {


            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);

        }
    }
}
