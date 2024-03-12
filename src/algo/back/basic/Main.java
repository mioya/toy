package algo.back.basic;

import java.util.Scanner;

public class Main {
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
     * https://www.acmicpc.net/problem/6064
     */
    public int solve(int[] esm) {
        int result = 0;

        return result;
    }
}
