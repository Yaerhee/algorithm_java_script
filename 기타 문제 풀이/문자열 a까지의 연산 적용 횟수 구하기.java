//

class Solution {
    public static int solution(String s) {
        int answer = 0;

//        String newS = s;

        while (!s.equals("a")) {
            s = s.replace("aa", "a");
            System.out.println(s);

            String[] sArr = s.split("");
            for (int i = 0; i+1 < sArr.length; i++) {
                if (i > 1 && sArr[i].equals("a")) {
                    sArr[i-1] = "a";
                    sArr[i+1] = "a";
//                    System.out.println(sArr[i]);
                }
            }

            answer += 1;
            System.out.println(answer);
        }

        return answer;
    }
}