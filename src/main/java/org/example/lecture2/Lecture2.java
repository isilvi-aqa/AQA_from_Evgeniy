package org.example.lecture2;

public class Lecture2  {

    public static void main(String[] args) {
    //        Пример оператора IF
        int a = 10;
        if (a > 5) {
            System.out.println("a больше 5");
        }

    //    Пример оператора IF-ELSE
        int b = 10;
        if (b > 5) {
            System.out.println("b больше 5");
        }
        else {
            System.out.println("b меньше либо равно 5");
        }

    //    Пример оператора SWITCH
        int c = 5;
        switch (c) {
            case 1:
                System.out.println("c равно 1");
                break;
            case 2:
                System.out.println("c равно 2");
                break;
            default:
                System.out.println("с не равно 1 или 2");
                break;
        }

    //    Пример тернарного оператора
        int d = 10;
        String result = d > 5 ? "d больше 5" : "d меньше или равно 5";
            System.out.println(result);

            //    Пример цикла FOR
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

//        Пример цикла WHILE
        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;
        }

//        Пример цикла DO-WHILE
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 10);

//        Пример блочного оператора
        int x = 10;
        {
            // Область видимости блока
            int y = 20;
            System.out.println(x); //Выведет 10
            System.out.println(y); //Выведет 20
        }
        System.out.println(x); //Выведет 10
//        System.out.println(y); //Ошибка что переменная y не определена

    }



}
