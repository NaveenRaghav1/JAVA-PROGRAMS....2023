import java.util.Arrays;
import java.util.Scanner;
public class arr_2 {
    public static void main(String[] args) {
        String [] a=new String[5];
        Scanner in=new Scanner(System.in);
        for(int i =0;i<a.length;i++){
           // System.out.println(a[i]);
           a[i]=in.next();

        }
        System.out.println(Arrays.toString(a));
    }
}
