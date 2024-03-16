package algo.programmer;

/**
 * Input :
 * Output :
 */

public class Solution자릿수더하기 {
    public static void main(String[] args) {
        System.out.println(new Solution자릿수더하기().solution(987));
    }

    //자릿수더하기
    public int solution(int n) {
        int answer = 0;
        while (n != 0) {
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }
}
