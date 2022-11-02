package FirstStepsInCodingExercise;

import java.util.Scanner;

public class VacationBooksList04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int readForHour = Integer.parseInt(scanner.nextLine());
        int countDays = Integer.parseInt(scanner.nextLine());

        int output = (pages / readForHour) / countDays;

        print(output);
    }
    public static void print(int output) {
        System.out.println(output);
    }
}
