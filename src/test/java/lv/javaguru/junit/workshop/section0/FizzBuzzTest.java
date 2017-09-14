package lv.javaguru.junit.workshop.section0;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    private boolean isDevidedBy(int number, int devider) {
        return (number % devider) == 0;
    }

    @Test
    public void test1() {
        for (int i = 1; i < 100; i++) {
            if (isDevidedBy(i, 3)
                    && !isDevidedBy(i, 5)) {
                String result = fizzBuzz.getResult(i);
                assertEquals(result, "Fizz");
            }
        }
    }

    @Test
    public void test2() {
        for (int i = 1; i < 100; i++) {
            if (!isDevidedBy(i, 3)
                    && isDevidedBy(i, 5)) {
                String result = fizzBuzz.getResult(i);
                assertEquals(result, "Buzz");
            }
        }
    }

    @Test
    public void test3() {
        for (int i = 1; i < 100; i++) {
            if (isDevidedBy(i, 3)
                    && isDevidedBy(i, 5)) {
                String result = fizzBuzz.getResult(i);
                assertEquals(result, "FizzBuzz");
            }
        }
    }

    @Test
    public void test4() {
        for (int i = 1; i < 100; i++) {
            if (!isDevidedBy(i, 3)
                    && !isDevidedBy(i, 5)) {
                String result = fizzBuzz.getResult(i);
                assertEquals(result, "" + i);
            }
        }
    }

}