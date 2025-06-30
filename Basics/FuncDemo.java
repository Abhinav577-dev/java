import java.util.*;

class FuncDemo{
    // public static void printHello () {
        
    //     System.out.println("Hello World");
    // } 
    // public static int calculateSum (int a , int b) {
    //     int sum = a + b;
    //     return sum;
    // } 

    // public static void swap (int a , int b) {
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("The value of A after swapping : "+a);
    //     System.out.println("The value of B after swapping : "+b);
    // } 

    public static int fact(int n){
        int f = 1;
        for (int i = 1; i<=n; i++){
            f *= i;
        }
        return f;
    }

    public static int BinoCoeff(int n, int r){
       int fact_n = fact(n);
       int fact_r = fact(r);
       int fact_nmr = fact(n-r);

       int binCoeff = fact_n / (fact_r * fact_nmr);
       return binCoeff;
     }

    public static void main(String[] args){
        // printHello();
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a,b);
        // System.out.println("Sum is : " + sum);
        // int a = 10;
        // int b = 5;
        // swap(a, b);
        // System.out.println("The value of A after swapping : "+a);
        // System.out.println("The value of B after swapping : "+b);
        int res = fact(5);
        System.out.println(res);

        System.out.println(BinoCoeff(5,2));


    }
}