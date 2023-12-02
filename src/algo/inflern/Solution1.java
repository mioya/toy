package algo.inflern;

/*
 * Input 1 -> 2 -> 3
 *       8 -> 8 -> 8
 * Output: 1011
 *
 * 문자열처럼 생긴 음이 아닌 정수값 num1, num2
 * 문자열로 num1, num2 합을 return
 * */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(new Solution1().solve("123", "888"));
    }

    public String solve(String num1, String num2) {
        int carry = 0;
        StringBuilder result = new StringBuilder();
        int num1LastIndex = num1.length() - 1; //2
        int num2LastIndex = num2.length() - 1; //2

        while (num1LastIndex >= 0 || num2LastIndex >= 0) {
            int num1LastNum = num1.charAt(num1LastIndex) - '0';
            int num2LastNum = num2.charAt(num2LastIndex) - '0';

            int sum = num1LastNum + num2LastNum + carry;
            carry = sum / 10;
            result.append(sum % 10);

            num1LastIndex--;
            num2LastIndex--;
        }
        if (carry >= 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
