package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        float first = 0f;
        float  value = 0.1f;

        double second = 0;
        double secondValue = 0.10;

        BigDecimal third  = BigDecimal.ZERO;
        BigDecimal tenthValue = new  BigDecimal("0.10");


        for (int i = 0; i < 10; i++) {
            first += value;
            System.out.println("The first result after each iteration: " + first);
        }

        for (int i = 0; i < 10; i++) {
            second += secondValue;
            System.out.println("The second result after each interation: " + second);

        }


        for (int i = 0; i < 10; i++) {
            third = third.add(tenthValue);
            System.out.println("The third result after each interation: " + third);
        }



    }
}
