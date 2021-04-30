package com.vibetech.hm.controllers;

import com.vibetech.hm.interfaces.ListarDeputados;
import com.vibetech.hm.model.Deputados;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ListarDeputadosController {
    
    @Autowired
    private ListarDeputados listaDep;

    @GetMapping("/deputado")
    public ResponseEntity<Deputados> listaDeputados () {

        Deputados deputado = listaDep.listarDeputados();
        return deputado != null ? ResponseEntity.ok().body(deputado) : ResponseEntity.notFound().build(); 
    }

}