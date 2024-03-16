package algo.back.basic;

import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/2309
 */

public class Solution3085 {
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
        new Solution1476().solve(heightSample);
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
        // 0 : 1,2,3,4,5,6
        //
        for(int i = 0; i< realSmallHeigth.length; i++){
            int result = 0;
            for(int k = i+1; k < realSmallHeigth.length-1; k++){
                result += height[k];
                if(result > 100){
                    break;
                }
            }
        }
        return null;
    }
}
/*
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                int sum = 0;
                for (int k=0; k<n; k++) {
                    if (i == k || j == k) continue;
                    sum += a[k];
                }
                if (sum == 100) {
                    for (int k=0; k<n; k++) {
                        if (i == k || j == k) continue;
                        System.out.println(a[k]);
                    }
                    System.exit(0);
                }
            }
        }
    }*/
