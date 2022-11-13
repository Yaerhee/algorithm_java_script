function solution(arr) {
  let answer = []
  if (arr.length <= 1) {
    answer.push(-1)
  } else {
    let minNum = Math.min(...arr)
    answer = arr.filter(num => num !== minNum)
  }
  return answer
}
