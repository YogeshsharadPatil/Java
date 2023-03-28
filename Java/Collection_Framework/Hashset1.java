package Collection_Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashset1 {
    public static void main(String[] args) {
        // Hash table works on the con the concept of hash table
        // it doesnot follow order of insertion
        // direct valu goes into the hash bucket
        // serching operation is fast here

        HashSet hs = new HashSet();
        hs.add(100);
        hs.add(200);
        hs.add(300);
        hs.add(400);
        hs.add(500);

        System.out.println(hs.contains(300));

        LinkedHashSet hs1 = new LinkedHashSet<>();
        hs1.add(100);
        hs1.add(200);
        hs1.add(300);
        hs1.add(400);
        hs1.add(500);
        
        System.out.println(hs1);
        
    }
}
