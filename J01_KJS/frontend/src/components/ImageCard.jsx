import React from 'react';
import styles from '../styles/Acore.module.css';

function ImageCard({title, desc}){
  return (
    <div className={styles.card}>
      <img src='/images/chunkind_logo.png' className={styles.image} />
      <div className={styles.textArea}>
        <h3 className={styles.title}>{title}</h3>
        <p className={styles.description}>{desc}</p>
      </div>
    </div>
  );
 }

 export default ImageCard;