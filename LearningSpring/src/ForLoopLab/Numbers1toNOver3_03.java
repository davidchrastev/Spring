package ForLoopLab;

import java.util.Scanner;

public class Numbers1toNOver3_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //ОТПЕЧАТВАМ ЧИСЛА ОТ 1 ДО N ПРЕЗ 3
        //повтаряме: печатаме число
        //начало: 1
        //край: n
        //промяна: +3
        for (int number = 1; number <= n; number += 3) {
            System.out.println(number);
        }
    }
}
