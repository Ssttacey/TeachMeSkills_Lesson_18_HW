package com.teachmeskills.lesson18.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberList {
    public static List<Integer> creationNumb() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(1, 20));
        }
        return numbers;
    }
}