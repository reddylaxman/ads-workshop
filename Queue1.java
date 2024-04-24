import java.util.Queue;
import java.util.LinkedList;

public class Queue1 {
    public static void main(String[] args) {
        Queue<Object> q = new LinkedList<>();
        q.offer(1);
        q.add(2);
        q.remove();
        q.poll();
        q.add(8);
        q.add("Class");
        q.add("Hello");
        q.peek();
        System.out.println(q);
        System.out.println(q.isEmpty());
    }
}

/*
 * [8,Class, Hello]
 * false
 */