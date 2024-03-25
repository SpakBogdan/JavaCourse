package homework;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        // Создаем массив и заполняем его числами от 1 до 100
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // Генерируем случайное число и место для вставки
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int randomIndex = random.nextInt(array.length + 1);

        // Вставляем случайное число в массив
        int[] newArray = new int[array.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++, j++) {
            if (i == randomIndex) {
                newArray[i] = randomNumber;
                j--;
            } else {
                newArray[i] = array[j];
            }
        }
        // Выводим добавленное число
        System.out.println("Добавленное число: " + randomNumber);
    }
}

