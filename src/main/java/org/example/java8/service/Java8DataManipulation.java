package org.example.java8.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.java8.glossModel.GlossaryItems;

public class Java8DataManipulation {
    public static void main(String[] args) throws JsonProcessingException {
//        GlossaryItems glossaryItems = setGlossary();
//        System.out.println(glossaryItems.getGlossary().getGlossDiv().getGlossList().getGlossEntry());
    }

    public GlossaryItems setGlossary() throws JsonProcessingException {
        String jsonString = """
                {
                      "glossary": {
                          "title": "example glossary",
                          "GlossDiv": {
                              "title": "S",
                              "GlossList": {
                                  "GlossEntry": [
                                      {
                                          "ID": "SGML",
                                          "SortAs": "SGML",
                                          "GlossTerm": "Standard Generalized Markup Language",
                                          "Acronym": "SGML",
                                          "Abbrev": "ISO 8879:1986",
                                          "GlossDef": {
                                              "para": "A meta-markup language, used to create markup languages such as DocBook.",
                                              "GlossSeeAlso": [
                                                  "GML",
                                                  "XML"
                                              ]
                                          },
                                          "GlossSee": "markup"
                                      },
                                      {
                                          "ID": "JSON",
                                          "SortAs": "JSON",
                                          "GlossTerm": "JavaScript Object Notation",
                                          "Acronym": "JSON",
                                          "Abbrev": "ECMA-404",
                                          "GlossDef": {
                                              "para": "A lightweight data-interchange format.",
                                              "GlossSeeAlso": [
                                                  "XML",
                                                  "YAML"
                                              ]
                                          },
                                          "GlossSee": "data interchange"
                                      },
                                      {
                                          "ID": "REST",
                                          "SortAs": "REST",
                                          "GlossTerm": "Representational State Transfer",
                                          "Acronym": "REST",
                                          "Abbrev": "Architectural Style",
                                          "GlossDef": {
                                              "para": "An architectural style for designing networked applications.",
                                              "GlossSeeAlso": [
                                                  "HTTP",
                                                  "API"
                                              ]
                                          },
                                          "GlossSee": "web services"
                                      },
                                      {
                                          "ID": "REST",
                                          "SortAs": "REST API",
                                          "GlossTerm": "Representational State Transfer Protocol",
                                          "Acronym": "REST",
                                          "Abbrev": "Architectural Style different",
                                          "GlossDef": {
                                              "para": "An architectural style for designing networked applications.",
                                              "GlossSeeAlso": [
                                                  "HTTP",
                                                  "API"
                                              ]
                                          },
                                          "GlossSee": "web services"
                                      }
                                  ]
                              }
                          }
                      }
                  }
                  
                """;
        ObjectMapper objectMapper = new ObjectMapper();
        GlossaryItems glossaryItems = objectMapper.readValue(jsonString, GlossaryItems.class);
        return glossaryItems;
    }
}
