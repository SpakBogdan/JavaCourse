package classwork24.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {


    // Student student = new Student();

    Student student; // создаем объект из тестируемого класса



    @BeforeEach
    void setUp() {
        student = new Student();
    }

    @Test
    void avrScore() {
        int[] marks = {1, 2, 1, 3, 2, 1, 6, 5, 4, 2};
         assertEquals(2.7, student.avrScore(marks));

    }
}