package kalkulator;

public class CalculatorLogic {
    /**
     * Adds two numbers.
     *
     * @param {number} num1 - The first number.
     * @param {number} num2 - The second number.
     * @returns {number} The sum of the two numbers.
     */
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Subtracts two numbers.
     *
     * @param {number} num1 - The first number.
     * @param {number} num2 - The second number.
     * @returns {number} The difference between the two numbers.
     */
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two numbers.
     *
     * @param {number} num1 - The first number.
     * @param {number} num2 - The second number.
     * @returns {number} The product of the two numbers.
     */
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Divides two numbers.
     *
     * @param {number} num1 - The numerator.
     * @param {number} num2 - The denominator.
     * @returns {number} The quotient of the division.
     */
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Nie mozna dzielic przez zero!");
            return 0;
        }
    }
}

