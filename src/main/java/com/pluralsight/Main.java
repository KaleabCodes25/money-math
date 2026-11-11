package com.pluralsight;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        float first = 0f;
        float value = 0.10f;

        double second = 0;
        double secondValue = 0.10;

        BigDecimal third = BigDecimal.ZERO;
        BigDecimal tenthValue = new BigDecimal("0.10");


        for (int i = 0; i < 10; i++) {
            first += value;
            System.out.println();
            second += secondValue;
            System.out.println();
            third = third.add(tenthValue);
            System.out.println();
            System.out.println( "float " + first);
            System.out.println();
            System.out.println("double " + second);
            System.out.println();
            System.out.println("bigDecimal " + third);
            System.out.println();
        }
        first = 0f;
        System.out.println("First after the loop: " + first);

        second = 0;
        System.out.println("Second after the loop: " + second);

        third = BigDecimal.ZERO;
        System.out.println("Third after the loop: " + third);

        for (int i = 0; i < 1000; i++) {
            first += value + 19.99f;
            System.out.println();
            second += secondValue + 19.99;
            System.out.println();
            third = third.add(tenthValue).add(new BigDecimal("19.99"));
            System.out.println();

        }
        System.out.println( "float " + first);
        System.out.println();
        System.out.println("double " + second);
        System.out.println();
        System.out.println("bigDecimal " + third);
        System.out.println();


    }
}
