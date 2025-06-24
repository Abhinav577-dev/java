import java.util.*;

class revNum{
    public static void main(String[] args){
        int n = 10899;

        while(n > 0){
            int lastDig = n % 10;
            int rev = 0;
            rev = (rev * 10) + lastDig;
            System.out.print(rev);
            n=n/10;
        }
    }
}