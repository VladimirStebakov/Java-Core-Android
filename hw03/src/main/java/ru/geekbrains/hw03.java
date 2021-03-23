package ru.geekbrains;

import java.util.Random;
import java.util.Scanner;


public class hw03 {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Хотите отгадать число?");
            System.out.println("1 - Да  0 - Нет");
            int pusk = scanner.nextInt();
            if (pusk == 1) {

                Random rand = new Random();

                int chel = scanner.nextInt();
                int comp = rand.nextInt(10);
                //System.out.println(comp);
                for (int i = 0; i < 3; i++) {
                    System.out.println("Введите число от 0 до 10");
                    chel = scanner.nextInt();

                    if (chel == comp) {
                        System.out.println("Вы угадали число. Поздравляю!");
                        System.out.println("============================================");
                        //break;
                    }
                    if (chel > comp)
                        System.out.println("Ваше число больше загаданного");
                    if (chel < comp)
                        System.out.println("Ваше число меньше загаданного");

                }
                if (chel != comp) System.out.println("Не угадали(");
                //break;
                //System.out.println("Повторить?");
            } else System.out.println("Как хотите...");

            System.out.println("=================================================");
            //return;
        }

    }
}
