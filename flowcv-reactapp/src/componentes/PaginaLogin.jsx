import React from 'react'

function PaginaLogin() {
    return (
        <div id="Pagina-Login">
            <h1 id='All-titles' className='text-center mt-5'>FlowCV</h1>
            <div id="Container-Form-Login" className='container p-5 mt-5 border rounded'>
                <h1>LOGIN</h1>
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
                    <div className="col-md-6"><a id='All-links'>Cadastrar-se</a></div>
                    <div className="col-md-6"><a id='All-links' href="">Esqueceu a senha</a></div>
                </div>
                <div className='text-center mt-3'><button id='All-buttons'>Entrar</button></div>
            </div>
        </div>
    )
}

export default PaginaLogin