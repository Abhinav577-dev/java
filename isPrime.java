import java.util.*;

class isPrime{
    public static void main(String[] args){
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n = sc.nextInt();

        if (n==2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i<=Math.sqrt(n); i++){
                if (n % i == 0){
                    isPrime = false;
                }
            }
            if (isPrime == true){
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
        }

        // while(counter <= 10){
        //     System.out.println(counter);
        //     counter++;
        // }

        // do {
        //     int n = sc.nextInt();
        //     if (n % 10 == 0){
        //         break;
        //     }
        //     System.out.println(n);
        // } while(true);
    }
}