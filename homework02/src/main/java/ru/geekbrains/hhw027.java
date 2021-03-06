package ru.geekbrains;

public class hhw027 {
    public static void main(String[] args) {

        int n = 3;
        int[] arr7 = {1, 2, 3, 4, 5, 6, 7};
//        int shift = (n / arr7.length) % 0;
        if (n > 0) {
            for (int i = 0; i < arr7.length; i++) {
                if (i == 0) {
                   // arr7[arr7.length - 1] = arr7[0];
                    arr7[i] = arr7[i+1];

                }System.out.print(arr7[i]);

            }
        }


    }

}
