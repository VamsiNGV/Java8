package org.example.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Map {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", "", "uhy", "vamsi", "javeed", "hari", "pari", "sorri");
        mapForEach(strList);
        mapFilterExample(strList);

        dataDistinct(strList);
    }

    private static void dataDistinct(List<String> strList) {

    }

    private static void mapForEach(List<String> strList) {
        List<String> modifiedList = new ArrayList<>();
        List<String> modifiedList1;
        strList.forEach(e->{
            modifiedList.add(e + "surname");
        });

        modifiedList1 = strList.stream().map(e->
            e.endsWith("i") ? e+"surname" : e).toList();
        System.out.println(modifiedList);
        System.out.println(modifiedList1);
    }

    private static void mapFilterExample(List<String> strList) {
        List<String> modifiedList2 = strList.stream()
                .filter(str -> str.endsWith("i"))
                .map(str -> str + " surname")
                .toList();

        modifiedList2.forEach(System.out::println);
    }
}
