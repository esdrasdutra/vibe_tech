package com.vibetech.hm.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class ExampleModel {

@SerializedName("dados")
@Expose
private List<DeputadoModel> dados = null;

@SerializedName("links")
@Expose
private List<LinkModel> links = null;

/**
* No args constructor for use in serialization
*
*/
public ExampleModel() {
}

/**
*
* @param dados
* @param links
*/
public ExampleModel(List<DeputadoModel> dados, List<LinkModel> links) {
super();
this.dados = dados;
this.links = links;
}

public List<DeputadoModel> getDados() {
return dados;
}

public void setDados(List<DeputadoModel> dados) {
this.dados = dados;
}

public ExampleModel withDados(List<DeputadoModel> dados) {
this.dados = dados;
return this;
}

public List<LinkModel> getLinks() {
return links;
}

public void setLinks(List<LinkModel> links) {
this.links = links;
}

public ExampleModel withLinks(List<LinkModel> links) {
this.links = links;
return this;
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(ExampleModel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("dados");
sb.append('=');
sb.append(((this.dados == null)?"<null>":this.dados));
sb.append(',');
sb.append("links");
sb.append('=');
sb.append(((this.links == null)?"<null>":this.links));
sb.append(',');
if (sb.charAt((sb.length()- 1)) == ',') {
sb.setCharAt((sb.length()- 1), ']');
} else {
sb.append(']');
}
return sb.toString();
}

}