import React from 'react';
import { Link } from 'react-router-dom';


function SideBarMenu() {
  return (
    <div className='container-fluid'>
      <div className='row'>
        <div className='bg-dark col-auto col-md-12 min-vh-100'>
					<Link className='text-decoration-none text-white d-flex aling-itemcenter ms-5 mt-4' to='/'>
							<span className='ms-1 fs-4'>FlowCV</span>
					</Link>
          <hr className='text-secondary'/>
          <ul class="nav nav-pills flex-column">
            <li class="nav-item text-white fs-4 my-1">
              <a href="#" class="nav-link text-white fs-5" aria-current="page">
                <i className='bi bi-speedometer2'></i>
                <span className='ms-2'>Formulários</span>
              </a>
            </li>
            <li class="nav-item text-white fs-4 my-1">
              <a href="#" class="nav-link text-white fs-5" aria-current="page">
                <i className='bi bi-house'></i>
                <span className='ms-2'>Vagas</span>
              </a>
            </li>
          </ul>
        </div>
      </div>
    </div>
  )
}

export default SideBarMenu