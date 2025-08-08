import { useState } from 'react'
import './App.css'
import Header from './componets/Header'
import ImageCard from './componets/ImageCard'
import Footer from './componets/Footer'

function App() {
  return (
    <>
      <Header />
      <div>
        <ImageCard/>
        <ImageCard/>
        <ImageCard/>
        <ImageCard/>
      </div>
      <Footer />
    </>
  )
}

export default App
