import logo from './logo.svg';
import './App.css';
import { Outlet } from 'react-router-dom';
import PaginaInicial from './componentes/PaginaInicial';
import PaginaCadastro from './componentes/PaginaCadastro';
import PaginaLogin from './componentes/PaginaLogin';
import PaginaEsqueceuSenha from './componentes/PaginaEsqueceuSenha';
function App() {
  return (
    <div className="App">
     <PaginaLogin/>
    </div>
  );
}

export default App;

