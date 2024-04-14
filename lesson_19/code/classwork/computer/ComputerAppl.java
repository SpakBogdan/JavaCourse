package classwork.computer;

import java.util.Scanner;

public class ComputerAppl {
    public static void main(String[] args) {
        Computer computer1 = new Computer("i5", 16, 512, "hp");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cpu: ");
        String cpu = scanner.nextLine();

        System.out.println("Enter ram: ");
        int ram = scanner.nextInt();

        System.out.println("Enter ssd: ");
        int ssd = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        Computer computer2 = new Computer(cpu, ram, ssd, name);


        System.out.println("Comp 1: " + computer1);
        System.out.println("Comp 2: " + computer2);

        System.out.println("Comp1 == Comp2: " + computer1.equals(computer2)); // true or false

    }

}
