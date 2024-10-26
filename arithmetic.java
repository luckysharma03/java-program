package skl_oop_b3_odd;
/* AIM: WAP to for operation through character
 * NAME: LUCKY SHARMA
 * UIN:  231P061
 */

import java.util.Scanner;


public class character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		int x, y;
		
		Scanner sc= new Scanner(System.in);
		do {
	    System.out.println("MENU");
		System.out.println("1.ADDITION");	
		System.out.println("2.SUBTRACTION");
		System.out.println("3.MULTIPLICATION");	
		System.out.println("4.DIVISION");
		System.out.println("5.MOD");
		System.out.println("6.EXIT");
		System.out.println("ENTER YOUR CHOICE: ");
		ch=sc.next().charAt(0);

		switch(ch)
		{
		case '+' : System.out.println("adddition");
		         System.out.println("ENTER YOUR FIRST NUMBER:");
		         x= sc.nextInt();
		         System.out.println("ENTER YOUR second NUMBER:");
		         y= sc.nextInt();
		         System.out.println("x+y:" +(x+y));

		break;
		case '-' : System.out.println("subtraction:");
		         System.out.println("ENTER YOUR FIRST NUMBER:");
		         x= sc.nextInt();
		         System.out.println("ENTER YOUR second NUMBER:");
		         y= sc.nextInt();
		         System.out.println("x-y:" +(x-y));
		break;

		case '*' : System.out.println("multiplication:");
		         System.out.println("ENTER YOUR FIRST NUMBER:");
		         x= sc.nextInt();
		         System.out.println("ENTER YOUR second NUMBER:");
		         y= sc.nextInt();
		         System.out.println("x*y:" +(x*y));
		break; 

		case '/': System.out.println("division:");
		         x= sc.nextInt();
		         System.out.println("ENTER YOUR second NUMBER:");
		         y= sc.nextInt();
		         System.out.println("x/y:" +(x/y));
		break;

		case '%' : System.out.println("mod:");
		         System.out.println("ENTER YOUR FIRST NUMBER:");
		         x= sc.nextInt();
		         System.out.println("ENTER YOUR second NUMBER:");
		         y= sc.nextInt();
		         System.out.println("x%y:" +(x%y));
		break;

		case '!' : System.out.println("THANK YOU ");
		         System.exit(0);

		default :System.out.println("WRONG CHOICE!");
		}
		}while(ch!=6);
	
	}	
	


}