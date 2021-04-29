package com.vibetech.hm.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class LinkModel {

@SerializedName("rel")
@Expose
private String rel;
@SerializedName("href")
@Expose
private String href;

/**
* No args constructor for use in serialization
*
*/
public LinkModel() {
}

/**
*
* @param rel
* @param href
*/
public LinkModel(String rel, String href) {
super();
this.rel = rel;
this.href = href;
}

public String getRel() {
return rel;
}

public void setRel(String rel) {
this.rel = rel;
}

public LinkModel withRel(String rel) {
this.rel = rel;
return this;
}

public String getHref() {
return href;
}

public void setHref(String href) {
this.href = href;
}

public LinkModel withHref(String href) {
this.href = href;
return this;
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(LinkModel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("rel");
sb.append('=');
sb.append(((this.rel == null)?"<null>":this.rel));
sb.append(',');
sb.append("href");
sb.append('=');
sb.append(((this.href == null)?"<null>":this.href));
sb.append(',');
if (sb.charAt((sb.length()- 1)) == ',') {
sb.setCharAt((sb.length()- 1), ']');
} else {
sb.append(']');
}
return sb.toString();
}

}
