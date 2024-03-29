package classwork;

/*
Задание 1. В программе задаются два целых числа.
Найдите минимальное из них с помощью тернарного оператора.
Дополните программу возможностью ввода чисел пользователем.
*/

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        int a = 0;
        int b = -35;

        Scanner scanner = new Scanner(System.in); // Включили сканер
        System.out.println("Input 1ist number: ");
        a = scanner.nextInt(); // получаем значение с клавиатуры
        System.out.println("Input 2ist number: ");
        b = scanner.nextInt(); // получаем значение с клавиатуры

        int min = (a < b) ? a : b; // это тернарный оператор

        System.out.println("Minimum: " + min);
    }
}