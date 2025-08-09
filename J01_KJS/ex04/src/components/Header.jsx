import React from 'react';
import styles from '../styles/Acore.module.css';

function Header(){
  return (
    <div className={styles.acore_header}>
      <div className={styles.acore_header_logo}>
        <img src='/images/chunkind_logo.png'/>
      </div>
      <div className={styles.acore_header_cont}>
        
      </div>
    </div>
  );
}

export default Header;