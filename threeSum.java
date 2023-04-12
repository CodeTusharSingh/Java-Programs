import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class threeSum {
    static public List<List<Integer>> ThreeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr_copy = new ArrayList<>();
        if (nums.length < 3) {
            return ls;
        } else if (nums.length == 3) {
            if (nums[0] + nums[1] + nums[2] == 0) {
                arr.add(nums[0]);
                arr.add(nums[1]);
                arr.add(nums[2]);
                ls.add(arr);
                return ls;
            } else {
                return ls;
            }
        } else {
            int chk = 0;
            int chk1 = chk + 1;
            int chk2 = chk1 + 1;
            int sum = 0;
            while (chk != nums.length - 2) {
                arr.add(nums[chk]);
                chk1 = chk + 1;
                while (chk1 != nums.length - 1) {
                    arr.add(nums[chk1]);
                    chk2 = chk1 + 1;
                    while (chk2 != nums.length) {
                        arr.add(nums[chk2]);
                        for (Integer x : arr) {
                            sum += x;
                        }
                        if (sum == 0) {
                            arr_copy = (ArrayList<Integer>) arr.clone();
                            Collections.sort(arr_copy);
                            ls.add(arr_copy);
                        }
                        arr.remove(2);
                        sum = 0;
                        chk2++;
                    }
                    arr.remove(1);
                    chk1++;
                }
                arr.remove(0);
                chk++;
            }

        }
        Set<List<Integer>> set1 = new HashSet<>(ls);
        ls.clear();
        ls.addAll(set1);
        return ls;
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum.ThreeSum(nums));

    }
}
