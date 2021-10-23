/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int k = 4;
        int l = 1;
        int h = 4;
        
        int test = runBinarySearchIteratively(arr, k, l, h);
        
        System.out.println("Found at index: " + test);
        
    }
}

//Time complexity O(log(n))
//Ω(1)
//Θ(log(n))