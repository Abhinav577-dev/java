import java.util.*;

class EvenOdd {

    public static void evenOrodd(int n) {
        int bitmask = 1;
        if((n & bitmask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("odd Number");
        }
    }
    public static void main(String[] args){
        int n = 3;
        evenOrodd(10);

    }
}