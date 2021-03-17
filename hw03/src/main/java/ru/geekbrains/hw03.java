package ru.geekbrains;

import java.util.Random;
import java.util.Scanner;


public class hw03 {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int comp = rand.nextInt(10);
        System.out.println(comp);

        int chel = scanner.NextInt();

        if (chel == comp) {
            System.out.println("Вы угадали число. Поздравляю!");
        }
        if (chel > comp)
            System.out.println("Ваше число больше загаданного");
        if (chel < comp)
            System.out.println("Ваше число меньше загаданного");


    }

}
