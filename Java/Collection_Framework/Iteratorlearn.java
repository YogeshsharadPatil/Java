package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteratorlearn {
    public static void main(String[] args) {
        // Iterator is one of the most important concept in Java
        // Because some of the collection doesnt allow to index based accessing
        
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);
        ar.add(400);

        // for (int i = 0; i < ar.size(); i++) {
        //     // Object o =  ar.get(i);
        //     // System.out.println(o);
        //     System.out.println(ar.get(i));
        // }

        // for each

        // for ( Object o: ar) {
        //     System.out.println(o);
        // }

        // Iterator is alloweed in every collection
        // itr has two methods .hasnext() , next()

         // At the beginning itr(cursor) will point to
        // index just before the first element in al
        Iterator itr = ar.iterator();

        // while(itr.hasNext()){
        //     itr.next();                // collection store the data in the form of object// if u want to convert in Integer then down cast it
        //    // Integer i = (Integer)itr.next();
        // //    System.out.println(i);
        //     System.out.println( itr.next());
        // }


        ListIterator lsi = ar.listIterator(ar.size());
        // list iterator is applicabble on list type i.e. Arraylist and LinkedList
        // we can traverse in both the ways

        while(lsi.hasPrevious()){
            System.out.println(lsi.previous());
        }


      

       









    }
}
