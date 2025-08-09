// 형변환

// 1. 묵시적 변환
let num = 10;
let str = "20";

const result = num + str;

console.log(`result : ${result}`);

// 2. 명시적 변환
const result1 = num + Number(str);
console.log(`result1 : ${result1}`);

let str3 = "10";
let str4 = "103개1200";

console.log(Number(str3));
console.log(Number(str4));

console.log(parseInt(str3));
console.log(parseInt(str4));

let num1 = 10;
let numToStr = String(num1);

console.log(typeof numToStr);