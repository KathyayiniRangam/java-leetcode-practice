import java.util.Scanner;

public class hashing2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        // Step 1: input array elements
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Step 2: Precompute hash (frequency count)
        int[] hash = new int[13];   // assuming arr[i] values are between 0–12
        for(int i = 0; i < n; i++){
            hash[arr[i]]++;
        }

        // Step 3: Find highest and lowest frequency
        int maxFreq = -1, maxElement = -1;
        int minFreq = Integer.MAX_VALUE, minElement = -1;

        for(int i = 0; i < hash.length; i++){
            if(hash[i] > 0) { // consider only present elements
                if(hash[i] > maxFreq){
                    maxFreq = hash[i];
                    maxElement = i;
                }
                if(hash[i] < minFreq){
                    minFreq = hash[i];
                    minElement = i;
                }
            }
        }

        System.out.println("Highest frequency element: " + maxElement +
                           " (frequency = " + maxFreq + ")");

        System.out.println("Lowest frequency element: " + minElement +
                           " (frequency = " + minFreq + ")");

        // Step 4: Queries (your original part)
        int q = sc.nextInt();
        while(q-- != 0){
            int number = sc.nextInt();
            System.out.println(hash[number]);
        }
    }
}
