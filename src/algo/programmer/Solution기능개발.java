package algo.programmer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Input :
 * Output :
 */

public class Solution기능개발 {
    public static void main(String[] args) {
     //   new Solution기능개발().solution(new int[]{50}, new int[]{20});
       // new Solution기능개발().solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        new Solution기능개발().solution정답(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
    }
    /**
     * days - 현재까지의 작업 중에서 가장 많은 일수
     * count - 작업 수
     * remain - i번째 작업일수
     *
     * 1. i번째 작업일수 구한다.
     * 2. 현재 일자는 0일로 세팅
     * 3.1 작업일수 > 현재일자 -> 기존작업이 더 작음
     *      작업수 > 0         -> 작업수를 더한다
     *          현재까지의 작업 중에서 가장 많은 일수에 작업일수를 넣는다
     *      작업수 =< 0        -> 초기값이거나
     *
     * 3.2 작업일수 < 현재일자
     *      작업수를 1 추가한다 -> 기존작업이 더 큰거니깐 작업수 추가
     *
     */
    public int[] solution정답(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();

        int days = 0;
        int count = 0;


        for (int i = 0; i < progresses.length; i++) {
            int remain = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);

            if (remain > days) {
                if (count > 0) {
                    answerList.add(count);
                    count = 0;
                }
                days = remain;
            }

            count++;
        }

        answerList.add(count);

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int remainProgress;
        int biggestFinishDay = 0;
        int remainProgressCnt = 0;
        Stack<Integer> result = new Stack<>();

        for (int i = 0; i < progresses.length; i++) {
            int finishDay;
            remainProgress = 100 - progresses[i];
            finishDay = remainProgress / speeds[i];
            if(remainProgress % speeds[i] != 0){
                finishDay ++;
            }
            // finishDay - 7, 3, 9

            //일정 초기화 되고 처음
            if(biggestFinishDay == 0){
                biggestFinishDay = finishDay;
                remainProgressCnt++;
                continue;
            }
            // 기존 값 7일 > 새로작업값 3일
            // progressCnt 올린다
            if(biggestFinishDay >= finishDay){
                remainProgressCnt++;
            } else if(i == progresses.length-1 && biggestFinishDay < finishDay){
                result.push(remainProgressCnt);
                result.push(1);
            } else {
                // 기존 값 3일 < 새로작업값 4일
                // progressCnt 초기화
                // biggestFinishDay 값 세팅 finishDay

                // 마지막 건인데 1건이면? 추가가 안된다.
                // for 빠져 나와서 확인해야함 근데 변수가 없어서 확인이 불가능
                // stack integer -> map 으로 바꾼다
                result.push(remainProgressCnt);
                remainProgressCnt = 0;
                biggestFinishDay = finishDay;
            }

        }
        System.out.println(result);
        return answer;
    }
}
