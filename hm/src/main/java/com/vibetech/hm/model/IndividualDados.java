package com.vibetech.hm.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "dataHoraFim", "dataHoraInicio", "descricao", "descricaoTipo", "fases", "id", "localCamara",
        "localExterno", "orgaos", "requerimentos", "situacao", "uri", "uriConvidados", "uriDeputados",
        "urlDocumentoPauta", "urlRegistro" })

public class IndividualDados implements Serializable {

    @JsonProperty("dataHoraFim")
    private String dataHoraFim;

    @JsonProperty("dataHoraInicio")
    private String dataHoraInicio;

    @JsonProperty("descricao")
    private String descricao;

    @JsonProperty("descricaoTipo")
    private String descricaoTipo;

    @JsonProperty("fases")
    private String fases;

    @JsonProperty("id")
    private int id;

    @JsonProperty("localCamara")
    private LocalCamara localCamara;

    @JsonProperty("localExterno")
    private String localExterno;

    @JsonProperty("orgaos")
    private List<Orgao> orgaos = new ArrayList<Orgao>();

    @JsonProperty("requerimentos")
    private List<Orgao> requerimentos = new ArrayList<Orgao>();

    @JsonProperty("situacao")
    private String situacao;

    @JsonProperty("uri")
    private String uri;

    @JsonProperty("uriConvidados")
    private String uriConvidados;

    @JsonProperty("uriDeputados")
    private String uriDeputados;

    @JsonProperty("urlDocumentoPauta")
    private String urlDocumentoPauta;

    @JsonProperty("urlRegistro")
    private String urlRegistro;

    private final static long serialVersionUID = 3511063249922191858L;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public IndividualDados() {    }

    /**
     *
     * @param orgaos
     * @param situacao
     * @param uriConvidados
     * @param fases
     * @param requerimentos
     * @param uri
     * @param urlRegistro
     * @param descricao
     * @param localCamara
     * @param localExterno
     * @param descricaoTipo
     * @param dataHoraInicio
     * @param uriDeputados
     * @param dataHoraFim
     * @param id
     * @param urlDocumentoPauta
     */
    public IndividualDados(String dataHoraFim, String dataHoraInicio, String descricao, String descricaoTipo, String fases, int id,
            LocalCamara localCamara, String localExterno, List<Orgao> orgaos, List<Orgao> requerimentos,
            String situacao, String uri, String uriConvidados, String uriDeputados, String urlDocumentoPauta,
            String urlRegistro) {
        super();
        this.dataHoraFim = dataHoraFim;
        this.dataHoraInicio = dataHoraInicio;
        this.descricao = descricao;
        this.descricaoTipo = descricaoTipo;
        this.fases = fases;
        this.id = id;
        this.localCamara = localCamara;
        this.localExterno = localExterno;
        this.orgaos = orgaos;
        this.requerimentos = requerimentos;
        this.situacao = situacao;
        this.uri = uri;
        this.uriConvidados = uriConvidados;
        this.uriDeputados = uriDeputados;
        this.urlDocumentoPauta = urlDocumentoPauta;
        this.urlRegistro = urlRegistro;
    }

    @JsonProperty("dataHoraFim")
    public String getDataHoraFim() {
        return dataHoraFim;
    }

    @JsonProperty("dataHoraInicio")
    public String getDataHoraInicio() {
        return dataHoraInicio;
    }

    @JsonProperty("descricao")
    public String getDescricao() {
        return descricao;
    }

    @JsonProperty("descricaoTipo")
    public String getDescricaoTipo() {
        return descricaoTipo;
    }

    @JsonProperty("fases")
    public String getFases() {
        return fases;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("localCamara")
    public LocalCamara getLocalCamara() {
        return localCamara;
    }

    @JsonProperty("localExterno")
    public String getLocalExterno() {
        return localExterno;
    }

    @JsonProperty("orgaos")
    public List<Orgao> getOrgaos() {
        return orgaos;
    }

    @JsonProperty("requerimentos")
    public List<Orgao> getRequerimentos() {
        return requerimentos;
    }

    @JsonProperty("situacao")
    public String getSituacao() {
        return situacao;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uriConvidados")
    public String getUriConvidados() {
        return uriConvidados;
    }

    @JsonProperty("uriDeputados")
    public String getUriDeputados() {
        return uriDeputados;
    }

    @JsonProperty("urlDocumentoPauta")
    public String getUrlDocumentoPauta() {
        return urlDocumentoPauta;
    }

    @JsonProperty("urlRegistro")
    public String getUrlRegistro() {
        return urlRegistro;
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
        sb.append(IndividualDados.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("dataHoraFim");
        sb.append('=');
        sb.append(((this.dataHoraFim == null) ? "<null>" : this.dataHoraFim));
        sb.append(',');
        sb.append("dataHoraInicio");
        sb.append('=');
        sb.append(((this.dataHoraInicio == null) ? "<null>" : this.dataHoraInicio));
        sb.append(',');
        sb.append("descricao");
        sb.append('=');
        sb.append(((this.descricao == null) ? "<null>" : this.descricao));
        sb.append(',');
        sb.append("descricaoTipo");
        sb.append('=');
        sb.append(((this.descricaoTipo == null) ? "<null>" : this.descricaoTipo));
        sb.append(',');
        sb.append("fases");
        sb.append('=');
        sb.append(((this.fases == null) ? "<null>" : this.fases));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("localCamara");
        sb.append('=');
        sb.append(((this.localCamara == null) ? "<null>" : this.localCamara));
        sb.append(',');
        sb.append("localExterno");
        sb.append('=');
        sb.append(((this.localExterno == null) ? "<null>" : this.localExterno));
        sb.append(',');
        sb.append("orgaos");
        sb.append('=');
        sb.append(((this.orgaos == null) ? "<null>" : this.orgaos));
        sb.append(',');
        sb.append("requerimentos");
        sb.append('=');
        sb.append(((this.requerimentos == null) ? "<null>" : this.requerimentos));
        sb.append(',');
        sb.append("situacao");
        sb.append('=');
        sb.append(((this.situacao == null) ? "<null>" : this.situacao));
        sb.append(',');
        sb.append("uri");
        sb.append('=');
        sb.append(((this.uri == null) ? "<null>" : this.uri));
        sb.append(',');
        sb.append("uriConvidados");
        sb.append('=');
        sb.append(((this.uriConvidados == null) ? "<null>" : this.uriConvidados));
        sb.append(',');
        sb.append("uriDeputados");
        sb.append('=');
        sb.append(((this.uriDeputados == null) ? "<null>" : this.uriDeputados));
        sb.append(',');
        sb.append("urlDocumentoPauta");
        sb.append('=');
        sb.append(((this.urlDocumentoPauta == null) ? "<null>" : this.urlDocumentoPauta));
        sb.append(',');
        sb.append("urlRegistro");
        sb.append('=');
        sb.append(((this.urlRegistro == null) ? "<null>" : this.urlRegistro));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}