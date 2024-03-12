package homework;

public class AverageOfArray {
    public static void main(String[] args) {
        int [] array = {5, 2, 6, 8, 20, 16, 55, 100, 450};

        double result = averageOfArray(array);

        System.out.println("Arithmetical mean: " + result);
    }
    public static double averageOfArray(int [] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return (double) total / arr.length;
    }
}
