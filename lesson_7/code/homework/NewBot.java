package homework;

import java.util.Scanner;

public class NewBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет! Я бот.");
        System.out.print("Как вас зовут? ");
        String name = scanner.nextLine();
        System.out.println("Приятно познакомиться, " + name + "!");

        System.out.print("Сколько у вас килограммов веса? ");
        try {
            double weight = Double.parseDouble(scanner.nextLine());
            if (weight > 100) {
                System.out.println("Ваш вес выше среднего. Важно следить за своим здоровьем.");
            } else {
                System.out.println("Ваш вес в пределах нормы.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Пожалуйста, введите число.");
        }
        System.out.print("Какой у вас рост в сантиметрах? ");
        try {
            double height = Double.parseDouble(scanner.nextLine());
            if (height > 180) {
                System.out.println("Вы достаточно высокий.");
            } else {
                System.out.println("Ваш рост ниже среднего.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Пожалуйста, введите число.");
        }

        System.out.println("Спасибо за ответы! Всего доброго!");
    }
}
