package ForLoopLab;

import java.util.Scanner;

public class EvenPowersOf2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //четни степени от 0 до n
        //повтаряме: печатаме 2 на степен
        //начало: 0
        //край: n
        //промяна: +2
        for (int step = 0; step <= n; step += 2) {
            //2 на степен step
            System.out.println(Math.pow(2, step));
        }

    }
}



