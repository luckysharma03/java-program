package skl_oop_b3_odd;
/* write a program in java to check string is palindrome or not using string buffer object
 * Name: LUCKY SHARMA
 * UIN: 231P061 */ 
import java.util.*;
public class Palindrome {
public static void main(String [] args) {
String str, rev; 
StringBuffer str1 = new StringBuffer();

Scanner sc= new Scanner(System.in); 
System.out.print ("Enter a String :"); 
str=sc.nextLine();
str1.append(str); 
str1.reverse(); 
rev=str1.toString(); 
if(str.equalsIgnoreCase(rev)) 
 System.out.println ("\n Palindrome"); 
else 
 System.out.println (" \n Not a Palindrome"); 



System.out.println("Lucky Sharma / 231P061/ 42" ); 
}

}