package algo.leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution0415 {
    public static void main(String[] args) {
        //t ff
        //String pattern = "abba", s = "dog cat cat dog";
        //String pattern = "abba", s = "dog cat cat fish";
        String pattern = "aaaa", s = "dog cat cat dog";


        var result = new Solution0415().wordPattern(pattern, s);
    }

    public boolean wordPattern(String pattern, String s) {
        boolean result = true;
        char[] patterns = pattern.toCharArray();
        String[] sStrings = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();

        if(patterns.length != sStrings.length){
            result = false;
            return result;
        }

        for(int i = 0; i< sStrings.length; i++){
            if(!map.containsKey(patterns[i])){
                if(map.containsValue(sStrings[i])){
                    result = false;
                    break;
                }
                map.put(patterns[i], sStrings[i]);
            }else {
                if(!sStrings[i].equals(map.get(patterns[i]))){
                    result = false;
                    break;
                }
            }
        }
        System.out.println(result);
        return result;
    }
    public boolean isSubsequence(String s, String t) {
        //        //String s = "abc", t = "ahbgdc";
        //        //String s = "axc", t = "ahbgdc";
        //        String s = "acb", t = "ahbgdc";
        //       // String s = "aaaaaa", t = "bbaaaa";
        boolean result = true;
        char[] sArrays = s.toCharArray();
        char[] tArrays = t.toCharArray();
        if (s.isBlank()) {
            return true;
        }
        int k = 0;
        for (int i = 0; i < sArrays.length; i++) {
            for (int j = k; j < tArrays.length; j++) {
                if (sArrays[i] == tArrays[j]) {
                    k = j + 1;
                    break;
                }
                if (j == (tArrays.length - 1) && sArrays[i] != tArrays[k]) {
                    result = false;
                    break;
                }
            }
            if (i == sArrays.length - 1) {

            }
        }
        System.out.println(result);
        return result;
    }

    public boolean isPalindrome(String s) {
        //String s = "a.";
        //        //String s = "race a car";
        //        //String s = "A man, a plan, a canal: Panama";
        boolean result = true;
        String tempS = s;
        tempS = tempS.replaceAll("[^a-zA-Z0-9]", "");
        tempS = tempS.toLowerCase();
        tempS = tempS.trim();
        char[] sChars = tempS.toCharArray();
        if (sChars.length == 1) {
            return result;
        }
        for (int i = 0; i < sChars.length / 2; i++) {
            if (sChars[i] != sChars[sChars.length - i - 1]) {
                result = false;
                break;
            }
        }
        System.out.println(tempS);
        System.out.println(result);
        return result;
    }
}
