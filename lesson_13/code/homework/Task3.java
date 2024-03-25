package homework;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя значение n
        System.out.print("Введите значение n: ");
        int n = scanner.nextInt();

        // Инициализируем переменную для хранения суммы
        double sum = 0;

        // Вычисляем сумму чисел от 1 до 1/n
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i; // Добавляем к сумме 1/i
        }

        // Выводим результат
        System.out.println("Сумма чисел от 1 до 1/" + n + " = " + sum);

        // Закрываем сканнер
        scanner.close();
    }
}
