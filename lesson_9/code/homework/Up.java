package homework;

import java.util.Scanner;
public class Up {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int currentHour;

            System.out.print("Введите текущее время (от 0 до 23): ");
            currentHour = scanner.nextInt();

            while (currentHour < 0 || currentHour > 23) {
                System.out.println("Неверный ввод. Пожалуйста, введите число от 0 до 23.");
                System.out.print("Введите текущее время (от 0 до 23): ");
                currentHour = scanner.nextInt();
            }

            String timeOfDay;
            if (currentHour >= 6 && currentHour < 12) {
                timeOfDay = "утром";
            } else if (currentHour >= 12 && currentHour < 18) {
                timeOfDay = "днем";
            } else if (currentHour >= 18 && currentHour < 24) {
                timeOfDay = "вечером";
            } else {
                timeOfDay = "ночью";
            }

            String clockSymbol = switch (currentHour % 12) {
                case 0 -> "🕛";
                case 1 -> "🕐";
                case 2 -> "🕑";
                case 3 -> "🕒";
                case 4 -> "🕓";
                case 5 -> "🕔";
                case 6 -> "🕕";
                case 7 -> "🕖";
                case 8 -> "🕗";
                case 9 -> "🕘";
                case 10 -> "🕙";
                case 11 -> "🕚";
                default -> "";
            };

            System.out.println("Сейчас " + clockSymbol + " " + timeOfDay + "!");
        }
    }
    
