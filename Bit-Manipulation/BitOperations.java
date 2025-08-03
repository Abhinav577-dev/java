import java.util.*;

class BitOperations {

    public static int getBit(int n, int i) {
        int bitMask = (1 << i);

        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public static int setBit(int n, int i) {
        int bitMask = (1 << i);

        return n|bitMask;
    }

    public static int clearBit(int n, int i) {
        int bitMask = (~(1<<i));

        return n & bitMask;
    }

    public static int updateBit(int n, int i, int newBit) {
        n = clearBit(n,i);
        int bitMask = (newBit << i);

        return n | bitMask;
    }

    public static int clearIbits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
        
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n-1)) == 0;
    }

    public static int countSetBit(int n) {
        int count = 0;
        while(n>0) {
            if((n&1) != 0) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getBit(10,2));
        System.out.println(setBit(10,2));
        System.out.println(clearBit(10,1));
        System.out.println(updateBit(10,2,1));
        System.out.println(clearIbits(15,2));
        System.out.println(isPowerOfTwo(16));
        System.out.println(countSetBit(10));
    }
}