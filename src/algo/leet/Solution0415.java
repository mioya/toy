package algo.leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution0415 {
    public static void main(String[] args) {
        String s = "a.";
        //String s = "race a car";
        //String s = "A man, a plan, a canal: Panama";
        var result = new Solution0415().isPalindrome(s);
    }

    public boolean isPalindrome(String s) {
        boolean result = true;
        String tempS = s;
        tempS = tempS.replaceAll("[^a-zA-Z0-9]", "");
        tempS = tempS.toLowerCase();
        tempS = tempS.trim();
        char[] sChars = tempS.toCharArray();
        if(sChars.length == 1){
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
