package day1;

import java.util.Scanner;

public class greater {
    public static void main(String[]args) {
System.out.println("here we take input from the user---->");        
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(a==b){
        System.out.println("both are equals");
    }
    else if(a>b){
        System.out.println("a is greater than b");
    }
    else{
        System.out.println("b is greater");
    }


}
}
