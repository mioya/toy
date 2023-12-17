package algo.back;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.acmicpc.net/problem/2606
 * */

public class Solution바이러스 {
    public static int edgeCnt;  				// 간선 수
    public static int N;						// 컴퓨터 개수

    public static int[] operator = new int[4];	// 연산자 개수


    public static void main(String[] args) {
        N = 7;
        edgeCnt = 6;
        int[][] xy = new int[N][N];
        List<int []> edge = new ArrayList<>();

//        Scanner in = new Scanner(System.in);
//        num = in.nextInt();
        new Solution바이러스().solve("");
    }

    public String solve(String str) {
        return null;
    }
}
