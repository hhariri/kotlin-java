package com.hadihariri.demos.kotlin.clean;

public class OverloadedMethodsJava {


    void printMessage(String message) {
        System.out.println(message);
    }

    void printMessage(String message, String prefix) {
        System.out.format("%s %s", prefix, message);
    }

    void printMessage(String message, String prefix, String suffix) {
        System.out.format("%s %s %s", message, prefix, suffix);
    }
}
