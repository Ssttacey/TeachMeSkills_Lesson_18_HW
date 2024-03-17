package com.teachmeskills.lesson18.task1;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> testList = NumberList.creationNumb();
        Test.duplicate(testList);
        Test.evenNumb(testList);
        Test.multiplicationNumb(testList);
        Test.sortElements(testList);
        Test.amountElements(testList);
        Test.averageEl(testList);
    }
}
