function solution(phone_number) {
    let maskingNumber = '';
    let restNumberDigits = phone_number.length - 4
    let lastFourNumber = phone_number.slice(restNumberDigits)
    maskingNumber = lastFourNumber.padStart(phone_number.length, "*")
    return maskingNumber;
}