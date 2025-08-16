let arr = []; // 배열
let obj = {}; // 객체
let objArr = {price:0, items:[1,2,3,4,5]} // 객체 안에 있는 배열 
console.log(objArr.items[0]);
console.log('===============================================');
let objArr2 = {price:0, items:[{a:'1', "b d": '2'},{},{}]} // 객체 안에 있는 배열
console.log(objArr2.items[0].a);
console.log(objArr2.items[0]['a']);
console.log(objArr2.items[0]['b d']);
console.log('===============================================');
let objArr3 = {price:0, items:[{arr:[10,20,30], arr2:[]},{},{}]} // 객체 안에 있는 배열 
console.log(objArr3.items[0]['arr'][0]);
console.log('===============================================');
let arrObj = [{},{},{},{}] // 배열안에 있는 객체
console.log('===============================================');

// 호이스팅 안됨.
let funcA = function(){
  console.log("funcA 입니다.");
};

let arrA = new Array();
arrA.push(1);
arrA.push(2);
arrA.push(funcA);
// let arrB = [1, 2, function() {console.log("funcB 입니다.");}];
let arrB = [1, 2, () => {console.log("funcB 입니다.");}];

// let func = arrA[2];
arrA[2]();
arrB[2]();

let objA = new Object();
objA.name = '홍길동';
objA.age = 18;
// objA.getAge = function() {
//   console.log(this.age + "입니다.");
// }
objA.getAge = () => {
  //console.log(objA.age + "입니다.");
  console.log(`${objA.age} 입니다.`);
}
objA.getAge();

let objB = {};



