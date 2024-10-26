package skl_oop_B3_odd;
/* Aim : Write a program in java to count vowels of a given string.
 * Name: Lucky Sharma
 * UIN : 231P061
 * Div : A
 */
import java.util.Scanner;

public class Count_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int count=0;
	    Scanner sc=new Scanner(System.in);
	    String str= "Lucky Sharma";
	
	    for(int i=0 ; i< str.length() ; i++) 
	    if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'||str.charAt(i)=='u') //comparing character with each element
	    		
	    count++;
	    		
	    System.out.println("Total number of vowels are : " +count);
	   
	    System.out.println("lucky  231P061  42");
	    sc.close();


	    }


	}