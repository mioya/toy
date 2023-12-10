package algo.programmer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Input :
 * Output :
 */

public class Solution기능개발 {
    public static void main(String[] args) {
     //   new Solution기능개발().solution(new int[]{50}, new int[]{20});
        new Solution기능개발().solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        new Solution기능개발().solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
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
