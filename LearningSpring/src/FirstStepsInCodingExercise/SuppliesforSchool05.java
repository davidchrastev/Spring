package FirstStepsInCodingExercise;

import java.util.Scanner;

public class SuppliesforSchool05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int penCount = Integer.parseInt(scanner.nextLine());
        int markersCount = Integer.parseInt(scanner.nextLine());
        int litersForCleaning = Integer.parseInt(scanner.nextLine());

        int procent = Integer.parseInt(scanner.nextLine());

        double sumWithoutSum = (penCount * 5.80 + markersCount * 7.20 + litersForCleaning * 1.20);

        double sum = sumWithoutSum - ((sumWithoutSum * procent) / 100);
        System.out.println(sum);
    }
}
