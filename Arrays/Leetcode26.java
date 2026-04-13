package Arrays;
import java.util.Scanner;
public class Leetcode26 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        for(int j = 1;j<6;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        System.out.println("Length: "+(i+1));
        System.out.println("Array:");
        for(int k=0;k<=i;k++){
            System.out.println(arr[k]+" ");
        }
    }
}
