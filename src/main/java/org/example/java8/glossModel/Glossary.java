
package org.example.java8.glossModel;

import com.fasterxml.jackson.annotation.JsonProperty;



public class Glossary {

    @JsonProperty("GlossDiv")
    private GlossDiv glossDiv;

    private String title;

    public GlossDiv getGlossDiv() {
        return glossDiv;
    }

    public void setGlossDiv(GlossDiv glossDiv) {
        this.glossDiv = glossDiv;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
