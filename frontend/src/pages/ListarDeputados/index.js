import React, { Component } from 'react';

import { Button } from 'antd';

var user = []

class ListarDeputados extends Component {

  getFromAPI() {
    fetch('/deputados')
    .then(res => res.json())
    .then(data => {
      user = data
    })
    console.log(user) 
  }
   

  render() {

    return (
      <div>
       
          <Button>
            GO BACK HOME
          </Button>

      </div>
    );
  }
}

export default ListarDeputados;