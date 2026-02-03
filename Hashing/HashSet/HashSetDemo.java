import java.util.*;

class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(4);
        // set.add(1);
        // set.add(2);
        // System.out.println(set);
        // System.out.println(set.size());

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bangalore");

        Iterator it = cities.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        for(String city : cities) {
            System.out.println(city);
        }

    }
}