import java.util.*;

public class BinarySrch{

    public static int BinarySearch(int numbers[], int key){
        int start = 0, end = numbers.length -1;
        while (start <= end){
            int mid = (start + end)/2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid + 1;
            } else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers[] = {2,56,35,6,5,68,47,75};
        int key = 56;
        System.out.println("index of the key is : "+ BinarySearch(numbers, key));

    
    }
}