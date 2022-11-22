function solution(a, b) {
  let answer = 0;
  if (a.length === b.length) {
    for (let i = 0; i < a.length; i++) {
      answer += a[i] * b[i]
    }
  }
  return answer;
}