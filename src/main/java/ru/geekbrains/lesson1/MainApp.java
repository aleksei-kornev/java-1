package ru.geekbrains.lesson1;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import jdk.nashorn.internal.parser.JSONParser;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("Задание №1");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println();

        System.out.println("Задание №2");
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
            System.out.print(arr2[i]);
        }
        System.out.println();
        System.out.println();

        System.out.println("Задание №3");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
            System.out.print(arr3[i]);
        }
        System.out.println();
        System.out.println();

        System.out.println("Задание №4");
        int[][] arr4 = new int[10][10];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
            arr4[i][arr4.length - i - 1] = 1;
        }

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Задание №5");
        int[] arr5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int iMax = 0;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > arr5[iMax]) iMax = i;
        }
        System.out.println("Максимальный элемент - " + arr5[iMax]);
        System.out.println();

        System.out.println("Задание №6");
        System.out.println(checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println();

        System.out.println("Задание №7");
        int[] oldArr = {2, 3, 2, 1, 2, 2, 9, 1};
        int n = 2;

        int[] leftArr = slideArray(oldArr.clone(), -n);
        int[] rightArr = slideArray(oldArr.clone(), n);
        System.out.print("Исходный массив: ");
        for (int i=0;i<oldArr.length;i++){
            System.out.print(oldArr[i]);
        }
        System.out.println();
        System.out.print("Сдвинули влево на "+n+": ");
        for (int i=0;i<leftArr.length;i++){
            System.out.print(leftArr[i]);
        }
        System.out.println();
        System.out.print("Сдвинули вправо на "+n+": ");
        for (int i=0;i<rightArr.length;i++){
            System.out.print(rightArr[i]);
        }
        System.out.println();
    }

    public static boolean checkBalance(int[] arr) {
        for (int i=1; i < arr.length; i++){
            int leftSum =0;
            int rightSum = 0;
            for (int j=0; j<i;j++){
                //считаем сумму слева
                leftSum += arr[j];
            }
            for (int j=i;j<arr.length;j++){
                //считаем сумму справа
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    public static int[] slideArray(int[] arr, int n) {
        //Проверяем, не превышает ли смещение размер массива и не задано ли смещение как 0
        if (Math.abs(n)>arr.length || n==0) return arr;

        //смещаем вправо
        if (n>0){
            for (int i=arr.length-1; i>n; i--){
                arr[i] = arr[i-n];
            }
            for (int i=0; i<n; i++){
                arr[i]=0;
            }
            return arr;
        }

        //смещаем влево
        if (n<0){

            for (int i=0; i<arr.length+n; i++){
                arr[i] = arr[i-n];
            }
            for (int i=arr.length+n; i<arr.length; i++){
                arr[i]=0;
            }
            return arr;
        }
    return arr;
    }

}