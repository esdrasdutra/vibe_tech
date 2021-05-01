import React, { Component } from 'react';

import CustomLayout from './containers/Layout';
import Main from './pages/Main';
import ListarDeputados from './pages/ListarDeputados';

class App extends Component {
  render(){
    return(
      <CustomLayout>
        <Main/>
        <ListarDeputados/>
      </CustomLayout>

    );
  }
}

export default App;