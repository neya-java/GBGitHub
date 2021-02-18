/*1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3
попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,
чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
1 – да / 0 – нет»(1 – повторить, 0 – нет).*/

import java.util.Random;
import java.util.Scanner;

public class Lesson3Task1 {
    public static void main(String[] args) {
        startGame();
    }

    static void startGame() {
        Random rand = new Random();
        int x = rand.nextInt(10);
        System.out.println(x); //Для вывода промежуточного значения, которое рандомно задал java.
        // Что бы быстро выиграть )))
        System.out.println("Игра. Угадай число от 1 до 9.");
        System.out.println("Введите число от 1 до 9: ");
        int min = 0;
        int max = 9;

        for (int i = 1; i <= 3; i++) {
            int a = aNumberFrom1To9(min, max);
            if (a == x) {
                winGame(i);
                break;
            } else {
                theGameContinues(i, a, x);
            }
        }
        gameOver();
    }

    static int aNumberFrom1To9(int min, int max) {
        Scanner sc1 = new Scanner(System.in);
        while (true) {
            if (sc1.hasNextInt()) {
                int number = sc1.nextInt();
                //System.out.println(number); Для вывода промежуточного значения введенного с клавиатуры
                if (number < min || number > max) {
                    System.out.println("Введите число от 1 до 9: ");
                } else {
                    return number;
                }
            } else {
                exitTheGameError();
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет» (1 – повторить, 0 – нет): ");
                Scanner sc = new Scanner(System.in);
                int number = sc.nextInt();
                if (number == 1) {
                    startGame();
                }
                if (number == 0) {
                    exitTheGame();
                }
            }
        }
    }

    static void winGame(int i) {
        System.out.println("Вы выиграли!");
        System.out.println("Вам потребовалось " + i + " хода(ов). Поздравляем.");
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет» (1 – повторить, 0 – нет): ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 1) {
            startGame();
        }
        if (number == 0) {
            exitTheGame();
        }
        sc.close();
    }

    static void theGameContinues(int i, int a, int x) {
        if (a < x && i != 3) {
            System.out.println("Загаданное число больше введенного");
            System.out.println("Промах. Попробуйте еще раз. Введите число от 1 до 9: ");
        } else if (a > x && i != 3) {
            System.out.println("Загаданное число меньше введенного");
            System.out.println("Промах. Попробуйте еще раз. Введите число от 1 до 9: ");
        }
    }

    static void exitTheGame() {
        System.out.println("Спасибо за игру! Возвращайтесь к нам скорее.");
        System.exit(0);
    }

    static void exitTheGameError() {
        System.out.println("К сожалению вам не удалось поиграть. Вы ввели не число и закончили игру! Возвращайтесь к нам скорее.");
    }

    static void gameOver() {
        System.out.println("Вам не хватило 3-x попыток. Вы лузер!");
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет» (1 – повторить, 0 – нет): ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 1) {
            startGame();
        }
        if (number == 0) {
            exitTheGame();
        }
        sc.close();
    }
}

