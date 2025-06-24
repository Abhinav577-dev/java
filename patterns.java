import java.util.*;

class patterns{
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
    }
}