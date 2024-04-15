package algo.programmer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Input :
 * Output :
 */

public class SolutionLevel_1 {
    public static void main(String[] args) {
        var result = new SolutionLevel_1().longestCommonPrefix(new String[]{"dog","racecar","car"});

        System.out.println(result);
    }


    public String longestCommonPrefix(String[] strs) {
        char[] firstStr = strs[0].toCharArray();

        String result = new String();
        for (int i = 0; i < strs.length-1; i++) {
            char[] compare = strs[i+1].toCharArray();

            int forCnt = Math.min(firstStr.length, compare.length);

            for (int j = 0; j < forCnt; j++) {
                if (firstStr[j] == compare[j]) {
                    result += firstStr[j];
                } else {
                    break;
                }
            }
            firstStr = result.toCharArray();
            result = "";
        }
        return String.valueOf(firstStr);
    }


    /***
     * III
     * 첫번째 i 보고 +1, 두번째 i 보고 +1,세번째 i 보고 +1 해서 3
     *
     * LVIII
     * L = 50, V= 5, III = 3.
     *
     * MCMXCIV
     * M 보고 1000
     * C다음에 M이면 = 900 D면 500
     * X다음에 C = 90 L 이면 50
     * I다음에 V면 4, X면 9, I면 1
     */
    public int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        if (0 >= s.toCharArray().length - 1) {
            return romanMap.get(s.toCharArray());
        }
        for (int i = 0; i < s.toCharArray().length - 1; i++) {
            char firRoman = s.toCharArray()[i];
            char secRoman = s.toCharArray()[i + 1];

            if (romanMap.get(firRoman) < romanMap.get(secRoman)) {
                result -= romanMap.get(firRoman);
            } else {
                result += romanMap.get(firRoman);
            }
            if (i == s.toCharArray().length - 2) {
                result += romanMap.get(secRoman);
            }
        }
        return result;
    }

    public int[] twoSum(int[] nums, int target) {
        int dif = 0;
        int[] result = new int[1];
        HashMap<Integer, Integer> temp = new HashMap();
        // 처음 2 들어오면 dif =7, 7을 찾고 없으면 (2,0) 을 hash 에 넣음
        // 7 들어오면 dif = 2, 2를 찾고 있으니깐 2에 해당하는 index와 자신 index 빼서 리턴
        for (int i = 0; i < nums.length; i++) {
            dif = target - nums[i];
            if (temp.containsKey(dif)) {
                int firstIdx = temp.get(dif);
                int secIdx = i;
                result = new int[]{firstIdx, secIdx};
            }
            temp.put(nums[i], i);
        }
        return result;
    }

    // 빈병 a 개를 주면 콜라 b병을 돌려줌
    // 빈병 N 개
    public int solution(int a, int b, int n) {
        int payback = 0;
        int answer = 0;
        int times = 0;
        int remain = 0;
        // times = a개 줫을때 몇번 받을수 있는지
        // payback = 몇번 받는지 * 돌려받는 b 병 = 총 받는 빈병수
        // remain = 처음에 갯수 안되서 못준 병
        while (n / a != 0) {
            if (n % a != 0) {
                remain = n % a;
                n -= remain;
            }
            times = n / a;
            payback = times * b;
            n = remain + payback;
            remain = 0;
            answer += payback;
        }

        return answer;
    }
}
