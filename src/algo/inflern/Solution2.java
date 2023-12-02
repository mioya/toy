package algo.inflern;

/**
 * Input : "in(f(lea)r)n)";
 * Output : "in(f(lea)r)n"
 * <p>
 * Input : "(a(b(c)d)"
 * Output : "(a(bc)d)"
 * <p>
 * Input : "a)b(c)d"
 * Output : "ab(c)d"
 * <p>
 * Input : "))(("
 * Output : ""
 * <p>
 * Input : ")()("
 * Output : ""
 * 최소 괄호의 수를 제거하여 유효한 parentheses string 리턴
 * 1. 빈 문자열이거나 소문자만 포함
 */

public class Solution2 {
    public static void main(String[] args) {
        new Solution2().solve("in(f(lea)r)n)");
        new Solution2().solve("(a(b(c)d)");
        new Solution2().solve("))((");

    }

    /**
     * 1. 처음에 '(' 나오면 braceCount++
     * 2. braceCount 0 인데(처음에 '('가 안나온 상황)  ')' 나오면 braceCount 그대로
     * -> 이렇게 하면 ) 이게 먼저 나오고 ( 이게 나오면 카운트가 안됨
     *
     * 2번 조건 지운다
     * 숫자로 몇개를 지울지 본다?
     * - 양수 : close 지우는 갯수
     * - 음수 : open 지우는 갯수
     * - 0 : 지우는것 없음 - "))((" 예시에서는 성립이 안되는데 지우는게 없음,
     *       근데 0이라 구분도 안됨. 지우고 나서 다시 검사해야하나
     */
    public String solve(String parentheses) {
        int openBrace = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (char pare : parentheses.toCharArray()) {
            if (pare == '(') {
                openBrace++;
            } else if (pare == ')') {
                if(openBrace == 0){
                    continue;
                }
                openBrace--;
            }
            sb.append(pare);
        }
        System.out.println("first step::" + sb);

        for (int i = sb.length() -1; i>=0; i--) {
            if(sb.charAt(i) == '(' && openBrace-- > 0) continue;
            result.append(sb.charAt(i));
        }
        System.out.println(result.reverse());
        return result.reverse().toString();
    }
}
