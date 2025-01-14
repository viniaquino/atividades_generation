import './App.css'
import Contador from './pages/contador/Contador'
import Home from './pages/home/Home'
import Login from './pages/login/Login'
import Tarefa from './pages/tarefa/Tarefa'

function App() {

  return (
    <>
        <Home titulo='Componente Home' texto='Este é o componente home'/>
        <Contador />
        <Tarefa />
        <Login />
    </>
  )
}

export default App
