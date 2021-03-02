//package ru.geekbrains;
//
//public class hw0231 {
//
//
//    public static void main(String[] args) {
//
//        if (checkBalans() == true){
//            System.out.println("есть такое место");
//        } else {
//            System.out.println("нет такого места");
//        }
//
//
//    }
//
//
//
//
//    static boolean checkBalans() {
//        boolean check;
//        int sum;
//        int sum1;
//        int[] arr1 = {1, 8, 6, 9, 9, 1};
//        for (int i = 0; i < arr1.length; i++) {
//
//            sum = 0;
//            sum = arr1[i] + sum;
//            sum1 = 0;
//            for (int j = i + 1; j < arr1.length; j++) {
//
//                sum1 = arr1[j] + sum1;
//
//
//            }
//            if (sum == sum1) {check = true;
//                System.out.println("est");
//            }
//
//
//        }
//        if (check == true)
//
//        return true;
//        else {return false;
//        }
//    }
//}
