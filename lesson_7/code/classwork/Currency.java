package classwork;

/*Написать программу для конвертации евро в три валюты - доллар, фунт стерлингов и швейцарский франк.
Для каждой валюты реализуйте свой метод конвертации.
Не допускайте ввода некорректных (отрицательных) значений обмениваемой валюты*/

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which currency do you have? (USD, CHF, GBP)");
        String currency = scanner.nextLine();
        System.out.println("How math currency do you have? ");
        double summa = scanner.nextDouble();

        double result = 0;
        double rateUsd = 1.08;
        double rateChf = 0.95;
        double rateGbr = 1.17;

        switch (currency){
            case "USD" -> result = exchange(summa, rateUsd);
            case "CHF" -> result = exchange(summa, rateChf);
            case "GBP" -> result = exchange(summa, rateGbr);
            default -> System.out.println("Wrong input.");
        }

        System.out.println("Pls, take your money in euro: " + result);
    }

    public static double exchange(double summa, double rate) {
    return summa / rate;
    }
}

/*
    **Шаг 1.**
Что дано?
Выписать все, что дано в задаче, продумать типы и имена необходимых переменных.
* тры валюты
* double
* имена для валют euro, frank, dollar, pound
* обменный курс - rate
* euro - dollar: 1.08
* euro - pound: 1.17
* euro - frank: 0.95
* как меняем? - мы имеем евро, нам приносят валюту

    **Шаг 2**
Что нужно сделать?
Выписать все, что нужно найти или сделать в рамках задачи.
Продумать типы и имена необходимых переменных, продумать возможные необходимые методы.

* Метод - конвертор: получает на вход double вол-во валют, метод должен рассчитать количество евро которое нам надо отдать за эту валюту
* кол-во евро = кол-во валюты + курс = rate.

     **Шаг 3.**
Как это уже решали?
Найти фрагменты похожего кода, решения похожих задач от которых можно оттолкнуться и решить "по аналогии" свою задачу.

* converter, switch case в программе calculator

     **Шаг 4.**
Какой самый важный, сложный момент в задаче?
Продумать, написать по шагам ключевой алгоритм, который позволяет решить поставленную задачу.
* Сделать расчет сколько денег отдать.

     **Шаг 5.**
Как будет работать программа?
Продумать интерфейс взаимодействия с пользователем.
* консоль, Scanner, вывод в консоль, запрос - ответ.
*/
