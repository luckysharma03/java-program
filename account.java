package skl_oop_b3_odd;
import java.util.*;
/* AIM: WAP to Write a program to create a class Account to perform the operation of insert, deposit and
withdrawal of single employee and make use of object.
 * NAME: LUCKY SHARMA
 * UIN:  231P061
 */

public class account {
public static void main(String[] args) {
	 int acc_no;
	 String name;
	 float amount;

	Scanner sc= new Scanner(System.in);
	System.out.print("enter  the account number:");
	acc_no= sc.nextInt();
	System.out.print("enter  the customer name:");
	name= sc.next();
	System.out.print("enter  the customer amount:");
	amount = sc.nextFloat();
	accounthelp obj1=new accounthelp();
	obj1.insert(acc_no, name, amount);
	obj1.display();
	obj1.checkbalance();
	System.out.print("enter the amount to be deposited:");
	float dep_amount=sc.nextFloat();
	obj1.deposit(dep_amount);
	obj1.checkbalance();
	System.out.print("enter the amount to be withdrawn:");
	float wit_amount=sc.nextFloat();
	obj1.withdraw(wit_amount);
	obj1.checkbalance();
	System.out.print("\n thank you!!!");
	
}
}
 class accounthelp
 {int acc_no;
String name;
float amount;

void insert(int a , String n , float amt)
{
	acc_no=a;
	name=n;
	amount=amt;
}
void deposit(float amt)
 {
	amount=amount+amt;
	System.out.println(amt+"deposited");

 }
void withdraw(float amt)
{
	if(amount<amt)
	{
		System.out.println("insuffient amount");
	}
	else
	{
		amount=amount-amt;
		System.out.println(amt+"withdraw");

		
	}
}
//method
void display()
{
	System.out.println("account number :"+acc_no);
	
	System.out.println("customer name:" +name);

	System.out.println("customers amount:"+amount);

}
void checkbalance()
{
	System.out.println("balance is:"+amount);
}
 }
