package skl_oop_b3_odd;
import java.util.Scanner;
/*AIM: 
 * NAME : LUCKY SHARMA
 * UIN: 231P061
 */
//Base class to accept radius from user
class Radius {
 protected double radius;

 public void getRadius() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the radius of the sphere: ");
     radius = sc.nextDouble();
 }

 // Method to display radius, can be overridden in derived classes
 public void display() {
     System.out.println("Radius: " + radius);
 }
}

//Derived class to calculate the area of the circle
class Circle extends Radius {
 public double areaOfCircle() {
     return Math.PI * radius * radius;
 }

 // Overriding display method to also show area of the circle
 @Override
 public void display() {
     super.display(); // Calls the base class display method
     System.out.println("Area of Circle: " + areaOfCircle());
 }
}

//Further derived class to calculate and display the volume of the sphere
class Sphere extends Circle {
 public double volumeOfSphere() {
     return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
 }

 // Overriding display method to also show volume of the sphere
 @Override
 public void display() {
     super.display(); // Calls the Circle's display method
     System.out.println("Volume of Sphere: " + volumeOfSphere());
 }


//Main class to execute the program

 public static void main(String[] args) {
     Sphere sphere = new Sphere();
     sphere.getRadius();
     sphere.display();
     System.out.println("Name : LUCKY SHARMA");
     System.out.println("UIN : 231P061"); // This will invoke the overridden method in Sphere class
 }
}
