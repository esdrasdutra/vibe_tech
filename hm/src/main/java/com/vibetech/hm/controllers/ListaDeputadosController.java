package com.vibetech.hm.controllers;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListaDeputadosController {

    @RequestMapping(path = "/deputados")    
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
        
    }  
}