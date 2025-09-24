
package convertfarenhite.to.celciuse;
import java.util.*;
public class ConvertFarenhiteToCelciuse {

    public static void main(String[] args) {
        java.util.Scanner input=new Scanner(System.in);
        System.out.print("Enter a farenhite :");
        double farenhite=input.nextDouble();
        double celciuse =(5.0/9)*(farenhite-32);
        System.out.println("the celciuse is ="+celciuse);
        
    }
    
}
