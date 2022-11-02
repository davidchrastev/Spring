package FirstStepsInCodingExercise;

import java.util.Scanner;

public class DepositCalculator03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double depositSum = Double.parseDouble(scanner.nextLine());
        int deadline = Integer.parseInt(scanner.nextLine());
        double yearly = Double.parseDouble(scanner.nextLine());

        double sum = depositSum + deadline * ((depositSum * yearly / 100) / 12);

        System.out.println(sum);
    }
}
