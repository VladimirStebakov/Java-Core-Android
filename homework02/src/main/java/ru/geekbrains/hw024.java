package ru.geekbrains;

public class hw024 {
    public static void main(String[] args) {

        int[][] arr5 = new int[5][5];
        int i, j;


        for (i = 0; i < arr5.length; i++) {


            for (j = 0; j < arr5.length; j++) {
                if (i == j) {
                    arr5[i][j] = 1;
                    System.out.print(arr5[i][j] + "  ");

                } else {
                    arr5[i][j] = 0;
                    arr5[arr5.length - 1 - j][j] = 1;
                    System.out.print(arr5[i][j] + "  ");
                }
            }

            System.out.println();

        }


    }
}
