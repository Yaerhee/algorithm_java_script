function solution(n) {
  let answer = 0
  let sqrtNum = Math.sqrt(n)
  if (Number.isInteger(sqrtNum)) {
    answer = Math.pow(sqrtNum + 1, 2)
  } else {
    answer = -1
  }
  return answer;
}
