O
package convert.celcius.to.fahrenheit;
import java.util.Scanner;
public class ConvertCelciusToFahrenheit {

    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        System.out.println("Enter a celcius number;");
        double C=input.nextDouble();
        double f=(9.0/5.0*C+32);
        System.out.println(C+"celcius in farenhite is "+f+" degrees farenhite");
        
    }
    
}
