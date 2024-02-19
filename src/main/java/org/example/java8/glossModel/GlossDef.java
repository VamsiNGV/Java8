
package org.example.java8.glossModel;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class GlossDef {

    @JsonProperty("GlossSeeAlso")
    private List<String> glossSeeAlso;

    private String para;

    public List<String> getGlossSeeAlso() {
        return glossSeeAlso;
    }

    public void setGlossSeeAlso(List<String> glossSeeAlso) {
        this.glossSeeAlso = glossSeeAlso;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

}
