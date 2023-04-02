import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(5);
        hs.add(45);
        hs.add(85);
        hs.add(35);
        hs.add(15);
        System.out.println(hs.hashCode());
        System.out.println(hs.contains(35));
        System.out.println(hs.getClass());
        Iterator<Integer> iter = hs.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
