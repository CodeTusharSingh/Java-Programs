import java.util.Arrays;

public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            char arr1[] = s.toCharArray();
            Arrays.sort(arr1);
            char arr2[] = t.toCharArray();
            Arrays.sort(arr2);
            if (new String(arr1).equals(new String(arr2))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "cat";
        String t = "car";
        Valid_Anagram va = new Valid_Anagram();
        System.out.println(va.isAnagram(s.toLowerCase(), t.toLowerCase()));

    }
}
