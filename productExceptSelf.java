public class productExceptSelf {
    static int[] Product_Except_Self(int nums[]) {
        int ans[] = new int[nums.length];
        // int i = 0;
        int s = 1;
        // int count = 0;
        // int k = 0;
        // while (i < nums.length) {
        // if (count == k) {
        // i++;
        // count++;
        // ans[k] = s;
        // } else {
        // s *= nums[i];
        // count++;
        // i++;
        // if (count == nums.length) {
        // ans[k] = s;
        // k++;
        // i = 0;
        // count = 0;
        // s = 1;
        // }
        // }
        // }
        int zcount = 0;
        int zindex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                s *= nums[i];
            } else {
                zcount++;
                zindex = i;
            }
        }
        if (zcount >= 2) {
            for (int i = 0; i < nums.length; i++) {
                ans[i] = 0;
            }
        } else if (zcount == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (zindex == i) {
                    ans[i] = s;
                } else {
                    ans[i] = 0;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                ans[i] = s / nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(ans[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 1, 0, -3, 3 };
        productExceptSelf.Product_Except_Self(arr);
    }
}
