function solution(s) {
  let pCount = 0
  let yCount = 0
  Array.from(s).forEach(char => {
    if ((char === 'p') || (char === 'P')) {
      pCount += 1
    } else if ((char === 'y') || (char === 'Y')) {
      yCount += 1
    }
  })
  
  return pCount === yCount
}