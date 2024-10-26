package skl_oop_B3_odd;
/*
Aim : Write a program in java to perform Matrix multiplication
Name: Lucky Sharma
UIN :231P061
Div : A
*/
import java.util.*;
public class MultiplicationMatrix {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
	    int i,j;
	    
	    int set1[ ][ ] =new int[3][3];
	    int set2[ ][ ] =new int[3][3];
	    int multi[ ][ ]=new int[3][3];
	    
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.print("Enter First 3x3 Matrix :\n");
	    for(i=0 ;i<3 ;i++) 
	    {
	    	for(j=0 ;j<3 ;j++)
	    	{
	    		set1[i][j]=sc.nextInt();
	    	}
	    }
	    
	    System.out.print("Enter Second 3x3 Matrix :\n");
	    for(i=0 ;i<3 ;i++) 
	    {
	    	for(j=0 ;j<3 ;j++)
	    	{
	    		set2[i][j]=sc.nextInt();
	    	}
	    }
		
	    
	    System.out.println("The First 3x3 Matrix is :\n");
	    for(i=0 ;i<3 ;i++) 
	    {
	    	for(j=0 ;j<3 ;j++)
	    	
	    	 System.out.print(set1[i][j]+"\t");
	    	 System.out.println(" ");
	    	
	    }
		
	    
	    System.out.println("The Second 3x3 Matrix is :\n");
	    for(i=0 ;i<3 ;i++) 
	    {
	    	for(j=0 ;j<3 ;j++)
	    	
	    	 System.out.print(set2[i][j]+"\t");
	    	 System.out.println(" ");
	    	
	    }
		
	    
	    System.out.println(" ");
	    for(i=0 ;i<3 ;i++) 
	    {
	    	for(j=0 ;j<3 ;j++)
	    	
	    		multi[i][j] = set1[i][j] * set2[i][j];
	    	
	    }
	    System.out.println("Result of 3x3 Matrix :\n");
	    for(i=0 ;i<3 ;i++) 
	    {
	    	for(j=0 ;j<3 ;j++)
	    	
	    		System.out.print(multi[i][j]+"\t");
	    		System.out.println(" ");
				System.out.println("LUcky , UIN : 231P061")
	    	
	    }
		
		
		}

	}


