import java.util.*;

class HashMapIter {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        // iterate
        Set<String> st = hm.keySet();
        System.out.println(st);

        for(String k : st) {
            System.out.println("Key : " + k+ ", value : "+hm.get(k));
        }
    }
}