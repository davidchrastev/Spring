package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class PersonalTitles04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        //1. проверка за пола -> m или f
        if (gender.equals("m")) {
            if (age >= 16) {
                System.out.println("Mr.");
            } else {  //age < 16
                System.out.println("Master");
            }
        } else if (gender.equals("f")) {
            if (age >= 16) {
                System.out.println("Ms.");
            } else { //age < 16
                System.out.println("Miss");
            }
        }
    }
}
