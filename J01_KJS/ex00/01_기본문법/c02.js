// 변수의 종류

// 1. Number Type
let num1 = 1;

// 2. String Type
let str1 = 's';
num1 = "ss";

// 3. Boolean Type
const b1 = true;
let b2 = false;

// 4. Null Type
let empty = null; // /0
// console.log(empty);

// 5.Undefined Type
let none;

console.log(empty, none);

if(none == null){ // 값만 검사
  console.log(`none:${none}`);
}
if(none === null){ // 값 + 타입까지 같이 검사
  //console.log('none:' + none);
  console.log(`none:${none}`);
}