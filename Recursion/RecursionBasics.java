class RecursionBasics {

    public static void printDec(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    } 
    public static void printInc(int n){
        if (n == 1) {
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
        
    }

    public static int Factorial(int n) {
        if( n == 0) {
            return 1;
        }

        int fnm1 = Factorial(n-1);
        int fn = n * Factorial(n-1);
        return fn;
    }

    public static int sumOfN(int n) {
        if (n == 1){
            return 1;
        }
        int snm1 = sumOfN(n-1);
        int sn = n + snm1;
        return sn;
    }

    public static void main(String[] args) {
        int n = 10;
        // printInc(10);
        //System.out.println(Factorial(5));
        System.out.println(sumOfN(5));
    }
}