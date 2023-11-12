import React from 'react'

function PaginaInicial() {
  return (
    <div className="row">
      <div className="col-2">
        <div className="container mt-5">
          <div className="container">
            <h1>FlowCv</h1>
          </div>
          <div className="container">
            <a href="#">Formularios</a>
            <br />
            <a href="#">Vagas</a>
          </div>
          <div className="container">
            <footer><p>adawdadwdw</p></footer>
          </div>
        </div>
      </div>
      <div id='Container-principla' className="col-10">
        <div className="container mt-5">
          <h2>Curriculos</h2>
        </div>
        <div className="container">
          <header className='text-end'>
            <button className='btn btn-primary m-1'>Filtrar</button>
            <input id='All-inputs' type="text" />
          </header>
        </div>
        <div className="container">
          <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Culpa deleniti nihil maxime, cum iusto nostrum, beatae repellat quas laudantium rem pariatur voluptatum eveniet est modi voluptatem labore id rerum adipisci.</p>
        </div>
      </div>
    </div>
  )
}
export default PaginaInicial