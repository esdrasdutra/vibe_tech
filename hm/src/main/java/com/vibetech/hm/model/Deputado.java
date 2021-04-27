package com.vibetech.hm.model;

public class Deputado {

    private Integer id;
    private String  nome;
    private Integer idLegislatura;
    private String  siglaUf;	
    private String  siglaPartido;
    private String  siglaSexo;
    private Integer pagina;	
    private Integer itens;	
    private String  dataInicio;	
    private String  dataFim;	
    private String  ordem;
    private String  ordenarPor;
    private String  views;    
    
    public Deputado(Integer id, String nome, Integer idLegislatura, String siglaUf, String siglaPartido,
            String siglaSexo, Integer pagina, Integer itens, String dataInicio, String dataFim, String ordem,
            String ordenarPor, String views) {
        this.id = id;
        this.nome = nome;
        this.idLegislatura = idLegislatura;
        this.siglaUf = siglaUf;
        this.siglaPartido = siglaPartido;
        this.siglaSexo = siglaSexo;
        this.pagina = pagina;
        this.itens = itens;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.ordem = ordem;
        this.ordenarPor = ordenarPor;
        this.views = views;
    }
    public String getViews() {
        return views;
    }
    public void setViews(String views) {
        this.views = views;
    }
    public String getOrdenarPor() {
        return ordenarPor;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdLegislatura() {
        return idLegislatura;
    }
    public void setIdLegislatura(Integer idLegislatura) {
        this.idLegislatura = idLegislatura;
    }
    public String getSiglaUf() {
        return siglaUf;
    }
    public void setSiglaUf(String siglaUf) {
        this.siglaUf = siglaUf;
    }
    public String getSiglaPartido() {
        return siglaPartido;
    }
    public void setSiglaPartido(String siglaPartido) {
        this.siglaPartido = siglaPartido;
    }
    public String getSiglaSexo() {
        return siglaSexo;
    }
    public void setSiglaSexo(String siglaSexo) {
        this.siglaSexo = siglaSexo;
    }
    public Integer getPagina() {
        return pagina;
    }
    public void setPagina(Integer pagina) {
        this.pagina = pagina;
    }
    public Integer getItens() {
        return itens;
    }
    public void setItens(Integer itens) {
        this.itens = itens;
    }
    public String getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
    public String getDataFim() {
        return dataFim;
    }
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
    public String getOrdem() {
        return ordem;
    }
    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }
    public void setOrdenarPor(String ordenarPor) {
        this.ordenarPor = ordenarPor;
    }

    @Override
	public String toString() {
		return "Deputado{" +
			"id=" + id +
			", nome='" + nome + '\'' +
			", partido='" + siglaPartido + '\'' +
			", uf='" + siglaUf + '\'' +
            ", views='" + views + '\'' +
			'}';
	}

    
    

}
