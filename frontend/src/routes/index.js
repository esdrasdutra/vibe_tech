import React from 'react';
import { Switch, Route } from 'react-router-dom';

import Main from '../pages/Main';
import ListarDeputados from '../pages/ListarDeputados';

export default function Routes() {
  return (
    <Switch>
      <Route path="/" exact component={Main} />
      <Route path="/deputados" exact component={ListarDeputados} />
    </Switch>
  );
}