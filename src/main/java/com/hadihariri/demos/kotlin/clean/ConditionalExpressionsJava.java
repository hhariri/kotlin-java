package com.hadihariri.demos.kotlin.clean;

import java.util.Objects;

public class ConditionalExpressionsJava {


    public static void main(String[] args) {
        String param;
        if (args.length == 0) {
            param = "100";
        } else {
            param = args[0];
        }

        int value;
        if (Objects.equals(param, "100")) {
            value = 1;
        } else if (Objects.equals(param, "300")) {
            value = 2;
        } else {
            value = 70;
        }

        int actual = 0;

        switch (value) {
            case 1:
                System.out.println("It was one"); actual = 20; break;
            case 2:
                System.out.println("It was two"); actual = 30; break;
            default:
                if (value >= 0 && value <= 100) {
                    actual = 40;
                    System.out.println("It was somewhere in between these numbers");
                } else {
                    value = 0;
                }
        }
        System.out.format("Value is %d and Actual is %d", value, actual);
    }

}
