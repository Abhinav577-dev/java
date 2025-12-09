import java.util.*;

class PairSum {

    // public static boolean pairSum(ArrayList<Integer> list, int target) {
    //     for(int i=0; i<list.size(); i++) {
    //         for(int j =i+1; j<list.size(); j++) {
    //             if(list.get(i) + list.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while(lp < rp) {
            // case 1
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            } else if(list.get(lp) + list.get(rp) < target) {
                lp++;
            } else if(list.get(lp) + list.get(rp) > target) {
                rp++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum1(list, 30));
    }
}