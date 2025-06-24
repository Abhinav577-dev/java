import java.util.*;
class intro{

    public static void main(String [] args){
        System.out.println("Hello World");
        int n = 3;


        // for(int i=0;i<=n;i++){
        //     System.out.println( n-i +"*" );
            

        // }
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        System.out.println("Binary Operators");
        System.out.println("Adiition is : " + (A+B));
        System.out.println("Subtraction is : " + (A-B));
        System.out.println("Multiplication is : " + (A*B));
        System.out.println("Division is : " + (A/B));
        System.out.println("Remainder is : " + (A%B));

        System.out.println("Unary Operators");
        int a = 10;
        int b = a++;
        int c = ++a;
        System.out.println("Value is : " + b);
        System.out.println("Incremention is : " + a);
        System.out.println("Incremention is : " + c);

        System.out.println( (3>2) && (2>0));


    }
}