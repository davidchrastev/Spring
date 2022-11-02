package FirstStepsInCodingLab;

import java.util.Scanner;

public class PetShop08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogCount = Integer.parseInt(scanner.nextLine());
        int catCount= Integer.parseInt(scanner.nextLine());
        double dogFoodPrice = 2.50;
        int catFoodPrice = 4;

        double sum = (dogCount * dogFoodPrice ) + (catFoodPrice * catCount);

        System.out.println(sum + " lv.");
    }
}
