import java.util.*;

public class LinearSearch{

    public static int LinearSrch(int numbers[], int key){
        for (int i=0; i<numbers.length; i++){
            if(numbers[i] == key)
            return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers[] = {2,56,35,6,5,68,47,75};
        int key = 55;

        int index = LinearSrch(numbers, key);
        if(index == -1){
            System.out.println("Not Found");
        } else {
            System.out.println("Key is at the index : " + index);
        }
    }
}
