// public class Main {
//     public static void main(String[] args) {
//         // Declaration + Initialization
//         int[] arr = {10, 20, 30, 40, 50};

//         // Print elements
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter Elements:"+" ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // System.out.println("Array Elements:"+" ");
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println("Size:"+arr.length);
        // System.out.println(arr[n-2]);
        //>>Reverse an array
        // int left=0;
        // int right=n-1;
        // while(left<right){
        //     int temp=arr[left];
        //     arr[left]=arr[right];
        //     arr[right]=temp;
        //     left++;
        //     right--;
        // }
        // for(int num:arr){
        //     System.out.println(num);
        // }
        //>>Print array in reverse order
        // for(int i=n-1;i>=0;i--){
        //     System.out.println(arr[i]+" ");
        // }
        //>>Swap first and last element
        // int temp=arr[0];
        // arr[0]=arr[n-1];
        // arr[n-1]=temp;
        // for(int num: arr){
        //     System.out.print(num+" ");
        // }
        //>>Find sum and average
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     sum=sum+arr[i];
        // }
        // double average=(double) sum/n;
        // System.out.println("sum: "+sum);
        // System.out.println("Average: "+average);
        //>>Count even and odd numbers
        // int even=0;
        // int odd=0;
        // for(int num:arr){
        //     if (num%2==0)
        //         even++;
        //     else
        //         odd++;
        // }
        // System.out.println("Even count: "+even);
        // System.out.println("Odd count: "+odd);
        //>>Find largest and second largest
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>first){
                second=first;
                first=num;
            }
            else if(num>second && num!=first){
                second=num;
            }
        }
        System.err.println("Largest: "+first);
        System.out.println("Second largest: "+second);
        //>>Remove duplicates from sorted array
        // int j=0;
        // for(int i=1;i<n;i++){
        //     if(arr[i]!=arr[j]){
        //         j++;
        //         arr[j]=arr[i];
        //     }
        // }
        // int newSize=j+1;
        // System.out.println("Array after removing duplicates: ");
        // for(int i=0;i<newSize;i++){
        //     System.out.print(arr[i]+" ");
        // }
        //>>Move all zeroes to end
        // int j=0;
        // //Move non-zero elements forward
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=0){
        //         arr[j]=arr[i];
        //         j++;
        //     }
        // }
        // //Fill rest with zeros
        // while(j<arr.length){
        //     arr[j]=0;
        //     j++;
        // }
        // for(int num:arr){
        //     System.out.print(num+" ");
        // }

    }
}
