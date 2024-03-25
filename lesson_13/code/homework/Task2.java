package homework;

public class Task2 {
    public static void main(String[] args) {
        // Создаем массив из 30 пельменей
        int[] pelmeni = new int[30];

        // Генерируем случайный индекс для счастливого пельменя
        int luckyPelmenIndex = (int) (Math.random() * 30);

        // Вставляем монету в счастливый пельмень
        pelmeni[luckyPelmenIndex] += 15;

        // Поиск счастливого пельменя
        for (int i = 0; i < pelmeni.length; i++) {
            if (pelmeni[i] == 15) {
                System.out.println("Счастливый пельмень на позиции: " + i + 1);
                break; // Найден счастливый пельмень, выходим из цикла
            }
        }
    }
}

