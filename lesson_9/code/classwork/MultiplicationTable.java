package classwork;

/*
Распечатать в консоли таблицу умножения от 1 до 10.
*/

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("MultiplicationTable");

        int n = 1; // firs multiplier
        int m = 1; // second multiplier

        while (n <10) {
            while (m <=10){

                System.out.print(n + " * " + m + " = " + n*m + " | ");
                m++;
            }
            System.out.println(); // next line
            m = 1;
            n++;
        }
    }
}
