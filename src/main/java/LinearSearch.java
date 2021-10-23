//@author juan
 
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - prvoide asymptotic analysis of the developed solution
    }
    
    public static void main(String[] args) {
        int arr[] = {24, 67, 98};
        int x = 99;
        int test = search(arr, x);
        if (test == -1)
            System.out.println("Not found");
        else
            System.out.println("Found at index: " + test);
        
    }
    
}

//Time complexity O(n)
//Ω(1)
//Θ(n)