
package org.example.java8.glossModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GlossEntry {

    @JsonProperty("Abbrev")
    private String abbrev;
    @JsonProperty("Acronym")
    private String acronym;
    @JsonProperty("GlossDef")
    private GlossDef glossDef;
    @JsonProperty("GlossSee")
    private String glossSee;
    @JsonProperty("GlossTerm")
    private String glossTerm;
    @JsonProperty("ID")
    private String iD;
    @JsonProperty("SortAs")
    private String sortAs;

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public GlossDef getGlossDef() {
        return glossDef;
    }

    public void setGlossDef(GlossDef glossDef) {
        this.glossDef = glossDef;
    }

    public String getGlossSee() {
        return glossSee;
    }

    public void setGlossSee(String glossSee) {
        this.glossSee = glossSee;
    }

    public String getGlossTerm() {
        return glossTerm;
    }

    public void setGlossTerm(String glossTerm) {
        this.glossTerm = glossTerm;
    }

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getSortAs() {
        return sortAs;
    }

    public void setSortAs(String sortAs) {
        this.sortAs = sortAs;
    }

}
