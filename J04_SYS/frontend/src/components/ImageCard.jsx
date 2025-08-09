import React from 'react';
import styles from '../styles/Acore.module.css'

function ImageCard({title, desc}){
    return (
        <div className={styles.card}>
            <img src='/images/logo.png' className={styles.image}/>
            <div className={styles.textArea}>
                <h3 className={styles.textArea}>{title}</h3>
                <p className={styles.desciption}>{desc}</p>
            </div>
        </div>
    );
}

export default ImageCard;