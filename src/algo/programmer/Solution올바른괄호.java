package algo.programmer;

/**
 * Input :
 * Output :
 */

public class Solution올바른괄호 {
    public static void main(String[] args) {
        new Solution올바른괄호().solution("()()");
        new Solution올바른괄호().solution("(())()");
        new Solution올바른괄호().solution(")()("	);
        new Solution올바른괄호().solution("(()("	);
    }

    boolean solution(String s) {
        boolean answer = true;
        char openBrace = '(';
        char closeBrace = ')';
        int result = 0;
        for (char brace : s.toCharArray()) {
            if (brace == openBrace) {
                result++;
            } else if(result == 0 && brace == closeBrace){
                answer = false;
            } else{
                result--;
            }

            if(result < 0){
                answer = false;
            }
        }
        if(result !=0 ){
            answer = false;
        }
        return answer;
    }
}
