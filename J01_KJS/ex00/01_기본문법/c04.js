// or => 피연산자들중 하나라도 true면 true
let or1 = true || a() || b() || true;  // 뒤에꺼 실행 안됨
let or2 = false || a(); // 뒤에꺼 실행 됨

// and => 하나라도 false 면 false
let and1 = true && b(); // 뒤에꺼 실행 됨
let and2 = false && b(); // 뒤에꺼 실행 됨

function a() {
  console.log('a() call..');
  return true;
}

function b() {
  console.log('b() call..');
  return true;
}



if(''==false){
  console.log('공백문자열은 false 입니다.');
}
if(Boolean('awioefjoiawefjio')==true){
  console.log('문자열은 true 입니다.');
}
if(Boolean(null)==false){
  console.log('null은 false 입니다.');
}
if(Boolean(undefined)==false){
  console.log('undefined은 false 입니다.');
}

// Falsy 값
/* 
false      명시적으로 false 것
0          숫자 0
""         빈 문자열
null       값이 없음
undefined  정의되지 않음
NaN        숫자가아님 (Not a Number)
*/

// Truthy한 값
// False 값 빼고 모두

// 널체크 방법 1
let jsonValue = ajaxCall();
if (jsonValue == ''){
  jsonValue.toLocaleUpperCase();
  jsonValue = 0;
}

// 널체크 방법 2
let jsonValue2 = ajaxCall() || 'empty';

let a = ajaxCall() || '';

function ajaxCall() {
  // 비동기통신으로 데이터 처리해서 리턴
  return null;
}

jsonValue2 = jsonValue2.toLocaleUpperCase();
console.log(`jsonValue2:${jsonValue2}`);

// 널체크 방법 3 => ES6
let c = ajaxCall()??'';