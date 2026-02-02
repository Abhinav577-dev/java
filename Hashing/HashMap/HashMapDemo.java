import java.util.*;

class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // get - O(1)

        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia"));

        // contains key - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // remove 

        System.out.println(hm.remove("China"));
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
    }
}