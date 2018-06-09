package lv.javaguru.junit.workshop.section0.myFizBuzz;

public class MyFizzBuzzImpl implements MyFizzBuzz {

    @Override
    public String calculate(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }

        return "" + number;
    }

}
