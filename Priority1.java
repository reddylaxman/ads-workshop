import java.util.PriorityQueue;

//MinHeap
public class Priority1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
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
 * [1, 2, 3, 4, 5]
 * [2, 4, 3, 5]
 */
