import java.util.*;

class StringDemo {

    public static void printStr(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }


    public static boolean Palindrome (String str){
        int n = str.length();
        for(int i=0; i<str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        String str = "abhinav";
        String str2 = new String("xyz");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // String fullName = "Abhinav K";
        // System.out.println(fullName.length());
        // printStr(str); 
        System.out.print(Palindrome(str));                                          
    }
}