package algo.back.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2309
 */

public class Solution2309 {
    public static int[] height = new int[9];    // 일곱 난쟁이의 키

    public static int[] heightSample = {20,
            7,
            23,
            19,
            10,
            15,
            25,
            8,
            13,};

    public static void main(String[] args) {
/*        Scanner in = new Scanner(System.in);
        for (int i = 0; i < height.length; i++) {
            height[i] = in.nextInt();
        }*/
        new Solution2309().solve(heightSample);
    }

    public String solve(int[] height) {
        int[] realSmallHeigth = new int [7];

        /**
         * 첫번째 : 7명을 구해야 한다.
         * -> 0부터 7까지
         * n,n+1,n+2,n+3,n+4,n+5,n+6
         * 더하다가 100보다 크면 n+6을 n+7로 넘어간다
         * n은 heigthLength까지
         *
         */
        Arrays.sort(height);
        for(int i = 0; i< realSmallHeigth.length; i++){
            int result = 0;
            result += height[i];
            if(result > 100){
                break;
            }
            for(int k = i+1; k < realSmallHeigth.length; k++){
                result += height[k];
            }
        }
        return null;
    }
}
