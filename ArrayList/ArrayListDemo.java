import java.util.*;
class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add operation O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1,8); // O(n)

        System.out.println(list);

        //get operation returns the value at the index
        int element = list.get(2);
        System.out.println(element);

        // delete ops 
        list.remove(1);
        System.out.println(list);

        // set operation
        list.set(2,10);
        System.out.println(list);

        //contains op
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
        //list.contains(11);

        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+ " ");
            
        }
        System.out.println();

        for(int i=list.size() -1; i>=0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++) {
            // if(max < list.get(i)) {
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
            
        }
        System.out.println("Max element : "+ max);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(9);
        list1.add(8);
        list1.add(1);
        list1.add(4);
        System.out.println(list1);
        // ascending order 
        Collections.sort(list1);
        System.out.println(list1);

        //descending order
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1); 
        Swap(list1, 1, 3);
        System.out.println(list1);

    }    
    public static void Swap(ArrayList<Integer> list1, int idx1, int idx2) {
        int temp = list1.get(idx1);
        list1.set(idx1, list1.get(idx2));
        list1.set(idx2, temp);
    }
}