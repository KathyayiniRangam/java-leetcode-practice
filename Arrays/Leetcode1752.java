package Arrays;
import java.util.Scanner;
public class Leetcode1752 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){
                count++;
            }
        }
        System.out.println(count<=1);
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
    }
}
