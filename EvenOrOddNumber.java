
package even.or.odd.number;
import java.util.Scanner;
public class EvenOrOddNumber {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=input.nextInt();
        if (n%2==1)
        System.out.println(n+" is odd");
        else 
        System.out.println(n+" is even");
    }
    
}
