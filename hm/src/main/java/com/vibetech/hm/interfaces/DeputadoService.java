package com.vibetech.hm.interfaces;

import com.vibetech.hm.model.Deputado;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/*https://dadosabertos.camara.leg.br/api/v2/deputados
https://dadosabertos.camara.leg.br/api/v2/deputados?itens=5&ordenarPor=nome*/

@FeignClient(url= "https://dadosabertos.camara.leg.br/api/v2/deputados" , name = "vibetech")
public interface DeputadoService {

    @GetMapping("?nome={nome}")
    Deputado buscaDeputadoPorNome(@PathVariable("nome") String nome);      


}
