import java.util.*;

public class LargestNum{

    public static int getLargestnum(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : " +smallest);
        return largest;
    }
    public static void main(String[] args){
        int numbers[] = {2,56,35,6,5,68,47,75};
        System.out.println("Largest value is : " + getLargestnum(numbers));
        
       
    }
}