package classwork;

/*Имеются оценки абитуриента из его аттестата, всего 20 оценок.
Найдите средний балл абитуриента.*/

public class AverageMark {
    public static void main(String[] args) {

        int[] mark = {1, 2, 1, 2, 3, 2, 1, 3, 4, 1, 2, 3, 1, 2, 3, 4, 5, 2, 1, 1};
        System.out.println(mark.length);

        int sumOfMarks = 0;

        for (int i = 0; i < mark.length; i++) {
            sumOfMarks += mark[i];
        }

        double averageMark = (double)sumOfMarks / mark.length;

        System.out.println("Average mark: " + averageMark);

        System.out.printf("Average mark: %.2f", averageMark);

    }
}
