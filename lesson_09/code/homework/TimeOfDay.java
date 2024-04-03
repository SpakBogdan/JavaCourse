package homework;

/*Task 3. Determining the time of day. Write a program that takes the current hour
 (0 to 23) and displays a greeting depending on the time of day (morning, afternoon, evening, night).
 */

import java.util.Scanner;

public class TimeOfDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int currentHour;

         System.out.print("Please enter a number between 0 and 23 \uD83D\uDD50:");
         currentHour = scanner.nextInt();

         while (currentHour < 0 || currentHour > 23) {
             System.out.println("Wrong input \uD83D\uDFE5 Please enter a number between 0 and 23.");
             currentHour = scanner.nextInt();
            }

         if (currentHour >= 6 && currentHour < 12) {
             System.out.println("Have a wonderful and energetic morning!\uD83C\uDF05 ");
         } else if (currentHour >= 12 && currentHour < 18) {
             System.out.println("Have a great and productive day!\uD83C\uDF1E ");
         } else if (currentHour >= 18 && currentHour < 24) {
             System.out.println("Have a calm and cozy evening!\uD83C\uDF03 ");
         } else if (currentHour >= 0 && currentHour < 6) {
             System.out.println("Night is the perfect time to relax and recuperate!\uD83C\uDF19 ");
         }
     }
}
