import java.util.*;

class SubStrings {

    public static String subString(String str, int si, int ei) {
        String subStr = "";
        for (int i=si; i<ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }
      
    public static void main(String[] args) {

        // String str = "Hello World";
        // System.out.println(subString(str,0,5));
        String Fruits[] = {"apple", "mango", "banana"};

        String largest = Fruits[0];
        for(int i=0; i<Fruits.length; i++){
            if(largest.compareTo(Fruits[i]) < 0) {
                largest =Fruits[i];
            }
        }
        System.out.println(largest);

    }
}