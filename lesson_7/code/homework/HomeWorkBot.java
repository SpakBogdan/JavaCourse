package homework;

/*
Написать бот, который задает не менее 3-х вопросов (последовательно),
принимает ответы от пользователя и реагирует на эти ответы по-разному,
в зависимости от полученного ответа.

Пример: Как вас зовут? Очень приятно, меня зовут Бот1. Какой у вас вес?
106 кг. А какой рост? 187 А какой возраст? 60 Для вашего возраста и роста
такой вес избыточен, я вам рекомендую похудеть на 5-10 кг
*/

import java.util.Scanner;

public class HomeWorkBot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I'm a bot1, I need information about you. "); // introduction

        // first question
        System.out.print("What is your name? "); // первый вопрос
        String name = scanner.nextLine();
        if (name.length() > 5) {
            System.out.println("A very difficult name! Nice to meet you " + name + "! (\u2713)");
        } else {
            System.out.println("A very simple name! Nice to meet you " + name + ".");
        }

        // second question
        System.out.println("What is your height in CM? ");
        int height = scanner.nextInt();
        if (height >= 140 && height <= 185) {
            System.out.println("Your height is average (\u2713)");
        } else if (height > 185 && height <= 210) {
            System.out.println("Your height is above average");
        } else {
            System.out.println("Input Error, please enter correct information");
            return; // Re-run the program to try again.
        }

        // third question
        System.out.println("What is your weight in KG? ");
        int weight = scanner.nextInt();
        if (weight >= 50 && weight <= 90) {
            System.out.println("Your weight is average (\u2713)");
        } else {
            System.out.println("Your weight is above or below average");
        }

        // fourth question
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if (age >= 18 && weight > 90 && height >= 150 && height <= 185) {
            System.out.println("For your age, height, and weight, it's recommended to lose 5-10 kg");
        }

        if (age >= 15 && age <= 100 && weight >= 50 && weight <= 90 && height >= 150 && height <= 185) {
            System.out.println("Thank you for the information! (\u2713)");
        }
    } // enf of method
} // end of class