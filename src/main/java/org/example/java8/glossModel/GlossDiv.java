
package org.example.java8.glossModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GlossDiv {

    @JsonProperty("GlossList")
    private GlossList glossList;
    private String title;

    public GlossList getGlossList() {
        return glossList;
    }

    public void setGlossList(GlossList glossList) {
        this.glossList = glossList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
