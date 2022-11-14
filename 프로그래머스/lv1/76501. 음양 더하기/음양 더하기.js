function solution(absolutes, signs) {
  let answer = 0
  absolutes.forEach((num, idx) => {
    answer += num * (signs[idx] ? 1 : -1)
  })
  return answer
}