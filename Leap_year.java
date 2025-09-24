
package leap_year;
import java.util.Scanner;
public class Leap_year {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Enter a year:");
        int year=input.nextInt();
        if (year%4==0 && year%100!=0)
            System.out.println("this year is leap yaer");
      
        
        else
            System.out.println("this year is not leap year");
            
            
    
        
        
    
}
