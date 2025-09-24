
package bmi;

import java.util.Scanner;

public class Bmi {

    public static void main(String[] args) {
        
      
     Scanner input = new Scanner(System.in);
     System.out.println("Enter weight in kg:");
        double weight=input.nextDouble();
      System.out.println("Enter height meter:");
        double height=input.nextDouble();
        double bmi=weight/(height*height);
        System.out.println("BMI is = "+bmi);
        if (bmi<18.5)
            System.out.println("Underweight");
        if (bmi>=18.5 && bmi<25.0)
            System.out.println("Normal");
      if (bmi>=25.0 && bmi<30.0)
            System.out.println("Overweight ");
        if (bmi>30.0)
            System.out.println("obese ");
      
    }
    
}
