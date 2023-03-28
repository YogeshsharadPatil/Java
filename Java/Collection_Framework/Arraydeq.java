package Collection_Framework;

import java.util.ArrayDeque;

public class Arraydeq {
    public static void main(String[] args) {
        //Arraydeque internally implements deque interface and 
        ArrayDeque dq = new ArrayDeque();
        dq.add(100);
        dq.add(200);
        dq.add(300);
        dq.addFirst("PW");
        dq.addLast("Skills");

        System.out.println(dq);

        dq.offer(1);
        dq.offerFirst(2);
        dq.offerLast(3);

        System.out.println(dq);


        // add and offer both do same work but by help of offer , there is no garranty that element will add definatly
    }
}
