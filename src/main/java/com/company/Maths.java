package com.company;

/**
 * Created by MDB on 30/03/2015.
 */
public class Maths {
    public static int factorial(int i) {

        int result=1;

        for (int j = 1; j < i; j++) {
            result+=(result*j);
        }

        return result;
    }
}
