package com.teachmeskills.lesson18.task1;

import java.util.List;

public class Test {
    public static void duplicate(List<Integer> list) {

        System.out.println(list);

        List<Integer> noDuplicate = list.stream()
                .distinct()
                .toList();
        System.out.println(noDuplicate);
    }

    public static void evenNumb(List<Integer> list) {

        System.out.println(list);

        List<Integer> evenList = list.stream()
                .filter(n -> n > 6 && n < 17)
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(evenList);
    }

    public static void multiplicationNumb(List<Integer> list) {

        System.out.println(list);

        List<Integer> multipl = list.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println(multipl);
    }

    public static void sortElements(List<Integer> list) {

        System.out.println(list);

        List<Integer> fourSort = list.stream()
                .sorted()
                .limit(4)
                .toList();
        System.out.println(fourSort);
    }

    public static void amountElements(List<Integer> list) {

        System.out.println(list);

        long amount = list.stream().count();
        System.out.println(amount);
    }

    public static void averageEl(List<Integer> list) {

        System.out.println(list);

        int sum = 0;
        long sumStream = list.stream()
                .mapToInt(n -> n)
                .sum();
        long amount = list.stream().count();
        long average = sumStream / amount;
        System.out.println(average);
    }
}
