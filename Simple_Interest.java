
package simple_interest;
import java.util.Scanner;
public class Simple_Interest {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("The amount of money=");
                  double money =input.nextDouble();
        System.out.print("The percentage of interest=");
                   double interest = input.nextDouble();
        System.out.print("The time=");
                   double time = input.nextDouble();
        double simple_interest =(money*interest*time)/100;
        System.out.println("simple interest ="+simple_interest);
        
        
        
        
        
    }
    
}
