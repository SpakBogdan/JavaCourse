package classwork;

/*Создайте массив и заполните его символами латинского алфавита от A до Z.
Разпечатайте полученный массив.*/

public class ArrayAlphabet {
    public static void main(String[] args) {

        // заполним массив целыми числами от 1 до 20

    char[] alphabet = new char[26]; // определили массив
        for (int i = 0; i <alphabet.length; i++) {
            alphabet[i] = (char) (65 + i);
            System.out.print(alphabet[i] + " | ");
        }

        System.out.println(alphabet);
    }
}
