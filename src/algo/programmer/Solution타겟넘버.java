package algo.programmer;

/**
 * Input :
 * Output :
 * */

public class Solution타겟넘버 {
    public static void main(String[] args) {
        System.out.println(new Solution타겟넘버().solution(new int[]{1,1,1,1,1}, 3));
        //System.out.println(new Solution타겟넘버().solution(new int[]{1,1,1,1,1}, 5));
    }

    public int solution(int[] numbers, int target) {
        int answer = 0;
        for(int number : numbers){
            dfs(number, 1);
        }
        return answer;
    }

    public static void dfs(int num, int idx) {

    }

}
