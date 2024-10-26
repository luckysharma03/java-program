package skl_oop_B3_odd;

/*aim : find area of rectangle , triangle and circle
 * name: Lucky sharma
 * Uin : 231P061/42
 * 
 */
import java.util.*;

public class overloading {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	int l,b;
	area a =new area();
	System.out.print("Enter length:");
    l =sc.nextInt();
	System.out.print("Enter breadth:");
	b =sc.nextInt();
	a.area1(l,b);
	a.display();
	
	
	
	

    double h,b1;
	area a2 =new area();
	System.out.print("Enter height:");
    h =sc.nextDouble();
	System.out.print("Enter breadth:");
	b1 =sc.nextDouble();
	a2.area1(h,b1);
	a2.display();

	
	
	
	
	int r;
    area a3 =new area();
    System.out.print("Enter radius:");
    r =sc.nextInt();
    a3.area1(r);
	a3.display();

    
	
}

	 
	
}


class area{
	int result1;
	double result2;
	double result3;
	void area1 (int l, int b)
	{
		result1 = l*b;
		
	}
	void area1(double h , double b1)
	{
	result2= 1/2*b1*h;
	}
	void area1(int r)
	{
	result3= 3.14*r*r;	
	}
	void display()
	{
		System.out.println("the area of rectangle is:"+result1);
		System.out.println("the area of triangle is:"+result2);
		System.out.println("the area of circle is:"+result3);
		
	}
}
