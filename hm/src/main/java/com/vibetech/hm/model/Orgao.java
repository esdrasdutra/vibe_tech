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
@JsonPropertyOrder({ "apelido", "codTipoOrgao", "id", "nome", "nomePublicacao", "sigla", "tipoOrgao", "uri" })
@Generated("jsonschema2pojo")
public class Orgao implements Serializable {

    @JsonProperty("apelido")
    private String apelido;
    @JsonProperty("codTipoOrgao")
    private int codTipoOrgao;
    @JsonProperty("id")
    private int id;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("nomePublicacao")
    private String nomePublicacao;
    @JsonProperty("sigla")
    private String sigla;
    @JsonProperty("tipoOrgao")
    private String tipoOrgao;
    @JsonProperty("uri")
    private String uri;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1538013013227331308L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Orgao() {
    }

    /**
     *
     * @param apelido
     * @param sigla
     * @param nomePublicacao
     * @param codTipoOrgao
     * @param nome
     * @param id
     * @param uri
     * @param tipoOrgao
     */
    public Orgao(String apelido, int codTipoOrgao, int id, String nome, String nomePublicacao, String sigla,
            String tipoOrgao, String uri) {
        super();
        this.apelido = apelido;
        this.codTipoOrgao = codTipoOrgao;
        this.id = id;
        this.nome = nome;
        this.nomePublicacao = nomePublicacao;
        this.sigla = sigla;
        this.tipoOrgao = tipoOrgao;
        this.uri = uri;
    }

    @JsonProperty("apelido")
    public String getApelido() {
        return apelido;
    }

    @JsonProperty("apelido")
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @JsonProperty("codTipoOrgao")
    public int getCodTipoOrgao() {
        return codTipoOrgao;
    }

    @JsonProperty("codTipoOrgao")
    public void setCodTipoOrgao(int codTipoOrgao) {
        this.codTipoOrgao = codTipoOrgao;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    @JsonProperty("nome")
    public void setNome(String nome) {
        this.nome = nome;
    }

    @JsonProperty("nomePublicacao")
    public String getNomePublicacao() {
        return nomePublicacao;
    }

    @JsonProperty("nomePublicacao")
    public void setNomePublicacao(String nomePublicacao) {
        this.nomePublicacao = nomePublicacao;
    }

    @JsonProperty("sigla")
    public String getSigla() {
        return sigla;
    }

    @JsonProperty("sigla")
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @JsonProperty("tipoOrgao")
    public String getTipoOrgao() {
        return tipoOrgao;
    }

    @JsonProperty("tipoOrgao")
    public void setTipoOrgao(String tipoOrgao) {
        this.tipoOrgao = tipoOrgao;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
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
        sb.append(Orgao.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("apelido");
        sb.append('=');
        sb.append(((this.apelido == null) ? "<null>" : this.apelido));
        sb.append(',');
        sb.append("codTipoOrgao");
        sb.append('=');
        sb.append(this.codTipoOrgao);
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("nome");
        sb.append('=');
        sb.append(((this.nome == null) ? "<null>" : this.nome));
        sb.append(',');
        sb.append("nomePublicacao");
        sb.append('=');
        sb.append(((this.nomePublicacao == null) ? "<null>" : this.nomePublicacao));
        sb.append(',');
        sb.append("sigla");
        sb.append('=');
        sb.append(((this.sigla == null) ? "<null>" : this.sigla));
        sb.append(',');
        sb.append("tipoOrgao");
        sb.append('=');
        sb.append(((this.tipoOrgao == null) ? "<null>" : this.tipoOrgao));
        sb.append(',');
        sb.append("uri");
        sb.append('=');
        sb.append(((this.uri == null) ? "<null>" : this.uri));
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