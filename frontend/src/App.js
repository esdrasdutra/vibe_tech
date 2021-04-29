import React, { Component } from 'react';
import { BrowserRouter } from 'react-router-dom';

import CustomLayout from './containers/Layout'
import Routes from './routes'

class App extends Component {
  render(){
    return(
      <CustomLayout>        
        <BrowserRouter>
            <Routes/>
        </BrowserRouter>
      </CustomLayout>

    );
  }
}

export default App;