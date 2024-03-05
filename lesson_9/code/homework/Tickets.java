package homework;

// В ПРОЦЕССЕ..)
import java.util.Scanner;
import java.util.Scanner;

public class Tickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в кинотеатр!");
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        System.out.print("Вы студент? (да/нет): ");
        boolean isStudent = scanner.next().equalsIgnoreCase("да");

        System.out.print("Вы пенсионер? (да/нет): ");
        boolean isSenior = scanner.next().equalsIgnoreCase("да");

        System.out.print("Хотите место в VIP-зоне? (да/нет): ");
        boolean isVIP = scanner.next().equalsIgnoreCase("да");

        double ticketPrice = calculateTicketPrice(age, isStudent, isSenior, isVIP);
        System.out.println("Итоговая стоимость билета: " + ticketPrice + " рублей.");
    }

    public static double calculateTicketPrice(int age, boolean isStudent, boolean isSenior, boolean isVIP) {
        double standardPrice = 100.0;

        if (age < 18 || age >= 65 || isStudent || isSenior || isVIP)
            standardPrice *= 0.75;

        return standardPrice;
    }
}
