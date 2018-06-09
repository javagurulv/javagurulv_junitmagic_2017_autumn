package lv.javaguru.junit.workshop.section0.myFizBuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFizzBuzzImplTest {

    private MyFizzBuzz fizzBuzz = new MyFizzBuzzImpl();

    @Test
    public void shouldReturnFizzIfNumberIsDevidableBy3() {
        assertEquals(fizzBuzz.calculate(3), "Fizz");
        assertEquals(fizzBuzz.calculate(6), "Fizz");
        assertEquals(fizzBuzz.calculate(9), "Fizz");
    }

    @Test
    public void shouldReturnBuzzIfNumberIsDevidableBy5() {
        assertEquals(fizzBuzz.calculate(5), "Buzz");
        assertEquals(fizzBuzz.calculate(10), "Buzz");
        assertEquals(fizzBuzz.calculate(20), "Buzz");
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberIsDevidableBy15() {
        assertEquals(fizzBuzz.calculate(15), "FizzBuzz");
        assertEquals(fizzBuzz.calculate(30), "FizzBuzz");
        assertEquals(fizzBuzz.calculate(45), "FizzBuzz");
    }

    @Test
    public void shouldReturnNumberIfNumberIsNotDevidableBy3And5() {
        assertEquals(fizzBuzz.calculate(1), "1");
        assertEquals(fizzBuzz.calculate(2), "2");
        assertEquals(fizzBuzz.calculate(7), "7");
    }

}