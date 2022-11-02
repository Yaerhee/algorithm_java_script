function solution(n) {
  let numberToArray = n.toString().split('')
  let answer = 0
  numberToArray.map(num => answer += Number(num))
    return answer;
}