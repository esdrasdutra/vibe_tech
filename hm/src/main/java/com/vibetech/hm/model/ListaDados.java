package com.vibetech.hm.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "email", "id", "idLegislatura", "nome", "siglaPartido", "siglaUf", "uri", "uriPartido",
        "urlFoto" })
        
public class ListaDados implements Serializable {

    @JsonProperty("email")
    private String email;
    @JsonProperty("id")
    private int id;
    @JsonProperty("idLegislatura")
    private int idLegislatura;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("siglaPartido")
    private String siglaPartido;
    @JsonProperty("siglaUf")
    private String siglaUf;
    @JsonProperty("uri")
    private String uri;
    @JsonProperty("uriPartido")
    private String uriPartido;
    @JsonProperty("urlFoto")
    private String urlFoto;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8380280475753718883L;


    public ListaDados() {
    }

    /**
     *
     * @param siglaUf
     * @param siglaPartido
     * @param urlFoto
     * @param idLegislatura
     * @param nome
     * @param id
     * @param uri
     * @param email
     * @param uriPartido
     */
    public ListaDados(String email, int id, int idLegislatura, String nome, String siglaPartido, String siglaUf, String uri,
            String uriPartido, String urlFoto) {
        super();
        this.email = email;
        this.id = id;
        this.idLegislatura = idLegislatura;
        this.nome = nome;
        this.siglaPartido = siglaPartido;
        this.siglaUf = siglaUf;
        this.uri = uri;
        this.uriPartido = uriPartido;
        this.urlFoto = urlFoto;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("idLegislatura")
    public int getIdLegislatura() {
        return idLegislatura;
    }

    @JsonProperty("idLegislatura")
    public void setIdLegislatura(int idLegislatura) {
        this.idLegislatura = idLegislatura;
    }

    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    @JsonProperty("nome")
    public void setNome(String nome) {
        this.nome = nome;
    }

    @JsonProperty("siglaPartido")
    public String getSiglaPartido() {
        return siglaPartido;
    }

    @JsonProperty("siglaPartido")
    public void setSiglaPartido(String siglaPartido) {
        this.siglaPartido = siglaPartido;
    }

    @JsonProperty("siglaUf")
    public String getSiglaUf() {
        return siglaUf;
    }

    @JsonProperty("siglaUf")
    public void setSiglaUf(String siglaUf) {
        this.siglaUf = siglaUf;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    @JsonProperty("uriPartido")
    public String getUriPartido() {
        return uriPartido;
    }

    @JsonProperty("uriPartido")
    public void setUriPartido(String uriPartido) {
        this.uriPartido = uriPartido;
    }

    @JsonProperty("urlFoto")
    public String getUrlFoto() {
        return urlFoto;
    }

    @JsonProperty("urlFoto")
    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
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
        sb.append(ListaDados.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null) ? "<null>" : this.email));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("idLegislatura");
        sb.append('=');
        sb.append(this.idLegislatura);
        sb.append(',');
        sb.append("nome");
        sb.append('=');
        sb.append(((this.nome == null) ? "<null>" : this.nome));
        sb.append(',');
        sb.append("siglaPartido");
        sb.append('=');
        sb.append(((this.siglaPartido == null) ? "<null>" : this.siglaPartido));
        sb.append(',');
        sb.append("siglaUf");
        sb.append('=');
        sb.append(((this.siglaUf == null) ? "<null>" : this.siglaUf));
        sb.append(',');
        sb.append("uri");
        sb.append('=');
        sb.append(((this.uri == null) ? "<null>" : this.uri));
        sb.append(',');
        sb.append("uriPartido");
        sb.append('=');
        sb.append(((this.uriPartido == null) ? "<null>" : this.uriPartido));
        sb.append(',');
        sb.append("urlFoto");
        sb.append('=');
        sb.append(((this.urlFoto == null) ? "<null>" : this.urlFoto));
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