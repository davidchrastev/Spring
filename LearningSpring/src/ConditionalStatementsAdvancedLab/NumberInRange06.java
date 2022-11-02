package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class NumberInRange06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        //ако: числото е [-100;100] и е различно от 0 -> Yes
        //число >= -100
        //число <= 100
        //число != 0
        //в противен случай -> No
        if (number >= -100 && number <= 100 && number != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
