package skl_oop_b3_odd;
/*
 * AIM:  Write a program to perform division of two numbers accepted from user.
 *  Handle the  IOException, NumberFormatException and also handle the divide by
 *   exception using multiple nested try catch block . 
 * NAME: LUCKY SHARMA
 * UIN: 231P061 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisionCalculatorusingnested {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double num1 = 0, num2 = 0;
        System.out.print("LUCKY SHARMA / 42 \n ");

        try {
            System.out.print("Enter the first number: ");
            String input1 = reader.readLine();
            num1 = Double.parseDouble(input1);

            System.out.print("Enter the second number: ");
            String input2 = reader.readLine();
            num2 = Double.parseDouble(input2);

            // Nested try-catch for division
            try {
                double result = num1 / num2;
                System.out.println("The result of division is: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}


