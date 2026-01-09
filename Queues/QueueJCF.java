import java.util.*;
class QueueJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // queue is an interface therefore we cannot create the object of queue we implement it using the LinkedList or ArrayDeque classes
        // also implemented using
        // Queue<Integer> q = new ArrayDeque
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}