import java.util.Scanner;
//>>rotate array by k positions
// public class Main2 {
//     static void reverse(int[] arr,int start,int end){
//         while(start<end){
//             int temp=arr[start];
//             arr[start]=arr[end];
//             arr[end]=temp;
//             start++;
//             end--;
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter size: ");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int k=3;
//         k=k%n;
//         reverse(arr,0,n-1);
//         reverse(arr,0,k-1);
//         reverse(arr,k,n-1);
//         for(int num:arr){
//             System.out.print(num+" ");
//         }
//     }
// }
public class Main2{
    public static void main(String[] args){
        //>>merge 2 sorted arrays
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter size of arr1: ");
        // int n=sc.nextInt();
        // int[] arr1=new int[n];
        // System.out.print("Enter elements of arr1: ");
        // for(int i=0;i<n;i++){
        //     arr1[i]=sc.nextInt();
        // }
        // System.out.print("Enter size of arr2: ");
        // int m=sc.nextInt();
        // int[] arr2=new int[m];
        // System.out.print("Enter elements of arr2: ");
        // for(int j=0;j<m;j++){
        //     arr2[j]=sc.nextInt();
        // }
        int[] arr1={10,20,30,2};
        // int[] arr2={2,4,6};
        // int[] result=new int[arr1.length+arr2.length];
        // int i=0,j=0,k=0;
        // while(i<arr1.length && j<arr2.length){
        //     if(arr1[i]<arr2[j]){
        //         result[k++]=arr1[i++];
        //     }
        //     else{
        //         result[k++]=arr2[j++];
        //     }
        // }
        // while(i<arr1.length){
        //     result[k++]=arr1[i++];
        // }
        // while(j<arr2.length){
        //     result[k++]=arr2[j++];
        // }
        // for(int num:result){
        //     System.out.print(num+" ");
        // }
        //>>FInd missing number-Sum formula
        // int n=5;
        // int expected=n*(n+1)/2;
        // int actual=0;
        // for(int num:arr1){
        //     actual+=num;
        // }
        // int missing=expected-actual;
        // System.out.println("Missing number: "+missing);
        //Find missing number-XOR method
        // int n=5;
        // int XOR1=0,XOR2=0;
        // for(int i=1;i<=n;i++)
        //     XOR1^=i;
        // for(int num:arr1)
        //     XOR2^=num;
        // int missing=XOR1^XOR2;
        // System.out.println("Missing number:"+missing );
        //>>Find peak element
        int left=0,right=arr1.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr1[mid]<arr1[mid+1])
                left=mid+1;
            else
                right=mid;
        }
        System.out.println("Peak Element: "+arr1[left]);
    }
}