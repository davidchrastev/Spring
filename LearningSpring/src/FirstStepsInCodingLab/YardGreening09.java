package FirstStepsInCodingLab;

import java.util.Scanner;

public class YardGreening09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double yardSize = Double.parseDouble(scanner.nextLine());
        double yardPrice = yardSize*7.61;
        double discount = yardPrice * 0.18;
        double finalPrice = yardPrice - discount ;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: "+ discount + " lv." );
    }
}
