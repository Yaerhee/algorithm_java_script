package Programmers.Hash;

import java.util.HashMap;

public class First {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        // 값을 담을 hashMap 에 순회하는 participant 값 담기
        // getOrDefault 를 통해 기존 값을 그대로 남겨둘 수 있음 (지정된 키로 매핑된 값이 없을 경우)
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);
        // player 에 대한 hm 에서 해당하는 값이 있을 경우 -1 처리

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) { // -1 처리에도 남아있는 key value 가 있으면 answer
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String returnSolution = solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        System.out.println(returnSolution);
    }
}
