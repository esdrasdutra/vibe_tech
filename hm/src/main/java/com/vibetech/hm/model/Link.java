package com.vibetech.hm.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "href", "rel", "type" })

public class Link implements Serializable {

    @JsonProperty("href")
    private String href;
    @JsonProperty("rel")
    private String rel;
    @JsonProperty("type")
    private String type;
    private final static long serialVersionUID = 2586876189085204968L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Link() {
    }

    /**
     *
     * @param rel
     * @param href
     * @param type
     */

    public Link(String href, String rel, String type) {
        super();
        this.href = href;
        this.rel = rel;
        this.type = type;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("rel")
    public String getRel() {
        return rel;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Link.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null) ? "<null>" : this.href));
        sb.append(',');
        sb.append("rel");
        sb.append('=');
        sb.append(((this.rel == null) ? "<null>" : this.rel));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}