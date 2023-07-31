
package com.mycompany.q4;
import java.util.Scanner;


public class Q4 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double radius = scanner.nextDouble(); 
        
        Circle circle=new Circle(radius);
        double areac=circle.calculateArea();
        
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        
        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        
        Rectangle rectangle= new Rectangle(width,height);
        double arear=rectangle.calculateArea();
        rectangle.display(arear);
    }
}
