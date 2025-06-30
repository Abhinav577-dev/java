import java.util.*;

class patterns{

    public static void hollowRectPat(int totRows , int totCols){
        for (int i=1; i<=totRows; i++){
            for(int j=1; j<=totCols; j++){
                if(i == 1|| i == totRows || j == 1  || j == totCols){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        for (int line = 1; line<=4 ; line++){
            for (int i = 1; i<=line ; i++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i<=4; i++){
            for (int j = 1; j<=4-i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i<=4; i++){
            for (int j = 1; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        char ch = 'A';
        for (int i = 1; i<=4; i++){
            for (int j = 1; j<=i ; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        hollowRectPat(5,4);


    }
}