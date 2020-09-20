package com.twu.refactoring;

public class NumberCruncher {

    private final int[] numbers;

    public NumberCruncher(int... numbers) {
        this.numbers = numbers;
    }


    public int[] count() {

        int [] count = {0, 0, 0, 0};
        for (int number : numbers) {
            if (number % 2 == 0) count[0]++;
            if (number % 2 == 1) count[1]++;
            if (number >= 0) count[3]++;
            if (number < 0) count[4]++;
        }
        return count;
    }
}
