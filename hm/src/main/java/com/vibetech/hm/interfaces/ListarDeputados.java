package com.vibetech.hm.interfaces;

import com.vibetech.hm.model.Deputados;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url= "https://dadosabertos.camara.leg.br/api/v2" , name = "vibetech2")
public interface ListarDeputados {

    @GetMapping("/deputados")
    Deputados listarDeputados();
}