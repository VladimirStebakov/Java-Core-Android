package lesson2;

public class Sample01 {


    enum Seasons { Winter, Spring, Summer, Autumn };

    enum SeasonsV2 {
        Winter("Зима"), Spring("Весна"), Summer("Лето"),Autumn("Осень");

        private String description;

        SeasonsV2(String description){
            this.description = description;
        }

        public String getDescription() { return description; }
    }

    public static void task1(){
        System.out.println("Process task1 ...");
    }

    public static void task2(){
        System.out.println("Process task2 ...");
    }

    public static void main(String[] args) {

        int taskNumber = 4;

        switch (taskNumber){

            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            default:
                System.out.println("Не удалось определить блок подпрограммы.");
                break;
        }

        switch (taskNumber){

            case 1:
                task1();
                break;
            case 2:
            case 3:
            case 4:
                task2();
                break;
            default:
                System.out.println("Не удалось определить блок подпрограммы.");
                break;
        }

        Seasons seasons  = Seasons.Winter;

        switch (seasons){
            case Winter:
                System.out.println("Зима");
                break;
            case Summer:
                System.out.println("Лето");
                break;
            default:
                System.out.println("Другое время года.");
                break;
        }

        SeasonsV2 seasonsV2 = SeasonsV2.Spring;
        System.out.println("seasonsV2: " + seasonsV2.getDescription());

    }
}
