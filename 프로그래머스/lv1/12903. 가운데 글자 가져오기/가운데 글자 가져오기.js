function solution(s) {
  let answer = ''
  const halfLength = s.length / 2
  const stringLengthIsEven = s.length % 2 === 0
  if (stringLengthIsEven) {
    answer = s.substring(halfLength -1, halfLength + 1)
  } else {
    answer = s.substring(halfLength, halfLength + 1)
  }
  return answer;
}