/*
  1. 자바스크립트 쓸라면 {}
  2. 모든태그는 닫혀있어야한다.
  3. 최상위 태그는 반드시 하나 있어야한다.
  4. 속성명은 카멜케이스로
  5. class 는 className으로 사용
*/

import { useState } from 'react'
import './App.css'

import Viewer from './component/Viewer'
import Controller from './component/Controller'

function App() {
  const [count, setCount] = useState(0);

  const onClickButton = (value) => {
    setCount(count + value);
  }

  return (
    <>
      <div>Hello</div>
      <Viewer count={count} />
      <Controller onClickButton={onClickButton} />
    </>
  )
}

export default App
