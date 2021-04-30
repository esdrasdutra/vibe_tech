package com.vibetech.hm.interfaces;

import com.vibetech.hm.model.Deputados;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url= "https://dadosabertos.camara.leg.br/api/v2" , name = "listaDep")
public interface ListarDeputados {

    @GetMapping("/deputados?itens=5&ordem=ASC&ordenarPor=nome")
    Deputados listarDeputados();
}