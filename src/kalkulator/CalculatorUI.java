package kalkulator;

import java.util.Scanner;

public class CalculatorUI {

    /**
     * The main method is the entry point of the program.
     * It prompts the user for input, performs the selected operation,
     * and displays the result.
     */
    public static void main(String[] args) {
        //
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w kalkulatorze!");

        // Prompt the user to enter the first number
        System.out.print("Podaj pierwsza liczbe: ");
        double number1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Podaj druga liczbe: ");
        double number2 = scanner.nextDouble();

        // Display the available operations
        System.out.println("Wybierz operacje: ");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnozenie");
        System.out.println("4. Dzielenie");

        // Prompt the user to choose an operation
        System.out.print("Wybierz opcje: ");
        int choice = scanner.nextInt();

        // Create a CalculatorLogic object to perform calculations
        CalculatorLogic calculator = new CalculatorLogic();

        double result = 0;
        switch (choice) {
            case 1:
                result = calculator.add(number1, number2);
                break;
            case 2:
                result = calculator.subtract(number1, number2);
                break;
            case 3:
                result = calculator.multiply(number1, number2);
                break;
            case 4:
                result = calculator.divide(number1, number2);
                break;
            default:
                System.out.println("Nieprawidlowa opcja");
                return;
        }

        // Display the result
        System.out.println("Wynik: " + result);
    }
}