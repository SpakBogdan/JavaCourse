package homework;

public class Task4 {
    public static void main(String[] args) {
        int n = 10; // Максимальное значение n без переполнения для типа int
        long factorial = calculateFactorial(n);
        System.out.println("Факториал " + n + "! = " + factorial);
    }

    // Метод для вычисления факториала числа n
    public static long calculateFactorial(int n) {
        long factorial = 1; // Используем long для хранения результата, чтобы избежать переполнения
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
