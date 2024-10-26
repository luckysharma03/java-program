package skl_oop_b3_odd;
import java.util.*;
public class Findarea_B3 {
	public static void main(String[] args) {
		double r1;
		int r2;
		Scanner sc=new Scanner(System.in);
		Areaof a1= new Areaof ();
		System.out.print("enter the radius 01:");
		r1= sc.nextDouble();
		Areaof b1= new Areaof (r1);
		System.out.print("enter the radius 02:");
		r2= sc.nextInt();
		Areaof c1= new Areaof (r2);
		System.out.print("Area of circle....radius=5:");
		a1.display();
		System.out.print("Area of circle....radius=:"+r1);
		b1.display();
		System.out.print("Area of circle....radius=:"+r2);
		c1.display();
		System.out.print("lucky UIN:231P061");
}
}
class Areaof
{
	double r;
	Areaof()
	{
		r=0;
	}
	Areaof (double radius)
	{
		r=radius;
	}
	Areaof(int radius)
	{
		r=radius;
	}
void display()
{System.out.println("Areaof circle:"+ (3.14*r*r));
	
}
}