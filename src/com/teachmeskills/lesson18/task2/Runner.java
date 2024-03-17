package com.teachmeskills.lesson18.task2;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> strTestList = NameList.createNameList();
        TestTwo.namesA(strTestList);
        TestTwo.sortNames(strTestList);
    }
}
