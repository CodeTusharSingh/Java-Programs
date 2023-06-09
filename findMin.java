public class findMin {
    public static int Min(int nums[], int k) {
        int min;
        int low = 0;
        int high = nums.length - 1;
        if (nums[high] == k) {
            return high;
        } else if (nums[0] == k) {
            return 0;
        }
        if (nums.length == 1) {
            if (nums[0] == k) {
                return 0;
            } else {
                return -1;
            }
        } else {
            if (nums[(low + high) / 2] < nums[((low + high) / 2) + 1]
                    && nums[(low + high) / 2] < nums[high]) {
                min = (low + high) / 2;
                high = (low + high) / 2;
                low = 0;
                if (nums[min] == k) {
                    return min;
                }
                while (low < high) {
                    if (nums[(low + high) / 2] < nums[((low + high) / 2) + 1] && nums[(low + high) / 2] < nums[high]) {
                        min = (low + high) / 2;
                        high = min;
                        if (nums[min] == k) {
                            return min;
                        } else if (nums[low] == k) {
                            return low;
                        }
                    } else {
                        min = ((low + high) / 2) + 1;
                        low = min;
                        if (nums[min] == k) {
                            return min;
                        } else if (nums[high] == k) {
                            return high;
                        }
                    }
                }
                for (int i = min + 1; i < nums.length; i++) {
                    if (nums[i] == k) {
                        return i;
                    }
                }
                for (int i = 1; i < min; i++) {
                    if (nums[i] == k) {
                        return i;
                    }
                }
                return -1;
            } else {
                min = ((low + high) / 2) + 1;
                high = nums.length - 1;
                low = min;
                if (nums[min] == k) {
                    return min;
                }
                while (low < high) {
                    if (nums[(low + high) / 2] < nums[((low + high) / 2) + 1] && nums[(low + high) / 2] < nums[high]) {
                        min = (low + high) / 2;
                        high = min;
                        if (nums[min] == k) {
                            return min;
                        } else if (nums[low] == k) {
                            return low;
                        }
                    } else {
                        min = ((low + high) / 2) + 1;
                        low = min;
                        if (nums[min] == k) {
                            return min;
                        } else if (nums[high] == k) {
                            return high;
                        }
                    }
                }
                for (int i = min + 1; i < nums.length; i++) {
                    if (nums[i] == k) {
                        return i;
                    }
                }
                for (int i = 1; i < min; i++) {
                    if (nums[i] == k) {
                        return i;
                    }
                }
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        System.out.println(findMin.Min(arr, 8));
    }
}