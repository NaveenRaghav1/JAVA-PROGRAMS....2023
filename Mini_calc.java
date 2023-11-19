import java.util.Scanner;

public class Mini_calc {
    public static void main(String[] args) {
        System.out.println("here is your mini cal-c by NAVEEN RAGHAV ON 17-11-23");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number ->");
        int a = sc.nextInt();
        System.out.println("enter the second number ->");
        int b = sc.nextInt();
        System.out.println("enter the operation you want-->");
        String op = sc.next();
        if (op.equals("+")) {
            System.out.println("result is addition ->" + (a + b));
        } else if (op.equals("-")) {
            System.out.println("result is subtraction ->" + (a - b));
        } else if (op.equals("*")) {
            System.out.println("result is multiply ->" + (a * b));
        } else if (op.equals("/")) {
            System.out.println("result is divide ->" + (a / b));
        } else {
            System.out.println("enter valid operation 😊😊");
        }

    }
}
