import java.util.Scanner;
public class solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int smallest=arr[0];
        int ssmallest=Integer.MIN_VALUE;
        for(int nums:arr){
            if(nums<smallest){
                ssmallest=smallest;
                smallest=nums;
            }
            else if(nums<ssmallest && nums!=ssmallest){
                ssmallest=nums;
            }
        }
        System.out.println("second smallest element:"+ssmallest);
        sc.close();
    }
}
