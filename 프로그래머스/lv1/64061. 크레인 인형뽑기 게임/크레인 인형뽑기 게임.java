import java.util.List;
import java.util.Stack;
import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> picks = new Stack<Integer>();
        

        for (int i = 0; i < moves.length; i++) {
            for (int[] arr: board) {
                int num = 0;
                num = arr[moves[i]-1]; // moves의 각 숫자를 index로 변환
                if (num != 0) {
                    picks.push(num);
                    arr[moves[i]-1] = 0;
                    
                    for (int j = 0; j < picks.size(); j++) {
                        if (j > 0 && picks.get(j).equals(picks.get(j-1))) {
                            picks.pop();
                            picks.pop();
                            answer += 2;
                        }
                    }
                    break;
                }
            }
        }

//         List<Integer> pickList = Arrays.stream(pick).boxed().collect(Collectors.toList()); // pick 배열을 List 로 변환하여 remove 할 수 있도록 함

//         for (int index: pick) {
//             for (int i = 0; i+1 < pick.length; i++) {
//                 if (i+1 < pickList.size()) {
//                    if (pickList.get(i + 1).equals(pickList.get(i))) {
//                     pickList.subList(i, i + 2).clear();
//                     answer += 2;
//                     } 
//                 }
//             }
//         }
        
        return answer;
    }
}