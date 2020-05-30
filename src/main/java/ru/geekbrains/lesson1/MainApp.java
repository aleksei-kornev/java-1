package ru.geekbrains.lesson1;

import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        //Задание №1
        guessNumberGame();
    }

    public static void guessNumberGame() {
        Random rand = new Random();

        int attempt = 0;            //кол-во использованных попыток пользователя
        int maxAttempt = 3;         //максимально позволенное кол-во попыток
        int userAnswer;        //ответ пользователя
        boolean playAgain = true;   //пока true - играем еще

        Scanner sc = new Scanner(System.in);
        do {
            int number = rand.nextInt(10);
            System.out.println("Компьютер загадал число от 0 до 9. Попробуйте угадать.");
            do {
                System.out.printf("У вас %d попыток.", maxAttempt - attempt);
                System.out.println("Ваш вариант: ");
                userAnswer = sc.nextInt();
                if (userAnswer != number) {
                    System.out.println("Ответ не верный.");
                    if (userAnswer > number) {
                        System.out.println("Ваше число больше загаданного.");
                    } else {
                        System.out.println("Ваше число меньше загаданного.");
                    }
                    attempt += 1;
                }
            } while (userAnswer != number && attempt < maxAttempt);

            if (userAnswer == number) {
                System.out.println("Правильно!");
            } else {
                System.out.println("Попытки закончились, вы проиграли. Было загадано число " + number);
            }

            attempt = 0;
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int a = sc.nextInt();
            if (a != 1) {
                playAgain = false;
            }

        } while (playAgain);

        sc.close();
        System.out.println("Игра окончена.");

    }
}