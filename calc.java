package day1;

import java.util.Scanner;

public class calc {
    public static void main(String[]args) {
        System.out.println("here we create a small calculator using java conditional statements--->");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=num1+num2;
        int diff=num1-num2;
        int prod=num1*num2;
        int div=num1/num2;
        System.out.println(sum );
        System.out.println(diff);
        System.out.println(prod);
        System.out.println(div);

    }
}
