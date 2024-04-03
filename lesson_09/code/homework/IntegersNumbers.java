package homework;

/*
Task 1. What is the value of the expression x-- + --x at x = 5? Test your guess with code.
*/

public class IntegersNumbers {
    public static void main(String[] args) {
        int x = 5;
        int result = x-- + --x;
        System.out.println("Result: " + result);
    } // end of method
} // end of class

