// Aim: Write a program in java to display number between 1 to 5 and break when it reached to 5

// Name:Lucky Sharma
// UIN : 231P061
package skl_oop_b3_odd;
import java.util.*;
public class pattern_p2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n;
		System.out.print("Enter a number for the for loop: ");
		n = sc.nextInt();	
		for (int i  = 1; i <= n; i++)
		{
			if (i == 5)
				break;
			System.out.println(i);
		}

}
}  
