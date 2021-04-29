package com.vibetech.hm.controller;

import com.vibetech.hm.interfaces.DeputadoService;
import com.vibetech.hm.model.Deputado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeputadoRestService {

    @Autowired
    private DeputadoService depService;

    @RequestMapping(value = "{nome}", method = RequestMethod.GET)
    public ResponseEntity<Deputado> getNome(@PathVariable String nome) {
        Deputado deputado = depService.buscaDeputadoPorNome(nome);
        return deputado != null ? ResponseEntity.ok().body(deputado) : ResponseEntity.notFound().build(); 
    }
}