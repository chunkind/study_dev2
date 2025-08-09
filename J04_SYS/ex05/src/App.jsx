import { useState } from 'react';
import './App.css';

import Viewer from './component/Viewer';
import Controller from './component/Controller';

function App() {
  const [count, setCount] = useState(0);

  const onClickButton = (value) => {
    setCount(count + value);
  };

  return (
    <>
      <div>Hello</div>
      <Viewer count={count} />
      <Controller onClickButton={onClickButton} />
    </>
  );
}

export default App;