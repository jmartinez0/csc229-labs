public class Problem01 {

    static boolean checkIfPrime(int n)
    {
        if(n == 1) {
            return false;
        }
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Tried to do it from just 1 to n but ended up
    //making a probably overcomplicated
    //method that has both a set start and end
    
    static int getSumOfPrimes(int start, int end)
    {
        int sum = 0;
        for (int i = end; i >= start; i--) {
            boolean isPrime = checkIfPrime(i);
            if (isPrime) {
                sum = sum + i;
            }
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        int start = 1, end = 10;

        System.out.println("Sum of all primes from 1 to " + end + ": " + getSumOfPrimes(start, end));
    }
}

//Time complexity O(n√n)
//Space complexity O(1)