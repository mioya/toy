package algo.util;

import java.util.Stack;

/**
 * Input :
 * Output :
 * */

public class SolutionUtil {
    public static int[] calculateSum(Stack<Integer> stack) {
        int size = stack.size();
        int[] answer = new int[size];

        // 스택의 요소를 배열로 복사
        for (int i = size - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}
