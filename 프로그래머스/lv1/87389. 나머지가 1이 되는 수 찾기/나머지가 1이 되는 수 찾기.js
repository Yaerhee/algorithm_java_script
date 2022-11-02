function solution(n) {
  let answer = 0;
  for (answer = 0; answer < n; answer++) {
      if (n % answer === 1) {
          return answer;
      }
  }
}