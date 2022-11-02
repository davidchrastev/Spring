package FirstStepsInCodingExercise;

import java.util.Scanner;

public class Repainting06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int r = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double sumNylon = (nylon + 2) * 1.50;
        double sumPaint = (paint + (paint * 0.10)) * 14.50;
        double sumR = r * 5.00;
        double sumMaterials = sumNylon + sumPaint + sumR + 0.40;
        double sumWorkers = (sumMaterials * 0.30) * hours;
        double endSum = sumMaterials + sumWorkers;
        System.out.println(endSum);
    }
}
