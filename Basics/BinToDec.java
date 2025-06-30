import java.util.*;

class BinToDec{

    public static void BinToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum>0){
            int lastDig = binNum % 10;
            decNum = decNum + (lastDig * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum / 10;
        }

        System.out.println("decial no : "+ myNum + " = " + decNum);
    }

    public static void main(String[] args){
        
        BinToDec(101);
    }
}