package skl_oop_b3_odd;
import java.util.*;
public class findareaoerload {
	public static void main(String[] args) {
		double r1;
		int r2;
		Scanner sc=new Scanner(System.in);
		AreaofMethodOverload a=new AreaofMethodOverload();
		a.areacircle();
		System.out.print("enter the radius 01:");
		r1= sc.nextDouble();
		
		
		AreaofMethodOverload b=new AreaofMethodOverload();
		b.areacircle(r1);
		System.out.print("enter the radius 02:");
		r2= sc.nextInt();
		AreaofMethodOverload c=new AreaofMethodOverload();
		c.areacircle(r2);
		System.out.print("Area of circle....radius=5:");
		a.display();
		System.out.print("Area of circle....radius=:"+r1);
		b.display();
		System.out.print("Area of circle....radius=:"+r2);
		c.display();
		System.out.print("lucky UIN:231P061");
		}
}
class AreaofMethodOverload
{
	double r;
	void areacircle()
	{
		r=5;
	}
	void areacircle(double radius)
	{
		r=radius;
	}
	void areacircle(int radius)
	{
		r=radius;
	}
void display()
{System.out.println("Areaof circle:"+ (3.14*r*r));
	}
}

