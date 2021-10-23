//@author juan

public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) {
                if (a[inner] > a[inner + 1]) {
                    temp = a[inner];
                    a[inner] = a[inner+1];
                    a[inner + 1] = temp;
                }
            }
        }
    }
    
    public static void printSortedArray(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int a[] = {7, 2, 8, 5, 4};
        int s = a.length;
        
        bubbleSort(a, s);
        printSortedArray(a);
    }   
}

//Time complexity O(n^2)
//Ω(n)
//Θ(n^2)

