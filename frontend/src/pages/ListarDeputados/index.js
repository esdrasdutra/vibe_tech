import React, { Component } from 'react';

const API = "/{id}";

class ListarDeputados extends Component {
  constructor(props) {
    super(props);
    this.state = {
      user: []
    };
  }

  getDataString() {
    fetch(API)
      .then(res => res.text()
        .then(greet => this.setState({ greet })
        )
      )
  }

  componentDidMount() {
    this.getDataString()      
  }

  render() {

    var obj1 = this.state.greet;    

    return (
      <div>
       {obj1}        
      </div>
    );
  }
}

export default ListarDeputados;