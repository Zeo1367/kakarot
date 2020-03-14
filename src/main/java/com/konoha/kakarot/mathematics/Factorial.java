package com.konoha.kakarot.mathematics;

import java.util.ArrayList;
import java.util.Collections;

public class Factorial {

    public ArrayList<Integer> allFactors(int number) {

        ArrayList<Integer> sortedFactorList = new ArrayList<>();
        int i = 1;
        if (number > 0) {
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    if (number / i != i) {
                        sortedFactorList.add(number / i);
                    }
                    sortedFactorList.add(i);
                }
                i++;
            }
        }

        Collections.sort(sortedFactorList);
        return sortedFactorList;
    }
}

