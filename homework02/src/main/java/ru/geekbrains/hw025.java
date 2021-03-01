package ru.geekbrains;

public class hw025 {

    public static void main(String[] args) {
        int min =0;
        int[] arr5 ={3,8,6,7,2,5,87,54,92};
        for (int i = 0;i<arr5.length;i++){
            min = arr5[0];

            if (min>arr5[i]){
                min = arr5[i];
            }
system.out.println("минимальное значение" + min)
        }




    }
}
