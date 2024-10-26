package skl_oop_b3_odd;
/*Write a program in java to display triangle of numbers
 * Name: Lucky Sharma
 * UIN: 231P061
 */

import java.util.Scanner;

public class pattern_p4 {
	public static void main(String[] args) {
		 int i, j,n; 
		 Scanner sc=new Scanner (System.in); 
		  
		 System.out.print("enter number of rows or column: "); 
		 n=sc.nextInt(); 
		  
		 for(i=1; i<=n; i++) //outer loop for number of rows(n)
		 {  
			 for(j=1; j<=i; j++) // inner loop for columns 
			 {  
				 System.out.print(j);
			 } 
			 System.out.println(); // ending line after each row  }
		} 

	}

}

