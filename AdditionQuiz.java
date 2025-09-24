
package additionquiz;

import java.util.Scanner;

public class AdditionQuiz {

    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
   int x=(int)System.currentTimeMillis() % 10;
         int x2=(int)System.currentTimeMillis()/10 % 10;
         System.out.println("what is "+x+" + "+x2+"?");
         int answer=input.nextInt();
         System.out.println(answer+" is "+(x+x2==answer));
       
        
    
    
    
    
    
    }
    
}




