package ru.geekbrains.lesson1;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import jdk.nashorn.internal.parser.JSONParser;

public class MainApp {
    public static void main(String[] args) {
        //#2 задание - переменные всех пройденных данных
        int a = 10;
        float b = 10.1f;
        boolean c = true;
        String s = "string";

        //#3 задание
        System.out.println(Calculation(1,2,4,2));

        //#4 задание
        System.out.println(isZeroToTen(13,5));

        //#5 задание
        isPositive(-5);

        //#6 задание
        System.out.println(isNegative(-10));

        //#7 задание
        printHelloName("Михаил");

        //№8 задание
        isLeapYear(2020);
        isLeapYear(2021);
        isLeapYear(1900);
        isLeapYear(2000);
    }

    public static int Calculation (int a, int b, int c, int d) {
        /*
        Метод вычисляет выражение a * (b + (c / d)) и возвращающет результат,
        где a, b, c, d – входные параметры этого метода;
         */
        return a * (b + (c / d));
    }

    public static boolean isZeroToTen (int a, int b) {
        /*
        Метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20
        (включительно), если да – вернуть true, в противном случае – false;
         */
        return a + b >= 10 && a + b <= 20;
    }

    public static void isPositive (int a){
        /*
        Метод, которому в качестве параметра передается целое число, метод печатает в консоль
        положительное ли число передали, или отрицательное;
        Замечание: ноль считаем положительным числом.
         */
        if (a >= 0) System.out.println(a+" - положительное.");
        else System.out.println(a+" - оттрицательное.");
    }

    public static boolean isNegative (int a) {
        /*
        Метод, которому в качестве параметра передается целое число,
        метод должен вернуть true, если число отрицательное;
         */
        return a < 0;
    }

    public static void isLeapYear (int year) {
        /*
        метод, который определяет является ли год високосным, и выводит сообщение в консоль.
        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        1900 - не високосный; 2000 - високосный.
         */
        boolean isLeap = false;

        if (year % 4 == 0) isLeap = true;
        if (year % 100 == 0) isLeap = false;
        if (year % 400 == 0) isLeap = true;

        if (isLeap) System.out.println(year+" високосный");
        else System.out.println(year+" не високосный");
    }

    public static void printHelloName (String name) {
        /*
        Метод, которому в качестве параметра передается строка, обозначающая имя,
        метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
         */
        System.out.println("Привет, "+name+"!");
    }
}