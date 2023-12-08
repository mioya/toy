package algo.programmer;

import java.util.Arrays;

/**
 * Input :
 * Output :
 */

public class SolutionHash3 {
    public static void main(String[] args) {
        //f
        System.out.println(new SolutionHash3().solution(new String[]{"119", "97674223", "1195524421"}));
        //t
        System.out.println(new SolutionHash3().solution(new String[]{"123", "456", "789"}));
        //f
        System.out.println(new SolutionHash3().solution(new String[]{"12", "123", "1235", "567", "88"}));

    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int result = 0;
        Arrays.sort(phone_book);
        for (int index = 0; index < phone_book.length - 1; index++) {
            String beforePhone = phone_book[index];
            //123 > 12
            if (phone_book[index + 1].startsWith(beforePhone)) {
                return false;
            }
        }
        return true;
    }
}


/**
 * 시간 효율 통과 못함.
 * 숫자를 순서대로 정렬하는것과 사전적으로 정렬하는것을 생각을 못함.
 * ["119", "1291", "11951", "3456"] 이렇게 정렬되면 바로 다음것을 비교하면 안됨. (숫자정렬)
 * ["119", "11951", "1291", "3456"] (사전적 정렬하면 이렇게 정렬되서 바로 다음것만 비교하면됨)
 * <p>
 * <p>
 * <p>
 * 입력 배열을 사전순으로 정렬한 결과가 ["119", "1291", "2345", "3456"]라고 생각해 보겠습니다.
 * 이 경우에 배열 길이가 n이라면 총 n2 번 비교를 하게 됩니다. 그런데.. 잘 생각해보면 모든 쌍에 대해서 비교를 수행하지 않아도 됩니다.
 * 예를 들어 i = "119"와 j = "1291"을 비교한 후에 접두어가 아닌 경우 i = "119"와 j = "2345"를 비교할 필요가 있을까요?
 * 배열이 사전순으로 정렬되어 있기 때문에,
 * "1291"뒤에는 "119"로 시작하는 문자열이 올 수 없습니다(사전순 정렬의 의미에 따라 "119"로 시작하는 문자열끼리 뭉쳐있을 것이라고 생각해보면 됩니다).
 * 따라서 j = "1291"이후의 문자열에 "119"로 시작하는 문자열은 없으므로, i = "119"와 비교하는 부분은 불필요한 연산이 되지요.
 * <p>
 * 따라서, "119"가 "1291"의 접두어가 아니라면, 남아있는 비교 연산을 수행하지 않고 그냥 i = "1291"과 j = "2345"를 비교하는 부분으로
 * 건너뛰어도 됩니다(i = "1291"과 j = "119"를 비교하지 않아도 되는 이유 역시 마찬가지로,
 * 이미 이전에 비교를 했기 때문입니다. "119"와 "1291"을 비교하는 것은 "1291"과 "119"를 비교하는것과 같으니까요).
 * <p>
 * 위 내용을 정리하면, 결국 문자열을 사전순으로 정렬한 경우 서로 붙어있는 문자열끼리만 비교해보면 접두어인 경우를 찾을 수 있습니다.
 * 이 경우 붙어있는 문자열끼리만 비교하면 되므로, 전체 비교횟수는 n - 1번이 됩니다.
 */