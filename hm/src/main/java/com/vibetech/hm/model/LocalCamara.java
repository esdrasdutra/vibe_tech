package com.vibetech.hm.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "andar", "nome", "predio", "sala" })
@Generated("jsonschema2pojo")
public class LocalCamara implements Serializable {

    @JsonProperty("andar")
    private String andar;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("predio")
    private String predio;
    @JsonProperty("sala")
    private String sala;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8862478972545538564L;

    /**
     * No args constructor for use in serialization
     *
     */
    public LocalCamara() {
    }

    /**
     *
     * @param andar
     * @param predio
     * @param sala
     * @param nome
     */
    public LocalCamara(String andar, String nome, String predio, String sala) {
        super();
        this.andar = andar;
        this.nome = nome;
        this.predio = predio;
        this.sala = sala;
    }

    @JsonProperty("andar")
    public String getAndar() {
        return andar;
    }

    @JsonProperty("andar")
    public void setAndar(String andar) {
        this.andar = andar;
    }

    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    @JsonProperty("nome")
    public void setNome(String nome) {
        this.nome = nome;
    }

    @JsonProperty("predio")
    public String getPredio() {
        return predio;
    }

    @JsonProperty("predio")
    public void setPredio(String predio) {
        this.predio = predio;
    }

    @JsonProperty("sala")
    public String getSala() {
        return sala;
    }

    @JsonProperty("sala")
    public void setSala(String sala) {
        this.sala = sala;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocalCamara.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("andar");
        sb.append('=');
        sb.append(((this.andar == null) ? "<null>" : this.andar));
        sb.append(',');
        sb.append("nome");
        sb.append('=');
        sb.append(((this.nome == null) ? "<null>" : this.nome));
        sb.append(',');
        sb.append("predio");
        sb.append('=');
        sb.append(((this.predio == null) ? "<null>" : this.predio));
        sb.append(',');
        sb.append("sala");
        sb.append('=');
        sb.append(((this.sala == null) ? "<null>" : this.sala));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}