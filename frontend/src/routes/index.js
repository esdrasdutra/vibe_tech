import React from 'react';
import { Switch, Route } from 'react-router-dom';

export default function Routes() {
  return (
    <Switch>
      <Route path="/" exact component={Main} />
      <Route path="/deputados" exact component={ListarDeputados} />
    </Switch>
  );
}