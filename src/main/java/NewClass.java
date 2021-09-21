//@author juan

import java.util.Scanner;

public class NewClass {
    static int getMaxPairwiseProduct(int[] arr) {
        int n = arr.length;
        
        int max = -1;
        for (int i = 0; i < n; i++) { 
            if (arr[i] > max) { 
                max = arr[i];
            }
        }
        
        int max2 = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];
            }
        }
        
        return max * max2;
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int [] arr = new int[length];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        
        System.out.println(getMaxPairwiseProduct(arr));
    }
}
