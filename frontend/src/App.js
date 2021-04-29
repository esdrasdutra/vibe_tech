import React, { useState, useEffect } from 'react';
import { Button, Tooltip } from 'antd';
import { SearchOutlined } from '@ant-design/icons';

import './App.css';
import CustomLayout from './containers/Layout'

function App() {
  const [message, setMessage] = useState("");
  useEffect(() => {
    fetch('/hello')
      .then(response => response.text())
      .then(message => {
        setMessage(message);
      });
  }, [])

  return (
    <CustomLayout>
      <div className="App">
        <header className="App-header">
          <h1>Quer saber quanto O SEU Deputado tem gastado?</h1>
          <Button type="primary" icon={<SearchOutlined />}>
            PESQUISAR
          </Button>

        </header>
      </div>
    </CustomLayout>
  );
}

export default App;