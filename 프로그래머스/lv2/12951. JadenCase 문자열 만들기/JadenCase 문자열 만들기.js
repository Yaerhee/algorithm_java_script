function solution(s) {
  let answer = []
  let wordsArray = s.split(' ')
  wordsArray.forEach((arr, idx) => {
    let firstCharacter = arr.charAt(0).toUpperCase()
    let restCharacters = arr.slice(1).toLowerCase()
    answer[idx] = firstCharacter + restCharacters
  })
  return answer.join(' ');
}