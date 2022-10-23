function solution(numbers) {
    let rangeArray = Array.from(new Array(9), (x, i) => i + 1)
    let exceptArray = rangeArray.filter(arr => !numbers.includes(arr))
    let exceptSum = exceptArray.reduce((sum, a) => sum + a, 0)

    return exceptSum;
}