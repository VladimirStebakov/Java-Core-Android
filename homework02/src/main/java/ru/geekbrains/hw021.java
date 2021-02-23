package ru.geekbrains;

public class hw021 {

    public static void main(String[] args) {

        int[] arr1 = new int[8];
        for (int i = 0; i < arr1.length; i=i+1) {
            if (i == 0) {
                arr1[i] = 0;

            } else {
                arr1[i] = arr1[i - 1] + 3;
            }

            System.out.println(arr1[i]);

        }


    }
}
