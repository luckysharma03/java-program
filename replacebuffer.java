package skl_oop_java_B3;

/*
* Aim : Write a program for replace method of StringBuffer class.
* Name : Sharma Lucky
* UIN : 231P061
* Div : A.
*/

import java.util.*;

public class StringBufferReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer str = new StringBuffer("Lucky Sharma");
		
		Scanner sc = new Scanner(System.in);
		
		 
		 System.out.println("Enter a string: "+str );

		 StringBuffer s= str.replace(6, 6, "Kunj");
		
		 System.out.println("New string is: "+s );

		 System.out.println("Thank You ");
		 System.out.println("Name : Sharma Lucky KunjBihari");
		 System.out.println("UIN : 231P061");

	}

}