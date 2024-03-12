package algo.back.basic;

import java.util.Objects;
import java.util.Scanner;


public class Solution1476 {
    //public static int[] sample1 = {1, 16, 16};
    //public static int[] sample1 = {1, 1, 1};
    //public static int[] sample1 = {1, 2, 3};
    //public static int[] sample1 = {15, 28, 19};
    public static int[] sample1 = new int[3];
    public static int E = 15;
    public static int S = 28;
    public static int M = 19;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < sample1.length; i++) {
            sample1[i] = in.nextInt();
        }
        System.out.println(new Solution1476().solve(sample1));
        System.exit(0);
    }
    /**
     * https://www.acmicpc.net/problem/1476
     */
    public int solve(int[] esm) {
        int result = 0;
        int e = 0, s = 0, m = 0;

        boolean index = true;

        while (index) {
            e++;
            s++;
            m++;
            result++;

            if (e > E) {
                e = 1;
            }
            if (s > S) {
                s = 1;
            }
            if (m > M) {
                m = 1;
            }
            if (Objects.equals(e, esm[0]) && Objects.equals(s, esm[1]) && Objects.equals(m, esm[2])) {
                index = false;
            }
        }
        return result;
    }
}
