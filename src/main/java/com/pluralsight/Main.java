package com.pluralsight;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.math.BigDecimal;

import static java.lang.Double.compare;

public class Main {
    public static void main(String[] args) {
        float first = 0.0f;


        double second = 0.0;


        BigDecimal third = BigDecimal.ZERO;
        BigDecimal tenCents = new BigDecimal("0.10");

        for (int i = 0; i < 10; i++) {
            first += 0.10f;

            second += 0.10;

            third = third.add(tenCents);

            System.out.println( "float " + first);

            System.out.println("double " + second);

            System.out.println("bigDecimal " + third);

        }
        first = 0f;
        System.out.println("First after the loop: " + first);

        second = 0;
        System.out.println("Second after the loop: " + second);

        third = BigDecimal.ZERO;
        System.out.println("Third after the loop: " + third);

        for (int i = 0; i < 1000; i++) {
            first +=  19.99f;
            System.out.println();
            second +=  19.99;
            System.out.println();
            third = third.add(new BigDecimal("19.99"));
            System.out.println();

        }
        System.out.println( "float " + first);
        System.out.println();
        System.out.println("double " + second);
        System.out.println();
        System.out.println("bigDecimal " + third);
        System.out.println();

        System.out.println(first == second);
        BigDecimal secondAsBigDecimal = BigDecimal.valueOf(second);

        System.out.println(third.compareTo(secondAsBigDecimal) == 0);

    }
}
