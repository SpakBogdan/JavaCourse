package homework;
import java.util.Scanner;

public class Bot2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I'm a bot1, I need information about you. "); // introduction

        // first question
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        if (name.length() > 5) {
            System.out.println("A very difficult name! Nice to meet you " + name + "!");
        } else {
            System.out.println("A very simple name! Nice to meet you " + name + "!");
        }

        // second question
        System.out.println("What is your height in cm? ");
        int height = scanner.nextInt();
        if (height < 0 || height > 250) {
            System.out.println("Invalid height! Please enter a valid height in the range of 0 to 250 cm.");
            return;
        }

        // third question
        System.out.println("What is your weight in kg? ");
        int weight = scanner.nextInt();
        if (weight < 0 || weight > 150) {
            System.out.println("Invalid weight! Please enter a valid weight in the range of 0 to 150 kg.");
            return;
        }

        double heightInMeters = height / 100.0; // Convert height to meters
        double bodyMassIndex = weight / (heightInMeters * heightInMeters); // Calculate bodyMassIndex

        // Print bodyMassIndex
        System.out.printf("Your bodyMassIndex is %.2f", bodyMassIndex);

        // Determine the recommendation based on BMI
        if (bodyMassIndex < 18.5) {
            System.out.println("You are underweight. It is recommended to gain weight.");
        } else if (bodyMassIndex >= 18.5 && bodyMassIndex < 25) {
            System.out.println("Your weight is normal. Keep up the good work!");
        } else if (bodyMassIndex >= 25 && bodyMassIndex < 30) {
            System.out.println("You are overweight. It is recommended to lose weight.");
        } else {
            System.out.println("You are obese. It is highly recommended to lose weight for health reasons.");
        }

        // Additional recommendations based on overweight status
        if (bodyMassIndex >= 25) {
            double idealWeight = 22 * heightInMeters * heightInMeters; // Calculate ideal weight based on bodyMassIndex 22
            double weightDifference = weight - idealWeight;
            System.out.printf("For your height, it's recommended to aim for an ideal weight of %.2f kg.", idealWeight);
            System.out.printf("You need to lose approximately %.2f kg to reach your ideal weight.", Math.abs(weightDifference));
        }

        // fourth question
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        // Display thank you message
        System.out.println("Thank you for the information!");
    }
}

