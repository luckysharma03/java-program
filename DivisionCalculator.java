package skl_oop_b3_odd;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class DivisionCalculator {
	    public static void main(String[] args) {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        double num1 = 0, num2 = 0;
	        System.out.print("LUCKY SHARMA / 42 \n");
	        try {
	            System.out.print("Enter the first number: ");
	            String input1 = reader.readLine();
	            num1 = Double.parseDouble(input1);

	            System.out.print("Enter the second number: ");
	            String input2 = reader.readLine();
	            num2 = Double.parseDouble(input2);
	        } catch (IOException e) {
	            System.out.println("Error reading input: " + e.getMessage());
	            return;
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid number format: " + e.getMessage());
	            return;
	        }

	        try {
	            double result = num1 / num2;
	            System.out.println("The result of division is: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        }
	    }
	}


