package com.practice.java8.newfeatures.lambda;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {

        /**
         * Imperative - how to
         */

        int sum = 0;
        for(int i = 0; i<100;i++) {
            sum = sum + i;
        }
        System.out.println(" Sum using imperative approach : "+sum);

        /**
         * Declarative - What to return (hides the how to part)
         */
        int sum1 = IntStream.range(0, 100).sum();
        System.out.println(" Sum using Declarative approach : "+sum1);

    }
}
