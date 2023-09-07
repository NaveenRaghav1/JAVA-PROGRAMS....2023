//import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
public class converter {
    public static void main(String[]args) {
        System.out.println("hello user.....");
        Scanner s=new Scanner(System.in);
        System.out.println("enter the distance in kilometer -");
        int a= s.nextInt();
        int b=(a)*1000;
        System.out.println("the distance in the meter is-");
        System.out.println(b);
        
    }
}
