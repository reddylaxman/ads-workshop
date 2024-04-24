import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Scanner;

//Product of first 3 largest numbers.
public class Question2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            pq.offer(s.nextInt());
            if (i < 2) {
                System.out.println(-1);
            } else {
                int first = pq.poll();
                int second = pq.poll();
                int third = pq.poll();
                int result = first * second * third;
                System.out.println(result);
                pq.offer(first);
                pq.offer(second);
                pq.offer(third);
            }
        }
    }

}

/*
 * output:-
 * 5
 * 1 2 3 4 5
 * -1
 * -1
 * 6
 * 24
 * 60
 */
