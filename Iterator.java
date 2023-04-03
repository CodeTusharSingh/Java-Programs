import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class testIterator {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("T");
        c.add("U");
        c.add("S");
        c.add("H");
        c.add("A");
        c.add("R");
        Iterator<String> iter = c.iterator();
        iter.next();
        iter.remove();
        while (iter.hasNext()) {
            System.out.print(iter.next() + "");
        }
        System.out.println();
        List<Integer> a = new LinkedList<Integer>();
        a.add(8);
        a.add(86);
        a.add(82);
        a.add(48);
        a.add(98);
        Iterator<Integer> iter1 = a.iterator();
        while (iter1.hasNext()) {
            System.out.print(iter1.next() + " ");
        }
        System.out.println();
        ListIterator<Integer> iter2 = a.listIterator();
        System.out.println(iter2.next());
        System.out.println(iter2.next());
        System.out.println(iter2.next());
        iter2.add(39);
        System.out.println(iter2.previous());
        iter2.remove();
        while (iter2.hasNext()) {
            System.out.print(iter2.next() + " ");
        }
        System.out.println();
        while (iter2.hasPrevious()) {
            System.out.print(iter2.previous() + " ");
        }
        System.out.println();
        System.out.println(a.get(0));
    }
}