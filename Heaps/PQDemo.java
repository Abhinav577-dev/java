import java.util.*;

class PQDemo {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("a", 4));
        pq.add(new Student("b", 2));
        pq.add(new Student("c", 6));
        pq.add(new Student("d", 10));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name+" -> " + pq.peek().rank);
            pq.remove();
        }

    }
}