package skl_oop_b3_odd;
/*
 * AIM: Program to implement user defined exception in java
 * NAME: LUCKY SHARMA
 * UIN: 231P061 
 */
import java.util.*; 
public class Month 
{ 
public static void main(String args[]) 
{ 
int n; 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter the month number:"); 
n=sc.nextInt(); 
try 
{ 
if(n>12||n<1) 
throw new ArithmeticException(); 
System.out.println("Month number entered is="+n); 
} 
catch(ArithmeticException ae) 
{ 
System.out.println("Invalid Number!"); 
System.out.println("LUCKY SHARMA , 42 "); 
} 
} 
} 



