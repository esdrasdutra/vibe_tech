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
    
    @
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
    
    public String getOrdenarPor() {
        return ordenarPor;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
   
    public Integer getIdLegislatura() {
        return idLegislatura;
    }
    
    public String getSiglaUf() {
        return siglaUf;
    }
    
    public String getSiglaPartido() {
        return siglaPartido;
    }
 
    public String getSiglaSexo() {
        return siglaSexo;
    }

    public Integer getPagina() {
        return pagina;
    }

    public Integer getItens() {
        return itens;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public String getOrdem() {
        return ordem;
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
