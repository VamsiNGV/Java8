package org.example.java8.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.java8.glossModel.GlossEntry;
import org.example.java8.glossModel.GlossList;
import org.example.java8.glossModel.Glossary;
import org.example.java8.glossModel.GlossaryItems;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Grouping {

    public static void main(String[] args) throws JsonProcessingException {
        Java8DataManipulation java8DataManipulation = new Java8DataManipulation();
        GlossaryItems glossaryItems = java8DataManipulation.setGlossary();
        System.out.println(glossaryItems.getGlossary().getTitle());

        var glossEntries =  glossaryItems.getGlossary().getGlossDiv().getGlossList().getGlossEntry();
        var glossGroups = glossEntries.stream().collect(Collectors.groupingBy(GlossEntry::getID));
        glossGroups.get("REST").forEach(glossEntry -> System.out.println(glossEntry.getAbbrev()));
    }
}
