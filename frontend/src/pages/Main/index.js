import React, { Component } from 'react';
import { Button } from 'antd';
import { FileSearchOutlined } from '@ant-design/icons';
import { Link } from 'react-router-dom';

// const API = "/";

class Main extends Component {
  constructor(props) {
    super(props);
    this.state = {};
  }

/*   componentDidMount() {
    fetch(API)
      .then(res => res.text()
        .then(greet => this.setState({ greet })
        )
      );
  } */

  render() {

    return (
      <div>
        <h1>Olá, Tudo bem?</h1>
        <p>AQUI VOCÊ PODE CONFERIR O QUE SEU DEPUTADO ANDA FAZENDO COM O DINHEIRO PÚBLICO</p>

        <Link to="/deputados" >
          <Button type="primary" icon={<FileSearchOutlined />}
            style={{
              fontSize: '40px', color: '#0016a6', backgroundColor: '#45ffda',
              borderRadius: '15px', width: '300px', height: '75px', borderWidth: 'inherit'
            }}>
          </Button>
        </Link>



      </div>
    );
  }
}

export default Main;