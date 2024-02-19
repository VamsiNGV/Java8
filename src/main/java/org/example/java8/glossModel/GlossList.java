
package org.example.java8.glossModel;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GlossList {

    public void setGlossEntry(List<GlossEntry> glossEntry) {
        this.glossEntry = glossEntry;
    }

    @JsonProperty("GlossEntry")
    private List<GlossEntry> glossEntry;

    public List<GlossEntry> getGlossEntry() {
        return glossEntry;
    }

}
