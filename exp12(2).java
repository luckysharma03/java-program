package myPackage;

///*
//* Aim : Write a program in java to add two number using packages.
//* Name : Sharma Lucky
//* UIN : 231P061
//* Div : A.
//*/

import myPackage.Add;
public class AddDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add obj = new Add(10,29);
		obj.getAddition();
		System.out.println("\nThank You ");	
		System.out.println("Name : Sharma Lucky");
		System.out.println("\nUIN : 231P061");
	}
}
