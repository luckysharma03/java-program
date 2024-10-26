package skl_oop_b3_odd;

// NAME : lucky sharma

// UIN : 231P061



import java.util.Scanner;



public class circle {

    double radius;

     double area;



    void acceptRadius() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");

        radius = sc.nextDouble();

    }



   void calculateArea() {

        area = Math.PI * Math.pow(radius, 2);

    }



   void displayArea() {

        System.out.printf("The area of the circle is %.2f%n", area);

    }



   public static void main(String[] args) {

        circle circle = new circle();

        circle.acceptRadius();

        circle.calculateArea();

        circle.displayArea();

    }

}



