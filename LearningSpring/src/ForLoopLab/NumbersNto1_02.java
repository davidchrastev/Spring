package ForLoopLab;

import java.util.Scanner;

public class NumbersNto1_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //отпечатаме всички числа от n до 1
        //повтаряме: печатане на числото
        //начало: n
        //крайна: 1
        //промяна: -1

        for (int number = n; number >= 1; number--) {
            System.out.println(number);
        }
    }
}
