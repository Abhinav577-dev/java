import java.util.*;

class loop{
    public static void main(String[] args){
        int counter = 1;

        Scanner sc = new Scanner(System.in);

        // while(counter <= 10){
        //     System.out.println(counter);
        //     counter++;
        // }

        do {
            int n = sc.nextInt();
            if (n % 10 == 0){
                break;
            }
            System.out.println(n);
        } while(true);
    }
}