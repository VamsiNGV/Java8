package org.example.java8;

import java.util.Arrays;
import java.util.List;

public class Java8Streams {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", "", "uhy", "vamsi");
        long begin = System.currentTimeMillis();
        long count = strList.stream().filter(String::isEmpty).count();
        long end = System.currentTimeMillis();
        long time = end-begin;
        System.out.println(begin);
        System.out.println(end);
        System.out.println("Elapsed Time: "+time +" milli seconds");
        System.out.println(count);

        begin = System.currentTimeMillis();
        int i=0;
        for(String element:strList){
            if(element.isEmpty()){
                i++;
            }
        }
        end = System.currentTimeMillis();
        time = end-begin;
        System.out.println(begin);
        System.out.println(end);
        System.out.println("Elapsed Time: "+time +" milli seconds");
        System.out.println(i);
    }
}
