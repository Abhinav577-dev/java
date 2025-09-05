class Fibonacci {

    public static int fib(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }

    public static boolean isSorted (int arr[], int i) {
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;

        }
        
        return isSorted(arr, i+1);
    }

    public static int firstOccurrence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return firstOccurrence(arr,key,i+1);
    }

    public static int lastOccurrence(int arr[], int key, int i){
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOccurrence(arr,key,i+1);

        if(isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }


    public static void main(String[] args){
        // System.out.println(fib(23));
        // System.out.println(fib(24));
        // System.out.println(fib(25));
        // System.out.println(fib(26));
        // System.out.println(fib(27));
        // System.out.println(fib(28));
        int arr[] = {8,7,5,2,3,4,2,0,5,7,2,3};
        // int i = 0;
        // System.out.println(isSorted(arr, 0));
        System.out.println(lastOccurrence(arr, 5, 0));

    }
}