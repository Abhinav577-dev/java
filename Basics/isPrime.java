import java.util.*;

class isPrime{

    public static boolean isPrime(int n ) {
            for (int i=2; i<=Math.sqrt(n); i++){
                if(n % i == 0){
                    return false;
                }
            }
        return true;
    }

    public static void PrimesInRange(int n){
        for (int i =2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the no : ");
        // int n = sc.nextInt();

        // if (n==2) {
        //     System.out.println("n is prime");
        // } else {
        //     boolean isPrime = true;
        //     for (int i = 2; i<=Math.sqrt(n); i++){
        //         if (n % i == 0){
        //             isPrime = false;
        //         }
        //     }
        //     if (isPrime == true){
        //         System.out.println("n is prime");
        //     } else {
        //         System.out.println("n is not prime");
        //     }
        // }

        // OPtimised approach
        PrimesInRange(20);
    }
}