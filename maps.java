import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class maps {
    public static void main(String[] args) {
        Map<String, stackTest> kv = new HashMap<>();
        stackTest st = new stackTest(-1);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(10);
        kv.put("One", st);
        System.out.println(kv.get("One"));
        Set<String> key = kv.keySet();
        for (String x : key) {
            System.out.println(x);
        }
        Collection<stackTest> value = kv.values();
        for (stackTest x : value) {
            System.out.println(x);
        }
        for (Map.Entry<String, stackTest> entry : kv.entrySet()) {
            System.out.println(entry);
        }
    }
}
