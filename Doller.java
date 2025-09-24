
package doller;

import java.util.Scanner;

public class Doller {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
          System.out.println("Enter (doller.cent) fo rexample (11.56)");
        double amount=input.nextDouble();
        //R = remaiders
        int R=(int)(amount*100);
       int dollars=(int)( R/100);
       R=R%100;
     int quarters=R/25;
    R=R%25;
     int dimes=R/10;
     R=R%10;
     
     int nickeles =R/5;
     R=R%5;
     int pennis =R;
        System.out.println(dollars);
        System.out.println(quarters);
        System.out.println(dimes);
        System.out.println(nickeles);
        System.out.println(pennis);
        
    }
    
}
