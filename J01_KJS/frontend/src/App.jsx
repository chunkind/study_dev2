import './App.css';
import Header from './components/Header';
import ImageCard from './components/ImageCard';
import Footer from './components/Footer';

import styles from './styles/Acore.module.css';

function App() {
  // 비동기로 데이터를 가지고 온다.
  let json = {
    carArr: [
      {title: 'BO', img : '...', desc:'bo 입니다'},
      {title: 'FO', img : '...', desc:'fo 입니다'},
      {title: 'PO', img : '...', desc:'po 입니다'},
      {title: 'PS', img : '...', desc:'ps 입니다'}
    ]
  }

  let dataList = json.carArr;
  return (
    <div className={styles.acore}>
      <Header/>
      <div className={styles.acore_contents}>
        {dataList.map(item => (
          <ImageCard 
            title={item.title}
            desc={item.desc}
          />
        ))}
      </div>
      <Footer/>
    </div>
  )
}

export default App;