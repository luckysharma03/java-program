// Aim: Write a program in java to display triangle of numbers
// Name: Izhar Mulla
// UIN : 231P068

package skl_oop_b3_odd;
import java.util.*;
public class pattern_p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{ 
			stop: { 
			nextRow: 
			for(int row=1;row<=7;row++) 
			   { 
			   if (row==6) 
			   break stop; 
			   System.out.println(); 
			   for(int column=1;column<=10;column++) 
			      { 
			      if(column>row) 
			      continue nextRow; 
			      System.out.print(" * "); 
			        } 
			            } 
			               } 
                              }
	}
}