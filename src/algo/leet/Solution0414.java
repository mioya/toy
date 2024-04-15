package algo.leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution0414 {
    public static void main(String[] args) {
        //String s = "egg", t = "add";
        //String s = "foo", t = "bar";
        //String s = "paper", t = "title";
        //String s = "egcd", t = "adfd";
        //String s = "bbbaaaba", t = "aaabbbba";
        String s = "badc", t = "baba";
        var result = new Solution0414().isIsomorphic(s, t);
    }

    public boolean isIsomorphic(String s, String t) {
        boolean result = true;
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        HashMap<Character, Character> tmap = new HashMap<>();
        HashMap<Character, Character> smap = new HashMap<>();
        for (int i = 0; i < sCharArray.length; i++) {
            if(!tmap.containsKey(sCharArray[i])){
                tmap.put(sCharArray[i], tCharArray[i]);
            }else if(tmap.get(sCharArray[i]) != tCharArray[i]){
                result = false;
                break;
            }

            if(!smap.containsKey(tCharArray[i])){
                smap.put(tCharArray[i], sCharArray[i]);
            }else if(smap.get(tCharArray[i]) != sCharArray[i]){
                result = false;
                break;
            }
        }
        System.out.println(result);
        return result;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        //        String ransomNote1 = "bg";
        //        String magazine1 = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
        //
        //        String ransomNote2 = "a";
        //        String magazine2 = "b";
        //
        //        String ransomNote3 = "aaaabbb";
        //        String magazine3 = "aaaabb";
        //
        //        String ransomNote4 = "aa";
        //        String magazine4 = "aba";
        //        //var result4 = new Solution0414().canConstruct(ransomNote4, magazine4);
        //        var result = new Solution0414().canConstruct(ransomNote1, magazine1);
        //        var result2 = new Solution0414().canConstruct(ransomNote2, magazine2);
        //        //var result2 = new Solution0414().canConstruct(ransomNote3, magazine3);
        //magazine 으로 ransomNote 만들수 있는지
        // ransomNote 가 더 커야함

        boolean result = true;
        char[] magChars = magazine.toCharArray();
        char[] ranChars = ransomNote.toCharArray();

        HashMap<Character, Integer> magMap = new HashMap();
        for (char magChar : magChars) {
            if (magMap.containsKey(magChar)) {
                magMap.put(magChar, magMap.get(magChar) + 1);
            } else {
                magMap.put(magChar, 1);
            }
        }

        HashMap<Character, Integer> rangMap = new HashMap();
        for (char ranChar : ranChars) {
            if (rangMap.containsKey(ranChar)) {
                rangMap.put(ranChar, rangMap.get(ranChar) + 1);
            } else {
                rangMap.put(ranChar, 1);
            }
        }

        for (Character ran : rangMap.keySet()) {
            if (!magMap.containsKey(ran) || (magMap.get(ran) < rangMap.get(ran))) {
                result = false;
                break;
            }
        }
        System.out.println(result);
        return result;
    }

    public int strStr(String haystack, String needle) {
        //        String haystack1 = "sadbutsad";
        //        String needle1 = "sad";
        //
        //        String haystack2 = "leetcode";
        //        String needle2 = "leeto";
        //        var result = new Solution0414().strStr(haystack1, needle1);
        //        var result1 = new Solution0414().strStr(haystack2, needle2);
        int result = 0;
        result = haystack.indexOf(needle);
        System.out.println(result);
        return result;
    }

    public int maxProfit(int[] prices) {
        //        int[] nums = {7, 1, 5, 3, 6, 4};
        //        int[] nums1 = {7, 6, 4, 3, 1};
        //
        //        int[] nums2 = {3, 10, 1, 4, 5, 4};
        //        var result = new Solution0414().maxProfit(nums2);
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        System.out.println(profit);
        return profit;
    }

    public int majorityElement(int[] nums) {
        //        int[] nums = {3, 2, 3};
        //        int[] nums1 = {2, 2, 1, 1, 1, 2, 2};
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }

            if (map.get(nums[i]) > nums.length / 2) {
                result = nums[i];
                break;
            }
        }
        System.out.println(result);
        return result;
    }

    //        String s = "   fly me   to   the moon  ";
//        String s1 = "Hello World";
//        String s2 = "luffy is still joyboy";
    public int lengthOfLastWord(String s) {
        int result = 0;
        String[] split = s.split(" ");

        for (int i = split.length; i >= 0; i--) {
            if (split[i - 1].length() != 0) {
                result = split[i - 1].length();
                break;
            }
        }
        System.out.println(result);
        return result;
    }

    //       int[] nums0 = {1, 2, 2, 2, 3, 3};
//        int[] nums1 = {1, 1, 1, 2, 2, 3};
//        int[] nums2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
    public int removeDuplicates(int[] nums) {
        int position = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                count = 1;
            } else {
                count++;
            }
            if (count <= 2) {
                System.out.println(position);
                nums[position++] = nums[i];
            }
        }

        return position;
    }

    int removeDuplicatesmy(int[] nums) {
        int count = 0;
        int pre = -1;
        for (int i = 1; i < nums.length; i++) {
            if (pre == nums[i - 1]) {
                System.out.println("pre:" + pre);
            } else {
                if (nums[i - 1] == nums[i]) {//같아
                    pre = nums[i - 1];
                    i++;
                } else {

                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length;
    }

    /**
     * int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
     * int[] nums2 = {1, 1, 2};
     */
    public int removeDuplicates1(int[] nums) {
        int count = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                nums[count] = nums[i];
                set.add(nums[i]);
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
}
