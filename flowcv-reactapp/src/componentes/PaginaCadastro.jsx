import React from 'react'

function PaginaCadastro() {
    return (
        <div id='Pagina-Cadastro'>
            <div id='Container-Form' className="container p-5 mt-5 border rounded">
                <h1>Cadastrar-se</h1>
                <form id='Form-Cadastro'>

                    <label className='mt-2' for="razaoSocial">Razão Social</label>
                    <div className="input-group input-group-sm mt-3">
                        <input type="text" id="razaoSocial" className="form-control" />
                    </div>

                    <label className='mt-2' for="nomeFantasia">Nome Fantasia</label>

                    <div className="input-group input-group-sm mt-3">
                        <input type="text" id="nomeFantasia" className="form-control" />
                    </div>

                    <label className='mt-2' for="email">Email</label>
                    <div className="input-group input-group-sm mt-3">
                        <input type="text" id="email" className="form-control" />
                    </div>

                    <label className='mt-2' for="cnpj">CNPJ</label>
                    <div className="input-group input-group-sm mt-3">
                        <input type="text" id="cnpj" className="form-control" />
                    </div>

                    <label className='mt-2' for="categoria">Categoria</label>
                    <div className="input-group input-group-sm mt-3">
                        <input type="text" id="categoria" className="form-control" />
                    </div>

                    <br />
                    <div className="row">
                        <div className="col-md-4">
                            <label for="cep">CEP</label>
                            <div className="input-group input-group-sm mt-3">
                                <input type="text" id="cep" className="form-control" />
                            </div>
                        </div>

                        <div className="col-md-4">
                            <label for="numero">Número</label>
                            <div className="input-group input-group-sm mt-3">
                                <input type="text" id="numero" className="form-control" />
                            </div>
                        </div>

                        <div className="col-md-4">
                            <label for="complemento">Complemento</label>
                            <div className="input-group input-group-sm mt-3">
                                <input type="text" id="complemento" className="form-control" />
                            </div>
                        </div>
                    </div>
                <div className='text-center mt-3'>
                    <button>Salvar</button>
                </div>
                </form>
            </div>
        </div >

    )
}

export default PaginaCadastro