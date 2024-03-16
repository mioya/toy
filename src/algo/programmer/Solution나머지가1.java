package algo.programmer;

/**
 * Input :
 * Output :
 */

public class Solution나머지가1 {
    public static void main(String[] args) {
        System.out.println(new Solution나머지가1().solution(3));
    }
//        return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
