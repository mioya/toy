package algo.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution0421 {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0, n = 1;

//        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {2,5,6};
//        int m = 3, n = 3;

        new Solution0421().merge(nums1, m, nums2, n);
        //var result = new Solution0421().merge(nums1, m, nums2, n);
        //System.out.println(result);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = m + n - 1; i >= 0; i--) {

            if (m != 0 && (n == 0 || nums1[m - 1] > nums2[n - 1])) {
                nums1[i] = nums1[m - 1];
                m--;
            } else {
                nums1[i] = nums2[n - 1];
                n--;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
