package homework;

/*
Task 2. Print out all natural numbers less than 200 and multiples of 13.
*/

public class MultiplesNumbers {
    public static void main(String[] args) {
        System.out.println("Natural numbers less than 200 and multiples of 13:");
        int i = 1;

        while (i <= 200) {
            if (i % 13 == 0) {
                System.out.print( i + " | ");
            }
            i++;
        }
    }
}
