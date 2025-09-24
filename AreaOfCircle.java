
package areaofcircle;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
System.out.print("Enter a number for radius:");
double radius = input.nextDouble();
double area = radius*radius*3.14;
        System.out.println("the area for the circle of radius");
        System.out.println(area);
    }
    
}
o