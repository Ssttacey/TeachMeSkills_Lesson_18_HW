package com.teachmeskills.lesson18.task2;

import java.util.List;

public class TestTwo {
    public static void namesA (List<String> list) {

        System.out.println(list);

        List<String> aNames = list.stream()
                .filter(n -> n.toLowerCase().startsWith("a")).toList();
        System.out.println(aNames);
    }

    public static void sortNames (List<String> list) {

        System.out.println(list);

        List<String> sortedName = list.stream()
                .sorted().findFirst().stream().toList();
        System.out.println(sortedName);
    }
}
