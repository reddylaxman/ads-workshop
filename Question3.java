import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        int ropes[] = { 4, 3, 2, 6 };
        int n = 4;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost = 0;
        List<Integer> intermediateRopes = new ArrayList<>();
        while (pq.size() > 1) {
            int min = pq.remove();
            int min2 = pq.remove();
            cost += min + min2;
            pq.add(min + min2);
            intermediateRopes.add(min + min2);
        }
        System.out.print("Cost of connecting n ropes = " + cost);
        System.out.print(intermediateRopes);
    }
}

/*
 * Cost of connecting n ropes = 29[5, 9, 15]
 */
