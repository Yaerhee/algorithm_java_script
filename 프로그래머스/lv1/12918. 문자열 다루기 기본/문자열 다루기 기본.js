function solution(s) {
  let answer = false;
  if (s.length === 4 || s.length === 6) {
    return s.split('').every(item => {
      return !isNaN(Number(item)) 
    })
  } else {
    return answer;
  }
}