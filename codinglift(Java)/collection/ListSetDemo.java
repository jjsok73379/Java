package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class ListSetDemo {

    public static void main(String[] args) {
        //ArrayList<Integer> A = new ArrayList<Integer>(); // 1 2 2 2 2 3
        Collection<Integer> A = new HashSet<Integer>(); // 1 2 3
        A.add(1);
        A.add(2);
        A.add(2);
        A.add(2);
        A.add(2);
        A.add(3);

        Iterator hi = A.iterator();
        while (hi.hasNext()) {
            System.out.println(hi.next());
        }
    }
}
