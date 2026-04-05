public class palindArr {
    public static void main(String[] args){
        int arr[]={3,2,3,3,5};
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]==arr[j]){
                i++;j--;
            }
        }
    }
}
