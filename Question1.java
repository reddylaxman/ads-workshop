import java.util.Queue;
import java.util.Stack;
import java.util.ArrayDeque;

public class Question1 {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<Integer>();// We can LinkedList instead of ArrayDeque
        q.add(10);
        q.offer(20);// offer is similar to add
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        System.out.println(q);
        Stack<Integer> s = new Stack<Integer>();
        while (q.size() > 0) {
            s.push(q.poll());
        }
        while (s.size() > 0) {
            q.offer(s.pop());
        }
        System.out.println(q);
    }
}

/*
 * output:-
 * [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
 * [100, 90, 80, 70, 60, 50, 40, 30, 20, 10]
 */
