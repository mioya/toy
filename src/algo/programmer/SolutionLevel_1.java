package algo.programmer;

/**
 * Input :
 * Output :
 */

public class SolutionLevel_1 {
    public static void main(String[] args) {
        var result = new SolutionLevel_1().solution(3,1,20);
        System.out.println(result);
    }
    // 빈병 a 개를 주면 콜라 b병을 돌려줌
    // 빈병 N 개
    public int solution(int a, int b, int n) {
        int payback = 0;
        int answer = 0;
        int times = 0;
        int remain = 0;
        // times = a개 줫을때 몇번 받을수 있는지
        // payback = 몇번 받는지 * 돌려받는 b 병 = 총 받는 빈병수
        // remain = 처음에 갯수 안되서 못준 병
        while (n/a != 0){
            if (n % a != 0) {
                remain = n % a;
                n -= remain;
            }
            times = n / a;
            payback = times * b;
            n = remain + payback;
            remain = 0;
            answer += payback;
        }

        return answer;
    }
}
