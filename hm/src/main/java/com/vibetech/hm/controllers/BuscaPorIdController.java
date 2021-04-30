package com.vibetech.hm.controllers;

import com.vibetech.hm.interfaces.BuscarPorId;
import com.vibetech.hm.model.Deputado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BuscaPorIdController {
    
    @Autowired
    private BuscarPorId buscaDep;

    @GetMapping("/{id}")
    public ResponseEntity<Deputado> getId(@PathVariable Integer id) {

        Deputado deputado = buscaDep.buscarPorID(id);
        return deputado != null ? ResponseEntity.ok().body(deputado) : ResponseEntity.notFound().build(); 
    } 


/*     @RequestMapping(path = "/deputados")    
    public String getTest() throws Exception{
        var url = "https://dadosabertos.camara.leg.br/api/v2/deputados?itens=5&ordem=ASC&ordenarPor=nome";

        HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI(url))
            .header("Content-Type","application/json")
            .GET()
        .build();
        
        HttpClient httpClient = HttpClient.newHttpClient();
        var response = httpClient.send(request,
        HttpResponse.BodyHandlers.ofString());
                                 
        return response.body();
    } */
}