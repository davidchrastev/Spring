package FirstStepsInCodingLab;


import java.util.Scanner;

public class InchesToCentimiters04 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double inches = Double.parseDouble(scanner.nextLine());
            double cm = inches * 2.54;
            System.out.println(cm);
    }

}
