package com.online.school.config;

import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


@Data
public class Test {

    Integer aa;


    public static void main(String[] args) {
        Comparator<String> stringComparator = (s, anotherString) -> s.compareTo(anotherString);

        System.out.println(stringComparator.compare("Rajneeshss", "Rajneeshss"));

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        System.out.println(integers);


    }

    public void method(){
        System.out.println("in private ...");
    }


}
