function solution(n) {
  const sortedStringArray = Array.from(String(n)).sort((a, b) => b - a)
  return Number(sortedStringArray.join(''))
}