package lv.javaguru.junit.workshop.section0;

public class FizzBuzz {

    public String getResult(int number) {
        if (isDevidedBy(number, 3)
                && isDevidedBy(number, 5)) {
            return "FizzBuzz";
        }
        if (isDevidedBy(number, 3)) {
            return "Fizz";
        }
        if (isDevidedBy(number, 5)) {
            return "Buzz";
        }
        return "" + number;
    }

    private boolean isDevidedBy(int number, int devider) {
        return (number % devider) == 0;
    }

}
