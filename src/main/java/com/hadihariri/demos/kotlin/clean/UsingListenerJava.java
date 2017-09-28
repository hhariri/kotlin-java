package com.hadihariri.demos.kotlin.clean;

public class UsingListenerJava {


    public static void main(String[] args) {

        View view = new View();

        view.setOnClickListener(new OnClickListenerJava() {
            @Override
            public void onClick(View view) {
                System.out.println("I'm just writing a single line of....wait no, multiple lines of code");
            }
        });


    }
}
