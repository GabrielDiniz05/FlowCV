import React from 'react';
import SideBarMenu from './SideBarMenu';
import Container from './Container';

function PaginaInicial() {
  return (
    <div className='d-flex'>
      <div className="col-2">
        <SideBarMenu/>
      </div>
      <div className="col-10">
        <Container/>
      </div>
    </div>
  )
}
export default PaginaInicial