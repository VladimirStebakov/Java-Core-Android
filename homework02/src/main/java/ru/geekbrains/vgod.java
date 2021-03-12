package ru.geekbrains;
//import scanner.;

public class vgod {

    public static void main(String[] args) {

        int year = 2014;
        if ((year % 4 ==0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year +" год високосный");
        } else {
            System.out.println(year + " год НЕвисокосный");
        }

    }
}
