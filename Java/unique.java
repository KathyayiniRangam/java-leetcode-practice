import java.util.Scanner;
public class unique {
    public static boolean isUnique(int n){
        int arr[]=new int[10];
        while(n!=0){
            arr[n%10]++;
            n/=10;
        }
        for(int i:arr){
            if(i>1) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        int count=0;
        for(int i=low;i<=high;i++){
            if(isUnique(i))
                count++;
        }
        if(count==0)
            System.out.println("No unique number");
        else 
            System.out.println(count);
        sc.close();
    }
}
