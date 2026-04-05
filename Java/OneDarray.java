import java.util.*;
import java.util.Arrays;
public class OneDarray {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       //take array size input
       System.out.println("Enter the size of an array: ");
       int size=sc.nextInt();
       //declare the array
       int[] arr=new int[size];
       //take array elements input
       System.out.println("Enter "+ size +" elements");
       for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
       }
       //print array elements
       System.out.println("The array is: "+Arrays.toString(arr));
       sc.close();
    }
}
