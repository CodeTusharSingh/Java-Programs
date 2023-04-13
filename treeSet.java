import java.util.SortedSet;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        SortedSet<Integer> ts = new TreeSet<>();
        ts.add(74);
        ts.add(7);
        ts.add(84);
        ts.add(94);
        ts.add(4);
        for (Integer x : ts) {
            System.out.println(x);
        }
    }
}
