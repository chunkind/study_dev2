import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

import Btn from './components/Button';

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <h1>안녕</h1>
      <Btn></Btn>
    </>
  )
}

export default App
