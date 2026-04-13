package Arrays;
import java.util.Scanner;
public class RotateArrayByOne {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //left rotate array by one
        // int temp=arr[0];
        // for(int i=1;i<n;i++){
        //     arr[i-1]=arr[i];
        // }
        // arr[n-1]=temp;
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
       // }
       //right rotate array by one
       int temp=arr[n-1];
       for(int i=n-2;i>=0;i--){
            arr[i+1]=arr[i];
       }
       arr[0]=temp;
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
    }
}
