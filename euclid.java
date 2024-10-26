package skl_oop_b3_odd;
/*
* AIM: WAP to Write an object oriented program in java that uses Euclid’s algorithm to display Greatest
common divisor of two integer
* NAME: LUCKY SHARMA
* UIN:  231P061
*/


import java.util.Scanner;

public class euclid {
 int num1;
int num2;
int gcd;
public void acceptNumbers() {
 Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first number: ");
 num1 = scanner.nextInt();
 System.out.print("Enter the second number: ");

num2 = scanner.nextInt();

    }

public void calculateGCD() {
int temp;

 while (num2 != 0) {
 temp = num2;
 num2 = num1 % num2;
 num1 = temp;
 }
gcd = num1;
}
public void displayGCD() {

System.out.println("The GCD of the two numbers is: " + gcd);

    }
public static void main(String[] args) {
 euclid gcdCalculator = new  euclid();
gcdCalculator.acceptNumbers();
 gcdCalculator.calculateGCD();
 gcdCalculator.displayGCD();

    }

}