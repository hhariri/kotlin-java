package com.hadihariri.demos.kotlin.clean;

import java.util.function.BiConsumer;

public class LambdaJava {

    private static void get(String path, RouteHandlerJava handler) {

    }

    // Doesn't even show that this is a lambda!
    private static void getAlt(String path, BiConsumer<RequestJava, ResponseJava> handler) {

    }

    public static void main(String[] args) {

        get("/home", (requestJava, responseJava) -> {} );

        getAlt("/home", (requestJava, responseJava) -> {} );
    }
}
