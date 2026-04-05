//segregating 0s and 1s
import java.util.Scanner;
public class hi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]==0){
        //         arr[j]=arr[i];
        //         j++;
        //     }
        // }
        // while(j<n){
        //     arr[j]=1;
        //     j++;
        // }
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int num:arr){
            System.out.print(num +" ");
        }
    }
}
// import java.util.Scanner;

// public class hi {
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         int j = 0; // next position for zero

//         for(int i = 0; i < n; i++){
//             if(arr[i] == 0){
//                 // swap arr[i] and arr[j]
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//                 j++;
//             }
//         }

//         for(int num : arr){
//             System.out.print(num + " ");
//         }
//         sc.close();
//     }
// }
