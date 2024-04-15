package algo.leet;

import java.util.Arrays;

public class Solution0422 {
    public static void main(String[] args) {
          int[] nums1 = {0, 1, 2, 2, 3, 0, 4, 2};
           int val = 2;

        //  int[] nums1 = {3, 2, 2, 3};
        //  int val = 3;

      // int[] nums1 = {3, 3};
      // int val = 3;

        var result = new Solution0422().removeElement(nums1, val);
        System.out.println(result);
    }

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public int removeElementMy(int[] nums, int val) {
        int k = 0;
        int lastIndex = nums.length - 1;
        int temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                if (lastIndex == i) {
                    k = lastIndex;
                    break;
                }
                for (; lastIndex >= i; lastIndex--) {
                    if (nums[lastIndex] != val) {
                        temp = nums[i];
                        nums[i] = nums[lastIndex];
                        nums[lastIndex] = temp;
                        break;
                    }
                }
            }
            if (lastIndex == 0) {
                lastIndex += 1;
            }
            k = lastIndex;
        }
        return k;
    }
}
