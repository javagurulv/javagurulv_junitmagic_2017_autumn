package lv.javaguru.junit.workshop.section0;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzBusinessLogicTest {

    private FizzBuzzBusinessLogic fb = new FizzBuzzBusinessLogic();

    @Test
    public void test1() {
        assertEquals(fb.calculate(9), "Fizz");
    }

    @Test
    public void test2() {
        assertEquals(fb.calculate(15), "FizzBuzz");
    }

    @Test
    public void test3() {
        assertEquals(fb.calculate(10), "Buzz");
    }

    @Test
    public void test4() {
        assertEquals(fb.calculate(11), "11");
    }

}