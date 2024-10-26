// AIM: Write a program to accept month number and display month name.
// Name: LUCKY SHARMA
// UIN: 231P061

package skl_op_package;
import java.util.*;
public class Months {

	public static void main(String[] args) {
		
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\nEnter the month (1-12) and 13 to exit: ");
			choice = sc.nextInt();
			
			switch (choice)
			{
				case 1:
					System.out.println("The entered Month is: January");
					break;
				case 2:
					System.out.println("The entered Month is: February");
					break;
				case 3:
					System.out.println("The entered Month is: March");
					break;
				case 4:
					System.out.println("The entered Month is: April");
					break;
				case 5:
					System.out.println("The entered Month is: May");
					break;
				case 6:
					System.out.println("The entered Month is: June");
					break;
				case 7:
					System.out.println("The entered Month is: July");
					break;
				case 8:
					System.out.println("The entered Month is: August");
					break;
				case 9:
					System.out.println("The entered Month is: September");
					break;
				case 10:
					System.out.println("The entered Month is: October");
					break;
				case 11:
					System.out.println("The entered Month is: November");
					break;
				case 12:
					System.out.println("The entered Month is: December");
					break;
				case 13:
					System.out.println("Exiting.");
					System.exit(choice);
				default:
					System.out.println("Wrong Choice.");
			}
		} while (choice != 13);
	}

}
