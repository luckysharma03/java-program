package skl_oop_b3_odd;
/*AIM: Write a program to implement interface demonstrating the concept of multiple  inheritance. 
*Name: LUCKY SHARMA 
*UIN: 231P061
*/
import java.util.*;

class Radius {
    protected double radius;

    public void getRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        radius = sc.nextDouble();
    }
}


class Circle extends Radius {
    public double areaOfCircle() {
        return Math.PI * radius * radius;
    }
}


class Sphere extends Circle {
    public double volumeOfSphere() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + areaOfCircle());
        System.out.println("Volume of Sphere: " + volumeOfSphere());
    }
}


public class Volume_Of_Sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sphere sphere = new Sphere();
        sphere.getRadius();
        sphere.display();
        System.out.println("Name : LUCKY SHARMA");
        System.out.println("UIN : 231P061");
    }

	}


