package algo.back;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/13458
 *
 * 총감독관 - B 명(1명)
 * 부감독관 - C 명(여러명)
 *
 *
 * */

public class Solution시험감독 {
    // 시험장갯수
    public static int N;
    // 각 시험장에 있는 응시자의 수 Ai
    public static int[] Ai;

    // 총감독관 - B
    public static int B;
    // 부감독관 - C
    public static int C;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        Ai = new int[N];
        for (int i = 0; i < N; i++) {
            Ai[i] = in.nextInt();
        }
        B = in.nextInt();
        C = in.nextInt();
        new Solution시험감독().solve(Ai, B, C);
    }

    public long solve(int[] examUserCnt, int mainMon, int subMon) {
        long totalMon = 0;
        for(int examUser : examUserCnt){
            int remainUser = examUser - mainMon;
            totalMon++;
            if(remainUser <= 0){
                continue;
            }

            int requireSubMon = remainUser / subMon;
            int remainExamUser = remainUser % subMon;

            if(remainExamUser > 0){
                requireSubMon++;
            }

            totalMon += requireSubMon;
        }
        System.out.println(totalMon);
        return totalMon;
    }
}
