class Solution {
    public int solution(String s) {
        int answer = 0;

        String[] sArray = s.split("");
        int ifMinus = s.contains("-") ? -1 : 1;

        int digits = 1;
        for (int i = 0; i < sArray.length; i++) {
            if (!sArray[i].equals("-") && !sArray[i].equals("+")) {
                digits *= 10;
            }
        }

        for (int i = 0; i < sArray.length; i++) {
            if (!sArray[i].equals("-") && !sArray[i].equals("+")) {
                digits /= 10;
                answer += Integer.parseInt(sArray[i]) * digits;
            }
        }

        return answer * ifMinus;

    }
}