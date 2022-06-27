import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> picks = new Stack<Integer>();  // Stack import하여 활용

        for (int i = 0; i < moves.length; i++) { // moves의 길이만큼 순회
            for (int[] arr: board) {
                int num = 0;
                num = arr[moves[i]-1]; // moves의 각 숫자를 index로 변환
                if (num != 0) {
                    picks.push(num); // moves가 지정하는 arr의 index 값을 picks에 push
                    arr[moves[i]-1] = 0; // pick 한 num은 0으로 주입(0은 선택되지 않음)

                    // picks가 업데이트 될 때마다 size 만큼 스택 순회
                    for (int j = 0; j < picks.size(); j++) {
                        if (j > 0 && picks.get(j).equals(picks.get(j-1))) {
                            picks.pop(); // picks의 두 값이 같을 경우 두 번 pop
                            picks.pop();
                            answer += 2; // 두 번 pop 하는 만큼의 숫자 차감
                        }
                    }
                    break;
                }
            }
        }

        return answer;
    }
}