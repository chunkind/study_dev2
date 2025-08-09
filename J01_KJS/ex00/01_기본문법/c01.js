// node 파일명
console.log('hello');

let age; // 선언
age = 2; // 할당

console.log(age); // 출력 

// 변수
let a = 1;
const b = 1; // 변경 불가 (상수값)

a = 2;
// b = 2;
console.log(a);
console.log(b);

// 예전 변수선언법 -> 지금은 쓰지말자
var c = 1;

// 이유 1. 함수 스코프가 전역 스코프를 가진다.
if (true) {
  var x = 10;
  // let x = 10;
}
console.log(x);

// 이유 2. 변수 호이스팅
console.log(y);
var y = 10;


// 이유 3. 중복선언
var c = 10;
var c = 20;
console.log(c);
