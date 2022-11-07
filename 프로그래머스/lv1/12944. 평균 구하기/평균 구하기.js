function solution(n) {
  let total = 0
  n.forEach(num => {
    total += num
  })

  return total / n.length
}