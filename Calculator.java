public class Calculator{
    int result;
    public void add(int num1,int num2){
        result=num1+num2;
    }

public void subtract(int num1,int num2){
    result=num1-num2;
}
public int getResult(){
    return result;
}
public static void main(String[]args){
    Calculator cal=new Calculator();
    int num1=10;
    int num2=5;
    cal.add(num1,num2);
    System.out.println("addition result="+ cal.getResult());

cal.subtract(num1, num2);
System.out.println("subtraction result="+cal.getResult());
}}