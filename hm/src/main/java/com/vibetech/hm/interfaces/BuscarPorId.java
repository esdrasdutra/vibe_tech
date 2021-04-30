package com.vibetech.hm.interfaces;

import com.vibetech.hm.model.Deputado;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url= "https://dadosabertos.camara.leg.br/api/v2" , name = "buscaPorID")
public interface BuscarPorId {

    @GetMapping("/deputados/?id={id}")
    Deputado buscarPorID(@PathVariable("id") Integer id);
}
