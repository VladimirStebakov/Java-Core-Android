package ru.geekbrains;

public class hw023 {

    public static boolean eoN (boolean eoN){
        if (eoN =true) {
            System.out.println("есть такое место");
            } else {
            System.out.println("нет такого места")
                    }
    }



    public static void main(String[] args) {

        int sum = 0;


        int sum1 = 0;



        int[] arr3 = {2, 2, 2, 1, 2, 2, 10, 1};
        for (int i = 0; i < arr3.length; i++) {
            sum = arr3[i] + sum;
            sum1 =0;
            for (int j = i + 1; j < arr3.length; j++) {

                sum1 = arr3[j] + sum1;

            }
            if (sum == sum1) {eoN(true)


            } else {
                ;
            }


        }


    }
}