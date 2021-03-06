package com.vibetech.hm.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "dados", "links" })

public class Deputados implements Serializable {

    @JsonProperty("dados")
    private List<Dados> dados;

    @JsonProperty("links")
    private List<Link> links = new ArrayList<Link>();
    private final static long serialVersionUID = -8380280475753718883L;

    public Deputados() {
    }

    /**
     *
     * @param dados
     * @param links
     */
    public Deputados(List<Dados> dados, List<Link> links) {
        super();
        this.dados = dados;
        this.links = links;
    }

    @JsonProperty("dados")
    public List<Dados> getDados() {
        return dados;    }

    @JsonProperty("links")
    public List<Link> getLinks() {
        return links;
    }
}