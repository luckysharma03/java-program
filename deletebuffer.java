package skl_oop_java_B3;

/*
* Aim : Write a program for delete method of StringBuffer class.
* Name : Sharma Lucky
* UIN : 231P061
* Div : A.
*/

import java.util.*;

public class StringBufferDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str = new StringBuffer("Lucky Kunjbihari Sharma");
		
		Scanner sc = new Scanner(System.in);
		
		 
		 System.out.println("Enter a string: "+str );

		 StringBuffer s= str.delete(6, 17);
		
		 System.out.println("Enter a string: "+s );

		 System.out.println("Thank You ");
		 System.out.println("Name : Sharma Lucky");
		 System.out.println("UIN : 231P061");
		
	}

}