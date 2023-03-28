package Collection_Framework;

import java.util.Deque;
import java.util.LinkedList;

public class Linkedlst {
    public static void main(String[] args) {
        LinkedList lst = new LinkedList();
        //Deque lst = new LinkedList();
        // Linked list have all the methods of Arraylist And deque
        // we can add from the front and from the back also
        // follows doubly linked list data structure
        // it implements list and dequee interface

        lst.add(100);
        lst.add(200);
        lst.add(300);
        lst.add(300);


        lst.addFirst("PW");
        lst.addLast("Skills");

        lst.peek();
        System.out.println(lst);

        // lst.poll();
        // System.out.println(lst);

        System.out.println(lst.get(2));
        System.out.println(lst.getFirst());
        System.out.println(lst.getLast());
        System.out.println("index if 300: "+lst.indexOf(300));
        System.out.println("last index of 300: "+lst.lastIndexOf(300));






        
    }
}
