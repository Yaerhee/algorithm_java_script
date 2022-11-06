function solution(n) {
  let numArr = num => Number(num)
  let toNumArr = Array.from(String(n), numArr).reverse()
  return toNumArr.map(num => Number(num))
}