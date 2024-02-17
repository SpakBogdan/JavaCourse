package homework;

/*
Задать в программе три стороны треугольника. Проверить выполнимость неравенства треугольника -
 - любая из сторон должна быть меньше суммы двух других.
Сообщить результат - существует или нет треугольник с заданными сторонами.
*/

public class Triangle {
    public static void main(String[] args) {

        double a = 600; // сторона 1
        double b = 150; // сторона 2   В первом случае треуголник не существует
        double c = 250; // сторона 3

        double q = 329; // сторона 1
        double w = 490; // сторона 2   Во втором случае треугоник существует
        double e = 250; // сторона 3

        if (triangle(a, b, c)) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }

        if (triangle1(q, w, e)) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    } // end of method

    public static boolean triangle (double a, double b, double c){
        return (a < b + c && b < a + c && c < a + b);
    }

    public static boolean triangle1 (double q, double w, double e) {
        return (q < w + e && w < q + e && e < q + w);
    }
} // end of class