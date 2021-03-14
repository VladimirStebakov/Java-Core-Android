package ru.geekbrains;

public class hw026 {

    public static void main(String[] args) {

        long n = 8654178545L;

        int i;
        int j;

        int[] arr7 = {1, 2, 3, 4, 5, 6, 7, 8};

        long shift = (arr7.length + (n % arr7.length)) % arr7.length;

        int buf;

        for (j = 0; j < (shift); j++) {
            buf = arr7[0];
            for (i = 0; i < arr7.length - 1; i++) {


                arr7[i] = arr7[i + 1];


                // System.out.print(arr7[i]);
            }
            arr7[arr7.length - 1] = buf;


            // System.out.println(buf);
        }
        System.out.println();
        for (int k : arr7) {

            System.out.print(k);
        }
        System.out.println();
        System.out.println("Реальное смещение " + "(" + shift + ")");

    }
}
