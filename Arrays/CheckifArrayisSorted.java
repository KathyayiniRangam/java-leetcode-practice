package Arrays;
import java.util.Scanner;
public class CheckifArrayisSorted {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean isSorted=true;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }
    }
}
