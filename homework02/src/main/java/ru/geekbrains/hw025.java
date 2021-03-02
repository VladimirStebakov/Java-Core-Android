package ru.geekbrains;

public class hw025 {

    public static void main(String[] args) {
        int max = 0;
        int iMax = 0;
        int iMin = 0;
        int min = 0;
        int[] arr5 = {8, 2, 1, -9, 2, -25, 87, 54, 2};
        for (int i = 0; i < arr5.length; i++) {

            if (i == 0) {
                min = max = arr5[0];

            }
            if (max < arr5[i]) {
                max = arr5[i];
                iMax = i;

            }

            if (min > arr5[i]) {
                min = arr5[i];
                iMin = i;

            }

        }
        System.out.println("минимальное значение " + min + " его индекс " + iMin);
        System.out.println("максимальное значение " + max + " его индекс " + iMax);

    }
}
