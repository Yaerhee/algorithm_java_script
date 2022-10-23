function solution(s) {
    let spacingNumbersToArray = s.split(" ").map(arr => Number(arr))
    let maxValue = String(Math.max.apply(Math, spacingNumbersToArray))
    let minValue = String(Math.min.apply(Math, spacingNumbersToArray))
    
    return `${minValue} ${maxValue}`;
}