import React from 'react';

function Container() {
  return (
    <>
      <div id='Container-principal' className="col-10">
        <div className="text-white container mt-5">
          <h2>Curriculos</h2>
        </div>
        <div className="container">
          <header className='text-end'>
            <button className='btn btn-primary m-1'>Filtrar</button>
            <input id='All-inputs' type="text" />
          </header>
        </div>
        <div className="text-white container">
          <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Culpa deleniti nihil maxime, cum iusto nostrum, beatae repellat quas laudantium rem pariatur voluptatum eveniet est modi voluptatem labore id rerum adipisci.</p>
        </div>
      </div>
    </>
  )
}
export default Container