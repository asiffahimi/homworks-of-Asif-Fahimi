
package sumoffirstnnaturalnumbers;
import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enters the value of N: ");
        int N = input.nextInt();
        int S=(N*(N+1))/2;
       

                System.out.print("The sum of first natural number with N ="+S);
                
    }
    
}



