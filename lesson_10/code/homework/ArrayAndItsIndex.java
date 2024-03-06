package homework;

/*
Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38. Найдите максимальный элемент массива и его индекс.
*/


// int n = (int)(Math.random() * (b - a + 1) + a) - генерирует случайное целое число в интервале [a, b] a - может быть, b - может быть


public class ArrayAndItsIndex {
    public static void main(String[] args) {


        int[] array = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38}; //  массив целых чисел


        int maxElement = array[0]; // максимальный элемент массива
        int maxIndex = 0; // индекс

                    // вычисление
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxIndex = i;
            }
        }

        System.out.println("Максимальный элемент массива: " + maxElement);
        System.out.println("Индекс максимального элемента: " + maxIndex);
    } // end of method

} // end of class