package ru.geekbrains;


import java.util.Arrays;

public class hw02 {


    public static void main(String[] args) {





        //region task1

        int[] arr01 = {0, 1, 1, 0, 0, 1, 0, 1, 0};

        System.out.println("размерность массива arr01 - " + arr01.length);
        for (int i = 0; i < arr01.length; i++) {
            if (arr01[i] == 0) {
                arr01[i] = 1;

            } else {
                arr01[i] = 0;
            }


            System.out.print(arr01[i]+" ");

        }
//endregion

//region task2



//endregion
    }
}
