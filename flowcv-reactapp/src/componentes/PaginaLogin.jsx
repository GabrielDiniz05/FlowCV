import React from 'react';
import { Link } from 'react-router-dom';
 
function PaginaLogin() {
    return (
        <div>
            <h1 id='All-titles' className='text-white text-center mt-5'>FlowCV</h1>
            <div id="Container-Form-Login" className='container p-4 mt-5'>
                <h1>Login</h1>
                <label id='All-labels' for="razaoSocial">Usuário:</label>
                <div className="input-group input-group-sm">
                    <input type="text" id="razaoSocial" className="form-control" />
                </div>
                <br />
                <label id='All-labels' for="senha">Senha:</label>
                <div className="input-group input-group-sm mb-1">
                    <input type="text" id="senha" className="form-control" />
                </div>
                <div className="row g-5">
                    <div className="col-md-6">
                        <Link to='/register'>
                            <a id='All-links'>Cadastrar-se</a>
                        </Link>
                    </div>
                    <div className="col-md-6">
                        <Link to='/reset-password'>
                            <a id='All-links'>Esqueceu a senha</a>
                        </Link>
                    </div>
                </div>
                <hr></hr>
                <div className='text-center mt-3'>
                    <Link to='/home'>
                        <button id='All-buttons'>Entrar</button>
                    </Link>
                </div>
            </div>
        </div>
    )
}

export default PaginaLogin