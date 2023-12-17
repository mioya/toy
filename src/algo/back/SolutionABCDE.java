package algo.back;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.acmicpc.net/problem/13023
 * */

public class SolutionABCDE {
    public static int N;				// 사람수
    public static int M;  				// 친구 관계 수
    public static int[] operator = new int[4];	// 연산자 개수


    public static void main(String[] args) {
        N = 5;
        M = 4;

        int[][] xy = new int[N][N];
        List<int []> edge = new ArrayList<>();

//        Scanner in = new Scanner(System.in);
//        num = in.nextInt();
        new SolutionABCDE().solve("");
    }

    public String solve(String str) {
        return null;
    }
}
