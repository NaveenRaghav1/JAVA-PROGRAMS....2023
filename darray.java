import java.util.Arrays;
import java.util.Scanner;
public class darray {
    public static void main(String[] args) {
        System.out.println("hello users......");
        int [][] arr=new int[2][2];
        Scanner a=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                 arr [i][j]=a.nextInt();
            }
        

        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[i][j]);
            }
        }
        for(int [] b:arr){
            System.out.println(Arrays.toString(b));
        }
    }
}
