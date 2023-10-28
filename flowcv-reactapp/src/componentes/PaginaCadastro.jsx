import React from 'react'

function PaginaCadastro() {
    return (
        <div>
            <div id='Container-Form-Cadastro' className="container p-5 mt-5 border rounded">
                <h1 id='All-titles'>Cadastrar-se</h1>
                <form>
                    <label id='All-labels' className='mb-1' for="razaoSocial">Razão Social</label>
                    <div className="input-group input-group-sm">
                        <input type="text" id="razaoSocial" className="form-control" />
                    </div>
                    <br />

                    <label id='All-labels' className='mb-1' for="nomeFantasia">Nome Fantasia</label>

                    <div className="input-group input-group-sm">
                        <input type="text" id="nomeFantasia" className="form-control" />
                    </div>
                    <br />
                    <label id='All-labels' className='mb-1' for="email">Email</label>
                    <div className="input-group input-group-sm">
                        <input type="text" id="email" className="form-control" />
                    </div>
                    <br />
                    <label id='All-labels' className='mb-1' for="cnpj">CNPJ</label>
                    <div className="input-group input-group-sm">
                        <input type="text" id="cnpj" className="form-control" />
                    </div>
                    <br />
                    <label id='All-labels' className='mb-1' for="categoria">Categoria</label>
                    <div className="input-group input-group-sm">
                        <input type="text" id="categoria" className="form-control" />
                    </div>
                    <br />
                    <div className="row">
                        <div className="col-md-4">
                            <label id='All-labels' for="cep">CEP</label>
                            <div className="input-group input-group-sm">
                                <input type="text" id="cep" className="form-control" />
                            </div>
                        </div>

                        <div className="col-md-4">
                            <label id='All-labels' for="numero">Número</label>
                            <div className="input-group input-group-sm">
                                <input type="text" id="numero" className="form-control" />
                            </div>
                        </div>

                        <div className="col-md-4">
                            <label id='All-labels' for="complemento">Complemento</label>
                            <div className="input-group input-group-sm">
                                <input type="text" id="complemento" className="form-control" />
                            </div>
                        </div>
                    </div>
                    <br />
                <div className='text-center'>
                    <button id='All-buttons'>Salvar</button>
                </div>
                </form>
            </div>
        </div >

    )
}

export default PaginaCadastro