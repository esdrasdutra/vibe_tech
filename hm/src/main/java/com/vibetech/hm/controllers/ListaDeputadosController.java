package com.vibetech.hm.controller;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.vibetech.hm.interfaces.DeputadoService;
import com.vibetech.hm.model.Deputado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListaDeputadosController {


    @RequestMapping(path = "/")    
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