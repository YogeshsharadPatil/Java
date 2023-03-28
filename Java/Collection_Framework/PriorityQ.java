package Collection_Framework;

import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        // priority queue follows Min-Heap Data structure
        // it will not allow null value and string
        // it doesnot follow order of insertion
        // according to binary tree with heap data structurte it works


        PriorityQueue pq = new PriorityQueue();
        pq.add(100);
        pq.add(25);
        pq.add(75);
        pq.add(175);
        pq.add(150);
        System.out.println(pq);

    }
}
 


