function solution(A,B){
  var answer = 0;

  let arrayLength = A.length;
  let newArr1 = A.sort((a, b) => a-b)
  let newArr2 = B.sort((a, b) => b-a)
  for (let i = 0; i < arrayLength; i++) {
    answer += newArr1[i] * newArr2[i]
  }

  return answer;
}