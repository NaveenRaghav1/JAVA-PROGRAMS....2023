import java.util.Scanner;
public class first {
    
    public static void main(String[] args){
        System.out.println("hello naveen");
        Scanner sum=new Scanner(System.in);
        System.out.println("enter first number-->");
        int num1=sum.nextInt();
        System.out.println("enter second number-->");
        int num2=sum.nextInt();
        int sume=num1+num2;
        System.out.println("the sum of the numbers is-->"+ sume);

    }
}
