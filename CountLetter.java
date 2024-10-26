package skl_oop_B3_odd;

/* Aim  : WAP in java to perform count frequency of a given letter in a string.
 * Name : Lucky Sharma
 * UIN  : 231P061
 * Div  : A
 */

import java.util.*;

public class CountLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str=new String();
    char ch= 'a';
    int len,count=0;
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter String :");
    str = sc.nextLine(); //to read a sting

    System.out.print("Enter a character to be searched in string :");
    ch = sc.nextLine().charAt(0); //to read a single character
    
    len = str.length(); //storing length of string in one variable
    for(int i=0 ; i<=len-1 ; i++)
    if(ch==str.charAt(i)) //comparing character with each element
    		count++;

    System.out.println("Frequency of character '"+ch+"' in string is : " +count);
   
    System.out.println("Lucky  231P061  42");
    sc.close();


    
	}

}
