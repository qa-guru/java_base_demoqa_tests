package tests.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodExample {
    @Test
    void sumTest() {
        int a = 3;
        int b = 5;
        int expectedSum = 8;
        int actualSum = sum(a, b);

        assertEquals(expectedSum, actualSum);
    }

//    void sum(int first, int second) {
//        int sum = first + second;
//    }

    int sum(int first, int second) {
        int sum = first + second;

        return sum;
    }
}
