package com.vibetech.hm.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "dados", "links" })

public class Deputado implements Serializable {

    @JsonProperty("dados")
    private IndividualDados dados;
    
    @JsonProperty("links")
    private List<Link> links = new ArrayList<Link>();
    private final static long serialVersionUID = -2257509809426723682L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Deputado() {
    }

    /**
     *
     * @param dados
     * @param links
     */
    public Deputado(IndividualDados dados, List<Link> links) {
        super();
        this.dados = dados;
        this.links = links;
    }

    @JsonProperty("dados")
    public IndividualDados getDados() {
        return dados;
    }

    @JsonProperty("links")
    public List<Link> getLinks() {
        return links;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Deputado.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("dados");
        sb.append('=');
        sb.append(((this.dados == null) ? "<null>" : this.dados));
        sb.append(',');
        sb.append("links");
        sb.append('=');
        sb.append(((this.links == null) ? "<null>" : this.links));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}