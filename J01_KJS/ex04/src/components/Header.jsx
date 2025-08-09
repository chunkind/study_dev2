import React from 'react';
import styles from '../styles/Header.module.css';

function Header(){
  return (
    <div>
      <div className={styles.header_logo}>
        <img src=''/>
      </div>

      <div className={styles.header}>
        <div>해더1</div>
      </div>
    </div>
  );
}

export default Header;