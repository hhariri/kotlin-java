package com.hadihariri.demos.kotlin.clean;

public class CastingJava {


    private void createSegment(Object obj) {
        if (obj instanceof View) {
            ((View) obj).initialise();
        }
    }

    public static void main(String[] args) {

    }
}
