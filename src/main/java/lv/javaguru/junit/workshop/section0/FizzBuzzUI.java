package lv.javaguru.junit.workshop.section0;

import java.util.Scanner;

public class FizzBuzzUI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        FizzBuzzBusinessLogic businessLogic = new FizzBuzzBusinessLogic();
        String result = businessLogic.calculate(number);

        System.out.println("Result: " + result);
    }

}
