import React from 'react';
import styles from './ImageCard.module.css';

function ImageCard({title, desc}){
  return (
    <div className={styles.cardContainer}>
      <img src=''  />
      <div>
        <h3>{title}</h3>
        <p>{desc}</p>
      </div>
    </div>
  );
 }

 export default ImageCard;