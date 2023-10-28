import React from 'react'

function PaginaEsqueceuSenha() {
  return (
    <div>
        <div id="Container-Esqueceu-Senha" className='container input-group input-group-sm p-5'>
            <h1 id="All-titles">Esqueceu a senha?</h1>
            <p>Insira seu email para enviarmos a redefinição de senha:</p>
            <input className='form-control' type="text" />
            <div className='container text-center mt-4'><button id='All-buttons'>Enviar</button></div>
        </div>
    </div>
  )
}

export default PaginaEsqueceuSenha