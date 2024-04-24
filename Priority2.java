import java.util.PriorityQueue;
import java.util.Collections;

//MaxHeap
public class Priority2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

    }

}
/*
 * [5, 4, 2, 1, 3]
 * [4, 3, 2, 1]
 */
