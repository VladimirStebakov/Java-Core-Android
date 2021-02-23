package ru.gikbrains.homework01;

public class dz01 {

    // region task1,2
    public static void main(String[] args) {

        byte a;
        a=5;


        short b;
        b=100;


        int c=987654;
        System.out.println(b+c+1);

        long d= 999888777L;

        float e;
        e=123456f;

        double f=555444888d;

        char g=605;

        boolean h;
        h=true;

        float a3 = 2.52f;
        float b3 = 5.02f;
        float c3 = 3.65847f;
        float d3 = 8.45f;
        task3 (a3, b3, c3, d3);

        int a4 = 12;
        int b4 = 8;
        int c4 = (a4+b4);
        checkSum (a4, b4, c4);
        System.out.println(c4);

        int a5 = 7;
        otricatelnoeIliPolozhitelnoe (a5);


        System.out.println("Привет, Станислав");


    }
//endregion

    //region task3
    public static float task3 (float a3, float b3, float c3, float d3){



        float p3 = a3 * (b3 + (c3 / d3));
        System.out.println("result: " + p3);
return p3;

    }



    //endregion

    //region task4
    public static boolean checkSum(int a4, int b4,int c){


        int c4 =a4+b4;
        if (c4>=10 && c4 <=20)
        return true;
        else
            return false;

    }


    //endregion

    //region task5


    public static void otricatelnoeIliPolozhitelnoe (int a5){



        if (a5 >=0){
            System.out.println("а5 число положительное");
        }
        else System.out.println("a5 число отрицательное");
    }



    //endregion

    //region task6
    public static boolean checkNum (int a6) {

        a6 = 12;


        if (a6 < 0)
            return true;
        else
            return false;
    }


    //endregion

    //region task7

    public static void privetstvie (String stanislav){



    }


    //endregion


}
