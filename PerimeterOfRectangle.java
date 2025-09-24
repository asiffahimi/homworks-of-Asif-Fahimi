
package perimeterofrectangle;
import java.util.Scanner;
public class PerimeterOfRectangle {
    

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the lenght:");
        double lenght= input.nextDouble();
         System.out.print("Enter the width:");
        double width = input.nextDouble();
        double perimeter=2*lenght+2*width;
        System.out.println("");
        System.out.println("perimeter of rectangle is = "+perimeter);
        
    }
    
    
    
    
}
