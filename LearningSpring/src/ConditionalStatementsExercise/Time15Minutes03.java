package ConditionalStatementsExercise;

import java.util.Scanner;

public class Time15Minutes03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initHour = Integer.parseInt(scanner.nextLine());
        int initMin = Integer.parseInt(scanner.nextLine());

        int allMin = (initHour * 60) + initMin + 15;

        int sor = allMin / 60;
        int min = allMin % 60;

        if (sor > 23) {
            sor = 0;

        }


        System.out.printf("%d:%02d", sor, min);
    }
}
