package ru.geekbrains;

public class hw026 {

    public static void main(String[] args) {

        int i;
        int j;

        int[] arr7 = {1, 2, 3, 4, 5, 6, 7, 8};

        int shift = 3;

        int buf;
        buf = arr7[0];
        for (j = 0; j < (shift + 1); j++) {
            for (i = 0; i < arr7.length - 1; i++) {


                arr7[i] = arr7[i + 1];


                System.out.print(arr7[i]);
            }
        }
        arr7[arr7.length - 1] = buf;

        System.out.println(buf);


    }
}
