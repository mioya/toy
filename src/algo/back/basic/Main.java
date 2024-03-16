package algo.back.basic;

import java.util.Objects;
import java.util.Scanner;

//백준 제출시 package 제거
public class Main {
    public static int sample1 = 15;
    public static int K;
    public static int M;
    public static int N;
    public static int X;
    public static int Y;

    public static void main(String[] args) {
        new Main().solve(sample1);
        System.exit(0);
    }

    /**
     * https://www.acmicpc.net/problem/1748
     * @param sample1
     */
    public int solve(int sample1) {
        int result = 0;
        boolean w = true;
        //5 => 숫자가 1개 * 5개 => 1 * 5
        //15 => 숫자가 1개 * 9(10-1까지) + 숫자 2개 * 6
        //120 => 숫자가 1개 * 9(10-1까지) + 숫자 2개 * 90(100-10) + 숫자 3개 * 21 = 9 + 180 + 63 = 252

        // 1 * 10, 입력숫자 N
        // if(1 * 10 > N)  true  1 * N
        // if(1 * 10 > N)  false
        // if(1 * 10 * 10 > N)      true 1 * 9 + 2*(N-9)
        //if(1 * 10 * 10 * 10 > N)  true 1 * 9 + 2*(100-10) + 3*(N-99)
        int ten = 10;
        while (w){

            if(ten > N){
                result = 1 * N;
                w = false;
            }else if(ten * ten > N){
                result = 1 * ten-1 + 2*(N-9);
                w = false;
            }
        }
        System.out.println(result);
        return result;
    }
}
