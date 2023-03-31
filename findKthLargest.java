import java.util.ArrayList;
import java.util.Collections;

public class findKthLargest {
    public static int find_Kth_Largest(int[] nums, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }
        Collections.sort(arr);
        return arr.get((nums.length - k));
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 5, 6, 4 };
        System.out.println(findKthLargest.find_Kth_Largest(arr, 2));

    }
}
