import './App.css';
import Header from './components/Header';
import Footer from './components/Footer';


/*
------------------------------------------
-----  ----- -----
|   |  |   | |   |
-----  ----- -----
 BO     FO    PO
-----  
|   |  
-----  
 BO    
------------------------------------------

*/

function App() {
  return (
    <>
      <Header/>
      <div>
        <ImageCard/>
      </div>
      <Footer/>
    </>
  )
}

export default App;