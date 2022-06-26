class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        String[] numArr = String.valueOf(x).split("");
        int total = 0;
        for (int i = 0; i < numArr.length; i++) {
            total += Integer.parseInt(numArr[i]);
        }
        
        if (x % total == 0) {
            answer = true;
        }
        
        return answer;
    }
}