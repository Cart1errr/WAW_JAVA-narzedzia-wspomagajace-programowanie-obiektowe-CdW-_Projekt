package kalkulator_test;

import kalkulator.CalculatorLogic;
/**
 * The CalculatorUITest class provides test cases for the CalculatorLogic class.
 */
public class CalculatorUITest {
    /**
     * The main method is the entry point of the test program.
     */
    public static void main(String[] args) {
        CalculatorLogic calculator = new CalculatorLogic();

        double resultAdd = calculator.add(5, 3);
        System.out.println("Wynik dodawania: " + resultAdd);

        double resultSubtract = calculator.subtract(8, 4);
        System.out.println("Wynik odejmowania: " + resultSubtract);

        double resultMultiply = calculator.multiply(6, 2);
        System.out.println("Wynik mnozenia: " + resultMultiply);

        double resultDivide = calculator.divide(10, 2);
        System.out.println("Wynik dzielenia: " + resultDivide);
    }
}
