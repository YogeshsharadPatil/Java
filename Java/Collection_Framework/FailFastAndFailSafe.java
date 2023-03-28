package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndFailSafe {
    public static void main(String[] args) {
        // ArrayList al = new ArrayList();
        // al.add(100);
        // al.add(200);
        // al.add(300);
        // al.add(400);

        // for (int i = 0; i < al.size(); i++) {
        //     al.add(100);
        // }

        // Iterator itr = al.iterator();

        // while(itr.hasNext()){
        //     al.add(100);
        // }
       // AT the run time if u are modfying list then it goes for exception

       CopyOnWriteArrayList al1 = new CopyOnWriteArrayList();
       al1.add(100);
       al1.add(200);
       al1.add(300);
       al1.add(400);
     
       Iterator itr1 = al1.iterator();

       while(itr1.hasNext()){
        System.out.println(itr1.next());
        al1.add(100);
       }
          
    }
}
