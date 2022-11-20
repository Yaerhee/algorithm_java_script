function solution(num) {
  var answer = 0;

  let numAfterCal = num;
  let calCount = 0;
  while(numAfterCal !== 1) {
    if (numAfterCal % 2 === 0) {
      numAfterCal = numAfterCal / 2
    } else {
      numAfterCal = numAfterCal * 3 + 1
    }
    calCount += 1
  }

  if (calCount < 500 && numAfterCal === 1) {
    answer = calCount
  } else {
    answer = -1
  }

  return answer;
}